import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import news from '@/views/modules/news/list'
    import daojufenlei from '@/views/modules/daojufenlei/list'
    import discussjubenxinxi from '@/views/modules/discussjubenxinxi/list'
    import jubenfenlei from '@/views/modules/jubenfenlei/list'
    import discussyouxihuodong from '@/views/modules/discussyouxihuodong/list'
    import youxihuodong from '@/views/modules/youxihuodong/list'
    import discussyouxidaoju from '@/views/modules/discussyouxidaoju/list'
    import forum from '@/views/modules/forum/list'
    import yonghu from '@/views/modules/yonghu/list'
    import huodongbaoming from '@/views/modules/huodongbaoming/list'
    import jubenxinxi from '@/views/modules/jubenxinxi/list'
    import orders from '@/views/modules/orders/list'
    import config from '@/views/modules/config/list'
    import youxidaoju from '@/views/modules/youxidaoju/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '系统首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '系统首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/news',
        name: '通知公告',
        component: news
      }
      ,{
	path: '/daojufenlei',
        name: '道具分类',
        component: daojufenlei
      }
      ,{
	path: '/discussjubenxinxi',
        name: '剧本信息评论',
        component: discussjubenxinxi
      }
      ,{
	path: '/jubenfenlei',
        name: '剧本分类',
        component: jubenfenlei
      }
      ,{
	path: '/discussyouxihuodong',
        name: '游戏活动评论',
        component: discussyouxihuodong
      }
      ,{
	path: '/youxihuodong',
        name: '游戏活动',
        component: youxihuodong
      }
      ,{
	path: '/discussyouxidaoju',
        name: '游戏道具评论',
        component: discussyouxidaoju
      }
      ,{
	path: '/forum',
        name: '游戏论坛',
        component: forum
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/huodongbaoming',
        name: '活动报名',
        component: huodongbaoming
      }
      ,{
	path: '/jubenxinxi',
        name: '剧本信息',
        component: jubenxinxi
      }
      ,{
        path: '/orders/:status',
        name: '订单管理',
        component: orders
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/youxidaoju',
        name: '游戏道具',
        component: youxidaoju
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '系统首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})
const originalPush = VueRouter.prototype.push
//修改原型对象中的push方法
VueRouter.prototype.push = function push(location) {
   return originalPush.call(this, location).catch(err => err)
}
export default router;
