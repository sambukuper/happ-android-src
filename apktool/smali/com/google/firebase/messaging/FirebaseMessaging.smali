.class public Lcom/google/firebase/messaging/FirebaseMessaging;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static l:Ly45;

.field public static m:Lw06;

.field public static n:Ljava/util/concurrent/ScheduledThreadPoolExecutor;


# instance fields
.field public final a:Lxa2;

.field public final b:Landroid/content/Context;

.field public final c:Lfu6;

.field public final d:Ly5;

.field public final e:Lxd6;

.field public final f:Lsa2;

.field public final g:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

.field public final h:Ljava/util/concurrent/ThreadPoolExecutor;

.field public final i:Lr41;

.field public final j:Lnb2;

.field public k:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lvy0;

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    invoke-direct {v0, v1}, Lvy0;-><init>(B)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/google/firebase/messaging/FirebaseMessaging;->m:Lw06;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lxa2;Lw06;Lw06;Lnb2;Lw06;Lbq7;)V
    .locals 22

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    move-object/from16 v4, p1

    .line 4
    .line 5
    new-instance v11, Lr41;

    .line 6
    .line 7
    invoke-virtual {v4}, Lxa2;->a()V

    .line 8
    .line 9
    .line 10
    iget-object v0, v4, Lxa2;->a:Landroid/content/Context;

    .line 11
    .line 12
    invoke-direct {v11, v0}, Lr41;-><init>(Landroid/content/Context;)V

    .line 13
    .line 14
    .line 15
    new-instance v10, Lfu6;

    .line 16
    .line 17
    move-object/from16 v9, p2

    .line 18
    .line 19
    move-object v7, v4

    .line 20
    move-object v6, v10

    .line 21
    move-object v8, v11

    .line 22
    move-object/from16 v10, p3

    .line 23
    .line 24
    move-object/from16 v11, p4

    .line 25
    .line 26
    invoke-direct/range {v6 .. v11}, Lfu6;-><init>(Lxa2;Lr41;Lw06;Lw06;Lnb2;)V

    .line 27
    .line 28
    .line 29
    move-object v10, v6

    .line 30
    move-object v9, v11

    .line 31
    move-object v11, v8

    .line 32
    new-instance v0, Le25;

    .line 33
    .line 34
    const-string v1, "Firebase-Messaging-Task"

    .line 35
    .line 36
    invoke-direct {v0, v1}, Le25;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    new-instance v12, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 44
    .line 45
    new-instance v1, Le25;

    .line 46
    .line 47
    const-string v2, "Firebase-Messaging-Init"

    .line 48
    .line 49
    invoke-direct {v1, v2}, Le25;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    const/4 v13, 0x1

    .line 53
    invoke-direct {v12, v13, v1}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;-><init>(ILjava/util/concurrent/ThreadFactory;)V

    .line 54
    .line 55
    .line 56
    const-string v1, "Firebase-Messaging-File-Io"

    .line 57
    .line 58
    new-instance v14, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 59
    .line 60
    sget-object v19, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 61
    .line 62
    new-instance v20, Ljava/util/concurrent/LinkedBlockingQueue;

    .line 63
    .line 64
    invoke-direct/range {v20 .. v20}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    .line 65
    .line 66
    .line 67
    new-instance v2, Le25;

    .line 68
    .line 69
    invoke-direct {v2, v1}, Le25;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    const/4 v15, 0x0

    .line 73
    const/16 v16, 0x1

    .line 74
    .line 75
    const-wide/16 v17, 0x1e

    .line 76
    .line 77
    move-object/from16 v21, v2

    .line 78
    .line 79
    invoke-direct/range {v14 .. v21}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    .line 80
    .line 81
    .line 82
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 83
    .line 84
    .line 85
    iput-boolean v15, v5, Lcom/google/firebase/messaging/FirebaseMessaging;->k:Z

    .line 86
    .line 87
    sput-object p5, Lcom/google/firebase/messaging/FirebaseMessaging;->m:Lw06;

    .line 88
    .line 89
    iput-object v4, v5, Lcom/google/firebase/messaging/FirebaseMessaging;->a:Lxa2;

    .line 90
    .line 91
    new-instance v1, Lsa2;

    .line 92
    .line 93
    move-object/from16 v2, p6

    .line 94
    .line 95
    invoke-direct {v1, v5, v2}, Lsa2;-><init>(Lcom/google/firebase/messaging/FirebaseMessaging;Lbq7;)V

    .line 96
    .line 97
    .line 98
    iput-object v1, v5, Lcom/google/firebase/messaging/FirebaseMessaging;->f:Lsa2;

    .line 99
    .line 100
    invoke-virtual {v4}, Lxa2;->a()V

    .line 101
    .line 102
    .line 103
    iget-object v1, v4, Lxa2;->a:Landroid/content/Context;

    .line 104
    .line 105
    iput-object v1, v5, Lcom/google/firebase/messaging/FirebaseMessaging;->b:Landroid/content/Context;

    .line 106
    .line 107
    new-instance v2, Lu5;

    .line 108
    .line 109
    invoke-direct {v2, v13}, Lu5;-><init>(B)V

    .line 110
    .line 111
    .line 112
    iput-object v11, v5, Lcom/google/firebase/messaging/FirebaseMessaging;->i:Lr41;

    .line 113
    .line 114
    iput-object v10, v5, Lcom/google/firebase/messaging/FirebaseMessaging;->c:Lfu6;

    .line 115
    .line 116
    iput-object v9, v5, Lcom/google/firebase/messaging/FirebaseMessaging;->j:Lnb2;

    .line 117
    .line 118
    new-instance v6, Ly5;

    .line 119
    .line 120
    move-object v7, v1

    .line 121
    move-object v8, v4

    .line 122
    invoke-direct/range {v6 .. v11}, Ly5;-><init>(Landroid/content/Context;Lxa2;Lnb2;Lfu6;Lr41;)V

    .line 123
    .line 124
    .line 125
    iput-object v6, v5, Lcom/google/firebase/messaging/FirebaseMessaging;->d:Ly5;

    .line 126
    .line 127
    new-instance v3, Lxd6;

    .line 128
    .line 129
    invoke-direct {v3, v0}, Lxd6;-><init>(Ljava/util/concurrent/ExecutorService;)V

    .line 130
    .line 131
    .line 132
    iput-object v3, v5, Lcom/google/firebase/messaging/FirebaseMessaging;->e:Lxd6;

    .line 133
    .line 134
    iput-object v12, v5, Lcom/google/firebase/messaging/FirebaseMessaging;->g:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 135
    .line 136
    iput-object v14, v5, Lcom/google/firebase/messaging/FirebaseMessaging;->h:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 137
    .line 138
    invoke-virtual {v4}, Lxa2;->a()V

    .line 139
    .line 140
    .line 141
    iget-object v0, v4, Lxa2;->a:Landroid/content/Context;

    .line 142
    .line 143
    instance-of v3, v0, Landroid/app/Application;

    .line 144
    .line 145
    if-eqz v3, :cond_0

    .line 146
    .line 147
    check-cast v0, Landroid/app/Application;

    .line 148
    .line 149
    invoke-virtual {v0, v2}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 150
    .line 151
    .line 152
    goto :goto_0

    .line 153
    :cond_0
    invoke-static {v0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    :goto_0
    invoke-virtual {v6}, Ly5;->R()Z

    .line 157
    .line 158
    .line 159
    move-result v0

    .line 160
    if-eqz v0, :cond_1

    .line 161
    .line 162
    new-instance v0, Lqb2;

    .line 163
    .line 164
    invoke-direct {v0, v5}, Lqb2;-><init>(Lcom/google/firebase/messaging/FirebaseMessaging;)V

    .line 165
    .line 166
    .line 167
    move-object/from16 v2, p4

    .line 168
    .line 169
    check-cast v2, Lmb2;

    .line 170
    .line 171
    monitor-enter v2

    .line 172
    :try_start_0
    iget-object v3, v2, Lmb2;->j:Ljava/util/HashSet;

    .line 173
    .line 174
    invoke-virtual {v3, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 175
    .line 176
    .line 177
    monitor-exit v2

    .line 178
    goto :goto_1

    .line 179
    :catchall_0
    move-exception v0

    .line 180
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 181
    throw v0

    .line 182
    :cond_1
    :goto_1
    new-instance v0, Lrb2;

    .line 183
    .line 184
    invoke-direct {v0, v5, v15}, Lrb2;-><init>(Lcom/google/firebase/messaging/FirebaseMessaging;B)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v12, v0}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 188
    .line 189
    .line 190
    new-instance v2, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 191
    .line 192
    new-instance v0, Le25;

    .line 193
    .line 194
    const-string v3, "Firebase-Messaging-Topics-Io"

    .line 195
    .line 196
    invoke-direct {v0, v3}, Le25;-><init>(Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    invoke-direct {v2, v13, v0}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;-><init>(ILjava/util/concurrent/ThreadFactory;)V

    .line 200
    .line 201
    .line 202
    new-instance v0, Lpc8;

    .line 203
    .line 204
    move-object/from16 v6, p4

    .line 205
    .line 206
    move-object v3, v11

    .line 207
    invoke-direct/range {v0 .. v6}, Lpc8;-><init>(Landroid/content/Context;Ljava/util/concurrent/ScheduledThreadPoolExecutor;Lr41;Lxa2;Lcom/google/firebase/messaging/FirebaseMessaging;Lnb2;)V

    .line 208
    .line 209
    .line 210
    invoke-static {v2, v0}, Lg28;->d(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lfb9;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    new-instance v1, Lsb2;

    .line 215
    .line 216
    invoke-direct {v1, v5, v15}, Lsb2;-><init>(Lcom/google/firebase/messaging/FirebaseMessaging;B)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v0, v12, v1}, Lfb9;->c(Ljava/util/concurrent/Executor;Lab5;)V

    .line 220
    .line 221
    .line 222
    new-instance v0, Lrb2;

    .line 223
    .line 224
    invoke-direct {v0, v5, v13}, Lrb2;-><init>(Lcom/google/firebase/messaging/FirebaseMessaging;B)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v12, v0}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 228
    .line 229
    .line 230
    return-void
.end method

.method public static b(Ljava/lang/Runnable;J)V
    .locals 4

    .line 1
    const-class v0, Lcom/google/firebase/messaging/FirebaseMessaging;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lcom/google/firebase/messaging/FirebaseMessaging;->n:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    new-instance v1, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 9
    .line 10
    new-instance v2, Le25;

    .line 11
    .line 12
    const-string v3, "TAG"

    .line 13
    .line 14
    invoke-direct {v2, v3}, Le25;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 v3, 0x1

    .line 18
    invoke-direct {v1, v3, v2}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;-><init>(ILjava/util/concurrent/ThreadFactory;)V

    .line 19
    .line 20
    .line 21
    sput-object v1, Lcom/google/firebase/messaging/FirebaseMessaging;->n:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception p0

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    :goto_0
    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 27
    .line 28
    invoke-interface {v1, p0, p1, p2, v2}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 29
    .line 30
    .line 31
    monitor-exit v0

    .line 32
    return-void

    .line 33
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    throw p0
.end method

.method public static declared-synchronized c(Landroid/content/Context;)Ly45;
    .locals 2

    .line 1
    const-class v0, Lcom/google/firebase/messaging/FirebaseMessaging;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lcom/google/firebase/messaging/FirebaseMessaging;->l:Ly45;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    new-instance v1, Ly45;

    .line 9
    .line 10
    invoke-direct {v1, p0}, Ly45;-><init>(Landroid/content/Context;)V

    .line 11
    .line 12
    .line 13
    sput-object v1, Lcom/google/firebase/messaging/FirebaseMessaging;->l:Ly45;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception p0

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    :goto_0
    monitor-exit v0

    .line 19
    return-object v1

    .line 20
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 21
    throw p0
.end method

.method public static declared-synchronized getInstance(Lxa2;)Lcom/google/firebase/messaging/FirebaseMessaging;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    const-class v0, Lcom/google/firebase/messaging/FirebaseMessaging;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {p0}, Lxa2;->a()V

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, Lxa2;->d:Lxy0;

    .line 8
    .line 9
    invoke-interface {p0, v0}, Lny0;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, Lcom/google/firebase/messaging/FirebaseMessaging;

    .line 14
    .line 15
    const-string v1, "Firebase Messaging component is not present"

    .line 16
    .line 17
    invoke-static {p0, v1}, Lw45;->t(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    .line 20
    monitor-exit v0

    .line 21
    return-object p0

    .line 22
    :catchall_0
    move-exception p0

    .line 23
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 24
    throw p0
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 8

    .line 1
    invoke-virtual {p0}, Lcom/google/firebase/messaging/FirebaseMessaging;->e()Lgj4;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, v0}, Lcom/google/firebase/messaging/FirebaseMessaging;->i(Lgj4;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    iget-object p0, v0, Lgj4;->Y:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Ljava/lang/String;

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    iget-object v1, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->a:Lxa2;

    .line 17
    .line 18
    invoke-static {v1}, Lr41;->g(Lxa2;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    iget-object v2, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->e:Lxd6;

    .line 23
    .line 24
    monitor-enter v2

    .line 25
    :try_start_0
    iget-object v3, v2, Lxd6;->Z:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v3, Lvt;

    .line 28
    .line 29
    invoke-virtual {v3, v1}, Ll97;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    check-cast v3, Lfb9;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    .line 35
    if-eqz v3, :cond_1

    .line 36
    .line 37
    monitor-exit v2

    .line 38
    goto :goto_0

    .line 39
    :cond_1
    :try_start_1
    iget-object v3, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->d:Ly5;

    .line 40
    .line 41
    invoke-virtual {v3}, Ly5;->Y()Lfb9;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    new-instance v5, Le25;

    .line 46
    .line 47
    const-string v6, "Firebase-Messaging-Task"

    .line 48
    .line 49
    invoke-direct {v5, v6}, Le25;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-static {v5}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    new-instance v6, Lo61;

    .line 57
    .line 58
    const/16 v7, 0x9

    .line 59
    .line 60
    invoke-direct {v6, v3, v7}, Lo61;-><init>(Ljava/lang/Object;B)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v4, v5, v6}, Lfb9;->e(Ljava/util/concurrent/Executor;Lr51;)Lfb9;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    iget-object v4, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->h:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 68
    .line 69
    new-instance v5, Lmf1;

    .line 70
    .line 71
    const/4 v6, 0x1

    .line 72
    invoke-direct {v5, p0, v1, v0, v6}, Lmf1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 73
    .line 74
    .line 75
    new-instance p0, Lfb9;

    .line 76
    .line 77
    invoke-direct {p0}, Lfb9;-><init>()V

    .line 78
    .line 79
    .line 80
    new-instance v0, Lna9;

    .line 81
    .line 82
    invoke-direct {v0, v4, v5, p0}, Lna9;-><init>(Ljava/util/concurrent/Executor;Liw7;Lfb9;)V

    .line 83
    .line 84
    .line 85
    iget-object v4, v3, Lfb9;->b:Lo8;

    .line 86
    .line 87
    invoke-virtual {v4, v0}, Lo8;->r(Lza9;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v3}, Lfb9;->n()V

    .line 91
    .line 92
    .line 93
    iget-object v0, v2, Lxd6;->Y:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v0, Ljava/util/concurrent/Executor;

    .line 96
    .line 97
    new-instance v3, Ljn0;

    .line 98
    .line 99
    const/16 v4, 0xa

    .line 100
    .line 101
    invoke-direct {v3, v2, v1, v4}, Ljn0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {p0, v0, v3}, Lfb9;->e(Ljava/util/concurrent/Executor;Lr51;)Lfb9;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    iget-object p0, v2, Lxd6;->Z:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast p0, Lvt;

    .line 111
    .line 112
    invoke-virtual {p0, v1, v3}, Ll97;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 113
    .line 114
    .line 115
    monitor-exit v2

    .line 116
    :goto_0
    :try_start_2
    invoke-static {v3}, Lg28;->b(Lfb9;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    check-cast p0, Ljava/lang/String;
    :try_end_2
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0

    .line 121
    .line 122
    return-object p0

    .line 123
    :catch_0
    move-exception p0

    .line 124
    new-instance v0, Ljava/io/IOException;

    .line 125
    .line 126
    const-string v1, "FCM Registration failed!"

    .line 127
    .line 128
    invoke-direct {v0, v1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 129
    .line 130
    .line 131
    throw v0

    .line 132
    :catchall_0
    move-exception p0

    .line 133
    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 134
    throw p0
.end method

.method public final d()Lfb9;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->d:Ly5;

    .line 2
    .line 3
    invoke-virtual {v0}, Ly5;->R()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 10
    .line 11
    const-string v0, "API disabled. Please use {@link #register()} instead or enable this API by removing {@code <meta-data android:name=\"firebase_messaging_installation_id_enabled\" android:value=\"true\" />} from your app\'s manifest."

    .line 12
    .line 13
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-static {p0}, Lg28;->k(Ljava/lang/Exception;)Lfb9;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :cond_0
    new-instance v0, Lz18;

    .line 22
    .line 23
    invoke-direct {v0}, Lz18;-><init>()V

    .line 24
    .line 25
    .line 26
    new-instance v1, Lsc;

    .line 27
    .line 28
    const/16 v2, 0x18

    .line 29
    .line 30
    invoke-direct {v1, p0, v0, v2}, Lsc;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 31
    .line 32
    .line 33
    iget-object p0, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->g:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 34
    .line 35
    invoke-virtual {p0, v1}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 36
    .line 37
    .line 38
    iget-object p0, v0, Lz18;->a:Lfb9;

    .line 39
    .line 40
    return-object p0
.end method

.method public final e()Lgj4;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->b:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/google/firebase/messaging/FirebaseMessaging;->c(Landroid/content/Context;)Ly45;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "[DEFAULT]"

    .line 8
    .line 9
    iget-object v2, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->a:Lxa2;

    .line 10
    .line 11
    invoke-virtual {v2}, Lxa2;->a()V

    .line 12
    .line 13
    .line 14
    iget-object v3, v2, Lxa2;->b:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    const-string v1, ""

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {v2}, Lxa2;->c()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    :goto_0
    iget-object p0, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->a:Lxa2;

    .line 30
    .line 31
    invoke-static {p0}, Lr41;->g(Lxa2;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    monitor-enter v0

    .line 36
    :try_start_0
    iget-object v2, v0, Ly45;->X:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v2, Landroid/content/SharedPreferences;

    .line 39
    .line 40
    new-instance v3, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const-string v1, "|T|"

    .line 46
    .line 47
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string p0, "|*"

    .line 54
    .line 55
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    const/4 v1, 0x0

    .line 63
    invoke-interface {v2, p0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-static {p0}, Lgj4;->g(Ljava/lang/String;)Lgj4;

    .line 68
    .line 69
    .line 70
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 71
    monitor-exit v0

    .line 72
    return-object p0

    .line 73
    :catchall_0
    move-exception p0

    .line 74
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 75
    throw p0
.end method

.method public final f()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->c:Lfu6;

    .line 2
    .line 3
    iget-object v0, v0, Lfu6;->f0:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lyq6;

    .line 6
    .line 7
    iget-object v1, v0, Lyq6;->c:Lcb0;

    .line 8
    .line 9
    invoke-virtual {v1}, Lcb0;->w()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const v2, 0xe5ee4e0

    .line 14
    .line 15
    .line 16
    const/4 v3, 0x1

    .line 17
    if-lt v1, v2, :cond_0

    .line 18
    .line 19
    iget-object v0, v0, Lyq6;->b:Landroid/content/Context;

    .line 20
    .line 21
    invoke-static {v0}, Leb9;->n(Landroid/content/Context;)Leb9;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sget-object v1, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 26
    .line 27
    new-instance v2, Lbb9;

    .line 28
    .line 29
    monitor-enter v0

    .line 30
    :try_start_0
    iget v4, v0, Leb9;->Y:I

    .line 31
    .line 32
    add-int/lit8 v5, v4, 0x1

    .line 33
    .line 34
    iput v5, v0, Leb9;->Y:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    .line 36
    monitor-exit v0

    .line 37
    const/4 v5, 0x5

    .line 38
    invoke-direct {v2, v4, v5, v1, v3}, Lbb9;-><init>(IILandroid/os/Bundle;B)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v2}, Leb9;->o(Lbb9;)Lfb9;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sget-object v1, Ldp1;->f0:Ldp1;

    .line 46
    .line 47
    sget-object v2, Lf08;->Z:Lf08;

    .line 48
    .line 49
    invoke-virtual {v0, v1, v2}, Lfb9;->d(Ljava/util/concurrent/Executor;Lr51;)Lfb9;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    goto :goto_0

    .line 54
    :catchall_0
    move-exception p0

    .line 55
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 56
    throw p0

    .line 57
    :cond_0
    new-instance v0, Ljava/io/IOException;

    .line 58
    .line 59
    const-string v1, "SERVICE_NOT_AVAILABLE"

    .line 60
    .line 61
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-static {v0}, Lg28;->k(Ljava/lang/Exception;)Lfb9;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    :goto_0
    iget-object v1, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->g:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 69
    .line 70
    new-instance v2, Lsb2;

    .line 71
    .line 72
    invoke-direct {v2, p0, v3}, Lsb2;-><init>(Lcom/google/firebase/messaging/FirebaseMessaging;B)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0, v1, v2}, Lfb9;->c(Ljava/util/concurrent/Executor;Lab5;)V

    .line 76
    .line 77
    .line 78
    return-void
.end method

.method public final g()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->b:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0}, Lwa;->u(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lwa;->x(Landroid/content/Context;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    goto :goto_1

    .line 13
    :cond_0
    iget-object p0, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->a:Lxa2;

    .line 14
    .line 15
    invoke-virtual {p0}, Lxa2;->a()V

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, Lxa2;->d:Lxy0;

    .line 19
    .line 20
    const-class v0, Lb9;

    .line 21
    .line 22
    invoke-interface {p0, v0}, Lny0;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    if-eqz p0, :cond_1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    invoke-static {}, Lkm4;->w()Z

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    if-eqz p0, :cond_2

    .line 34
    .line 35
    sget-object p0, Lcom/google/firebase/messaging/FirebaseMessaging;->m:Lw06;

    .line 36
    .line 37
    if-eqz p0, :cond_2

    .line 38
    .line 39
    :goto_0
    const/4 p0, 0x1

    .line 40
    return p0

    .line 41
    :cond_2
    :goto_1
    const/4 p0, 0x0

    .line 42
    return p0
.end method

.method public final declared-synchronized h(J)V
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    const-wide/16 v0, 0x2

    .line 3
    .line 4
    mul-long/2addr v0, p1

    .line 5
    const-wide/16 v2, 0x1e

    .line 6
    .line 7
    :try_start_0
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    const-wide/16 v2, 0x7080

    .line 12
    .line 13
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    new-instance v2, Lsz7;

    .line 18
    .line 19
    invoke-direct {v2, p0, v0, v1}, Lsz7;-><init>(Lcom/google/firebase/messaging/FirebaseMessaging;J)V

    .line 20
    .line 21
    .line 22
    invoke-static {v2, p1, p2}, Lcom/google/firebase/messaging/FirebaseMessaging;->b(Ljava/lang/Runnable;J)V

    .line 23
    .line 24
    .line 25
    const/4 p1, 0x1

    .line 26
    iput-boolean p1, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->k:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    monitor-exit p0

    .line 29
    return-void

    .line 30
    :catchall_0
    move-exception p1

    .line 31
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    throw p1
.end method

.method public final i(Lgj4;)Z
    .locals 9

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eqz p1, :cond_3

    .line 3
    .line 4
    iget-object v1, p1, Lgj4;->Y:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v1, Ljava/lang/String;

    .line 7
    .line 8
    iget-object v2, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->i:Lr41;

    .line 9
    .line 10
    invoke-virtual {v2}, Lr41;->f()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 15
    .line 16
    .line 17
    move-result-wide v3

    .line 18
    iget-wide v5, p1, Lgj4;->X:J

    .line 19
    .line 20
    const-wide/32 v7, 0x240c8400

    .line 21
    .line 22
    .line 23
    add-long/2addr v5, v7

    .line 24
    cmp-long v3, v3, v5

    .line 25
    .line 26
    if-gtz v3, :cond_3

    .line 27
    .line 28
    iget-object p1, p1, Lgj4;->Z:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p1, Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-nez p1, :cond_0

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_0
    iget-object p1, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->d:Ly5;

    .line 40
    .line 41
    invoke-virtual {p1}, Ly5;->R()Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    if-eqz p1, :cond_1

    .line 46
    .line 47
    :try_start_0
    iget-object p0, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->j:Lnb2;

    .line 48
    .line 49
    check-cast p0, Lmb2;

    .line 50
    .line 51
    invoke-virtual {p0}, Lmb2;->c()Lfb9;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-static {p0}, Lg28;->b(Lfb9;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    check-cast p0, Ljava/lang/String;
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :catch_0
    const/4 p0, 0x0

    .line 63
    :goto_0
    invoke-virtual {v1, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 64
    .line 65
    .line 66
    move-result p0

    .line 67
    xor-int/2addr p0, v0

    .line 68
    return p0

    .line 69
    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 70
    .line 71
    .line 72
    move-result p0

    .line 73
    const/16 p1, 0x16

    .line 74
    .line 75
    if-gt p0, p1, :cond_2

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_2
    const/4 p0, 0x0

    .line 79
    return p0

    .line 80
    :cond_3
    :goto_1
    return v0
.end method
