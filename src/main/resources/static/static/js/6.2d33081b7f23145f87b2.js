webpackJsonp([6],{lXWG:function(e,t){},oe4N:function(e,t,a){"use strict";Object.defineProperty(t,"__esModule",{value:!0});var o=a("1HuH"),n=a("P9l9"),s=a("U+Q4"),r={name:"node",data:function(){return{nodeData:[],pageNumber:1,pageSize:10,nodeName:"",loading:!1,total:0,groupId:this.$route.query.groupId,groupList:[]}},components:{"v-content-head":o.a},mounted:function(){this.getGroupList()},methods:{changGroup:function(){this.getGroupList()},getNodeList:function(){var e=this,t={chainId:localStorage.getItem("chainId"),groupId:this.groupId,pageNumber:this.pageNumber,pageSize:this.pageSize};Object(n.k)(t,{}).then(function(t){0===t.data.code?(e.total=t.data.totalCount,e.nodeData=t.data.data):e.$message({type:"error",message:s.a.errCode[t.data.code].zh})}).catch(function(t){e.$message({message:"系统错误！",type:"error",duration:2e3})})},getGroupList:function(e){var t=this;Object(n.i)(localStorage.getItem("chainId")).then(function(e){if(0===e.data.code){if(e.data.data&&e.data.data.length){var a=0;t.groupList=e.data.data||[];for(var o=0;o<t.groupList.length;o++)t.groupList[o].groupId==t.groupId&&a++;a>0?t.getNodeList():(t.groupId=t.groupList[0].groupId,t.getNodeList())}}else t.groupList=[],t.$message({type:"error",message:s.a.errCode[e.data.code].zh})}).catch(function(e){t.groupList=[],t.$message({message:"系统错误！",type:"error",duration:2e3}),t.$message.closeAll()})},search:function(){this.getNodeList()},handleSizeChange:function(e){this.pageSize=e,this.pageNumber=1,this.getNodeList()},handleCurrentChange:function(e){this.pageNumber=e,this.getNodeList()},copyNodeIdKey:function(e){var t=this;e?this.$copyText(e).then(function(e){t.$message({type:"success",showClose:!0,message:"复制成功",duration:2e3})}):this.$message({type:"fail",showClose:!0,message:"复制失败",duration:2e3})}},filters:{Status:function(e){return 1==e?"存活":"不存活"}}},i={render:function(){var e=this,t=e.$createElement,a=e._self._c||t;return a("div",[a("v-content-head",{attrs:{headTitle:"节点列表",icon:!0,route:"/group"},on:{changGroup:e.changGroup}}),e._v(" "),a("div",{staticClass:"module-wrapper"},[a("div",{staticClass:"search-part",staticStyle:{"padding-top":"20px"}},[a("div",{staticClass:"search-part-left"},[a("div",{staticClass:"input-with-select"},[a("span",[e._v("切换群组")]),e._v(" "),a("el-select",{attrs:{placeholder:"请选择"},on:{change:e.search},model:{value:e.groupId,callback:function(t){e.groupId=t},expression:"groupId"}},e._l(e.groupList,function(e){return a("el-option",{key:e.groupId,attrs:{label:e.groupName,value:e.groupId}})}),1)],1)])]),e._v(" "),a("div",[a("el-table",{directives:[{name:"loading",rawName:"v-loading",value:e.loading,expression:"loading"}],staticClass:"search-table-content",attrs:{data:e.nodeData}},[a("el-table-column",{attrs:{prop:"nodeId",label:"节点编号","show-overflow-tooltip":""},scopedSlots:e._u([{key:"default",fn:function(t){return[a("i",{staticClass:"el-icon-document-copy",attrs:{title:"复制"},on:{click:function(a){return e.copyNodeIdKey(t.row.nodeId)}}}),e._v(" "),a("span",[e._v(e._s(t.row.nodeId))])]}}])}),e._v(" "),a("el-table-column",{attrs:{prop:"groupId",label:"所属群组编号",width:"140"}}),e._v(" "),a("el-table-column",{attrs:{prop:"nodeActive",label:"状态",width:"80"},scopedSlots:e._u([{key:"default",fn:function(t){return[a("span",[e._v(e._s(e._f("Status")(t.row.nodeActive)))])]}}])}),e._v(" "),a("el-table-column",{attrs:{prop:"blockNumber",label:"节点块高",width:"140"}}),e._v(" "),a("el-table-column",{attrs:{prop:"createTime",label:"创建时间",width:"160"},scopedSlots:e._u([{key:"default",fn:function(t){return[a("span",{},[e._v(e._s(e._f("dateSet")(t.row.createTime)))])]}}])})],1),e._v(" "),a("el-pagination",{staticClass:"page",attrs:{"current-page":e.pageNumber,"page-sizes":[10,20,30,50],"page-size":e.pageSize,layout:" sizes, prev, pager, next, jumper",total:e.total},on:{"size-change":e.handleSizeChange,"current-change":e.handleCurrentChange}})],1)])],1)},staticRenderFns:[]};var u=a("VU/8")(r,i,!1,function(e){a("lXWG")},"data-v-93894498",null);t.default=u.exports}});