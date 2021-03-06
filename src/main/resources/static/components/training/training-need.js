import courseDialog from './course-detail-dialog.js';
let template=`
<div class="training-need">
	<div>
		<span style="color:#2E2E2D;margin-right:10px;">Teacher Group</span>
		<el-select v-model="group" style="width:120px;" v-on:change="handleDutyChange" :disabled="loading" clearable>
			<el-option v-for="item in groups" :key="item.id" :label="item.name" :value="item.id"></el-option>
		</el-select>
	</div>
	<div class="training-need-title">
		Training Need Analysis
	</div>
	<div v-loading="loading">
		<div v-for="(item,index) in categorys" :key="index">
			<div class="category">{{ item.name }}</div>
			<div class="table" v-for="(subItem, subIndex) in item.subCategorys" :key="subIndex">
				<div class="sub-category td">{{ subItem.name }}</div>
				<div class="members td clearfix">
					<div class="left">
						<div class="teacher" v-for="teacher in subItem.teachers" :key="teacher.id" v-on:click="roadMap(teacher.id, teacher.evaluationId)">
							<el-badge :is-dot="teacher.status == 2">
								<div class="portrait" :class="{course_complete:teacher.status == 3}">
									<img v-if="teacher.pic" :src="teacher.pic" style="width: 100%;height: 100%;"/>
								</div>
							</el-badge>
							
							<div class="name" :title="teacher.name.replace('&',' ')">{{ teacher.name.split('&')[0] }}</div>
						</div>
					</div>
					<div class="new-button">
						<el-button v-on:click="openCourseDialog(subItem.id,subItem.code)">Add Training</el-button>
					</div>
				</div>
			</div>
		</div>
	</div>
	<course-dialog v-model="dialogVisible" :course="tmpCourse"></course-dialog>
</div>
`;

export default {
	template:template,
	components:{
		courseDialog:courseDialog,
	},
	mounted(){
		this.getDuty();
		this.getTrainingNeed();
	},
	data:function(){
		return{
			group:'',
			loading:false,
			groups:[],
			categorys:[],
            dialogVisible:false,
			waitNetwork:false,
			tmpCourse:{
                name:'',
                awardingOrganization:'',
                startTime:'',
                trainingHours:'',
                courseFee:'',
                members:[],
                dutyLevelSkillId:'',
                dutyLevelSkillCode:''
            },
		}
	},
	methods:{
		getDuty(){
			server.get("/api/training/duty").then(res => {
				this.groups = res.data.data;
			}).catch(err => {
			
			});
		},
		getTrainingNeed(){
			this.loading = true;
			server.get("/api/training/training/need",{
				params:{
					duty:this.group,
                },
			}).then(res => {
				this.categorys = res.data.data;
				this.loading = false;
			}).catch(err => {
				this.loading = false;
			})
		},
        openCourseDialog(id,code){
			this.tmpCourse.dutyLevelSkillId = id;
			this.tmpCourse.dutyLevelSkillCode = code;
			this.tmpCourse = Object.assign({},this.tmpCourse);
			this.dialogVisible = true;
		},
        handleDutyChange(val){
        	this.getTrainingNeed();
		},
        roadMap(userId, evaluationId){
        	this.$router.push({name:"roadmapDetail",params:{id:evaluationId}, query:{teacherId:userId}})
		}
	}
}