.class public abstract Lio/sentry/android/core/internal/util/n;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# direct methods
.method public static a(Landroid/app/Activity;Lio/sentry/util/thread/a;Lio/sentry/ILogger;Lio/sentry/android/core/n0;)Landroid/graphics/Bitmap;
    .locals 13

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v6, 0x0

    .line 7
    if-nez v0, :cond_9

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_9

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    sget-object p0, Lio/sentry/s5;->DEBUG:Lio/sentry/s5;

    .line 22
    .line 23
    const-string p1, "Activity window is null, not taking screenshot."

    .line 24
    .line 25
    new-array v0, v1, [Ljava/lang/Object;

    .line 26
    .line 27
    invoke-interface {p2, p0, p1, v0}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    return-object v6

    .line 31
    :cond_0
    invoke-virtual {v0}, Landroid/view/Window;->peekDecorView()Landroid/view/View;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    if-nez v2, :cond_1

    .line 36
    .line 37
    sget-object p0, Lio/sentry/s5;->DEBUG:Lio/sentry/s5;

    .line 38
    .line 39
    const-string p1, "DecorView is null, not taking screenshot."

    .line 40
    .line 41
    new-array v0, v1, [Ljava/lang/Object;

    .line 42
    .line 43
    invoke-interface {p2, p0, p1, v0}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    return-object v6

    .line 47
    :cond_1
    invoke-virtual {v2}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    if-nez v2, :cond_2

    .line 52
    .line 53
    sget-object p0, Lio/sentry/s5;->DEBUG:Lio/sentry/s5;

    .line 54
    .line 55
    const-string p1, "Root view is null, not taking screenshot."

    .line 56
    .line 57
    new-array v0, v1, [Ljava/lang/Object;

    .line 58
    .line 59
    invoke-interface {p2, p0, p1, v0}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    return-object v6

    .line 63
    :cond_2
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    if-lez v4, :cond_8

    .line 68
    .line 69
    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    if-gtz v4, :cond_3

    .line 74
    .line 75
    goto/16 :goto_5

    .line 76
    .line 77
    :cond_3
    :try_start_0
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    .line 82
    .line 83
    .line 84
    move-result v5

    .line 85
    sget-object v7, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    .line 86
    .line 87
    invoke-static {v4, v5, v7}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 88
    .line 89
    .line 90
    move-result-object v7

    .line 91
    new-instance v4, Ljava/util/concurrent/CountDownLatch;

    .line 92
    .line 93
    const/4 v5, 0x1

    .line 94
    invoke-direct {v4, v5}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 95
    .line 96
    .line 97
    sget v8, Landroid/os/Build$VERSION;->SDK_INT:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 98
    .line 99
    const/16 v9, 0x1a

    .line 100
    .line 101
    sget-object v10, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 102
    .line 103
    const-wide/16 v11, 0x3e8

    .line 104
    .line 105
    if-lt v8, v9, :cond_5

    .line 106
    .line 107
    :try_start_1
    new-instance p0, Landroid/os/HandlerThread;

    .line 108
    .line 109
    const-string p1, "SentryScreenshot"

    .line 110
    .line 111
    invoke-direct {p0, p1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p0}, Ljava/lang/Thread;->start()V

    .line 115
    .line 116
    .line 117
    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 118
    .line 119
    const/4 v2, -0x1

    .line 120
    invoke-direct {p1, v2}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 121
    .line 122
    .line 123
    :try_start_2
    new-instance v2, Landroid/os/Handler;

    .line 124
    .line 125
    invoke-virtual {p0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 126
    .line 127
    .line 128
    move-result-object v8

    .line 129
    invoke-direct {v2, v8}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 130
    .line 131
    .line 132
    new-instance v8, Lio/sentry/android/core/internal/util/m;

    .line 133
    .line 134
    invoke-direct {v8, p1, v4, v1}, Lio/sentry/android/core/internal/util/m;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 135
    .line 136
    .line 137
    invoke-static {v0, v7, v8, v2}, Landroid/view/PixelCopy;->request(Landroid/view/Window;Landroid/graphics/Bitmap;Landroid/view/PixelCopy$OnPixelCopyFinishedListener;Landroid/os/Handler;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v4, v11, v12, v10}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z

    .line 141
    .line 142
    .line 143
    move-result v0

    .line 144
    if-eqz v0, :cond_4

    .line 145
    .line 146
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 147
    .line 148
    .line 149
    move-result v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 150
    if-nez v0, :cond_4

    .line 151
    .line 152
    move v1, v5

    .line 153
    goto :goto_0

    .line 154
    :catchall_0
    move-exception v0

    .line 155
    goto :goto_1

    .line 156
    :cond_4
    :goto_0
    :try_start_3
    invoke-virtual {p0}, Landroid/os/HandlerThread;->quit()Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 157
    .line 158
    .line 159
    goto :goto_2

    .line 160
    :catchall_1
    move-exception v0

    .line 161
    move-object p0, v0

    .line 162
    goto :goto_4

    .line 163
    :goto_1
    :try_start_4
    sget-object v2, Lio/sentry/s5;->ERROR:Lio/sentry/s5;

    .line 164
    .line 165
    const-string v4, "Taking screenshot using PixelCopy failed."

    .line 166
    .line 167
    invoke-interface {p2, v2, v4, v0}, Lio/sentry/ILogger;->e(Lio/sentry/s5;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 168
    .line 169
    .line 170
    goto :goto_0

    .line 171
    :goto_2
    if-nez v1, :cond_7

    .line 172
    .line 173
    :try_start_5
    sget-object p0, Lio/sentry/s5;->WARNING:Lio/sentry/s5;

    .line 174
    .line 175
    const-string v0, "PixelCopy failed for screenshot capture (result=%d)."

    .line 176
    .line 177
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 178
    .line 179
    .line 180
    move-result p1

    .line 181
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    invoke-interface {p2, p0, v0, p1}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 190
    .line 191
    .line 192
    return-object v6

    .line 193
    :catchall_2
    move-exception v0

    .line 194
    move-object p1, v0

    .line 195
    invoke-virtual {p0}, Landroid/os/HandlerThread;->quit()Z

    .line 196
    .line 197
    .line 198
    throw p1

    .line 199
    :cond_5
    new-instance v0, Landroid/graphics/Canvas;

    .line 200
    .line 201
    invoke-direct {v0, v7}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 202
    .line 203
    .line 204
    invoke-interface {p1}, Lio/sentry/util/thread/a;->c()Z

    .line 205
    .line 206
    .line 207
    move-result p1

    .line 208
    if-eqz p1, :cond_6

    .line 209
    .line 210
    invoke-virtual {v2, v0}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v4}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 214
    .line 215
    .line 216
    goto :goto_3

    .line 217
    :cond_6
    move-object v1, v2

    .line 218
    move-object v2, v0

    .line 219
    new-instance v0, Lio/sentry/android/core/h1;

    .line 220
    .line 221
    const/4 v5, 0x3

    .line 222
    move-object v3, p2

    .line 223
    invoke-direct/range {v0 .. v5}, Lio/sentry/android/core/h1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {p0, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 227
    .line 228
    .line 229
    :goto_3
    invoke-virtual {v4, v11, v12, v10}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z

    .line 230
    .line 231
    .line 232
    move-result p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 233
    if-nez p0, :cond_7

    .line 234
    .line 235
    return-object v6

    .line 236
    :cond_7
    return-object v7

    .line 237
    :goto_4
    sget-object p1, Lio/sentry/s5;->ERROR:Lio/sentry/s5;

    .line 238
    .line 239
    const-string v0, "Taking screenshot failed."

    .line 240
    .line 241
    invoke-interface {p2, p1, v0, p0}, Lio/sentry/ILogger;->e(Lio/sentry/s5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 242
    .line 243
    .line 244
    return-object v6

    .line 245
    :cond_8
    :goto_5
    sget-object p0, Lio/sentry/s5;->DEBUG:Lio/sentry/s5;

    .line 246
    .line 247
    const-string p1, "View\'s width and height is zeroed, not taking screenshot."

    .line 248
    .line 249
    new-array v0, v1, [Ljava/lang/Object;

    .line 250
    .line 251
    invoke-interface {p2, p0, p1, v0}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 252
    .line 253
    .line 254
    return-object v6

    .line 255
    :cond_9
    sget-object p0, Lio/sentry/s5;->DEBUG:Lio/sentry/s5;

    .line 256
    .line 257
    const-string p1, "Activity isn\'t valid, not taking screenshot."

    .line 258
    .line 259
    new-array v0, v1, [Ljava/lang/Object;

    .line 260
    .line 261
    invoke-interface {p2, p0, p1, v0}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 262
    .line 263
    .line 264
    return-object v6
.end method
