.class public final Lpr7;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:Lxr7;

.field public final b:Loh7;

.field public final c:Ljava/util/concurrent/ConcurrentHashMap;


# direct methods
.method public constructor <init>(Lxr7;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lpr7;->a:Lxr7;

    .line 8
    .line 9
    sget-object p1, Ldm5;->f0:Ldm5;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-static {p1}, Lph7;->a(Ljava/lang/Object;)Loh7;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iput-object p1, p0, Lpr7;->b:Loh7;

    .line 19
    .line 20
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 21
    .line 22
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, Lpr7;->c:Ljava/util/concurrent/ConcurrentHashMap;

    .line 26
    .line 27
    return-void
.end method

.method public static synthetic b(Lpr7;Ljava/lang/String;ZLjava/lang/String;Lq30;Lok4;Lzs1;Lpk4;Ljava/lang/Boolean;Ls51;I)Ljava/lang/Object;
    .locals 11

    .line 1
    move/from16 v0, p10

    .line 2
    .line 3
    and-int/lit8 v1, v0, 0x2

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    const/4 p2, 0x1

    .line 8
    :cond_0
    move v2, p2

    .line 9
    and-int/lit8 p2, v0, 0x4

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz p2, :cond_1

    .line 13
    .line 14
    move-object v3, v1

    .line 15
    goto :goto_0

    .line 16
    :cond_1
    move-object v3, p3

    .line 17
    :goto_0
    and-int/lit8 p2, v0, 0x8

    .line 18
    .line 19
    if-eqz p2, :cond_2

    .line 20
    .line 21
    move-object v4, v1

    .line 22
    goto :goto_1

    .line 23
    :cond_2
    move-object v4, p4

    .line 24
    :goto_1
    and-int/lit8 p2, v0, 0x10

    .line 25
    .line 26
    if-eqz p2, :cond_3

    .line 27
    .line 28
    move-object v5, v1

    .line 29
    goto :goto_2

    .line 30
    :cond_3
    move-object/from16 v5, p5

    .line 31
    .line 32
    :goto_2
    and-int/lit8 p2, v0, 0x20

    .line 33
    .line 34
    if-eqz p2, :cond_4

    .line 35
    .line 36
    move-object v6, v1

    .line 37
    goto :goto_3

    .line 38
    :cond_4
    move-object/from16 v6, p6

    .line 39
    .line 40
    :goto_3
    and-int/lit8 p2, v0, 0x40

    .line 41
    .line 42
    if-eqz p2, :cond_5

    .line 43
    .line 44
    move-object v7, v1

    .line 45
    goto :goto_4

    .line 46
    :cond_5
    move-object/from16 v7, p7

    .line 47
    .line 48
    :goto_4
    and-int/lit16 p2, v0, 0x80

    .line 49
    .line 50
    if-eqz p2, :cond_6

    .line 51
    .line 52
    sget-object p2, Lmr7;->a:Lmr7;

    .line 53
    .line 54
    :goto_5
    move-object v8, p2

    .line 55
    goto :goto_6

    .line 56
    :cond_6
    sget-object p2, Llr7;->a:Llr7;

    .line 57
    .line 58
    goto :goto_5

    .line 59
    :goto_6
    and-int/lit16 p2, v0, 0x100

    .line 60
    .line 61
    if-eqz p2, :cond_7

    .line 62
    .line 63
    move-object v9, v1

    .line 64
    move-object v0, p0

    .line 65
    move-object/from16 v10, p9

    .line 66
    .line 67
    move-object v1, p1

    .line 68
    goto :goto_7

    .line 69
    :cond_7
    move-object/from16 v9, p8

    .line 70
    .line 71
    move-object v0, p0

    .line 72
    move-object v1, p1

    .line 73
    move-object/from16 v10, p9

    .line 74
    .line 75
    :goto_7
    invoke-virtual/range {v0 .. v10}, Lpr7;->a(Ljava/lang/String;ZLjava/lang/String;Ldn2;Lgn2;Lgn2;Lsn2;Lnr7;Ljava/lang/Boolean;Ls51;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    return-object p0
.end method


# virtual methods
.method public final a(Ljava/lang/String;ZLjava/lang/String;Ldn2;Lgn2;Lgn2;Lsn2;Lnr7;Ljava/lang/Boolean;Ls51;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p10

    .line 6
    .line 7
    instance-of v3, v2, Lor7;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    move-object v3, v2

    .line 12
    check-cast v3, Lor7;

    .line 13
    .line 14
    iget v4, v3, Lor7;->q0:I

    .line 15
    .line 16
    const/high16 v5, -0x80000000

    .line 17
    .line 18
    and-int v6, v4, v5

    .line 19
    .line 20
    if-eqz v6, :cond_0

    .line 21
    .line 22
    sub-int/2addr v4, v5

    .line 23
    iput v4, v3, Lor7;->q0:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v3, Lor7;

    .line 27
    .line 28
    invoke-direct {v3, v0, v2}, Lor7;-><init>(Lpr7;Ls51;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v2, v3, Lor7;->o0:Ljava/lang/Object;

    .line 32
    .line 33
    iget v4, v3, Lor7;->q0:I

    .line 34
    .line 35
    iget-object v5, v0, Lpr7;->b:Loh7;

    .line 36
    .line 37
    const/4 v6, 0x2

    .line 38
    const/4 v7, 0x1

    .line 39
    const/4 v8, 0x0

    .line 40
    sget-object v9, Lc71;->X:Lc71;

    .line 41
    .line 42
    if-eqz v4, :cond_3

    .line 43
    .line 44
    if-eq v4, v7, :cond_2

    .line 45
    .line 46
    if-ne v4, v6, :cond_1

    .line 47
    .line 48
    iget-object v1, v3, Lor7;->m0:Lo15;

    .line 49
    .line 50
    iget-object v0, v3, Lor7;->f0:Ljava/lang/String;

    .line 51
    .line 52
    :try_start_0
    invoke-static {v2}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    .line 54
    .line 55
    goto/16 :goto_4

    .line 56
    .line 57
    :catchall_0
    move-exception v0

    .line 58
    move-object v2, v8

    .line 59
    goto/16 :goto_6

    .line 60
    .line 61
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 62
    .line 63
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    return-object v8

    .line 67
    :cond_2
    iget-boolean v1, v3, Lor7;->n0:Z

    .line 68
    .line 69
    iget-object v4, v3, Lor7;->m0:Lo15;

    .line 70
    .line 71
    iget-object v7, v3, Lor7;->l0:Ljava/lang/Boolean;

    .line 72
    .line 73
    iget-object v10, v3, Lor7;->k0:Lsn2;

    .line 74
    .line 75
    iget-object v11, v3, Lor7;->j0:Lgn2;

    .line 76
    .line 77
    iget-object v12, v3, Lor7;->i0:Lgn2;

    .line 78
    .line 79
    iget-object v13, v3, Lor7;->h0:Ldn2;

    .line 80
    .line 81
    iget-object v14, v3, Lor7;->g0:Ljava/lang/String;

    .line 82
    .line 83
    iget-object v15, v3, Lor7;->f0:Ljava/lang/String;

    .line 84
    .line 85
    invoke-static {v2}, Lw39;->n0(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    move-object/from16 v16, v12

    .line 89
    .line 90
    move-object v12, v11

    .line 91
    move-object/from16 v11, v16

    .line 92
    .line 93
    goto/16 :goto_2

    .line 94
    .line 95
    :cond_3
    invoke-static {v2}, Lw39;->n0(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    new-instance v2, Lsu/happ/proxyutility/domain/sub/SubId;

    .line 99
    .line 100
    invoke-direct {v2, v1}, Lsu/happ/proxyutility/domain/sub/SubId;-><init>(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    iget-object v4, v0, Lpr7;->c:Ljava/util/concurrent/ConcurrentHashMap;

    .line 104
    .line 105
    invoke-virtual {v4, v2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v10

    .line 109
    if-nez v10, :cond_5

    .line 110
    .line 111
    invoke-static {}, Lr15;->a()Lq15;

    .line 112
    .line 113
    .line 114
    move-result-object v10

    .line 115
    invoke-virtual {v4, v2, v10}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    if-nez v2, :cond_4

    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_4
    move-object v10, v2

    .line 123
    :cond_5
    :goto_1
    check-cast v10, Lo15;

    .line 124
    .line 125
    sget-object v2, Llr7;->a:Llr7;

    .line 126
    .line 127
    move-object/from16 v4, p8

    .line 128
    .line 129
    invoke-static {v4, v2}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v2

    .line 133
    if-eqz v2, :cond_6

    .line 134
    .line 135
    invoke-interface {v10}, Lo15;->k()Z

    .line 136
    .line 137
    .line 138
    move-result v2

    .line 139
    if-eqz v2, :cond_6

    .line 140
    .line 141
    return-object v8

    .line 142
    :cond_6
    iput-object v1, v3, Lor7;->f0:Ljava/lang/String;

    .line 143
    .line 144
    move-object/from16 v2, p3

    .line 145
    .line 146
    iput-object v2, v3, Lor7;->g0:Ljava/lang/String;

    .line 147
    .line 148
    move-object/from16 v4, p4

    .line 149
    .line 150
    iput-object v4, v3, Lor7;->h0:Ldn2;

    .line 151
    .line 152
    move-object/from16 v11, p5

    .line 153
    .line 154
    iput-object v11, v3, Lor7;->i0:Lgn2;

    .line 155
    .line 156
    move-object/from16 v12, p6

    .line 157
    .line 158
    iput-object v12, v3, Lor7;->j0:Lgn2;

    .line 159
    .line 160
    move-object/from16 v13, p7

    .line 161
    .line 162
    iput-object v13, v3, Lor7;->k0:Lsn2;

    .line 163
    .line 164
    move-object/from16 v14, p9

    .line 165
    .line 166
    iput-object v14, v3, Lor7;->l0:Ljava/lang/Boolean;

    .line 167
    .line 168
    iput-object v10, v3, Lor7;->m0:Lo15;

    .line 169
    .line 170
    move/from16 v15, p2

    .line 171
    .line 172
    iput-boolean v15, v3, Lor7;->n0:Z

    .line 173
    .line 174
    iput v7, v3, Lor7;->q0:I

    .line 175
    .line 176
    invoke-interface {v10, v3}, Lo15;->g(Lq51;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v7

    .line 180
    if-ne v7, v9, :cond_7

    .line 181
    .line 182
    goto :goto_3

    .line 183
    :cond_7
    move v7, v15

    .line 184
    move-object v15, v1

    .line 185
    move v1, v7

    .line 186
    move-object v7, v13

    .line 187
    move-object v13, v4

    .line 188
    move-object v4, v10

    .line 189
    move-object v10, v7

    .line 190
    move-object v7, v14

    .line 191
    move-object v14, v2

    .line 192
    :goto_2
    :try_start_1
    invoke-virtual {v5}, Loh7;->getValue()Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v2

    .line 196
    move-object v6, v2

    .line 197
    check-cast v6, Lcm5;

    .line 198
    .line 199
    new-instance v8, Lsu/happ/proxyutility/domain/sub/SubId;

    .line 200
    .line 201
    invoke-direct {v8, v15}, Lsu/happ/proxyutility/domain/sub/SubId;-><init>(Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    move-object/from16 p8, v7

    .line 205
    .line 206
    sget-object v7, Lyu7;->a:Lyu7;

    .line 207
    .line 208
    invoke-interface {v6, v8, v7}, Lcm5;->d(Landroid/os/Parcelable;Ljava/lang/Object;)Lcm5;

    .line 209
    .line 210
    .line 211
    move-result-object v6

    .line 212
    invoke-virtual {v5, v2, v6}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    move-result v2

    .line 216
    if-eqz v2, :cond_a

    .line 217
    .line 218
    iget-object v0, v0, Lpr7;->a:Lxr7;

    .line 219
    .line 220
    iput-object v15, v3, Lor7;->f0:Ljava/lang/String;

    .line 221
    .line 222
    const/4 v2, 0x0

    .line 223
    iput-object v2, v3, Lor7;->g0:Ljava/lang/String;

    .line 224
    .line 225
    iput-object v2, v3, Lor7;->h0:Ldn2;

    .line 226
    .line 227
    iput-object v2, v3, Lor7;->i0:Lgn2;

    .line 228
    .line 229
    iput-object v2, v3, Lor7;->j0:Lgn2;

    .line 230
    .line 231
    iput-object v2, v3, Lor7;->k0:Lsn2;

    .line 232
    .line 233
    iput-object v2, v3, Lor7;->l0:Ljava/lang/Boolean;

    .line 234
    .line 235
    iput-object v4, v3, Lor7;->m0:Lo15;

    .line 236
    .line 237
    iput-boolean v1, v3, Lor7;->n0:Z

    .line 238
    .line 239
    const/4 v2, 0x2

    .line 240
    iput v2, v3, Lor7;->q0:I

    .line 241
    .line 242
    move-object/from16 p0, v0

    .line 243
    .line 244
    move/from16 p2, v1

    .line 245
    .line 246
    move-object/from16 p9, v3

    .line 247
    .line 248
    move-object/from16 p7, v10

    .line 249
    .line 250
    move-object/from16 p5, v11

    .line 251
    .line 252
    move-object/from16 p6, v12

    .line 253
    .line 254
    move-object/from16 p4, v13

    .line 255
    .line 256
    move-object/from16 p3, v14

    .line 257
    .line 258
    move-object/from16 p1, v15

    .line 259
    .line 260
    invoke-virtual/range {p0 .. p9}, Lxr7;->d(Ljava/lang/String;ZLjava/lang/String;Ldn2;Lgn2;Lgn2;Lsn2;Ljava/lang/Boolean;Ls51;)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 264
    move-object/from16 v15, p1

    .line 265
    .line 266
    if-ne v2, v9, :cond_8

    .line 267
    .line 268
    :goto_3
    return-object v9

    .line 269
    :cond_8
    move-object v1, v4

    .line 270
    move-object v0, v15

    .line 271
    :goto_4
    :try_start_2
    check-cast v2, Lav7;

    .line 272
    .line 273
    :cond_9
    invoke-virtual {v5}, Loh7;->getValue()Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object v3

    .line 277
    move-object v4, v3

    .line 278
    check-cast v4, Lcm5;

    .line 279
    .line 280
    new-instance v6, Lsu/happ/proxyutility/domain/sub/SubId;

    .line 281
    .line 282
    invoke-direct {v6, v0}, Lsu/happ/proxyutility/domain/sub/SubId;-><init>(Ljava/lang/String;)V

    .line 283
    .line 284
    .line 285
    invoke-interface {v4, v6, v2}, Lcm5;->d(Landroid/os/Parcelable;Ljava/lang/Object;)Lcm5;

    .line 286
    .line 287
    .line 288
    move-result-object v4

    .line 289
    invoke-virtual {v5, v3, v4}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 290
    .line 291
    .line 292
    move-result v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 293
    if-eqz v3, :cond_9

    .line 294
    .line 295
    const/4 v3, 0x0

    .line 296
    invoke-interface {v1, v3}, Lo15;->m(Ljava/lang/Object;)V

    .line 297
    .line 298
    .line 299
    return-object v2

    .line 300
    :catchall_1
    move-exception v0

    .line 301
    :goto_5
    const/4 v2, 0x0

    .line 302
    goto :goto_6

    .line 303
    :catchall_2
    move-exception v0

    .line 304
    move-object v1, v4

    .line 305
    goto :goto_5

    .line 306
    :cond_a
    move-object/from16 v7, p8

    .line 307
    .line 308
    const/4 v6, 0x2

    .line 309
    const/4 v8, 0x0

    .line 310
    goto :goto_2

    .line 311
    :goto_6
    invoke-interface {v1, v2}, Lo15;->m(Ljava/lang/Object;)V

    .line 312
    .line 313
    .line 314
    throw v0
.end method
