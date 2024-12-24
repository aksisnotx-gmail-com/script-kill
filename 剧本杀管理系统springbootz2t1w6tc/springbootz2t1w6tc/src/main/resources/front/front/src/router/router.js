import VueRouter from 'vue-router'

//引入组件
import Index from '../pages'
import Home from '../pages/home/home'
import Login from '../pages/login/login'
import Register from '../pages/register/register'
import Center from '../pages/center/center'
import Forum from '../pages/forum/list'
import ForumAdd from '../pages/forum/add'
import ForumDetail from '../pages/forum/detail'
import MyForumList from '../pages/forum/myForumList'
import Storeup from '../pages/storeup/list'
import AddrList from '../pages/shop-address/list'
import AddrAdd from '../pages/shop-address/addOrUpdate'
import Order from '../pages/shop-order/list'
import OrderConfirm from '../pages/shop-order/confirm'
import Cart from '../pages/shop-cart/list'
import News from '../pages/news/news-list'
import NewsDetail from '../pages/news/news-detail'
import payList from '../pages/pay'

import yonghuList from '../pages/yonghu/list'
import yonghuDetail from '../pages/yonghu/detail'
import yonghuAdd from '../pages/yonghu/add'
import jubenfenleiList from '../pages/jubenfenlei/list'
import jubenfenleiDetail from '../pages/jubenfenlei/detail'
import jubenfenleiAdd from '../pages/jubenfenlei/add'
import jubenxinxiList from '../pages/jubenxinxi/list'
import jubenxinxiDetail from '../pages/jubenxinxi/detail'
import jubenxinxiAdd from '../pages/jubenxinxi/add'
import youxihuodongList from '../pages/youxihuodong/list'
import youxihuodongDetail from '../pages/youxihuodong/detail'
import youxihuodongAdd from '../pages/youxihuodong/add'
import huodongbaomingList from '../pages/huodongbaoming/list'
import huodongbaomingDetail from '../pages/huodongbaoming/detail'
import huodongbaomingAdd from '../pages/huodongbaoming/add'
import daojufenleiList from '../pages/daojufenlei/list'
import daojufenleiDetail from '../pages/daojufenlei/detail'
import daojufenleiAdd from '../pages/daojufenlei/add'
import youxidaojuList from '../pages/youxidaoju/list'
import youxidaojuDetail from '../pages/youxidaoju/detail'
import youxidaojuAdd from '../pages/youxidaoju/add'
import discussjubenxinxiList from '../pages/discussjubenxinxi/list'
import discussjubenxinxiDetail from '../pages/discussjubenxinxi/detail'
import discussjubenxinxiAdd from '../pages/discussjubenxinxi/add'
import discussyouxihuodongList from '../pages/discussyouxihuodong/list'
import discussyouxihuodongDetail from '../pages/discussyouxihuodong/detail'
import discussyouxihuodongAdd from '../pages/discussyouxihuodong/add'
import discussyouxidaojuList from '../pages/discussyouxidaoju/list'
import discussyouxidaojuDetail from '../pages/discussyouxidaoju/detail'
import discussyouxidaojuAdd from '../pages/discussyouxidaoju/add'

const originalPush = VueRouter.prototype.push
VueRouter.prototype.push = function push(location) {
	return originalPush.call(this, location).catch(err => err)
}

//配置路由
export default new VueRouter({
	routes:[
		{
      path: '/',
      redirect: '/index/home'
    },
		{
			path: '/index',
			component: Index,
			children:[
				{
					path: 'home',
					component: Home
				},
				{
					path: 'center',
					component: Center,
				},
				{
					path: 'pay',
					component: payList,
				},
				{
					path: 'forum',
					component: Forum
				},
				{
					path: 'forumAdd',
					component: ForumAdd
				},
				{
					path: 'forumDetail',
					component: ForumDetail
				},
				{
					path: 'myForumList',
					component: MyForumList
				},
				{
					path: 'storeup',
					component: Storeup
				},
                {
                    path: 'shop-address/list',
                    component: AddrList
                },
                {
                    path: 'shop-address/addOrUpdate',
                    component: AddrAdd
                },
				{
					path: 'shop-order/order',
					component: Order
				},
				{
					path: 'cart',
					component: Cart
				},
				{
					path: 'shop-order/orderConfirm',
					component: OrderConfirm
				},
				{
					path: 'news',
					component: News
				},
				{
					path: 'newsDetail',
					component: NewsDetail
				},
				{
					path: 'yonghu',
					component: yonghuList
				},
				{
					path: 'yonghuDetail',
					component: yonghuDetail
				},
				{
					path: 'yonghuAdd',
					component: yonghuAdd
				},
				{
					path: 'jubenfenlei',
					component: jubenfenleiList
				},
				{
					path: 'jubenfenleiDetail',
					component: jubenfenleiDetail
				},
				{
					path: 'jubenfenleiAdd',
					component: jubenfenleiAdd
				},
				{
					path: 'jubenxinxi',
					component: jubenxinxiList
				},
				{
					path: 'jubenxinxiDetail',
					component: jubenxinxiDetail
				},
				{
					path: 'jubenxinxiAdd',
					component: jubenxinxiAdd
				},
				{
					path: 'youxihuodong',
					component: youxihuodongList
				},
				{
					path: 'youxihuodongDetail',
					component: youxihuodongDetail
				},
				{
					path: 'youxihuodongAdd',
					component: youxihuodongAdd
				},
				{
					path: 'huodongbaoming',
					component: huodongbaomingList
				},
				{
					path: 'huodongbaomingDetail',
					component: huodongbaomingDetail
				},
				{
					path: 'huodongbaomingAdd',
					component: huodongbaomingAdd
				},
				{
					path: 'daojufenlei',
					component: daojufenleiList
				},
				{
					path: 'daojufenleiDetail',
					component: daojufenleiDetail
				},
				{
					path: 'daojufenleiAdd',
					component: daojufenleiAdd
				},
				{
					path: 'youxidaoju',
					component: youxidaojuList
				},
				{
					path: 'youxidaojuDetail',
					component: youxidaojuDetail
				},
				{
					path: 'youxidaojuAdd',
					component: youxidaojuAdd
				},
				{
					path: 'discussjubenxinxi',
					component: discussjubenxinxiList
				},
				{
					path: 'discussjubenxinxiDetail',
					component: discussjubenxinxiDetail
				},
				{
					path: 'discussjubenxinxiAdd',
					component: discussjubenxinxiAdd
				},
				{
					path: 'discussyouxihuodong',
					component: discussyouxihuodongList
				},
				{
					path: 'discussyouxihuodongDetail',
					component: discussyouxihuodongDetail
				},
				{
					path: 'discussyouxihuodongAdd',
					component: discussyouxihuodongAdd
				},
				{
					path: 'discussyouxidaoju',
					component: discussyouxidaojuList
				},
				{
					path: 'discussyouxidaojuDetail',
					component: discussyouxidaojuDetail
				},
				{
					path: 'discussyouxidaojuAdd',
					component: discussyouxidaojuAdd
				},
			]
		},
		{
			path: '/login',
			component: Login
		},
		{
			path: '/register',
			component: Register
		},
	]
})
