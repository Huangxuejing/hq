//vue 组件
let  template=
    `
<div class="td-score-table" style="width:96%;margin-top: 10px;padding:0 2%;height:1000px;">
    <el-table
			:data="scoreLevel"
			border fit 
			:stripe="false"
			header-row-class-name="score-table-head">
			<el-table-column
			        width="90"
					label="Score"
					prop="score"
					align="center"
					:resizable="false"
					header-align="center">
			</el-table-column>
			<el-table-column
					label="Name"
					prop="name"
					align="center"
					:resizable="false"
					header-align="center">
			</el-table-column>
			<el-table-column
					label="Key"
					prop="rateKeys"
					align="center"
					:resizable="false"
					header-align="center">
			</el-table-column>
			<el-table-column
			        width="55"
					align="center"
					:resizable="false"
					header-align="center">
				<template slot-scope="scope">
					<span class="el-icon-delete" style="color:#F2898C;cursor: pointer;font-weight: bold;" v-on:click="deleteScore(scope.row.id)"></span>
				</template>
			</el-table-column>
	</el-table>
	<div class="score-add-class">
	    <span class="el-icon-circle-plus" v-on:click="addScore"> Add</span>
    </div>
</div>

`
export default  {
    template:template,
    props:{
        scoreLevel:{
            required:true,
            type:Array,
        }
    },
    data(){
        return {

        }
    },
    methods:{
        addScore(){
            this.$emit("addScore")
        },
        deleteScore(id){
            console.log("进来了1")
            this.$emit("deleteScore",id)
        }
    }
}