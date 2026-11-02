.class public Ly45;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lq63;
.implements Lbq1;
.implements Liv5;
.implements Lfz6;
.implements Lna1;
.implements Lkt5;
.implements Lhw5;
.implements Li04;
.implements Lbd6;
.implements Lqe2;
.implements Lv17;
.implements Lu4;
.implements Llt4;


# instance fields
.field public X:Ljava/lang/Object;


# direct methods
.method public constructor <init>(B)V
    .locals 1

    sparse-switch p1, :sswitch_data_0

    .line 101
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 102
    new-instance p1, Lqi4;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Lqi4;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Ly45;->X:Ljava/lang/Object;

    return-void

    .line 103
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 104
    new-instance p1, Lmq7;

    invoke-direct {p1, p0}, Lmq7;-><init>(Ly45;)V

    .line 105
    new-instance v0, Lvz7;

    invoke-direct {v0, p1}, Lvz7;-><init>(Ldn2;)V

    .line 106
    iput-object v0, p0, Ly45;->X:Ljava/lang/Object;

    return-void

    .line 107
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 108
    new-instance p1, Ljava/util/Stack;

    invoke-direct {p1}, Ljava/util/Stack;-><init>()V

    iput-object p1, p0, Ly45;->X:Ljava/lang/Object;

    return-void

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_1
        0x1a -> :sswitch_0
    .end sparse-switch
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "com.google.android.gms.appid"

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Ly45;->X:Ljava/lang/Object;

    .line 12
    .line 13
    const-string v1, "com.google.android.gms.appid-no-backup"

    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/content/Context;->getNoBackupFilesDir()Ljava/io/File;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    new-instance v2, Ljava/io/File;

    .line 20
    .line 21
    invoke-direct {v2, p1, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    if-eqz p1, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    :try_start_0
    invoke-virtual {v2}, Ljava/io/File;->createNewFile()Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-eqz p1, :cond_1

    .line 36
    .line 37
    monitor-enter p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    :try_start_1
    invoke-interface {v0}, Landroid/content/SharedPreferences;->getAll()Ljava/util/Map;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    .line 43
    .line 44
    .line 45
    move-result p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 46
    :try_start_2
    monitor-exit p0

    .line 47
    if-nez p1, :cond_1

    .line 48
    .line 49
    monitor-enter p0
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 50
    :try_start_3
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 59
    .line 60
    .line 61
    :try_start_4
    monitor-exit p0
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    .line 62
    return-void

    .line 63
    :catchall_0
    move-exception p1

    .line 64
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 65
    :try_start_6
    throw p1
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_0

    .line 66
    :catchall_1
    move-exception p1

    .line 67
    :try_start_7
    monitor-exit p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 68
    :try_start_8
    throw p1
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_0

    .line 69
    :catch_0
    move-exception p0

    .line 70
    const-string p1, "FirebaseMessaging"

    .line 71
    .line 72
    const/4 v0, 0x3

    .line 73
    invoke-static {p1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    if-eqz p1, :cond_1

    .line 78
    .line 79
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    :cond_1
    :goto_0
    return-void
.end method

.method public constructor <init>(Lfi1;)V
    .locals 2

    .line 83
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 84
    new-instance v0, Lnx1;

    .line 85
    sget v1, Lsf7;->a:F

    .line 86
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput v1, v0, Lnx1;->a:F

    .line 87
    invoke-interface {p1}, Lfi1;->getDensity()F

    move-result p1

    .line 88
    sget v1, Lke2;->a:F

    const v1, 0x43c10b3d

    mul-float/2addr p1, v1

    const/high16 v1, 0x43200000    # 160.0f

    mul-float/2addr p1, v1

    const v1, 0x3f570a3d    # 0.84f

    mul-float/2addr p1, v1

    .line 89
    iput p1, v0, Lnx1;->b:F

    .line 90
    iput-object v0, p0, Ly45;->X:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 100
    iput-object p1, p0, Ly45;->X:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lsu/happ/proxyutility/ui/BaseActivity;)V
    .locals 3

    .line 91
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 92
    invoke-virtual {p1}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v0

    const-string v1, "RxPermissions"

    invoke-virtual {v0, v1}, Landroid/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/app/Fragment;

    move-result-object v0

    check-cast v0, Lor6;

    if-nez v0, :cond_0

    .line 93
    new-instance v0, Lor6;

    invoke-direct {v0}, Lor6;-><init>()V

    .line 94
    invoke-virtual {p1}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object p1

    .line 95
    invoke-virtual {p1}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    move-result-object v2

    .line 96
    invoke-virtual {v2, v0, v1}, Landroid/app/FragmentTransaction;->add(Landroid/app/Fragment;Ljava/lang/String;)Landroid/app/FragmentTransaction;

    move-result-object v1

    .line 97
    invoke-virtual {v1}, Landroid/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 98
    invoke-virtual {p1}, Landroid/app/FragmentManager;->executePendingTransactions()Z

    .line 99
    :cond_0
    iput-object v0, p0, Ly45;->X:Ljava/lang/Object;

    return-void
.end method

.method public static y(Ln63;)Ls57;
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    sget-object v1, Ld18;->b:Ld18;

    .line 6
    .line 7
    new-instance v2, Ls57;

    .line 8
    .line 9
    new-instance v3, Landroid/util/Size;

    .line 10
    .line 11
    invoke-interface {p0}, Ln63;->b()I

    .line 12
    .line 13
    .line 14
    move-result v4

    .line 15
    invoke-interface {p0}, Ln63;->a()I

    .line 16
    .line 17
    .line 18
    move-result v5

    .line 19
    invoke-direct {v3, v4, v5}, Landroid/util/Size;-><init>(II)V

    .line 20
    .line 21
    .line 22
    new-instance v4, Leh0;

    .line 23
    .line 24
    new-instance v5, Lgj4;

    .line 25
    .line 26
    invoke-interface {p0}, Ln63;->r0()Ld63;

    .line 27
    .line 28
    .line 29
    move-result-object v6

    .line 30
    invoke-interface {v6}, Ld63;->getTimestamp()J

    .line 31
    .line 32
    .line 33
    move-result-wide v6

    .line 34
    invoke-direct {v5, v6, v7, v0, v1}, Lgj4;-><init>(JLjava/lang/Object;Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    invoke-direct {v4, v5}, Leh0;-><init>(Ldh0;)V

    .line 38
    .line 39
    .line 40
    invoke-direct {v2, p0, v3, v4}, Ls57;-><init>(Ln63;Landroid/util/Size;Ld63;)V

    .line 41
    .line 42
    .line 43
    return-object v2
.end method


# virtual methods
.method public A([II)I
    .locals 13

    .line 1
    iget-object p0, p0, Ly45;->X:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ljq2;

    .line 4
    .line 5
    array-length v0, p1

    .line 6
    const/4 v1, 0x0

    .line 7
    if-eqz v0, :cond_1b

    .line 8
    .line 9
    array-length v0, p1

    .line 10
    const/4 v2, 0x1

    .line 11
    if-le v0, v2, :cond_2

    .line 12
    .line 13
    aget v3, p1, v1

    .line 14
    .line 15
    if-nez v3, :cond_2

    .line 16
    .line 17
    move v3, v2

    .line 18
    :goto_0
    if-ge v3, v0, :cond_0

    .line 19
    .line 20
    aget v4, p1, v3

    .line 21
    .line 22
    if-nez v4, :cond_0

    .line 23
    .line 24
    add-int/lit8 v3, v3, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    if-ne v3, v0, :cond_1

    .line 28
    .line 29
    filled-new-array {v1}, [I

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    sub-int/2addr v0, v3

    .line 35
    new-array v4, v0, [I

    .line 36
    .line 37
    invoke-static {p1, v3, v4, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 38
    .line 39
    .line 40
    move-object v0, v4

    .line 41
    goto :goto_1

    .line 42
    :cond_2
    move-object v0, p1

    .line 43
    :goto_1
    new-array v3, p2, [I

    .line 44
    .line 45
    move v4, v1

    .line 46
    move v5, v2

    .line 47
    :goto_2
    if-ge v4, p2, :cond_7

    .line 48
    .line 49
    iget-boolean v6, p0, Ljq2;->g:Z

    .line 50
    .line 51
    add-int/2addr v6, v4

    .line 52
    iget-object v7, p0, Ljq2;->a:[I

    .line 53
    .line 54
    aget v6, v7, v6

    .line 55
    .line 56
    if-nez v6, :cond_3

    .line 57
    .line 58
    array-length v6, v0

    .line 59
    sub-int/2addr v6, v2

    .line 60
    aget v6, v0, v6

    .line 61
    .line 62
    goto :goto_5

    .line 63
    :cond_3
    if-ne v6, v2, :cond_5

    .line 64
    .line 65
    array-length v6, v0

    .line 66
    move v7, v1

    .line 67
    move v8, v7

    .line 68
    :goto_3
    if-ge v8, v6, :cond_4

    .line 69
    .line 70
    aget v9, v0, v8

    .line 71
    .line 72
    sget-object v10, Ljq2;->h:Ljq2;

    .line 73
    .line 74
    xor-int/2addr v7, v9

    .line 75
    add-int/lit8 v8, v8, 0x1

    .line 76
    .line 77
    goto :goto_3

    .line 78
    :cond_4
    move v6, v7

    .line 79
    goto :goto_5

    .line 80
    :cond_5
    aget v7, v0, v1

    .line 81
    .line 82
    array-length v8, v0

    .line 83
    move v9, v2

    .line 84
    :goto_4
    if-ge v9, v8, :cond_4

    .line 85
    .line 86
    invoke-virtual {p0, v6, v7}, Ljq2;->c(II)I

    .line 87
    .line 88
    .line 89
    move-result v7

    .line 90
    aget v10, v0, v9

    .line 91
    .line 92
    xor-int/2addr v7, v10

    .line 93
    add-int/lit8 v9, v9, 0x1

    .line 94
    .line 95
    goto :goto_4

    .line 96
    :goto_5
    add-int/lit8 v7, p2, -0x1

    .line 97
    .line 98
    sub-int/2addr v7, v4

    .line 99
    aput v6, v3, v7

    .line 100
    .line 101
    if-eqz v6, :cond_6

    .line 102
    .line 103
    move v5, v1

    .line 104
    :cond_6
    add-int/lit8 v4, v4, 0x1

    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_7
    if-eqz v5, :cond_8

    .line 108
    .line 109
    return v1

    .line 110
    :cond_8
    new-instance v0, Lkq2;

    .line 111
    .line 112
    invoke-direct {v0, p0, v3}, Lkq2;-><init>(Ljq2;[I)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p0, p2, v2}, Ljq2;->a(II)Lkq2;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    iget-object v4, p0, Ljq2;->c:Lkq2;

    .line 120
    .line 121
    invoke-virtual {v3}, Lkq2;->d()I

    .line 122
    .line 123
    .line 124
    move-result v5

    .line 125
    invoke-virtual {v0}, Lkq2;->d()I

    .line 126
    .line 127
    .line 128
    move-result v6

    .line 129
    if-ge v5, v6, :cond_9

    .line 130
    .line 131
    goto :goto_6

    .line 132
    :cond_9
    move-object v12, v3

    .line 133
    move-object v3, v0

    .line 134
    move-object v0, v12

    .line 135
    :goto_6
    iget-object v5, p0, Ljq2;->d:Lkq2;

    .line 136
    .line 137
    move-object v6, v3

    .line 138
    move-object v3, v0

    .line 139
    move-object v0, v6

    .line 140
    move-object v6, v4

    .line 141
    :goto_7
    invoke-virtual {v0}, Lkq2;->d()I

    .line 142
    .line 143
    .line 144
    move-result v7

    .line 145
    mul-int/lit8 v7, v7, 0x2

    .line 146
    .line 147
    if-lt v7, p2, :cond_d

    .line 148
    .line 149
    invoke-virtual {v0}, Lkq2;->e()Z

    .line 150
    .line 151
    .line 152
    move-result v7

    .line 153
    if-nez v7, :cond_c

    .line 154
    .line 155
    invoke-virtual {v0}, Lkq2;->d()I

    .line 156
    .line 157
    .line 158
    move-result v7

    .line 159
    invoke-virtual {v0, v7}, Lkq2;->c(I)I

    .line 160
    .line 161
    .line 162
    move-result v7

    .line 163
    invoke-virtual {p0, v7}, Ljq2;->b(I)I

    .line 164
    .line 165
    .line 166
    move-result v7

    .line 167
    move-object v8, v4

    .line 168
    :goto_8
    invoke-virtual {v3}, Lkq2;->d()I

    .line 169
    .line 170
    .line 171
    move-result v9

    .line 172
    invoke-virtual {v0}, Lkq2;->d()I

    .line 173
    .line 174
    .line 175
    move-result v10

    .line 176
    if-lt v9, v10, :cond_a

    .line 177
    .line 178
    invoke-virtual {v3}, Lkq2;->e()Z

    .line 179
    .line 180
    .line 181
    move-result v9

    .line 182
    if-nez v9, :cond_a

    .line 183
    .line 184
    invoke-virtual {v3}, Lkq2;->d()I

    .line 185
    .line 186
    .line 187
    move-result v9

    .line 188
    invoke-virtual {v0}, Lkq2;->d()I

    .line 189
    .line 190
    .line 191
    move-result v10

    .line 192
    sub-int/2addr v9, v10

    .line 193
    invoke-virtual {v3}, Lkq2;->d()I

    .line 194
    .line 195
    .line 196
    move-result v10

    .line 197
    invoke-virtual {v3, v10}, Lkq2;->c(I)I

    .line 198
    .line 199
    .line 200
    move-result v10

    .line 201
    invoke-virtual {p0, v10, v7}, Ljq2;->c(II)I

    .line 202
    .line 203
    .line 204
    move-result v10

    .line 205
    invoke-virtual {p0, v9, v10}, Ljq2;->a(II)Lkq2;

    .line 206
    .line 207
    .line 208
    move-result-object v11

    .line 209
    invoke-virtual {v8, v11}, Lkq2;->a(Lkq2;)Lkq2;

    .line 210
    .line 211
    .line 212
    move-result-object v8

    .line 213
    invoke-virtual {v0, v9, v10}, Lkq2;->h(II)Lkq2;

    .line 214
    .line 215
    .line 216
    move-result-object v9

    .line 217
    invoke-virtual {v3, v9}, Lkq2;->a(Lkq2;)Lkq2;

    .line 218
    .line 219
    .line 220
    move-result-object v3

    .line 221
    goto :goto_8

    .line 222
    :cond_a
    invoke-virtual {v8, v5}, Lkq2;->g(Lkq2;)Lkq2;

    .line 223
    .line 224
    .line 225
    move-result-object v7

    .line 226
    invoke-virtual {v7, v6}, Lkq2;->a(Lkq2;)Lkq2;

    .line 227
    .line 228
    .line 229
    move-result-object v6

    .line 230
    invoke-virtual {v3}, Lkq2;->d()I

    .line 231
    .line 232
    .line 233
    move-result v7

    .line 234
    invoke-virtual {v0}, Lkq2;->d()I

    .line 235
    .line 236
    .line 237
    move-result v8

    .line 238
    if-ge v7, v8, :cond_b

    .line 239
    .line 240
    move-object v12, v3

    .line 241
    move-object v3, v0

    .line 242
    move-object v0, v12

    .line 243
    move-object v12, v6

    .line 244
    move-object v6, v5

    .line 245
    move-object v5, v12

    .line 246
    goto :goto_7

    .line 247
    :cond_b
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 248
    .line 249
    new-instance p1, Ljava/lang/StringBuilder;

    .line 250
    .line 251
    const-string p2, "Division algorithm failed to reduce polynomial? r: "

    .line 252
    .line 253
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 257
    .line 258
    .line 259
    const-string p2, ", rLast: "

    .line 260
    .line 261
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 262
    .line 263
    .line 264
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 265
    .line 266
    .line 267
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object p1

    .line 271
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 272
    .line 273
    .line 274
    throw p0

    .line 275
    :cond_c
    new-instance p0, Lz96;

    .line 276
    .line 277
    const-string p1, "r_{i-1} was zero"

    .line 278
    .line 279
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 280
    .line 281
    .line 282
    throw p0

    .line 283
    :cond_d
    invoke-virtual {v5, v1}, Lkq2;->c(I)I

    .line 284
    .line 285
    .line 286
    move-result p2

    .line 287
    if-eqz p2, :cond_1a

    .line 288
    .line 289
    invoke-virtual {p0, p2}, Ljq2;->b(I)I

    .line 290
    .line 291
    .line 292
    move-result p2

    .line 293
    invoke-virtual {v5, p2}, Lkq2;->f(I)Lkq2;

    .line 294
    .line 295
    .line 296
    move-result-object v3

    .line 297
    invoke-virtual {v0, p2}, Lkq2;->f(I)Lkq2;

    .line 298
    .line 299
    .line 300
    move-result-object p2

    .line 301
    filled-new-array {v3, p2}, [Lkq2;

    .line 302
    .line 303
    .line 304
    move-result-object p2

    .line 305
    aget-object v0, p2, v1

    .line 306
    .line 307
    aget-object p2, p2, v2

    .line 308
    .line 309
    invoke-virtual {v0}, Lkq2;->d()I

    .line 310
    .line 311
    .line 312
    move-result v3

    .line 313
    if-ne v3, v2, :cond_e

    .line 314
    .line 315
    invoke-virtual {v0, v2}, Lkq2;->c(I)I

    .line 316
    .line 317
    .line 318
    move-result v0

    .line 319
    filled-new-array {v0}, [I

    .line 320
    .line 321
    .line 322
    move-result-object v0

    .line 323
    goto :goto_a

    .line 324
    :cond_e
    new-array v4, v3, [I

    .line 325
    .line 326
    move v6, v1

    .line 327
    move v5, v2

    .line 328
    :goto_9
    iget-short v7, p0, Ljq2;->e:S

    .line 329
    .line 330
    if-ge v5, v7, :cond_10

    .line 331
    .line 332
    if-ge v6, v3, :cond_10

    .line 333
    .line 334
    invoke-virtual {v0, v5}, Lkq2;->b(I)I

    .line 335
    .line 336
    .line 337
    move-result v7

    .line 338
    if-nez v7, :cond_f

    .line 339
    .line 340
    invoke-virtual {p0, v5}, Ljq2;->b(I)I

    .line 341
    .line 342
    .line 343
    move-result v7

    .line 344
    aput v7, v4, v6

    .line 345
    .line 346
    add-int/lit8 v6, v6, 0x1

    .line 347
    .line 348
    :cond_f
    add-int/lit8 v5, v5, 0x1

    .line 349
    .line 350
    goto :goto_9

    .line 351
    :cond_10
    if-ne v6, v3, :cond_19

    .line 352
    .line 353
    move-object v0, v4

    .line 354
    :goto_a
    array-length v3, v0

    .line 355
    new-array v4, v3, [I

    .line 356
    .line 357
    move v5, v1

    .line 358
    :goto_b
    if-ge v5, v3, :cond_15

    .line 359
    .line 360
    aget v6, v0, v5

    .line 361
    .line 362
    invoke-virtual {p0, v6}, Ljq2;->b(I)I

    .line 363
    .line 364
    .line 365
    move-result v6

    .line 366
    move v7, v1

    .line 367
    move v8, v2

    .line 368
    :goto_c
    if-ge v7, v3, :cond_13

    .line 369
    .line 370
    if-eq v5, v7, :cond_12

    .line 371
    .line 372
    aget v9, v0, v7

    .line 373
    .line 374
    invoke-virtual {p0, v9, v6}, Ljq2;->c(II)I

    .line 375
    .line 376
    .line 377
    move-result v9

    .line 378
    and-int/lit8 v10, v9, 0x1

    .line 379
    .line 380
    if-nez v10, :cond_11

    .line 381
    .line 382
    or-int/lit8 v9, v9, 0x1

    .line 383
    .line 384
    goto :goto_d

    .line 385
    :cond_11
    and-int/lit8 v9, v9, -0x2

    .line 386
    .line 387
    :goto_d
    invoke-virtual {p0, v8, v9}, Ljq2;->c(II)I

    .line 388
    .line 389
    .line 390
    move-result v8

    .line 391
    :cond_12
    add-int/lit8 v7, v7, 0x1

    .line 392
    .line 393
    goto :goto_c

    .line 394
    :cond_13
    invoke-virtual {p2, v6}, Lkq2;->b(I)I

    .line 395
    .line 396
    .line 397
    move-result v7

    .line 398
    invoke-virtual {p0, v8}, Ljq2;->b(I)I

    .line 399
    .line 400
    .line 401
    move-result v8

    .line 402
    invoke-virtual {p0, v7, v8}, Ljq2;->c(II)I

    .line 403
    .line 404
    .line 405
    move-result v7

    .line 406
    aput v7, v4, v5

    .line 407
    .line 408
    iget-boolean v8, p0, Ljq2;->g:Z

    .line 409
    .line 410
    if-eqz v8, :cond_14

    .line 411
    .line 412
    invoke-virtual {p0, v7, v6}, Ljq2;->c(II)I

    .line 413
    .line 414
    .line 415
    move-result v6

    .line 416
    aput v6, v4, v5

    .line 417
    .line 418
    :cond_14
    add-int/lit8 v5, v5, 0x1

    .line 419
    .line 420
    goto :goto_b

    .line 421
    :cond_15
    move p2, v1

    .line 422
    :goto_e
    array-length v3, v0

    .line 423
    if-ge p2, v3, :cond_18

    .line 424
    .line 425
    array-length v3, p1

    .line 426
    sub-int/2addr v3, v2

    .line 427
    aget v5, v0, p2

    .line 428
    .line 429
    if-eqz v5, :cond_17

    .line 430
    .line 431
    iget-object v6, p0, Ljq2;->b:[I

    .line 432
    .line 433
    aget v5, v6, v5

    .line 434
    .line 435
    sub-int/2addr v3, v5

    .line 436
    if-ltz v3, :cond_16

    .line 437
    .line 438
    aget v5, p1, v3

    .line 439
    .line 440
    aget v6, v4, p2

    .line 441
    .line 442
    xor-int/2addr v5, v6

    .line 443
    aput v5, p1, v3

    .line 444
    .line 445
    add-int/lit8 p2, p2, 0x1

    .line 446
    .line 447
    goto :goto_e

    .line 448
    :cond_16
    new-instance p0, Lz96;

    .line 449
    .line 450
    const-string p1, "Bad error location"

    .line 451
    .line 452
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 453
    .line 454
    .line 455
    throw p0

    .line 456
    :cond_17
    invoke-static {}, Lkp5;->e()V

    .line 457
    .line 458
    .line 459
    return v1

    .line 460
    :cond_18
    array-length p0, v0

    .line 461
    return p0

    .line 462
    :cond_19
    new-instance p0, Lz96;

    .line 463
    .line 464
    const-string p1, "Error locator degree does not match number of roots"

    .line 465
    .line 466
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 467
    .line 468
    .line 469
    throw p0

    .line 470
    :cond_1a
    new-instance p0, Lz96;

    .line 471
    .line 472
    const-string p1, "sigmaTilde(0) was zero"

    .line 473
    .line 474
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 475
    .line 476
    .line 477
    throw p0

    .line 478
    :cond_1b
    invoke-static {}, Lkp5;->e()V

    .line 479
    .line 480
    .line 481
    return v1
.end method

.method public B(Ljb0;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljb0;->f()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_6

    .line 6
    .line 7
    invoke-virtual {p1}, Ljb0;->size()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    sget-object v1, Lzl6;->j0:[I

    .line 12
    .line 13
    invoke-static {v1, v0}, Ljava/util/Arrays;->binarySearch([II)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-gez v0, :cond_0

    .line 18
    .line 19
    add-int/lit8 v0, v0, 0x1

    .line 20
    .line 21
    neg-int v0, v0

    .line 22
    add-int/lit8 v0, v0, -0x1

    .line 23
    .line 24
    :cond_0
    add-int/lit8 v2, v0, 0x1

    .line 25
    .line 26
    aget v2, v1, v2

    .line 27
    .line 28
    iget-object p0, p0, Ly45;->X:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p0, Ljava/util/Stack;

    .line 31
    .line 32
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-nez v3, :cond_5

    .line 37
    .line 38
    invoke-virtual {p0}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    check-cast v3, Ljb0;

    .line 43
    .line 44
    invoke-virtual {v3}, Ljb0;->size()I

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    if-lt v3, v2, :cond_1

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_1
    aget v0, v1, v0

    .line 52
    .line 53
    invoke-virtual {p0}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    check-cast v1, Ljb0;

    .line 58
    .line 59
    :goto_0
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-nez v2, :cond_2

    .line 64
    .line 65
    invoke-virtual {p0}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    check-cast v2, Ljb0;

    .line 70
    .line 71
    invoke-virtual {v2}, Ljb0;->size()I

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    if-ge v2, v0, :cond_2

    .line 76
    .line 77
    invoke-virtual {p0}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    check-cast v2, Ljb0;

    .line 82
    .line 83
    new-instance v3, Lzl6;

    .line 84
    .line 85
    invoke-direct {v3, v2, v1}, Lzl6;-><init>(Ljb0;Ljb0;)V

    .line 86
    .line 87
    .line 88
    move-object v1, v3

    .line 89
    goto :goto_0

    .line 90
    :cond_2
    new-instance v0, Lzl6;

    .line 91
    .line 92
    invoke-direct {v0, v1, p1}, Lzl6;-><init>(Ljb0;Ljb0;)V

    .line 93
    .line 94
    .line 95
    :goto_1
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    if-nez p1, :cond_4

    .line 100
    .line 101
    sget-object p1, Lzl6;->j0:[I

    .line 102
    .line 103
    iget v1, v0, Lzl6;->Y:I

    .line 104
    .line 105
    invoke-static {p1, v1}, Ljava/util/Arrays;->binarySearch([II)I

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    if-gez v1, :cond_3

    .line 110
    .line 111
    add-int/lit8 v1, v1, 0x1

    .line 112
    .line 113
    neg-int v1, v1

    .line 114
    add-int/lit8 v1, v1, -0x1

    .line 115
    .line 116
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 117
    .line 118
    aget p1, p1, v1

    .line 119
    .line 120
    invoke-virtual {p0}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    check-cast v1, Ljb0;

    .line 125
    .line 126
    invoke-virtual {v1}, Ljb0;->size()I

    .line 127
    .line 128
    .line 129
    move-result v1

    .line 130
    if-ge v1, p1, :cond_4

    .line 131
    .line 132
    invoke-virtual {p0}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    check-cast p1, Ljb0;

    .line 137
    .line 138
    new-instance v1, Lzl6;

    .line 139
    .line 140
    invoke-direct {v1, p1, v0}, Lzl6;-><init>(Ljb0;Ljb0;)V

    .line 141
    .line 142
    .line 143
    move-object v0, v1

    .line 144
    goto :goto_1

    .line 145
    :cond_4
    invoke-virtual {p0, v0}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    return-void

    .line 149
    :cond_5
    :goto_2
    invoke-virtual {p0, p1}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    return-void

    .line 153
    :cond_6
    instance-of v0, p1, Lzl6;

    .line 154
    .line 155
    if-eqz v0, :cond_7

    .line 156
    .line 157
    check-cast p1, Lzl6;

    .line 158
    .line 159
    iget-object v0, p1, Lzl6;->Z:Ljb0;

    .line 160
    .line 161
    invoke-virtual {p0, v0}, Ly45;->B(Ljb0;)V

    .line 162
    .line 163
    .line 164
    iget-object p1, p1, Lzl6;->f0:Ljb0;

    .line 165
    .line 166
    invoke-virtual {p0, p1}, Ly45;->B(Ljb0;)V

    .line 167
    .line 168
    .line 169
    return-void

    .line 170
    :cond_7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object p0

    .line 178
    new-instance p1, Ljava/lang/StringBuilder;

    .line 179
    .line 180
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 181
    .line 182
    .line 183
    move-result v0

    .line 184
    add-int/lit8 v0, v0, 0x31

    .line 185
    .line 186
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 187
    .line 188
    .line 189
    const-string v0, "Has a new type of ByteString been created? Found "

    .line 190
    .line 191
    invoke-static {p1, v0, p0}, Loi0;->p(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object p0

    .line 195
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    return-void
.end method

.method public C(Ljava/lang/String;)Lvk1;
    .locals 2

    .line 1
    iget-object p0, p0, Ly45;->X:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ljava/lang/ClassLoader;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    const/4 v1, 0x0

    .line 10
    :try_start_0
    invoke-static {p1, v0, p0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    goto :goto_0

    .line 15
    :catch_0
    move-object p0, v1

    .line 16
    :goto_0
    if-eqz p0, :cond_0

    .line 17
    .line 18
    invoke-static {p0}, Lz91;->o(Ljava/lang/Class;)Lqb6;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    if-eqz p0, :cond_0

    .line 23
    .line 24
    new-instance p1, Lvk1;

    .line 25
    .line 26
    const/16 v0, 0x14

    .line 27
    .line 28
    invoke-direct {p1, p0, v0}, Lvk1;-><init>(Ljava/lang/Object;B)V

    .line 29
    .line 30
    .line 31
    return-object p1

    .line 32
    :cond_0
    return-object v1
.end method

.method public D(Lnt4;)V
    .locals 2

    .line 1
    iget-object p0, p0, Ly45;->X:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroidx/appcompat/widget/Toolbar;

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->f0:Landroidx/appcompat/widget/ActionMenuView;

    .line 6
    .line 7
    iget-object v0, v0, Landroidx/appcompat/widget/ActionMenuView;->y0:Landroidx/appcompat/widget/a;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Landroidx/appcompat/widget/a;->j()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_0
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->L0:Lf63;

    .line 19
    .line 20
    iget-object v0, v0, Lf63;->Z:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, Lfl2;

    .line 39
    .line 40
    iget-object v1, v1, Lfl2;->a:Lml2;

    .line 41
    .line 42
    invoke-virtual {v1}, Lml2;->u()Z

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    :goto_1
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->T0:Lrb8;

    .line 47
    .line 48
    if-eqz p0, :cond_2

    .line 49
    .line 50
    invoke-virtual {p0, p1}, Lrb8;->D(Lnt4;)V

    .line 51
    .line 52
    .line 53
    :cond_2
    return-void
.end method

.method public E()[Ljava/lang/Integer;
    .locals 4

    .line 1
    const-string v0, "StreamConfigurationMapCompatBaseImpl"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :try_start_0
    iget-object p0, p0, Ly45;->X:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p0, Landroid/hardware/camera2/params/StreamConfigurationMap;

    .line 7
    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/hardware/camera2/params/StreamConfigurationMap;->getOutputFormats()[I

    .line 11
    .line 12
    .line 13
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    goto :goto_1

    .line 15
    :catch_0
    invoke-static {v0}, Lhi5;->z0(Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    :cond_0
    :goto_0
    move-object p0, v1

    .line 19
    goto :goto_1

    .line 20
    :catch_1
    invoke-static {v0}, Lhi5;->z0(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :goto_1
    if-eqz p0, :cond_1

    .line 25
    .line 26
    array-length v0, p0

    .line 27
    new-array v1, v0, [Ljava/lang/Integer;

    .line 28
    .line 29
    array-length v0, p0

    .line 30
    const/4 v2, 0x0

    .line 31
    :goto_2
    if-ge v2, v0, :cond_1

    .line 32
    .line 33
    aget v3, p0, v2

    .line 34
    .line 35
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    aput-object v3, v1, v2

    .line 40
    .line 41
    add-int/lit8 v2, v2, 0x1

    .line 42
    .line 43
    goto :goto_2

    .line 44
    :cond_1
    return-object v1
.end method

.method public F(ILandroid/util/Size;)J
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Ly45;->X:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p0, Landroid/hardware/camera2/params/StreamConfigurationMap;

    .line 7
    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, Landroid/hardware/camera2/params/StreamConfigurationMap;->getOutputMinFrameDuration(ILandroid/util/Size;)J

    .line 11
    .line 12
    .line 13
    move-result-wide p0

    .line 14
    return-wide p0

    .line 15
    :cond_0
    const-wide/16 p0, 0x0

    .line 16
    .line 17
    return-wide p0
.end method

.method public G(I)[Landroid/util/Size;
    .locals 0

    .line 1
    iget-object p0, p0, Ly45;->X:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/hardware/camera2/params/StreamConfigurationMap;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Landroid/hardware/camera2/params/StreamConfigurationMap;->getOutputSizes(I)[Landroid/util/Size;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return-object p0
.end method

.method public H()V
    .locals 2

    .line 1
    iget-object p0, p0, Ly45;->X:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/view/View;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "input_method"

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    const/4 v1, 0x0

    .line 24
    invoke-virtual {v0, p0, v1}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void
.end method

.method public I(Lzz2;Landroidx/compose/ui/platform/AndroidComposeView;)Lzz2;
    .locals 41

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    iget-object v1, v1, Ly45;->X:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lqi4;

    .line 8
    .line 9
    new-instance v2, Lqi4;

    .line 10
    .line 11
    iget-object v3, v0, Lzz2;->Y:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v3, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    invoke-direct {v2, v4}, Lqi4;-><init>(I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    const/4 v6, 0x0

    .line 27
    :goto_0
    if-ge v6, v4, :cond_2

    .line 28
    .line 29
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v7

    .line 33
    check-cast v7, Ljq5;

    .line 34
    .line 35
    iget-wide v8, v7, Ljq5;->a:J

    .line 36
    .line 37
    invoke-virtual {v1, v8, v9}, Lqi4;->b(J)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v10

    .line 41
    check-cast v10, Liq5;

    .line 42
    .line 43
    if-nez v10, :cond_0

    .line 44
    .line 45
    iget-wide v10, v7, Ljq5;->b:J

    .line 46
    .line 47
    iget-wide v12, v7, Ljq5;->d:J

    .line 48
    .line 49
    move-wide/from16 v25, v10

    .line 50
    .line 51
    move-wide/from16 v27, v12

    .line 52
    .line 53
    const/16 v29, 0x0

    .line 54
    .line 55
    move-object/from16 v10, p2

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_0
    iget-wide v11, v10, Liq5;->a:J

    .line 59
    .line 60
    iget-boolean v13, v10, Liq5;->c:Z

    .line 61
    .line 62
    iget-wide v14, v10, Liq5;->b:J

    .line 63
    .line 64
    move-object/from16 v10, p2

    .line 65
    .line 66
    invoke-virtual {v10, v14, v15}, Landroidx/compose/ui/platform/AndroidComposeView;->E(J)J

    .line 67
    .line 68
    .line 69
    move-result-wide v14

    .line 70
    move-wide/from16 v25, v11

    .line 71
    .line 72
    move/from16 v29, v13

    .line 73
    .line 74
    move-wide/from16 v27, v14

    .line 75
    .line 76
    :goto_1
    iget-wide v11, v7, Ljq5;->a:J

    .line 77
    .line 78
    new-instance v16, Lhq5;

    .line 79
    .line 80
    iget-wide v13, v7, Ljq5;->b:J

    .line 81
    .line 82
    move v15, v6

    .line 83
    iget-wide v5, v7, Ljq5;->d:J

    .line 84
    .line 85
    move-object/from16 v39, v3

    .line 86
    .line 87
    iget-boolean v3, v7, Ljq5;->e:Z

    .line 88
    .line 89
    move/from16 v23, v3

    .line 90
    .line 91
    iget v3, v7, Ljq5;->f:F

    .line 92
    .line 93
    move/from16 v24, v3

    .line 94
    .line 95
    iget v3, v7, Ljq5;->g:I

    .line 96
    .line 97
    move/from16 v30, v3

    .line 98
    .line 99
    iget-object v3, v7, Ljq5;->i:Ljava/util/ArrayList;

    .line 100
    .line 101
    move-object/from16 v31, v3

    .line 102
    .line 103
    move/from16 v40, v4

    .line 104
    .line 105
    iget-wide v3, v7, Ljq5;->j:J

    .line 106
    .line 107
    move-wide/from16 v32, v3

    .line 108
    .line 109
    iget v3, v7, Ljq5;->k:F

    .line 110
    .line 111
    move/from16 v34, v3

    .line 112
    .line 113
    iget-wide v3, v7, Ljq5;->l:J

    .line 114
    .line 115
    move-wide/from16 v35, v3

    .line 116
    .line 117
    iget-wide v3, v7, Ljq5;->m:J

    .line 118
    .line 119
    move-wide/from16 v37, v3

    .line 120
    .line 121
    move-wide/from16 v21, v5

    .line 122
    .line 123
    move-wide/from16 v17, v11

    .line 124
    .line 125
    move-wide/from16 v19, v13

    .line 126
    .line 127
    invoke-direct/range {v16 .. v38}, Lhq5;-><init>(JJJZFJJZILjava/util/ArrayList;JFJJ)V

    .line 128
    .line 129
    .line 130
    move-object/from16 v5, v16

    .line 131
    .line 132
    move-wide/from16 v3, v17

    .line 133
    .line 134
    invoke-virtual {v2, v3, v4, v5}, Lqi4;->f(JLjava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    iget-boolean v3, v7, Ljq5;->e:Z

    .line 138
    .line 139
    if-eqz v3, :cond_1

    .line 140
    .line 141
    new-instance v16, Liq5;

    .line 142
    .line 143
    iget-wide v4, v7, Ljq5;->b:J

    .line 144
    .line 145
    iget-wide v6, v7, Ljq5;->c:J

    .line 146
    .line 147
    move/from16 v21, v3

    .line 148
    .line 149
    move-wide/from16 v17, v4

    .line 150
    .line 151
    move-wide/from16 v19, v6

    .line 152
    .line 153
    invoke-direct/range {v16 .. v21}, Liq5;-><init>(JJZ)V

    .line 154
    .line 155
    .line 156
    move-object/from16 v3, v16

    .line 157
    .line 158
    invoke-virtual {v1, v8, v9, v3}, Lqi4;->f(JLjava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    goto :goto_2

    .line 162
    :cond_1
    invoke-virtual {v1, v8, v9}, Lqi4;->g(J)V

    .line 163
    .line 164
    .line 165
    :goto_2
    add-int/lit8 v6, v15, 0x1

    .line 166
    .line 167
    move-object/from16 v3, v39

    .line 168
    .line 169
    move/from16 v4, v40

    .line 170
    .line 171
    goto/16 :goto_0

    .line 172
    .line 173
    :cond_2
    new-instance v1, Lzz2;

    .line 174
    .line 175
    const/4 v3, 0x1

    .line 176
    invoke-direct {v1, v2, v0, v3}, Lzz2;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 177
    .line 178
    .line 179
    return-object v1
.end method

.method public J()V
    .locals 1

    .line 1
    iget-object p0, p0, Ly45;->X:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ltv;

    .line 4
    .line 5
    sget-object v0, Ll57;->Z:Ll57;

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Ltv;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    sget-object v0, Ll57;->Y:Ll57;

    .line 12
    .line 13
    if-eq p0, v0, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    throw p0
.end method

.method public K(Ljava/lang/Object;Led6;)V
    .locals 2

    .line 1
    check-cast p1, Ld43;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Ly45;->X:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Landroidx/work/multiprocess/RemoteListenableDelegatingWorker;

    .line 9
    .line 10
    iget-object v0, p0, Lec4;->b:Landroidx/work/WorkerParameters;

    .line 11
    .line 12
    iget-object v0, v0, Landroidx/work/WorkerParameters;->b:Lu91;

    .line 13
    .line 14
    const-string v1, "androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME"

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Lu91;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    new-instance v1, Lkh5;

    .line 23
    .line 24
    iget-object p0, p0, Landroidx/work/multiprocess/RemoteListenableDelegatingWorker;->f:Landroidx/work/WorkerParameters;

    .line 25
    .line 26
    invoke-direct {v1, v0, p0}, Lkh5;-><init>(Ljava/lang/String;Landroidx/work/WorkerParameters;)V

    .line 27
    .line 28
    .line 29
    invoke-static {v1}, Lw79;->K(Landroid/os/Parcelable;)[B

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    invoke-interface {p1, p2, p0}, Ld43;->e(Lr43;[B)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_0
    const-string p0, "Need to specify a class name for the RemoteListenableWorker to delegate to."

    .line 41
    .line 42
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public varargs L([Ljava/lang/String;)Lq85;
    .locals 3

    .line 1
    new-instance v0, Low6;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Low6;-><init>(Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    new-instance v1, Lnr6;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-direct {v1, p0, p1, v2}, Lnr6;-><init>(Ly45;[Ljava/lang/String;B)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, v0}, Lnr6;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, Lq85;

    .line 18
    .line 19
    return-object p0
.end method

.method public M(Ljp0;Ldn2;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Ly45;->X:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Lcw0;

    .line 8
    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const-string v2, "Called runAndWatch on a manager that has been disposed of"

    .line 13
    .line 14
    invoke-static {v2}, Lwr5;->b(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    :goto_0
    iget-object v2, v0, Ly45;->X:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v2, Lcw0;

    .line 20
    .line 21
    instance-of v3, v2, Lna7;

    .line 22
    .line 23
    if-eqz v3, :cond_7

    .line 24
    .line 25
    check-cast v2, Lna7;

    .line 26
    .line 27
    iget-object v3, v2, Lna7;->j0:Ln17;

    .line 28
    .line 29
    if-eqz v3, :cond_7

    .line 30
    .line 31
    invoke-virtual {v3, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-nez v3, :cond_7

    .line 36
    .line 37
    new-instance v3, Ljz4;

    .line 38
    .line 39
    invoke-direct {v3}, Ljz4;-><init>()V

    .line 40
    .line 41
    .line 42
    iget-object v4, v2, Lna7;->j0:Ln17;

    .line 43
    .line 44
    if-eqz v4, :cond_1

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    const-string v5, "promote must only be called when a manager is managing subscriptions for one channel and needs to start managing them for a second"

    .line 48
    .line 49
    invoke-static {v5}, Lwr5;->b(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    :goto_1
    iget-object v5, v2, Lna7;->h0:Lt05;

    .line 53
    .line 54
    iget-object v6, v3, Ljz4;->g0:Ljava/util/ArrayList;

    .line 55
    .line 56
    if-nez v5, :cond_2

    .line 57
    .line 58
    iget-object v5, v2, Lna7;->f0:Ljava/lang/Object;

    .line 59
    .line 60
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    new-instance v7, Lgz4;

    .line 64
    .line 65
    invoke-direct {v7, v4, v5}, Lgz4;-><init>(Ln17;Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    goto :goto_5

    .line 72
    :cond_2
    iget-object v7, v5, Lt05;->b:[Ljava/lang/Object;

    .line 73
    .line 74
    iget-object v5, v5, Lt05;->a:[J

    .line 75
    .line 76
    array-length v8, v5

    .line 77
    add-int/lit8 v8, v8, -0x2

    .line 78
    .line 79
    if-ltz v8, :cond_6

    .line 80
    .line 81
    const/4 v10, 0x0

    .line 82
    :goto_2
    aget-wide v11, v5, v10

    .line 83
    .line 84
    not-long v13, v11

    .line 85
    const/4 v15, 0x7

    .line 86
    shl-long/2addr v13, v15

    .line 87
    and-long/2addr v13, v11

    .line 88
    const-wide v15, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    and-long/2addr v13, v15

    .line 94
    cmp-long v13, v13, v15

    .line 95
    .line 96
    if-eqz v13, :cond_5

    .line 97
    .line 98
    sub-int v13, v10, v8

    .line 99
    .line 100
    not-int v13, v13

    .line 101
    ushr-int/lit8 v13, v13, 0x1f

    .line 102
    .line 103
    const/16 v14, 0x8

    .line 104
    .line 105
    rsub-int/lit8 v13, v13, 0x8

    .line 106
    .line 107
    const/4 v15, 0x0

    .line 108
    :goto_3
    if-ge v15, v13, :cond_4

    .line 109
    .line 110
    const-wide/16 v16, 0xff

    .line 111
    .line 112
    and-long v16, v11, v16

    .line 113
    .line 114
    const-wide/16 v18, 0x80

    .line 115
    .line 116
    cmp-long v16, v16, v18

    .line 117
    .line 118
    if-gez v16, :cond_3

    .line 119
    .line 120
    shl-int/lit8 v16, v10, 0x3

    .line 121
    .line 122
    add-int v16, v16, v15

    .line 123
    .line 124
    aget-object v9, v7, v16

    .line 125
    .line 126
    move/from16 v16, v14

    .line 127
    .line 128
    new-instance v14, Lgz4;

    .line 129
    .line 130
    invoke-direct {v14, v4, v9}, Lgz4;-><init>(Ln17;Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v6, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    goto :goto_4

    .line 137
    :cond_3
    move/from16 v16, v14

    .line 138
    .line 139
    :goto_4
    shr-long v11, v11, v16

    .line 140
    .line 141
    add-int/lit8 v15, v15, 0x1

    .line 142
    .line 143
    move/from16 v14, v16

    .line 144
    .line 145
    goto :goto_3

    .line 146
    :cond_4
    move v9, v14

    .line 147
    if-ne v13, v9, :cond_6

    .line 148
    .line 149
    :cond_5
    if-eq v10, v8, :cond_6

    .line 150
    .line 151
    add-int/lit8 v10, v10, 0x1

    .line 152
    .line 153
    goto :goto_2

    .line 154
    :cond_6
    :goto_5
    invoke-virtual {v3}, Ljz4;->p0()V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v2}, Lna7;->r0()V

    .line 158
    .line 159
    .line 160
    iput-object v3, v0, Ly45;->X:Ljava/lang/Object;

    .line 161
    .line 162
    :cond_7
    iget-object v0, v0, Ly45;->X:Ljava/lang/Object;

    .line 163
    .line 164
    check-cast v0, Lcw0;

    .line 165
    .line 166
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v0, v1}, Lcw0;->B0(Ln17;)Lgn2;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    invoke-static {}, Lkd7;->h()Ldd7;

    .line 174
    .line 175
    .line 176
    move-result-object v3

    .line 177
    invoke-virtual {v3, v2}, Ldd7;->u(Lgn2;)Ldd7;

    .line 178
    .line 179
    .line 180
    move-result-object v2

    .line 181
    invoke-virtual {v0, v1}, Lcw0;->g0(Ln17;)V

    .line 182
    .line 183
    .line 184
    :try_start_0
    invoke-virtual {v2}, Ldd7;->j()Ldd7;

    .line 185
    .line 186
    .line 187
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 188
    :try_start_1
    invoke-interface/range {p2 .. p2}, Ldn2;->invoke()Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 192
    :try_start_2
    invoke-static {v1}, Ldd7;->q(Ldd7;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 193
    .line 194
    .line 195
    invoke-virtual {v2}, Ldd7;->c()V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v0}, Lcw0;->p0()V

    .line 199
    .line 200
    .line 201
    return-object v3

    .line 202
    :catchall_0
    move-exception v0

    .line 203
    goto :goto_6

    .line 204
    :catchall_1
    move-exception v0

    .line 205
    :try_start_3
    invoke-static {v1}, Ldd7;->q(Ldd7;)V

    .line 206
    .line 207
    .line 208
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 209
    :goto_6
    invoke-virtual {v2}, Ldd7;->c()V

    .line 210
    .line 211
    .line 212
    throw v0
.end method

.method public N(FJ)F
    .locals 4

    .line 1
    const-wide/32 v0, 0xf4240

    .line 2
    .line 3
    .line 4
    div-long/2addr p2, v0

    .line 5
    iget-object p0, p0, Ly45;->X:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Lnx1;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lnx1;->a(F)Lje2;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    iget-wide v0, p0, Lje2;->c:J

    .line 14
    .line 15
    const-wide/16 v2, 0x0

    .line 16
    .line 17
    cmp-long p1, v0, v2

    .line 18
    .line 19
    if-lez p1, :cond_0

    .line 20
    .line 21
    long-to-float p1, p2

    .line 22
    long-to-float p2, v0

    .line 23
    div-float/2addr p1, p2

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/high16 p1, 0x3f800000    # 1.0f

    .line 26
    .line 27
    :goto_0
    invoke-static {p1}, Lae;->a(F)Lzd;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iget p1, p1, Lzd;->b:F

    .line 32
    .line 33
    iget p2, p0, Lje2;->a:F

    .line 34
    .line 35
    invoke-static {p2}, Ljava/lang/Math;->signum(F)F

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    mul-float/2addr p2, p1

    .line 40
    iget p0, p0, Lje2;->b:F

    .line 41
    .line 42
    mul-float/2addr p2, p0

    .line 43
    long-to-float p0, v0

    .line 44
    div-float/2addr p2, p0

    .line 45
    const/high16 p0, 0x447a0000    # 1000.0f

    .line 46
    .line 47
    mul-float/2addr p2, p0

    .line 48
    return p2
.end method

.method public O()V
    .locals 2

    .line 1
    iget-object p0, p0, Ly45;->X:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/view/View;

    .line 4
    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    goto :goto_2

    .line 8
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_2

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/view/View;->onCheckIsTextEditor()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Landroid/view/View;->findFocus()Landroid/view/View;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    goto :goto_1

    .line 30
    :cond_2
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 31
    .line 32
    .line 33
    move-object v0, p0

    .line 34
    :goto_1
    if-nez v0, :cond_3

    .line 35
    .line 36
    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    const v0, 0x1020002

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    :cond_3
    if-eqz v0, :cond_4

    .line 48
    .line 49
    invoke-virtual {v0}, Landroid/view/View;->hasWindowFocus()Z

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    if-eqz p0, :cond_4

    .line 54
    .line 55
    new-instance p0, Lce7;

    .line 56
    .line 57
    const/4 v1, 0x0

    .line 58
    invoke-direct {p0, v0, v1}, Lce7;-><init>(Landroid/view/View;B)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 62
    .line 63
    .line 64
    :cond_4
    :goto_2
    return-void
.end method

.method public T(FFJ)F
    .locals 4

    .line 1
    const-wide/32 v0, 0xf4240

    .line 2
    .line 3
    .line 4
    div-long/2addr p3, v0

    .line 5
    iget-object p0, p0, Ly45;->X:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Lnx1;

    .line 8
    .line 9
    invoke-virtual {p0, p2}, Lnx1;->a(F)Lje2;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    iget-wide v0, p0, Lje2;->c:J

    .line 14
    .line 15
    const-wide/16 v2, 0x0

    .line 16
    .line 17
    cmp-long p2, v0, v2

    .line 18
    .line 19
    if-lez p2, :cond_0

    .line 20
    .line 21
    long-to-float p2, p3

    .line 22
    long-to-float p3, v0

    .line 23
    div-float/2addr p2, p3

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/high16 p2, 0x3f800000    # 1.0f

    .line 26
    .line 27
    :goto_0
    iget p3, p0, Lje2;->b:F

    .line 28
    .line 29
    iget p0, p0, Lje2;->a:F

    .line 30
    .line 31
    invoke-static {p0}, Ljava/lang/Math;->signum(F)F

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    mul-float/2addr p0, p3

    .line 36
    invoke-static {p2}, Lae;->a(F)Lzd;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    iget p2, p2, Lzd;->a:F

    .line 41
    .line 42
    mul-float/2addr p0, p2

    .line 43
    add-float/2addr p0, p1

    .line 44
    return p0
.end method

.method public a()I
    .locals 0

    .line 1
    iget-object p0, p0, Ly45;->X:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lo8;

    .line 4
    .line 5
    invoke-virtual {p0}, Lo8;->a()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public b()I
    .locals 0

    .line 1
    iget-object p0, p0, Ly45;->X:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lo8;

    .line 4
    .line 5
    invoke-virtual {p0}, Lo8;->b()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public c()V
    .locals 0

    .line 1
    return-void
.end method

.method public close()V
    .locals 0

    .line 1
    iget-object p0, p0, Ly45;->X:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lo8;

    .line 4
    .line 5
    invoke-virtual {p0}, Lo8;->close()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public d()Ln63;
    .locals 0

    .line 1
    iget-object p0, p0, Ly45;->X:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lo8;

    .line 4
    .line 5
    invoke-virtual {p0}, Lo8;->d()Ln63;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-static {p0}, Ly45;->y(Ln63;)Ls57;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public e()I
    .locals 0

    .line 1
    iget-object p0, p0, Ly45;->X:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lo8;

    .line 4
    .line 5
    invoke-virtual {p0}, Lo8;->e()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public f(Landroid/view/View;)Z
    .locals 3

    .line 1
    iget-object p0, p0, Ly45;->X:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lcom/google/android/material/behavior/SwipeDismissBehavior;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lcom/google/android/material/behavior/SwipeDismissBehavior;->v(Landroid/view/View;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_5

    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/view/View;->getLayoutDirection()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v2, 0x1

    .line 17
    if-ne v0, v2, :cond_0

    .line 18
    .line 19
    move v1, v2

    .line 20
    :cond_0
    iget-byte v0, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->e:B

    .line 21
    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    if-nez v1, :cond_2

    .line 25
    .line 26
    :cond_1
    if-ne v0, v2, :cond_3

    .line 27
    .line 28
    if-nez v1, :cond_3

    .line 29
    .line 30
    :cond_2
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    neg-int v0, v0

    .line 35
    goto :goto_0

    .line 36
    :cond_3
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    :goto_0
    sget-object v1, Lcw8;->a:Ljava/util/WeakHashMap;

    .line 41
    .line 42
    invoke-virtual {p1, v0}, Landroid/view/View;->offsetLeftAndRight(I)V

    .line 43
    .line 44
    .line 45
    const/4 v0, 0x0

    .line 46
    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    .line 47
    .line 48
    .line 49
    iget-object p0, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->b:Lwl6;

    .line 50
    .line 51
    if-eqz p0, :cond_4

    .line 52
    .line 53
    invoke-virtual {p0, p1}, Lwl6;->R(Landroid/view/View;)V

    .line 54
    .line 55
    .line 56
    :cond_4
    return v2

    .line 57
    :cond_5
    return v1
.end method

.method public g(Lv15;Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object p0, p0, Ly45;->X:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lx66;

    .line 4
    .line 5
    invoke-virtual {p1}, Lv15;->b()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const-string v0, "k"

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    instance-of p1, p2, Ljava/lang/Integer;

    .line 18
    .line 19
    if-eqz p1, :cond_4

    .line 20
    .line 21
    check-cast p2, Ljava/lang/Integer;

    .line 22
    .line 23
    sget-object p1, La04;->Y:Lk32;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    sget-object p1, La04;->Z:Ljava/util/LinkedHashMap;

    .line 29
    .line 30
    invoke-virtual {p1, p2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    check-cast p1, La04;

    .line 35
    .line 36
    if-nez p1, :cond_0

    .line 37
    .line 38
    sget-object p1, La04;->f0:La04;

    .line 39
    .line 40
    :cond_0
    iput-object p1, p0, Lx66;->i0:La04;

    .line 41
    .line 42
    return-void

    .line 43
    :cond_1
    const-string v0, "mv"

    .line 44
    .line 45
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-eqz v0, :cond_2

    .line 50
    .line 51
    instance-of p1, p2, [I

    .line 52
    .line 53
    if-eqz p1, :cond_4

    .line 54
    .line 55
    check-cast p2, [I

    .line 56
    .line 57
    iput-object p2, p0, Lx66;->X:[I

    .line 58
    .line 59
    return-void

    .line 60
    :cond_2
    const-string v0, "xs"

    .line 61
    .line 62
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-eqz v0, :cond_3

    .line 67
    .line 68
    instance-of p1, p2, Ljava/lang/String;

    .line 69
    .line 70
    if-eqz p1, :cond_4

    .line 71
    .line 72
    check-cast p2, Ljava/lang/String;

    .line 73
    .line 74
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    if-nez p1, :cond_4

    .line 79
    .line 80
    iput-object p2, p0, Lx66;->Y:Ljava/lang/String;

    .line 81
    .line 82
    return-void

    .line 83
    :cond_3
    const-string v0, "xi"

    .line 84
    .line 85
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    if-eqz v0, :cond_5

    .line 90
    .line 91
    instance-of p1, p2, Ljava/lang/Integer;

    .line 92
    .line 93
    if-eqz p1, :cond_4

    .line 94
    .line 95
    check-cast p2, Ljava/lang/Integer;

    .line 96
    .line 97
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    iput p1, p0, Lx66;->Z:I

    .line 102
    .line 103
    :cond_4
    return-void

    .line 104
    :cond_5
    const-string p0, "pn"

    .line 105
    .line 106
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    return-void
.end method

.method public getSurface()Landroid/view/Surface;
    .locals 0

    .line 1
    iget-object p0, p0, Ly45;->X:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lo8;

    .line 4
    .line 5
    invoke-virtual {p0}, Lo8;->getSurface()Landroid/view/Surface;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public h()V
    .locals 0

    .line 1
    iget-object p0, p0, Ly45;->X:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lo8;

    .line 4
    .line 5
    invoke-virtual {p0}, Lo8;->h()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public i(ILjava/lang/Object;)V
    .locals 1

    .line 1
    const/4 v0, 0x6

    .line 2
    if-eq p1, v0, :cond_0

    .line 3
    .line 4
    const/4 v0, 0x7

    .line 5
    if-eq p1, v0, :cond_0

    .line 6
    .line 7
    const/16 v0, 0x8

    .line 8
    .line 9
    if-eq p1, v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    check-cast p2, Ljava/lang/Throwable;

    .line 13
    .line 14
    :goto_0
    iget-object p0, p0, Ly45;->X:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, Landroidx/profileinstaller/ProfileInstallReceiver;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, Landroid/content/BroadcastReceiver;->setResultCode(I)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public j()Lxe2;
    .locals 0

    .line 1
    iget-object p0, p0, Ly45;->X:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lna1;

    .line 4
    .line 5
    invoke-interface {p0}, Lna1;->j()Lxe2;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public k()V
    .locals 5

    .line 1
    iget-object p0, p0, Ly45;->X:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lwu7;

    .line 4
    .line 5
    iget-object p0, p0, Lwu7;->w1:Luu7;

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    check-cast p0, Lsu/happ/proxyutility/feature/main/MainActivity;

    .line 10
    .line 11
    iget-object v0, p0, Landroidx/core/app/ComponentActivity;->X:Lg94;

    .line 12
    .line 13
    invoke-static {v0}, Lys0;->z(Lg94;)Lu84;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sget-object v1, Ltp1;->a:Lnf1;

    .line 18
    .line 19
    sget-object v1, Ldm4;->a:Lhv2;

    .line 20
    .line 21
    new-instance v2, Lnk4;

    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    const/4 v4, 0x2

    .line 25
    invoke-direct {v2, p0, v3, v4}, Lnk4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;Lq51;B)V

    .line 26
    .line 27
    .line 28
    invoke-static {v0, v1, v2, v4}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 29
    .line 30
    .line 31
    :cond_0
    return-void
.end method

.method public l(Lnt4;Landroid/view/MenuItem;)Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public m()Lxg1;
    .locals 0

    .line 1
    iget-object p0, p0, Ly45;->X:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lyg1;

    .line 4
    .line 5
    return-object p0
.end method

.method public m0(F)J
    .locals 4

    .line 1
    iget-object p0, p0, Ly45;->X:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lnx1;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lnx1;->b(F)D

    .line 6
    .line 7
    .line 8
    move-result-wide p0

    .line 9
    sget v0, Lke2;->a:F

    .line 10
    .line 11
    float-to-double v0, v0

    .line 12
    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    .line 13
    .line 14
    sub-double/2addr v0, v2

    .line 15
    div-double/2addr p0, v0

    .line 16
    invoke-static {p0, p1}, Ljava/lang/Math;->exp(D)D

    .line 17
    .line 18
    .line 19
    move-result-wide p0

    .line 20
    const-wide v0, 0x408f400000000000L    # 1000.0

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    mul-double/2addr p0, v0

    .line 26
    double-to-long p0, p0

    .line 27
    const-wide/32 v0, 0xf4240

    .line 28
    .line 29
    .line 30
    mul-long/2addr p0, v0

    .line 31
    return-wide p0
.end method

.method public n(Lv15;Lvs0;)V
    .locals 0

    .line 1
    return-void
.end method

.method public o(Lhy7;)V
    .locals 6

    .line 1
    invoke-static {}, Ls08;->c()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Ly45;->X:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Landroidx/camera/view/PreviewView;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0}, Lw79;->y(Landroid/content/Context;)Ljava/util/concurrent/Executor;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    new-instance v1, Lsc4;

    .line 20
    .line 21
    const/4 v2, 0x6

    .line 22
    invoke-direct {v1, p0, p1, v2}, Lsc4;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 23
    .line 24
    .line 25
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    const-string v0, "PreviewView"

    .line 30
    .line 31
    invoke-static {v0}, Lhi5;->z0(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    iget-object v0, p1, Lhy7;->d:Lcj0;

    .line 35
    .line 36
    iget-object v1, p0, Ly45;->X:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v1, Landroidx/camera/view/PreviewView;

    .line 39
    .line 40
    invoke-interface {v0}, Lcj0;->s()Laj0;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    iput-object v2, v1, Landroidx/camera/view/PreviewView;->n0:Laj0;

    .line 45
    .line 46
    iget-object v1, p0, Ly45;->X:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v1, Landroidx/camera/view/PreviewView;

    .line 49
    .line 50
    iget-object v1, v1, Landroidx/camera/view/PreviewView;->m0:Lvt5;

    .line 51
    .line 52
    invoke-interface {v0}, Lcj0;->s()Laj0;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-interface {v2}, Laj0;->h()Landroid/graphics/Rect;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    new-instance v3, Landroid/util/Rational;

    .line 64
    .line 65
    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    .line 70
    .line 71
    .line 72
    move-result v5

    .line 73
    invoke-direct {v3, v4, v5}, Landroid/util/Rational;-><init>(II)V

    .line 74
    .line 75
    .line 76
    monitor-enter v1

    .line 77
    :try_start_0
    iput-object v2, v1, Lvt5;->b:Landroid/graphics/Rect;

    .line 78
    .line 79
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 80
    iget-object v1, p0, Ly45;->X:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v1, Landroidx/camera/view/PreviewView;

    .line 83
    .line 84
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    invoke-static {v1}, Lw79;->y(Landroid/content/Context;)Ljava/util/concurrent/Executor;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    new-instance v2, Lmf1;

    .line 93
    .line 94
    const/4 v3, 0x4

    .line 95
    invoke-direct {v2, p0, v0, p1, v3}, Lmf1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p1, v1, v2}, Lhy7;->b(Ljava/util/concurrent/Executor;Lgy7;)V

    .line 99
    .line 100
    .line 101
    iget-object v1, p0, Ly45;->X:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v1, Landroidx/camera/view/PreviewView;

    .line 104
    .line 105
    iget-object v2, v1, Landroidx/camera/view/PreviewView;->g0:Ls65;

    .line 106
    .line 107
    iget-object v1, v1, Landroidx/camera/view/PreviewView;->f0:Lst5;

    .line 108
    .line 109
    instance-of v2, v2, Lly7;

    .line 110
    .line 111
    if-eqz v2, :cond_1

    .line 112
    .line 113
    invoke-static {p1, v1}, Landroidx/camera/view/PreviewView;->b(Lhy7;Lst5;)Z

    .line 114
    .line 115
    .line 116
    move-result v1

    .line 117
    if-nez v1, :cond_1

    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_1
    iget-object v1, p0, Ly45;->X:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v1, Landroidx/camera/view/PreviewView;

    .line 123
    .line 124
    iget-object v2, v1, Landroidx/camera/view/PreviewView;->f0:Lst5;

    .line 125
    .line 126
    invoke-static {p1, v2}, Landroidx/camera/view/PreviewView;->b(Lhy7;Lst5;)Z

    .line 127
    .line 128
    .line 129
    move-result v2

    .line 130
    iget-object v3, p0, Ly45;->X:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast v3, Landroidx/camera/view/PreviewView;

    .line 133
    .line 134
    iget-object v4, v3, Landroidx/camera/view/PreviewView;->i0:Lrt5;

    .line 135
    .line 136
    if-eqz v2, :cond_2

    .line 137
    .line 138
    new-instance v2, Lb98;

    .line 139
    .line 140
    invoke-direct {v2, v3, v4}, Ls65;-><init>(Landroid/widget/FrameLayout;Lrt5;)V

    .line 141
    .line 142
    .line 143
    const/4 v3, 0x0

    .line 144
    iput-boolean v3, v2, Lb98;->i:Z

    .line 145
    .line 146
    new-instance v3, Ljava/util/concurrent/atomic/AtomicReference;

    .line 147
    .line 148
    invoke-direct {v3}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 149
    .line 150
    .line 151
    iput-object v3, v2, Lb98;->k:Ljava/util/concurrent/atomic/AtomicReference;

    .line 152
    .line 153
    goto :goto_0

    .line 154
    :cond_2
    new-instance v2, Lly7;

    .line 155
    .line 156
    invoke-direct {v2, v3, v4}, Lly7;-><init>(Landroid/widget/FrameLayout;Lrt5;)V

    .line 157
    .line 158
    .line 159
    :goto_0
    iput-object v2, v1, Landroidx/camera/view/PreviewView;->g0:Ls65;

    .line 160
    .line 161
    :goto_1
    new-instance v1, Lqt5;

    .line 162
    .line 163
    invoke-interface {v0}, Lcj0;->s()Laj0;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    iget-object v3, p0, Ly45;->X:Ljava/lang/Object;

    .line 168
    .line 169
    check-cast v3, Landroidx/camera/view/PreviewView;

    .line 170
    .line 171
    iget-object v4, v3, Landroidx/camera/view/PreviewView;->k0:Lyz4;

    .line 172
    .line 173
    iget-object v3, v3, Landroidx/camera/view/PreviewView;->g0:Ls65;

    .line 174
    .line 175
    invoke-direct {v1, v2, v4, v3}, Lqt5;-><init>(Laj0;Lyz4;Ls65;)V

    .line 176
    .line 177
    .line 178
    iget-object v2, p0, Ly45;->X:Ljava/lang/Object;

    .line 179
    .line 180
    check-cast v2, Landroidx/camera/view/PreviewView;

    .line 181
    .line 182
    iget-object v2, v2, Landroidx/camera/view/PreviewView;->l0:Ljava/util/concurrent/atomic/AtomicReference;

    .line 183
    .line 184
    invoke-virtual {v2, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    invoke-interface {v0}, Lcj0;->b()Lr85;

    .line 188
    .line 189
    .line 190
    move-result-object v2

    .line 191
    iget-object v3, p0, Ly45;->X:Ljava/lang/Object;

    .line 192
    .line 193
    check-cast v3, Landroidx/camera/view/PreviewView;

    .line 194
    .line 195
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 196
    .line 197
    .line 198
    move-result-object v3

    .line 199
    invoke-static {v3}, Lw79;->y(Landroid/content/Context;)Ljava/util/concurrent/Executor;

    .line 200
    .line 201
    .line 202
    move-result-object v3

    .line 203
    invoke-interface {v2, v3, v1}, Lr85;->c(Ljava/util/concurrent/Executor;Ln85;)V

    .line 204
    .line 205
    .line 206
    iget-object v2, p0, Ly45;->X:Ljava/lang/Object;

    .line 207
    .line 208
    check-cast v2, Landroidx/camera/view/PreviewView;

    .line 209
    .line 210
    iget-object v2, v2, Landroidx/camera/view/PreviewView;->g0:Ls65;

    .line 211
    .line 212
    new-instance v3, Lmf1;

    .line 213
    .line 214
    const/4 v4, 0x5

    .line 215
    invoke-direct {v3, p0, v1, v0, v4}, Lmf1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v2, p1, v3}, Ls65;->g(Lhy7;Lmf1;)V

    .line 219
    .line 220
    .line 221
    iget-object p1, p0, Ly45;->X:Ljava/lang/Object;

    .line 222
    .line 223
    check-cast p1, Landroidx/camera/view/PreviewView;

    .line 224
    .line 225
    iget-object v0, p1, Landroidx/camera/view/PreviewView;->h0:Landroidx/camera/view/ScreenFlashView;

    .line 226
    .line 227
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 228
    .line 229
    .line 230
    move-result p1

    .line 231
    const/4 v0, -0x1

    .line 232
    if-ne p1, v0, :cond_3

    .line 233
    .line 234
    iget-object p0, p0, Ly45;->X:Ljava/lang/Object;

    .line 235
    .line 236
    check-cast p0, Landroidx/camera/view/PreviewView;

    .line 237
    .line 238
    iget-object p1, p0, Landroidx/camera/view/PreviewView;->h0:Landroidx/camera/view/ScreenFlashView;

    .line 239
    .line 240
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 241
    .line 242
    .line 243
    :cond_3
    return-void

    .line 244
    :catchall_0
    move-exception p0

    .line 245
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 246
    throw p0
.end method

.method public p(Lp63;Ljava/util/concurrent/Executor;)V
    .locals 3

    .line 1
    iget-object v0, p0, Ly45;->X:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lo8;

    .line 4
    .line 5
    new-instance v1, Ljn0;

    .line 6
    .line 7
    const/4 v2, 0x6

    .line 8
    invoke-direct {v1, p0, p1, v2}, Ljn0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1, p2}, Lo8;->p(Lp63;Ljava/util/concurrent/Executor;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public q(Ljava/lang/String;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Ly45;->X:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p0, Lwu7;

    .line 7
    .line 8
    iget-object p0, p0, Lwu7;->w1:Luu7;

    .line 9
    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    check-cast p0, Lsu/happ/proxyutility/feature/main/MainActivity;

    .line 13
    .line 14
    iget-object v0, p0, Landroidx/core/app/ComponentActivity;->X:Lg94;

    .line 15
    .line 16
    invoke-static {v0}, Lys0;->z(Lg94;)Lu84;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    sget-object v1, Ltp1;->a:Lnf1;

    .line 21
    .line 22
    sget-object v1, Lye1;->Z:Lye1;

    .line 23
    .line 24
    new-instance v2, Lfk4;

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    const/4 v4, 0x4

    .line 28
    invoke-direct {v2, p0, p1, v3, v4}, Lfk4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;Ljava/lang/String;Lq51;B)V

    .line 29
    .line 30
    .line 31
    const/4 p0, 0x2

    .line 32
    invoke-static {v0, v1, v2, p0}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 33
    .line 34
    .line 35
    :cond_0
    return-void
.end method

.method public r(Lv15;)Lj04;
    .locals 1

    .line 1
    invoke-virtual {p1}, Lv15;->b()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-string v0, "d1"

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    new-instance p1, Lv66;

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    invoke-direct {p1, p0, v0}, Lv66;-><init>(Ly45;B)V

    .line 17
    .line 18
    .line 19
    return-object p1

    .line 20
    :cond_0
    const-string v0, "d2"

    .line 21
    .line 22
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    new-instance p1, Lv66;

    .line 29
    .line 30
    const/4 v0, 0x1

    .line 31
    invoke-direct {p1, p0, v0}, Lv66;-><init>(Ly45;B)V

    .line 32
    .line 33
    .line 34
    return-object p1

    .line 35
    :cond_1
    const/4 p0, 0x0

    .line 36
    return-object p0
.end method

.method public r0(FF)F
    .locals 8

    .line 1
    iget-object p0, p0, Ly45;->X:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lnx1;

    .line 4
    .line 5
    invoke-virtual {p0, p2}, Lnx1;->b(F)D

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    sget v2, Lke2;->a:F

    .line 10
    .line 11
    float-to-double v2, v2

    .line 12
    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    .line 13
    .line 14
    sub-double v4, v2, v4

    .line 15
    .line 16
    iget v6, p0, Lnx1;->a:F

    .line 17
    .line 18
    iget p0, p0, Lnx1;->b:F

    .line 19
    .line 20
    mul-float/2addr v6, p0

    .line 21
    float-to-double v6, v6

    .line 22
    div-double/2addr v2, v4

    .line 23
    mul-double/2addr v2, v0

    .line 24
    invoke-static {v2, v3}, Ljava/lang/Math;->exp(D)D

    .line 25
    .line 26
    .line 27
    move-result-wide v0

    .line 28
    mul-double/2addr v0, v6

    .line 29
    double-to-float p0, v0

    .line 30
    invoke-static {p2}, Ljava/lang/Math;->signum(F)F

    .line 31
    .line 32
    .line 33
    move-result p2

    .line 34
    mul-float/2addr p2, p0

    .line 35
    add-float/2addr p2, p1

    .line 36
    return p2
.end method

.method public request(J)V
    .locals 2

    .line 1
    iget-object p0, p0, Ly45;->X:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lxc5;

    .line 4
    .line 5
    const-wide/16 v0, 0x0

    .line 6
    .line 7
    cmp-long v0, p1, v0

    .line 8
    .line 9
    if-ltz v0, :cond_1

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget v0, p0, Lxc5;->h0:I

    .line 14
    .line 15
    int-to-long v0, v0

    .line 16
    invoke-static {p1, p2, v0, v1}, Lmb6;->Q(JJ)J

    .line 17
    .line 18
    .line 19
    move-result-wide p1

    .line 20
    invoke-virtual {p0, p1, p2}, Laq7;->e(J)V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void

    .line 24
    :cond_1
    const-string p0, "n >= required but it was "

    .line 25
    .line 26
    invoke-static {p1, p2, p0}, Lie2;->f(JLjava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public s()I
    .locals 0

    .line 1
    iget-object p0, p0, Ly45;->X:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lo8;

    .line 4
    .line 5
    invoke-virtual {p0}, Lo8;->s()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public t(Lv15;Lqs0;Lv15;)V
    .locals 0

    .line 1
    return-void
.end method

.method public u(Lrn2;Ls51;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object p0, p0, Ly45;->X:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lna1;

    .line 4
    .line 5
    new-instance v0, Lhs5;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-direct {v0, p1, v1, v2}, Lhs5;-><init>(Lrn2;Lq51;B)V

    .line 10
    .line 11
    .line 12
    invoke-interface {p0, v0, p2}, Lna1;->u(Lrn2;Ls51;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public v()Ln63;
    .locals 0

    .line 1
    iget-object p0, p0, Ly45;->X:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lo8;

    .line 4
    .line 5
    invoke-virtual {p0}, Lo8;->v()Ln63;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-static {p0}, Ly45;->y(Ln63;)Ls57;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public w(Lqs0;Lv15;)Li04;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public x(Ls51;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, Lm57;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lm57;

    .line 7
    .line 8
    iget v1, v0, Lm57;->h0:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lm57;->h0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lm57;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lm57;-><init>(Ly45;Ls51;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lm57;->f0:Ljava/lang/Object;

    .line 26
    .line 27
    iget v0, v0, Lm57;->h0:I

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    if-eqz v0, :cond_3

    .line 31
    .line 32
    const/4 v2, 0x1

    .line 33
    if-ne v0, v2, :cond_2

    .line 34
    .line 35
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    iget-object p0, p0, Ly45;->X:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p0, Ltv;

    .line 41
    .line 42
    sget-object p1, Ll57;->X:Ll57;

    .line 43
    .line 44
    sget-object v0, Ll57;->Y:Ll57;

    .line 45
    .line 46
    invoke-virtual {p0, p1, v0}, Ltv;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    if-eqz p0, :cond_1

    .line 51
    .line 52
    sget-object p0, Ldn8;->a:Ldn8;

    .line 53
    .line 54
    return-object p0

    .line 55
    :cond_1
    throw v1

    .line 56
    :cond_2
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 57
    .line 58
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    return-object v1

    .line 62
    :cond_3
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    throw v1
.end method

.method public z()F
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method
