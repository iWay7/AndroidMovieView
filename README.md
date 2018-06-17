# AndroidMovieView
Android Movie(GIF) 播放视图。

### 本应用的示例

![image](https://github.com/iWay7/AndroidMovieView/blob/master/sample.gif)   

### 本示例基于 AndroidHelpers 库，访问 https://github.com/iWay7/AndroidHelpers 添加依赖。

#### 开始使用：
##### 在布局文件中声明一个 MovieView 视图即可使用：
```
<site.iway.androidhelpers.MovieView
    android:id="@+id/movieView"
    android:layout_width="320dp"
    android:layout_height="200dp"
    android:layout_gravity="center"
    app:refreshTimeSpan="16"
    app:repeated="true"
    app:scaleType="centerCrop" />
```

##### 支持的可配置属性：
```
app:refreshTimeSpan 配置刷新间隔
app:repeated 配置是否循环播放
app:scaleType 配置缩放模式
```

##### 设定播放流：
```
try {
    AssetManager assetManager = getAssets();
    InputStream inputStream = assetManager.open("movie.gif");
    MovieView movieView = findViewById(R.id.movieView);
    movieView.load(inputStream);
} catch (IOException e) {
    // nothing
}
```
