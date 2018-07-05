//vue 组件
let  template=
    `
<div class="td-skill-table" style="width:96%;margin-top: 10px;padding:0 2%;height:1000px;">
    <el-table
			:data="skillLevel"
			:span-method="spanRowMethod"
			border fit 
			:stripe="false"
			header-row-class-name="skill-level-table-head">
			<el-table-column
			        min-width="35%"
					label="Type"
					prop="name"
					align="center"
					:resizable="false"
					header-align="center">
			</el-table-column>
			<el-table-column
					label="Levels"
					prop="dutyLevelName"
					align="center"
					:resizable="false"
					header-align="center">
			</el-table-column>
	</el-table>
</div>

    `
export default  {
    template:template,
    props:{
        skillLevel:{
            required:true,
            type:Array,
        },
        grades:{
            required:true,
            type:Array,
        }
    },
    data(){
        return {

        }
    },
    methods:{
        showlist(){
            console.log("temp:"+this.skillLevel)
        },

        spanRowMethod({ row, column, rowIndex, columnIndex }) {
            /*里面包含当前行row、当前列column、当前行号rowIndex、当前列号columnIndex四个属性。
            该函数可以返回一个包含两个元素的数组，第一个元素代表rowspan，第二个元素代表colspan。
             也可以返回一个键名为rowspan和colspan的对象。*/
            /*1 2 3 4 5 6 7 8 9 10 11 12*/
            let length1=this.grades[0] //4
            let length2=this.grades[1] //3
            let length3=this.grades[2] //5
            let length4=this.grades[0]+this.grades[1] //7
            if (columnIndex === 0) {
                if(rowIndex ===0){
                    return {
                        rowspan: length1,
                        colspan: 1
                    };
                }else if(rowIndex ===length1){
                    return {
                        rowspan: length2,
                        colspan: 1
                    };
                }else if(rowIndex ===length4){
                    return {
                        rowspan: length3,
                        colspan: 1
                    };
                }else{
                    return {
                        rowspan: 0,
                        colspan: 0
                    };
                }
                /*if (rowIndex % 4 === 0) {
                    return {
                        rowspan: 4,
                        colspan: 1
                    };
                } else {
                    return {
                        rowspan: 0,
                        colspan: 0
                    };
                }*/
            }
        }
    }
}