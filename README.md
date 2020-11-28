# MyWeb
实验四
* #### 首先用到了intent，通过intent来启用相应的Activity。这里我用到了隐式指定方法。设置intent.setAction(Intent.ACTION_VIEW)，启动action参数为ACTION_VIEW的Activity<br>
* #### 第一个工程就是一个简单的输入框获取网址，将之存到intent的data中方便之后获取网址。<br>
* #### 第二个工程就是我的浏览器，这里必不可少<category android:name="android.intent.category.BROWSABLE"/><data android:scheme="http" />第一个指定这是一个浏览器，第二个则匹配http的请求。<br>
* #### 第二个工程创建WebView用来显示网址内容。<br>
最后的成果截图：<br>
![mage text](https://github.com/IYuanM/My-View/blob/main/picture/2.PNG)
