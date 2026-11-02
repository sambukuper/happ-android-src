.class public final synthetic Lsc;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Ljava/lang/Object;

.field public final synthetic Z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, Lsc;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lsc;->Y:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lsc;->Z:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private final a()V
    .locals 7

    .line 1
    iget-object v0, p0, Lsc;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lzl0;

    .line 4
    .line 5
    iget-object p0, p0, Lsc;->Z:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Lqd0;

    .line 8
    .line 9
    iget-object v1, v0, Lzl0;->g:Lt6;

    .line 10
    .line 11
    iget-object v2, v1, Lt6;->m0:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v2, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-virtual {v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    const/4 v4, 0x0

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    goto :goto_2

    .line 24
    :cond_0
    iget-object v2, v1, Lt6;->h0:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v2, Lvh0;

    .line 27
    .line 28
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    const/4 v5, 0x0

    .line 32
    iput-boolean v5, v2, Lvh0;->f:Z

    .line 33
    .line 34
    iget-object v6, v2, Lvh0;->b:Ljava/lang/Object;

    .line 35
    .line 36
    monitor-enter v6

    .line 37
    :try_start_0
    iput-object v4, v2, Lvh0;->c:Ljk0;

    .line 38
    .line 39
    iput-boolean v5, v2, Lvh0;->e:Z

    .line 40
    .line 41
    iget-object v2, v2, Lvh0;->d:Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 44
    .line 45
    .line 46
    monitor-exit v6

    .line 47
    iget-object v2, v1, Lt6;->i0:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v2, Lbo5;

    .line 50
    .line 51
    iget-object v6, v2, Lbo5;->j0:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 52
    .line 53
    invoke-virtual {v6, v3, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    if-nez v5, :cond_1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_1
    iget-object v5, v2, Lbo5;->k0:Log7;

    .line 61
    .line 62
    if-eqz v5, :cond_2

    .line 63
    .line 64
    invoke-virtual {v5, v4}, Lrm3;->m(Ljava/util/concurrent/CancellationException;)V

    .line 65
    .line 66
    .line 67
    :cond_2
    iput-object v4, v2, Lbo5;->k0:Log7;

    .line 68
    .line 69
    :goto_0
    iget-object v2, v1, Lt6;->Y:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v2, Lvz7;

    .line 72
    .line 73
    invoke-virtual {v2}, Lvz7;->d()Z

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    if-eqz v2, :cond_4

    .line 78
    .line 79
    iget-object v1, v1, Lt6;->Y:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v1, Lvz7;

    .line 82
    .line 83
    invoke-virtual {v1}, Lvz7;->getValue()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    check-cast v1, Lrj0;

    .line 88
    .line 89
    iget-object v2, v1, Lrj0;->c:Ljava/lang/Object;

    .line 90
    .line 91
    monitor-enter v2

    .line 92
    :try_start_1
    iget-boolean v5, v1, Lrj0;->d:Z

    .line 93
    .line 94
    if-nez v5, :cond_3

    .line 95
    .line 96
    iget-object v5, v1, Lrj0;->a:Lr91;

    .line 97
    .line 98
    iget-object v5, v5, Lr91;->e:Lu06;

    .line 99
    .line 100
    invoke-interface {v5}, Lv06;->get()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v5

    .line 104
    check-cast v5, Lwj0;

    .line 105
    .line 106
    invoke-virtual {v5}, Lwj0;->b()V

    .line 107
    .line 108
    .line 109
    iput-boolean v3, v1, Lrj0;->d:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 110
    .line 111
    monitor-exit v2

    .line 112
    goto :goto_2

    .line 113
    :catchall_0
    move-exception p0

    .line 114
    goto :goto_1

    .line 115
    :cond_3
    :try_start_2
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 116
    .line 117
    const-string v0, "Check failed."

    .line 118
    .line 119
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 123
    :goto_1
    monitor-exit v2

    .line 124
    throw p0

    .line 125
    :cond_4
    :goto_2
    iget-object v1, v0, Lzl0;->f:Landroid/os/HandlerThread;

    .line 126
    .line 127
    if-eqz v1, :cond_7

    .line 128
    .line 129
    iget-object v1, v0, Lzl0;->d:Ljava/util/concurrent/Executor;

    .line 130
    .line 131
    instance-of v2, v1, Ldi0;

    .line 132
    .line 133
    if-eqz v2, :cond_6

    .line 134
    .line 135
    check-cast v1, Ldi0;

    .line 136
    .line 137
    iget-object v2, v1, Ldi0;->X:Ljava/lang/Object;

    .line 138
    .line 139
    monitor-enter v2

    .line 140
    :try_start_3
    iget-object v3, v1, Ldi0;->Y:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 141
    .line 142
    invoke-interface {v3}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    .line 143
    .line 144
    .line 145
    move-result v3

    .line 146
    if-nez v3, :cond_5

    .line 147
    .line 148
    iget-object v1, v1, Ldi0;->Y:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 149
    .line 150
    invoke-virtual {v1}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->shutdown()V

    .line 151
    .line 152
    .line 153
    goto :goto_3

    .line 154
    :catchall_1
    move-exception p0

    .line 155
    goto :goto_4

    .line 156
    :cond_5
    :goto_3
    monitor-exit v2

    .line 157
    goto :goto_5

    .line 158
    :goto_4
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 159
    throw p0

    .line 160
    :cond_6
    :goto_5
    iget-object v0, v0, Lzl0;->f:Landroid/os/HandlerThread;

    .line 161
    .line 162
    invoke-virtual {v0}, Landroid/os/HandlerThread;->quit()Z

    .line 163
    .line 164
    .line 165
    :cond_7
    invoke-virtual {p0, v4}, Lqd0;->b(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    return-void

    .line 169
    :catchall_2
    move-exception p0

    .line 170
    monitor-exit v6

    .line 171
    throw p0
.end method


# virtual methods
.method public final run()V
    .locals 8

    .line 1
    iget-byte v0, p0, Lsc;->X:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x2

    .line 5
    const/4 v3, 0x0

    .line 6
    const/4 v4, 0x1

    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lsc;->Y:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Ljf6;

    .line 13
    .line 14
    iget-object p0, p0, Lsc;->Z:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, Lxy0;

    .line 17
    .line 18
    new-instance v1, Ljava/util/HashSet;

    .line 19
    .line 20
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 21
    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    iget-object v0, v0, Ljf6;->b:Ljava/util/LinkedHashSet;

    .line 26
    .line 27
    invoke-interface {v1, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 28
    .line 29
    .line 30
    :cond_0
    iget-object p0, p0, Lxy0;->i0:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast p0, Lbn0;

    .line 33
    .line 34
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :pswitch_0
    iget-object v0, p0, Lsc;->Y:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v0, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/JobInfoSchedulerService;

    .line 41
    .line 42
    iget-object p0, p0, Lsc;->Z:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p0, Landroid/app/job/JobParameters;

    .line 45
    .line 46
    sget v1, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/JobInfoSchedulerService;->X:I

    .line 47
    .line 48
    invoke-virtual {v0, p0, v3}, Landroid/app/job/JobService;->jobFinished(Landroid/app/job/JobParameters;Z)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :pswitch_1
    iget-object v0, p0, Lsc;->Y:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v0, La63;

    .line 55
    .line 56
    iget-object p0, p0, Lsc;->Z:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast p0, Lz18;

    .line 59
    .line 60
    :try_start_0
    invoke-virtual {v0}, La63;->g()Landroid/graphics/Bitmap;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-virtual {p0, v0}, Lz18;->a(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :catch_0
    move-exception v0

    .line 69
    iget-object p0, p0, Lz18;->a:Lfb9;

    .line 70
    .line 71
    invoke-virtual {p0, v0}, Lfb9;->k(Ljava/lang/Exception;)V

    .line 72
    .line 73
    .line 74
    :goto_0
    return-void

    .line 75
    :pswitch_2
    iget-object v0, p0, Lsc;->Y:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v0, Lz76;

    .line 78
    .line 79
    iget-object p0, p0, Lsc;->Z:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast p0, Lz76;

    .line 82
    .line 83
    invoke-virtual {v0}, Lz76;->f()V

    .line 84
    .line 85
    .line 86
    if-eqz p0, :cond_1

    .line 87
    .line 88
    invoke-virtual {p0}, Lz76;->f()V

    .line 89
    .line 90
    .line 91
    :cond_1
    return-void

    .line 92
    :pswitch_3
    iget-object v0, p0, Lsc;->Y:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v0, Lmm0;

    .line 95
    .line 96
    iget-object p0, p0, Lsc;->Z:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast p0, Lhv2;

    .line 99
    .line 100
    invoke-virtual {v0, p0}, Lmm0;->F(Lu61;)V

    .line 101
    .line 102
    .line 103
    return-void

    .line 104
    :pswitch_4
    iget-object v0, p0, Lsc;->Y:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v0, Lcom/google/firebase/messaging/FirebaseMessaging;

    .line 107
    .line 108
    iget-object p0, p0, Lsc;->Z:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast p0, Lz18;

    .line 111
    .line 112
    :try_start_1
    invoke-virtual {v0}, Lcom/google/firebase/messaging/FirebaseMessaging;->a()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-virtual {p0, v0}, Lz18;->a(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 117
    .line 118
    .line 119
    goto :goto_1

    .line 120
    :catch_1
    move-exception v0

    .line 121
    iget-object p0, p0, Lz18;->a:Lfb9;

    .line 122
    .line 123
    invoke-virtual {p0, v0}, Lfb9;->k(Ljava/lang/Exception;)V

    .line 124
    .line 125
    .line 126
    :goto_1
    return-void

    .line 127
    :pswitch_5
    iget-object v0, p0, Lsc;->Y:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v0, Lu5;

    .line 130
    .line 131
    iget-object p0, p0, Lsc;->Z:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast p0, Landroid/content/Intent;

    .line 134
    .line 135
    invoke-virtual {v0, p0}, Lu5;->a(Landroid/content/Intent;)V

    .line 136
    .line 137
    .line 138
    return-void

    .line 139
    :pswitch_6
    iget-object v0, p0, Lsc;->Y:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast v0, Lcx1;

    .line 142
    .line 143
    iget-object p0, p0, Lsc;->Z:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast p0, Lby7;

    .line 146
    .line 147
    iget-object v1, v0, Lcx1;->c:Llv2;

    .line 148
    .line 149
    new-instance v3, Lml0;

    .line 150
    .line 151
    invoke-direct {v3, v0, p0, v2}, Lml0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {p0, v1, v3}, Lby7;->k(Llv2;Ld41;)Landroid/view/Surface;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    iget-object v2, v0, Lcx1;->a:Lax1;

    .line 159
    .line 160
    invoke-virtual {v2, v1}, Lib5;->g(Landroid/view/Surface;)V

    .line 161
    .line 162
    .line 163
    iget-object v0, v0, Lcx1;->h:Ljava/util/LinkedHashMap;

    .line 164
    .line 165
    invoke-interface {v0, p0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    return-void

    .line 169
    :pswitch_7
    iget-object v0, p0, Lsc;->Y:Ljava/lang/Object;

    .line 170
    .line 171
    check-cast v0, Lcx1;

    .line 172
    .line 173
    iget-object p0, p0, Lsc;->Z:Ljava/lang/Object;

    .line 174
    .line 175
    check-cast p0, Lhy7;

    .line 176
    .line 177
    iget v1, v0, Lcx1;->e:I

    .line 178
    .line 179
    add-int/2addr v1, v4

    .line 180
    iput v1, v0, Lcx1;->e:I

    .line 181
    .line 182
    new-instance v1, Landroid/graphics/SurfaceTexture;

    .line 183
    .line 184
    iget-object v2, v0, Lcx1;->a:Lax1;

    .line 185
    .line 186
    iget-boolean v3, p0, Lhy7;->e:Z

    .line 187
    .line 188
    iget-object v5, p0, Lhy7;->b:Landroid/util/Size;

    .line 189
    .line 190
    iget-object v6, v2, Lib5;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 191
    .line 192
    invoke-static {v6, v4}, Lfp2;->d(Ljava/util/concurrent/atomic/AtomicBoolean;Z)V

    .line 193
    .line 194
    .line 195
    iget-object v4, v2, Lib5;->c:Ljava/lang/Thread;

    .line 196
    .line 197
    invoke-static {v4}, Lfp2;->c(Ljava/lang/Thread;)V

    .line 198
    .line 199
    .line 200
    if-eqz v3, :cond_2

    .line 201
    .line 202
    iget v2, v2, Lax1;->n:I

    .line 203
    .line 204
    goto :goto_2

    .line 205
    :cond_2
    iget v2, v2, Lax1;->o:I

    .line 206
    .line 207
    :goto_2
    invoke-direct {v1, v2}, Landroid/graphics/SurfaceTexture;-><init>(I)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v5}, Landroid/util/Size;->getWidth()I

    .line 211
    .line 212
    .line 213
    move-result v2

    .line 214
    invoke-virtual {v5}, Landroid/util/Size;->getHeight()I

    .line 215
    .line 216
    .line 217
    move-result v4

    .line 218
    invoke-virtual {v1, v2, v4}, Landroid/graphics/SurfaceTexture;->setDefaultBufferSize(II)V

    .line 219
    .line 220
    .line 221
    new-instance v2, Landroid/view/Surface;

    .line 222
    .line 223
    invoke-direct {v2, v1}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    .line 224
    .line 225
    .line 226
    iget-object v4, v0, Lcx1;->c:Llv2;

    .line 227
    .line 228
    new-instance v5, Lbx1;

    .line 229
    .line 230
    invoke-direct {v5, v0, v1, v2}, Lbx1;-><init>(Lcx1;Landroid/graphics/SurfaceTexture;Landroid/view/Surface;)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {p0, v2, v4, v5}, Lhy7;->a(Landroid/view/Surface;Ljava/util/concurrent/Executor;Ld41;)V

    .line 234
    .line 235
    .line 236
    if-eqz v3, :cond_3

    .line 237
    .line 238
    iput-object v1, v0, Lcx1;->i:Landroid/graphics/SurfaceTexture;

    .line 239
    .line 240
    goto :goto_3

    .line 241
    :cond_3
    iput-object v1, v0, Lcx1;->j:Landroid/graphics/SurfaceTexture;

    .line 242
    .line 243
    iget-object p0, v0, Lcx1;->d:Landroid/os/Handler;

    .line 244
    .line 245
    invoke-virtual {v1, v0, p0}, Landroid/graphics/SurfaceTexture;->setOnFrameAvailableListener(Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;Landroid/os/Handler;)V

    .line 246
    .line 247
    .line 248
    :goto_3
    return-void

    .line 249
    :pswitch_8
    iget-object v0, p0, Lsc;->Y:Ljava/lang/Object;

    .line 250
    .line 251
    check-cast v0, Ljava/util/concurrent/Callable;

    .line 252
    .line 253
    iget-object p0, p0, Lsc;->Z:Ljava/lang/Object;

    .line 254
    .line 255
    check-cast p0, Lwl6;

    .line 256
    .line 257
    iget-object p0, p0, Lwl6;->Y:Ljava/lang/Object;

    .line 258
    .line 259
    check-cast p0, Lxh1;

    .line 260
    .line 261
    :try_start_2
    invoke-interface {v0}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    invoke-virtual {p0, v0}, Lu2;->j(Ljava/lang/Object;)Z
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 266
    .line 267
    .line 268
    goto :goto_4

    .line 269
    :catch_2
    move-exception v0

    .line 270
    invoke-virtual {p0, v0}, Lu2;->k(Ljava/lang/Throwable;)Z

    .line 271
    .line 272
    .line 273
    :goto_4
    return-void

    .line 274
    :pswitch_9
    iget-object v0, p0, Lsc;->Y:Ljava/lang/Object;

    .line 275
    .line 276
    check-cast v0, Ljg1;

    .line 277
    .line 278
    iget-object p0, p0, Lsc;->Z:Ljava/lang/Object;

    .line 279
    .line 280
    check-cast p0, Lhy7;

    .line 281
    .line 282
    iget v1, v0, Ljg1;->i:I

    .line 283
    .line 284
    add-int/2addr v1, v4

    .line 285
    iput v1, v0, Ljg1;->i:I

    .line 286
    .line 287
    new-instance v1, Landroid/graphics/SurfaceTexture;

    .line 288
    .line 289
    iget-object v3, v0, Ljg1;->a:Lib5;

    .line 290
    .line 291
    iget-object v5, v3, Lib5;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 292
    .line 293
    invoke-static {v5, v4}, Lfp2;->d(Ljava/util/concurrent/atomic/AtomicBoolean;Z)V

    .line 294
    .line 295
    .line 296
    iget-object v4, v3, Lib5;->c:Ljava/lang/Thread;

    .line 297
    .line 298
    invoke-static {v4}, Lfp2;->c(Ljava/lang/Thread;)V

    .line 299
    .line 300
    .line 301
    iget v3, v3, Lib5;->m:I

    .line 302
    .line 303
    invoke-direct {v1, v3}, Landroid/graphics/SurfaceTexture;-><init>(I)V

    .line 304
    .line 305
    .line 306
    iget-object v3, p0, Lhy7;->b:Landroid/util/Size;

    .line 307
    .line 308
    invoke-virtual {v3}, Landroid/util/Size;->getWidth()I

    .line 309
    .line 310
    .line 311
    move-result v4

    .line 312
    invoke-virtual {v3}, Landroid/util/Size;->getHeight()I

    .line 313
    .line 314
    .line 315
    move-result v3

    .line 316
    invoke-virtual {v1, v4, v3}, Landroid/graphics/SurfaceTexture;->setDefaultBufferSize(II)V

    .line 317
    .line 318
    .line 319
    new-instance v3, Landroid/view/Surface;

    .line 320
    .line 321
    invoke-direct {v3, v1}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    .line 322
    .line 323
    .line 324
    iget-object v4, v0, Ljg1;->c:Llv2;

    .line 325
    .line 326
    new-instance v5, Ljn0;

    .line 327
    .line 328
    invoke-direct {v5, v0, p0, v2}, Ljn0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 329
    .line 330
    .line 331
    invoke-virtual {p0, v4, v5}, Lhy7;->b(Ljava/util/concurrent/Executor;Lgy7;)V

    .line 332
    .line 333
    .line 334
    new-instance v2, Lhg1;

    .line 335
    .line 336
    invoke-direct {v2, v0, p0, v1, v3}, Lhg1;-><init>(Ljg1;Lhy7;Landroid/graphics/SurfaceTexture;Landroid/view/Surface;)V

    .line 337
    .line 338
    .line 339
    invoke-virtual {p0, v3, v4, v2}, Lhy7;->a(Landroid/view/Surface;Ljava/util/concurrent/Executor;Ld41;)V

    .line 340
    .line 341
    .line 342
    iget-object p0, v0, Ljg1;->d:Landroid/os/Handler;

    .line 343
    .line 344
    invoke-virtual {v1, v0, p0}, Landroid/graphics/SurfaceTexture;->setOnFrameAvailableListener(Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;Landroid/os/Handler;)V

    .line 345
    .line 346
    .line 347
    return-void

    .line 348
    :pswitch_a
    iget-object v0, p0, Lsc;->Y:Ljava/lang/Object;

    .line 349
    .line 350
    check-cast v0, Ljg1;

    .line 351
    .line 352
    iget-object p0, p0, Lsc;->Z:Ljava/lang/Object;

    .line 353
    .line 354
    check-cast p0, Lby7;

    .line 355
    .line 356
    iget-object v1, v0, Ljg1;->c:Llv2;

    .line 357
    .line 358
    new-instance v2, Lml0;

    .line 359
    .line 360
    invoke-direct {v2, v0, p0, v4}, Lml0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 361
    .line 362
    .line 363
    invoke-virtual {p0, v1, v2}, Lby7;->k(Llv2;Ld41;)Landroid/view/Surface;

    .line 364
    .line 365
    .line 366
    move-result-object v1

    .line 367
    iget-object v2, v0, Ljg1;->a:Lib5;

    .line 368
    .line 369
    invoke-virtual {v2, v1}, Lib5;->g(Landroid/view/Surface;)V

    .line 370
    .line 371
    .line 372
    iget-object v0, v0, Ljg1;->h:Ljava/util/LinkedHashMap;

    .line 373
    .line 374
    invoke-interface {v0, p0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 375
    .line 376
    .line 377
    return-void

    .line 378
    :pswitch_b
    iget-object v0, p0, Lsc;->Y:Ljava/lang/Object;

    .line 379
    .line 380
    check-cast v0, Lo81;

    .line 381
    .line 382
    iget-object p0, p0, Lsc;->Z:Ljava/lang/Object;

    .line 383
    .line 384
    check-cast p0, Ljava/lang/Runnable;

    .line 385
    .line 386
    iget-byte v1, v0, Lo81;->c:B

    .line 387
    .line 388
    invoke-static {v1}, Landroid/os/Process;->setThreadPriority(I)V

    .line 389
    .line 390
    .line 391
    iget-object v0, v0, Lo81;->d:Landroid/os/StrictMode$ThreadPolicy;

    .line 392
    .line 393
    if-eqz v0, :cond_4

    .line 394
    .line 395
    invoke-static {v0}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 396
    .line 397
    .line 398
    :cond_4
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    .line 399
    .line 400
    .line 401
    return-void

    .line 402
    :pswitch_c
    iget-object v0, p0, Lsc;->Y:Ljava/lang/Object;

    .line 403
    .line 404
    check-cast v0, Ljava/util/List;

    .line 405
    .line 406
    iget-object p0, p0, Lsc;->Z:Ljava/lang/Object;

    .line 407
    .line 408
    check-cast p0, Le31;

    .line 409
    .line 410
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 411
    .line 412
    .line 413
    move-result-object v0

    .line 414
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 415
    .line 416
    .line 417
    move-result v1

    .line 418
    if-eqz v1, :cond_6

    .line 419
    .line 420
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 421
    .line 422
    .line 423
    move-result-object v1

    .line 424
    check-cast v1, Lp10;

    .line 425
    .line 426
    iget-object v2, p0, Le31;->e:Ljava/lang/Object;

    .line 427
    .line 428
    iget-object v3, v1, Lp10;->a:Lq10;

    .line 429
    .line 430
    invoke-virtual {v3, v2}, Lq10;->e(Ljava/lang/Object;)Z

    .line 431
    .line 432
    .line 433
    move-result v2

    .line 434
    if-eqz v2, :cond_5

    .line 435
    .line 436
    new-instance v2, Lw31;

    .line 437
    .line 438
    invoke-virtual {v3}, Lq10;->d()I

    .line 439
    .line 440
    .line 441
    move-result v3

    .line 442
    invoke-direct {v2, v3}, Lw31;-><init>(I)V

    .line 443
    .line 444
    .line 445
    goto :goto_6

    .line 446
    :cond_5
    sget-object v2, Lv31;->a:Lv31;

    .line 447
    .line 448
    :goto_6
    iget-object v1, v1, Lp10;->b:Lkv5;

    .line 449
    .line 450
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 451
    .line 452
    .line 453
    invoke-virtual {v1, v2}, Lkv5;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 454
    .line 455
    .line 456
    goto :goto_5

    .line 457
    :cond_6
    return-void

    .line 458
    :pswitch_d
    iget-object v0, p0, Lsc;->Y:Ljava/lang/Object;

    .line 459
    .line 460
    check-cast v0, Lq74;

    .line 461
    .line 462
    iget-object p0, p0, Lsc;->Z:Ljava/lang/Object;

    .line 463
    .line 464
    check-cast p0, Lw06;

    .line 465
    .line 466
    monitor-enter v0

    .line 467
    :try_start_3
    iget-object v1, v0, Lq74;->b:Ljava/util/Set;

    .line 468
    .line 469
    if-nez v1, :cond_7

    .line 470
    .line 471
    iget-object v1, v0, Lq74;->a:Ljava/util/Set;

    .line 472
    .line 473
    invoke-interface {v1, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 474
    .line 475
    .line 476
    goto :goto_7

    .line 477
    :catchall_0
    move-exception p0

    .line 478
    goto :goto_8

    .line 479
    :cond_7
    iget-object v1, v0, Lq74;->b:Ljava/util/Set;

    .line 480
    .line 481
    invoke-interface {p0}, Lw06;->get()Ljava/lang/Object;

    .line 482
    .line 483
    .line 484
    move-result-object p0

    .line 485
    invoke-interface {v1, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 486
    .line 487
    .line 488
    :goto_7
    monitor-exit v0

    .line 489
    return-void

    .line 490
    :goto_8
    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 491
    throw p0

    .line 492
    :pswitch_e
    iget-object v0, p0, Lsc;->Y:Ljava/lang/Object;

    .line 493
    .line 494
    check-cast v0, Lnd5;

    .line 495
    .line 496
    iget-object p0, p0, Lsc;->Z:Ljava/lang/Object;

    .line 497
    .line 498
    check-cast p0, Lw06;

    .line 499
    .line 500
    iget-object v2, v0, Lnd5;->b:Lw06;

    .line 501
    .line 502
    sget-object v3, Lnd5;->d:Lvy0;

    .line 503
    .line 504
    if-ne v2, v3, :cond_8

    .line 505
    .line 506
    monitor-enter v0

    .line 507
    :try_start_5
    iget-object v2, v0, Lnd5;->a:Lxw3;

    .line 508
    .line 509
    iput-object v1, v0, Lnd5;->a:Lxw3;

    .line 510
    .line 511
    iput-object p0, v0, Lnd5;->b:Lw06;

    .line 512
    .line 513
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 514
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 515
    .line 516
    .line 517
    goto :goto_9

    .line 518
    :catchall_1
    move-exception p0

    .line 519
    :try_start_6
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 520
    throw p0

    .line 521
    :cond_8
    const-string p0, "provide() can be called only once."

    .line 522
    .line 523
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 524
    .line 525
    .line 526
    :goto_9
    return-void

    .line 527
    :pswitch_f
    iget-object v0, p0, Lsc;->Y:Ljava/lang/Object;

    .line 528
    .line 529
    check-cast v0, Landroidx/activity/ComponentActivity;

    .line 530
    .line 531
    iget-object p0, p0, Lsc;->Z:Ljava/lang/Object;

    .line 532
    .line 533
    check-cast p0, Lz95;

    .line 534
    .line 535
    sget v1, Landroidx/activity/ComponentActivity;->x0:I

    .line 536
    .line 537
    iget-object v1, v0, Landroidx/core/app/ComponentActivity;->X:Lg94;

    .line 538
    .line 539
    new-instance v2, Lfy0;

    .line 540
    .line 541
    invoke-direct {v2, p0, v0, v3}, Lfy0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 542
    .line 543
    .line 544
    invoke-virtual {v1, v2}, Lg94;->a(Lc94;)V

    .line 545
    .line 546
    .line 547
    return-void

    .line 548
    :pswitch_10
    iget-object v0, p0, Lsc;->Y:Ljava/lang/Object;

    .line 549
    .line 550
    check-cast v0, Lme6;

    .line 551
    .line 552
    iget-object p0, p0, Lsc;->Z:Ljava/lang/Object;

    .line 553
    .line 554
    check-cast p0, Lne6;

    .line 555
    .line 556
    invoke-interface {v0, p0}, Lme6;->a0(Lne6;)V

    .line 557
    .line 558
    .line 559
    return-void

    .line 560
    :pswitch_11
    iget-object v0, p0, Lsc;->Y:Ljava/lang/Object;

    .line 561
    .line 562
    check-cast v0, Landroidx/work/impl/WorkDatabase;

    .line 563
    .line 564
    iget-object p0, p0, Lsc;->Z:Ljava/lang/Object;

    .line 565
    .line 566
    check-cast p0, Lx39;

    .line 567
    .line 568
    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->x()Ln49;

    .line 569
    .line 570
    .line 571
    move-result-object v1

    .line 572
    iget-object v1, v1, Ln49;->a:Lql6;

    .line 573
    .line 574
    new-instance v2, Lut8;

    .line 575
    .line 576
    const/16 v5, 0x11

    .line 577
    .line 578
    invoke-direct {v2, v5}, Lut8;-><init>(B)V

    .line 579
    .line 580
    .line 581
    invoke-static {v1, v4, v3, v2}, Lu15;->G(Lql6;ZZLgn2;)Ljava/lang/Object;

    .line 582
    .line 583
    .line 584
    move-result-object v1

    .line 585
    check-cast v1, Ljava/util/List;

    .line 586
    .line 587
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 588
    .line 589
    .line 590
    move-result-object v1

    .line 591
    :goto_a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 592
    .line 593
    .line 594
    move-result v2

    .line 595
    if-eqz v2, :cond_9

    .line 596
    .line 597
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 598
    .line 599
    .line 600
    move-result-object v2

    .line 601
    check-cast v2, Ljava/lang/String;

    .line 602
    .line 603
    invoke-static {p0, v2}, Lpu;->j(Lx39;Ljava/lang/String;)V

    .line 604
    .line 605
    .line 606
    goto :goto_a

    .line 607
    :cond_9
    iget-object p0, p0, Lx39;->j0:Lxy0;

    .line 608
    .line 609
    iget-object p0, p0, Lxy0;->g0:Ljava/lang/Object;

    .line 610
    .line 611
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 612
    .line 613
    .line 614
    move-result-wide v1

    .line 615
    new-instance p0, Lfs5;

    .line 616
    .line 617
    const-string v3, "last_cancel_all_time_ms"

    .line 618
    .line 619
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 620
    .line 621
    .line 622
    move-result-object v1

    .line 623
    invoke-direct {p0, v3, v1}, Lfs5;-><init>(Ljava/lang/String;Ljava/lang/Long;)V

    .line 624
    .line 625
    .line 626
    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->s()Lgs5;

    .line 627
    .line 628
    .line 629
    move-result-object v0

    .line 630
    invoke-virtual {v0, p0}, Lgs5;->b(Lfs5;)V

    .line 631
    .line 632
    .line 633
    return-void

    .line 634
    :pswitch_12
    iget-object v0, p0, Lsc;->Y:Ljava/lang/Object;

    .line 635
    .line 636
    check-cast v0, Lx39;

    .line 637
    .line 638
    iget-object p0, p0, Lsc;->Z:Ljava/lang/Object;

    .line 639
    .line 640
    check-cast p0, Ljava/util/UUID;

    .line 641
    .line 642
    invoke-virtual {p0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 643
    .line 644
    .line 645
    move-result-object p0

    .line 646
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 647
    .line 648
    .line 649
    invoke-static {v0, p0}, Lpu;->j(Lx39;Ljava/lang/String;)V

    .line 650
    .line 651
    .line 652
    return-void

    .line 653
    :pswitch_13
    invoke-direct {p0}, Lsc;->a()V

    .line 654
    .line 655
    .line 656
    return-void

    .line 657
    :pswitch_14
    iget-object v0, p0, Lsc;->Y:Ljava/lang/Object;

    .line 658
    .line 659
    check-cast v0, Ld41;

    .line 660
    .line 661
    iget-object p0, p0, Lsc;->Z:Ljava/lang/Object;

    .line 662
    .line 663
    check-cast p0, Lux;

    .line 664
    .line 665
    invoke-interface {v0, p0}, Ld41;->accept(Ljava/lang/Object;)V

    .line 666
    .line 667
    .line 668
    return-void

    .line 669
    :pswitch_15
    iget-object v0, p0, Lsc;->Y:Ljava/lang/Object;

    .line 670
    .line 671
    check-cast v0, Ljk0;

    .line 672
    .line 673
    iget-object p0, p0, Lsc;->Z:Ljava/lang/Object;

    .line 674
    .line 675
    check-cast p0, Lcj0;

    .line 676
    .line 677
    iget-object v2, v0, Ljk0;->a:Ljava/lang/Object;

    .line 678
    .line 679
    monitor-enter v2

    .line 680
    :try_start_7
    iget-object v3, v0, Ljk0;->c:Ljava/util/HashSet;

    .line 681
    .line 682
    invoke-virtual {v3, p0}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 683
    .line 684
    .line 685
    iget-object p0, v0, Ljk0;->c:Ljava/util/HashSet;

    .line 686
    .line 687
    invoke-virtual {p0}, Ljava/util/HashSet;->isEmpty()Z

    .line 688
    .line 689
    .line 690
    move-result p0

    .line 691
    if-eqz p0, :cond_a

    .line 692
    .line 693
    iget-object p0, v0, Ljk0;->e:Lqd0;

    .line 694
    .line 695
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 696
    .line 697
    .line 698
    iget-object p0, v0, Ljk0;->e:Lqd0;

    .line 699
    .line 700
    invoke-virtual {p0, v1}, Lqd0;->b(Ljava/lang/Object;)Z

    .line 701
    .line 702
    .line 703
    iput-object v1, v0, Ljk0;->e:Lqd0;

    .line 704
    .line 705
    iput-object v1, v0, Ljk0;->d:Lxb4;

    .line 706
    .line 707
    goto :goto_b

    .line 708
    :catchall_2
    move-exception p0

    .line 709
    goto :goto_c

    .line 710
    :cond_a
    :goto_b
    monitor-exit v2

    .line 711
    return-void

    .line 712
    :goto_c
    monitor-exit v2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 713
    throw p0

    .line 714
    :pswitch_16
    iget-object v0, p0, Lsc;->Y:Ljava/lang/Object;

    .line 715
    .line 716
    check-cast v0, Laj0;

    .line 717
    .line 718
    iget-object p0, p0, Lsc;->Z:Ljava/lang/Object;

    .line 719
    .line 720
    check-cast p0, Lbk0;

    .line 721
    .line 722
    invoke-interface {v0}, Lxi0;->b()Lqc4;

    .line 723
    .line 724
    .line 725
    move-result-object v0

    .line 726
    invoke-virtual {v0, p0}, Lqc4;->f(Lv85;)V

    .line 727
    .line 728
    .line 729
    return-void

    .line 730
    :pswitch_17
    iget-object v0, p0, Lsc;->Y:Ljava/lang/Object;

    .line 731
    .line 732
    check-cast v0, Lcj0;

    .line 733
    .line 734
    iget-object p0, p0, Lsc;->Z:Ljava/lang/Object;

    .line 735
    .line 736
    check-cast p0, Lv85;

    .line 737
    .line 738
    invoke-interface {v0}, Lcj0;->s()Laj0;

    .line 739
    .line 740
    .line 741
    move-result-object v0

    .line 742
    invoke-interface {v0}, Lxi0;->b()Lqc4;

    .line 743
    .line 744
    .line 745
    move-result-object v0

    .line 746
    invoke-virtual {v0, p0}, Lqc4;->i(Lv85;)V

    .line 747
    .line 748
    .line 749
    return-void

    .line 750
    :pswitch_18
    iget-object v0, p0, Lsc;->Y:Ljava/lang/Object;

    .line 751
    .line 752
    check-cast v0, Lck0;

    .line 753
    .line 754
    iget-object p0, p0, Lsc;->Z:Ljava/lang/Object;

    .line 755
    .line 756
    check-cast p0, Ljava/util/Set;

    .line 757
    .line 758
    iget-object v0, v0, Lck0;->a:Ld6;

    .line 759
    .line 760
    invoke-static {}, Ls08;->b()V

    .line 761
    .line 762
    .line 763
    iget-object v1, v0, Ld6;->Y:Ljava/lang/Object;

    .line 764
    .line 765
    monitor-enter v1

    .line 766
    :try_start_8
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 767
    .line 768
    .line 769
    move-result-object p0

    .line 770
    :cond_b
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 771
    .line 772
    .line 773
    move-result v2

    .line 774
    if-eqz v2, :cond_e

    .line 775
    .line 776
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 777
    .line 778
    .line 779
    move-result-object v2

    .line 780
    check-cast v2, Lwi0;

    .line 781
    .line 782
    iget-object v3, v0, Ld6;->k0:Ljava/lang/Object;

    .line 783
    .line 784
    check-cast v3, Ljava/util/HashMap;

    .line 785
    .line 786
    invoke-virtual {v3}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 787
    .line 788
    .line 789
    move-result-object v3

    .line 790
    check-cast v3, Ljava/lang/Iterable;

    .line 791
    .line 792
    new-instance v4, Ljava/util/ArrayList;

    .line 793
    .line 794
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 795
    .line 796
    .line 797
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 798
    .line 799
    .line 800
    move-result-object v3

    .line 801
    :cond_c
    :goto_d
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 802
    .line 803
    .line 804
    move-result v5

    .line 805
    if-eqz v5, :cond_d

    .line 806
    .line 807
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 808
    .line 809
    .line 810
    move-result-object v5

    .line 811
    move-object v6, v5

    .line 812
    check-cast v6, Lwi0;

    .line 813
    .line 814
    iget-object v6, v6, Lwi0;->a:Ljava/util/ArrayList;

    .line 815
    .line 816
    iget-object v7, v2, Lwi0;->a:Ljava/util/ArrayList;

    .line 817
    .line 818
    invoke-virtual {v6, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 819
    .line 820
    .line 821
    move-result v6

    .line 822
    if-eqz v6, :cond_c

    .line 823
    .line 824
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 825
    .line 826
    .line 827
    goto :goto_d

    .line 828
    :catchall_3
    move-exception p0

    .line 829
    goto :goto_f

    .line 830
    :cond_d
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 831
    .line 832
    .line 833
    move-result-object v2

    .line 834
    :goto_e
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 835
    .line 836
    .line 837
    move-result v3

    .line 838
    if-eqz v3, :cond_b

    .line 839
    .line 840
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 841
    .line 842
    .line 843
    move-result-object v3

    .line 844
    check-cast v3, Lwi0;

    .line 845
    .line 846
    iget-object v4, v0, Ld6;->k0:Ljava/lang/Object;

    .line 847
    .line 848
    check-cast v4, Ljava/util/HashMap;

    .line 849
    .line 850
    invoke-virtual {v4, v3}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 851
    .line 852
    .line 853
    goto :goto_e

    .line 854
    :cond_e
    monitor-exit v1

    .line 855
    return-void

    .line 856
    :goto_f
    monitor-exit v1

    .line 857
    throw p0

    .line 858
    :pswitch_19
    iget-object v0, p0, Lsc;->Y:Ljava/lang/Object;

    .line 859
    .line 860
    check-cast v0, Lol0;

    .line 861
    .line 862
    iget-object p0, p0, Lsc;->Z:Ljava/lang/Object;

    .line 863
    .line 864
    check-cast p0, Landroid/hardware/camera2/CameraCaptureSession;

    .line 865
    .line 866
    iget-object v0, v0, Lol0;->a:Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;

    .line 867
    .line 868
    const/4 v1, -0x1

    .line 869
    invoke-virtual {v0, p0, v1}, Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;->onCaptureSequenceAborted(Landroid/hardware/camera2/CameraCaptureSession;I)V

    .line 870
    .line 871
    .line 872
    return-void

    .line 873
    :pswitch_1a
    iget-object v0, p0, Lsc;->Y:Ljava/lang/Object;

    .line 874
    .line 875
    check-cast v0, Llp;

    .line 876
    .line 877
    iget-object p0, p0, Lsc;->Z:Ljava/lang/Object;

    .line 878
    .line 879
    check-cast p0, Ljava/lang/Runnable;

    .line 880
    .line 881
    :try_start_9
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 882
    .line 883
    .line 884
    invoke-virtual {v0}, Llp;->a()V

    .line 885
    .line 886
    .line 887
    return-void

    .line 888
    :catchall_4
    move-exception p0

    .line 889
    invoke-virtual {v0}, Llp;->a()V

    .line 890
    .line 891
    .line 892
    throw p0

    .line 893
    :pswitch_1b
    iget-object v0, p0, Lsc;->Y:Ljava/lang/Object;

    .line 894
    .line 895
    check-cast v0, Lo8;

    .line 896
    .line 897
    iget-object p0, p0, Lsc;->Z:Ljava/lang/Object;

    .line 898
    .line 899
    check-cast p0, Lp63;

    .line 900
    .line 901
    invoke-interface {p0, v0}, Lp63;->k(Lq63;)V

    .line 902
    .line 903
    .line 904
    return-void

    .line 905
    :pswitch_1c
    iget-object v0, p0, Lsc;->Y:Ljava/lang/Object;

    .line 906
    .line 907
    check-cast v0, Lvc;

    .line 908
    .line 909
    iget-object p0, p0, Lsc;->Z:Ljava/lang/Object;

    .line 910
    .line 911
    check-cast p0, Landroid/util/LongSparseArray;

    .line 912
    .line 913
    invoke-static {v0, p0}, Ltc;->d(Lvc;Landroid/util/LongSparseArray;)V

    .line 914
    .line 915
    .line 916
    return-void

    .line 917
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
