.class public final Lf84;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lzr7;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lvz7;

.field public final c:Lvz7;

.field public final d:Lvz7;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lf84;->a:Landroid/content/Context;

    .line 5
    .line 6
    new-instance p1, Lei3;

    .line 7
    .line 8
    const/16 v0, 0xe

    .line 9
    .line 10
    invoke-direct {p1, v0}, Lei3;-><init>(B)V

    .line 11
    .line 12
    .line 13
    new-instance v0, Lvz7;

    .line 14
    .line 15
    invoke-direct {v0, p1}, Lvz7;-><init>(Ldn2;)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lf84;->b:Lvz7;

    .line 19
    .line 20
    new-instance p1, Lei3;

    .line 21
    .line 22
    const/16 v0, 0xf

    .line 23
    .line 24
    invoke-direct {p1, v0}, Lei3;-><init>(B)V

    .line 25
    .line 26
    .line 27
    new-instance v0, Lvz7;

    .line 28
    .line 29
    invoke-direct {v0, p1}, Lvz7;-><init>(Ldn2;)V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Lf84;->c:Lvz7;

    .line 33
    .line 34
    new-instance p1, Lei3;

    .line 35
    .line 36
    const/16 v0, 0x10

    .line 37
    .line 38
    invoke-direct {p1, v0}, Lei3;-><init>(B)V

    .line 39
    .line 40
    .line 41
    new-instance v0, Lvz7;

    .line 42
    .line 43
    invoke-direct {v0, p1}, Lvz7;-><init>(Ldn2;)V

    .line 44
    .line 45
    .line 46
    iput-object v0, p0, Lf84;->d:Lvz7;

    .line 47
    .line 48
    return-void
.end method

.method public static c(Lf84;Ljava/lang/Long;Ljava/net/Proxy;Ljava/util/HashMap;Ljava/lang/String;ZLiq1;Ls51;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v2, p0

    .line 2
    .line 3
    move-object/from16 v0, p7

    .line 4
    .line 5
    instance-of v1, v0, Lc84;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    move-object v1, v0

    .line 10
    check-cast v1, Lc84;

    .line 11
    .line 12
    iget v3, v1, Lc84;->m0:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v1, Lc84;->m0:I

    .line 22
    .line 23
    :goto_0
    move-object v10, v1

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    new-instance v1, Lc84;

    .line 26
    .line 27
    invoke-direct {v1, v2, v0}, Lc84;-><init>(Lf84;Ls51;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :goto_1
    iget-object v0, v10, Lc84;->k0:Ljava/lang/Object;

    .line 32
    .line 33
    iget v1, v10, Lc84;->m0:I

    .line 34
    .line 35
    const/4 v11, 0x0

    .line 36
    const/4 v12, 0x2

    .line 37
    const/4 v13, 0x1

    .line 38
    const/4 v14, 0x0

    .line 39
    sget-object v15, Lc71;->X:Lc71;

    .line 40
    .line 41
    if-eqz v1, :cond_3

    .line 42
    .line 43
    if-eq v1, v13, :cond_2

    .line 44
    .line 45
    if-ne v1, v12, :cond_1

    .line 46
    .line 47
    iget v1, v10, Lc84;->i0:I

    .line 48
    .line 49
    iget-object v2, v10, Lc84;->g0:Lzf6;

    .line 50
    .line 51
    :try_start_0
    invoke-static {v0}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    .line 53
    .line 54
    goto/16 :goto_7

    .line 55
    .line 56
    :catchall_0
    move-exception v0

    .line 57
    goto/16 :goto_8

    .line 58
    .line 59
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 60
    .line 61
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    return-object v14

    .line 65
    :cond_2
    iget-wide v1, v10, Lc84;->j0:J

    .line 66
    .line 67
    iget v3, v10, Lc84;->i0:I

    .line 68
    .line 69
    iget-boolean v4, v10, Lc84;->h0:Z

    .line 70
    .line 71
    iget-object v5, v10, Lc84;->f0:Lf84;

    .line 72
    .line 73
    :try_start_1
    invoke-static {v0}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 74
    .line 75
    .line 76
    move v8, v4

    .line 77
    move-wide/from16 v16, v1

    .line 78
    .line 79
    move v1, v3

    .line 80
    move-wide/from16 v3, v16

    .line 81
    .line 82
    move-object v2, v5

    .line 83
    goto :goto_3

    .line 84
    :catchall_1
    move-exception v0

    .line 85
    move v1, v3

    .line 86
    goto/16 :goto_8

    .line 87
    .line 88
    :cond_3
    invoke-static {v0}, Lw39;->n0(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    :try_start_2
    invoke-virtual/range {p6 .. p6}, Liq1;->invoke()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    move-object v1, v0

    .line 96
    check-cast v1, Lz47;

    .line 97
    .line 98
    if-eqz p1, :cond_4

    .line 99
    .line 100
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Long;->longValue()J

    .line 101
    .line 102
    .line 103
    move-result-wide v3

    .line 104
    goto :goto_2

    .line 105
    :catchall_2
    move-exception v0

    .line 106
    move v1, v11

    .line 107
    goto/16 :goto_8

    .line 108
    .line 109
    :cond_4
    new-instance v0, Ljava/lang/Integer;

    .line 110
    .line 111
    const/4 v3, 0x7

    .line 112
    invoke-direct {v0, v3}, Ljava/lang/Integer;-><init>(I)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 116
    .line 117
    .line 118
    move-result-wide v3

    .line 119
    const-wide/16 v5, 0x3e8

    .line 120
    .line 121
    mul-long/2addr v3, v5

    .line 122
    :goto_2
    sget-object v0, Ltp1;->a:Lnf1;

    .line 123
    .line 124
    sget-object v0, Lye1;->Z:Lye1;

    .line 125
    .line 126
    move-object v5, v0

    .line 127
    new-instance v0, Lm41;

    .line 128
    .line 129
    const/4 v9, 0x0

    .line 130
    move-object/from16 v6, p3

    .line 131
    .line 132
    move-object/from16 v7, p4

    .line 133
    .line 134
    move/from16 v8, p5

    .line 135
    .line 136
    move-object v12, v5

    .line 137
    move-object/from16 v5, p2

    .line 138
    .line 139
    invoke-direct/range {v0 .. v9}, Lm41;-><init>(Lz47;Lf84;JLjava/net/Proxy;Ljava/util/HashMap;Ljava/lang/String;ZLq51;)V

    .line 140
    .line 141
    .line 142
    iput-object v2, v10, Lc84;->f0:Lf84;

    .line 143
    .line 144
    move/from16 v8, p5

    .line 145
    .line 146
    iput-boolean v8, v10, Lc84;->h0:Z

    .line 147
    .line 148
    iput v11, v10, Lc84;->i0:I

    .line 149
    .line 150
    iput-wide v3, v10, Lc84;->j0:J

    .line 151
    .line 152
    iput v13, v10, Lc84;->m0:I

    .line 153
    .line 154
    invoke-static {v12, v0, v10}, Lw51;->W(Ls61;Lrn2;Lq51;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 158
    if-ne v0, v15, :cond_5

    .line 159
    .line 160
    goto :goto_6

    .line 161
    :cond_5
    move v1, v11

    .line 162
    :goto_3
    :try_start_3
    check-cast v0, Lyf8;

    .line 163
    .line 164
    iget-object v5, v0, Lyf8;->X:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast v5, Lzf6;

    .line 167
    .line 168
    iget-object v6, v0, Lyf8;->Y:Ljava/lang/Object;

    .line 169
    .line 170
    check-cast v6, Ljava/lang/String;

    .line 171
    .line 172
    iget-object v0, v0, Lyf8;->Z:Ljava/lang/Object;

    .line 173
    .line 174
    check-cast v0, Ljava/lang/Throwable;

    .line 175
    .line 176
    if-eqz v0, :cond_8

    .line 177
    .line 178
    iget-object v2, v2, Lf84;->c:Lvz7;

    .line 179
    .line 180
    invoke-virtual {v2}, Lvz7;->getValue()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v2

    .line 184
    check-cast v2, [Lzu3;

    .line 185
    .line 186
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    move-result-object v7

    .line 190
    sget-object v9, Lyb6;->a:Lzb6;

    .line 191
    .line 192
    invoke-virtual {v9, v7}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 193
    .line 194
    .line 195
    move-result-object v7

    .line 196
    invoke-static {v7, v2}, Leu;->Z(Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 197
    .line 198
    .line 199
    move-result v2

    .line 200
    if-eqz v2, :cond_6

    .line 201
    .line 202
    goto :goto_4

    .line 203
    :cond_6
    move-object v0, v14

    .line 204
    :goto_4
    if-nez v0, :cond_7

    .line 205
    .line 206
    goto :goto_5

    .line 207
    :cond_7
    throw v0

    .line 208
    :cond_8
    :goto_5
    if-eqz v5, :cond_c

    .line 209
    .line 210
    iget v0, v5, Lzf6;->f0:I

    .line 211
    .line 212
    const/16 v2, 0xc8

    .line 213
    .line 214
    if-gt v2, v0, :cond_a

    .line 215
    .line 216
    const/16 v2, 0x12c

    .line 217
    .line 218
    if-ge v0, v2, :cond_a

    .line 219
    .line 220
    sget-object v0, Ltp1;->a:Lnf1;

    .line 221
    .line 222
    sget-object v0, Lye1;->Z:Lye1;

    .line 223
    .line 224
    new-instance v2, Ll40;

    .line 225
    .line 226
    const/4 v6, 0x6

    .line 227
    invoke-direct {v2, v5, v14, v6}, Ll40;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 228
    .line 229
    .line 230
    iput-object v14, v10, Lc84;->f0:Lf84;

    .line 231
    .line 232
    iput-object v5, v10, Lc84;->g0:Lzf6;

    .line 233
    .line 234
    iput-boolean v8, v10, Lc84;->h0:Z

    .line 235
    .line 236
    iput v1, v10, Lc84;->i0:I

    .line 237
    .line 238
    iput-wide v3, v10, Lc84;->j0:J

    .line 239
    .line 240
    const/4 v3, 0x2

    .line 241
    iput v3, v10, Lc84;->m0:I

    .line 242
    .line 243
    invoke-static {v0, v2, v10}, Lw51;->W(Ls61;Lrn2;Lq51;)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    if-ne v0, v15, :cond_9

    .line 248
    .line 249
    :goto_6
    return-object v15

    .line 250
    :cond_9
    move-object v2, v5

    .line 251
    :goto_7
    move-object v14, v0

    .line 252
    check-cast v14, Ljava/lang/String;

    .line 253
    .line 254
    move-object v5, v2

    .line 255
    :cond_a
    if-nez v14, :cond_b

    .line 256
    .line 257
    const-string v14, ""

    .line 258
    .line 259
    :cond_b
    iget v0, v5, Lzf6;->f0:I

    .line 260
    .line 261
    iget-object v2, v5, Lzf6;->h0:Lnz2;

    .line 262
    .line 263
    new-instance v3, Ljava/util/TreeMap;

    .line 264
    .line 265
    sget-object v4, Ljava/lang/String;->CASE_INSENSITIVE_ORDER:Ljava/util/Comparator;

    .line 266
    .line 267
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 268
    .line 269
    .line 270
    invoke-direct {v3, v4}, Ljava/util/TreeMap;-><init>(Ljava/util/Comparator;)V

    .line 271
    .line 272
    .line 273
    invoke-static {v2, v3}, Lzp4;->R(Ljava/lang/Iterable;Ljava/util/AbstractMap;)V

    .line 274
    .line 275
    .line 276
    new-instance v2, Lpr;

    .line 277
    .line 278
    new-instance v4, Ljava/lang/Integer;

    .line 279
    .line 280
    invoke-direct {v4, v0}, Ljava/lang/Integer;-><init>(I)V

    .line 281
    .line 282
    .line 283
    invoke-direct {v2, v14, v3, v4}, Lpr;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/lang/Integer;)V

    .line 284
    .line 285
    .line 286
    return-object v2

    .line 287
    :cond_c
    new-instance v0, Ljava/lang/RuntimeException;

    .line 288
    .line 289
    invoke-direct {v0, v6}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 290
    .line 291
    .line 292
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 293
    :goto_8
    if-eqz v1, :cond_d

    .line 294
    .line 295
    invoke-static {v0}, Lgv3;->W(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object v1

    .line 299
    const-string v2, "util.protection"

    .line 300
    .line 301
    invoke-static {v1, v2, v11}, Lfm7;->d0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 302
    .line 303
    .line 304
    move-result v1

    .line 305
    if-nez v1, :cond_d

    .line 306
    .line 307
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 308
    .line 309
    .line 310
    :cond_d
    instance-of v1, v0, Ljava/lang/InterruptedException;

    .line 311
    .line 312
    if-nez v1, :cond_e

    .line 313
    .line 314
    instance-of v1, v0, Ljava/util/concurrent/CancellationException;

    .line 315
    .line 316
    if-nez v1, :cond_e

    .line 317
    .line 318
    new-instance v1, Lrj6;

    .line 319
    .line 320
    invoke-direct {v1, v0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 321
    .line 322
    .line 323
    return-object v1

    .line 324
    :cond_e
    throw v0
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;Ljava/net/Proxy;Ljava/util/HashMap;Ljava/lang/String;ZLs51;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p7

    .line 4
    .line 5
    instance-of v2, v1, Le84;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, Le84;

    .line 11
    .line 12
    iget v3, v2, Le84;->h0:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, Le84;->h0:I

    .line 22
    .line 23
    :goto_0
    move-object v7, v2

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    new-instance v2, Le84;

    .line 26
    .line 27
    invoke-direct {v2, v0, v1}, Le84;-><init>(Lf84;Ls51;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :goto_1
    iget-object v1, v7, Le84;->f0:Ljava/lang/Object;

    .line 32
    .line 33
    iget v2, v7, Le84;->h0:I

    .line 34
    .line 35
    const/4 v3, 0x1

    .line 36
    const/4 v4, 0x0

    .line 37
    if-eqz v2, :cond_2

    .line 38
    .line 39
    if-ne v2, v3, :cond_1

    .line 40
    .line 41
    invoke-static {v1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    check-cast v1, Lsj6;

    .line 45
    .line 46
    iget-object v0, v1, Lsj6;->X:Ljava/lang/Object;

    .line 47
    .line 48
    return-object v0

    .line 49
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 50
    .line 51
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    return-object v4

    .line 55
    :cond_2
    invoke-static {v1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    iget-object v1, v0, Lf84;->d:Lvz7;

    .line 59
    .line 60
    invoke-virtual {v1}, Lvz7;->getValue()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    check-cast v1, Lzt7;

    .line 65
    .line 66
    move-object/from16 v2, p2

    .line 67
    .line 68
    invoke-virtual {v1, v2}, Lzt7;->a(Ljava/lang/String;)Lqs7;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    if-eqz v1, :cond_3

    .line 73
    .line 74
    iget-object v5, v1, Lqs7;->g:Lms7;

    .line 75
    .line 76
    if-eqz v5, :cond_3

    .line 77
    .line 78
    iget-boolean v5, v5, Lms7;->a:Z

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_3
    move v5, v3

    .line 82
    :goto_2
    sget-object v6, Lss8;->a:Lss8;

    .line 83
    .line 84
    iget-object v6, v0, Lf84;->a:Landroid/content/Context;

    .line 85
    .line 86
    invoke-static {v6}, Lss8;->k(Landroid/content/Context;)Lyf8;

    .line 87
    .line 88
    .line 89
    move-result-object v8

    .line 90
    iget-object v9, v8, Lyf8;->X:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v9, Lsu/happ/proxyutility/dto/HWID;

    .line 93
    .line 94
    invoke-virtual {v9}, Lsu/happ/proxyutility/dto/HWID;->c()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v9

    .line 98
    iget-object v10, v8, Lyf8;->Y:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v10, Lsu/happ/proxyutility/dto/VersionOS;

    .line 101
    .line 102
    invoke-virtual {v10}, Lsu/happ/proxyutility/dto/VersionOS;->a()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v10

    .line 106
    iget-object v8, v8, Lyf8;->Z:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v8, Lsu/happ/proxyutility/dto/DeviceModel;

    .line 109
    .line 110
    invoke-virtual {v8}, Lsu/happ/proxyutility/dto/DeviceModel;->a()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v8

    .line 114
    new-instance v11, Ljava/net/URL;

    .line 115
    .line 116
    move-object/from16 v12, p1

    .line 117
    .line 118
    invoke-direct {v11, v12}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    if-eqz v1, :cond_4

    .line 122
    .line 123
    iget-object v12, v1, Lqs7;->i:Lps7;

    .line 124
    .line 125
    if-eqz v12, :cond_4

    .line 126
    .line 127
    iget-object v12, v12, Lps7;->a:Ljava/lang/String;

    .line 128
    .line 129
    goto :goto_3

    .line 130
    :cond_4
    move-object v12, v4

    .line 131
    :goto_3
    const-string v13, "Android"

    .line 132
    .line 133
    const-string v14, "AndroidTV"

    .line 134
    .line 135
    if-eqz v12, :cond_6

    .line 136
    .line 137
    invoke-static {v12}, Lfm7;->o0(Ljava/lang/CharSequence;)Z

    .line 138
    .line 139
    .line 140
    move-result v15

    .line 141
    if-nez v15, :cond_5

    .line 142
    .line 143
    goto :goto_4

    .line 144
    :cond_5
    move-object v12, v4

    .line 145
    :goto_4
    if-eqz v12, :cond_6

    .line 146
    .line 147
    goto :goto_6

    .line 148
    :cond_6
    invoke-static {v6}, Lue3;->y(Landroid/content/Context;)Z

    .line 149
    .line 150
    .line 151
    move-result v12

    .line 152
    if-eqz v12, :cond_7

    .line 153
    .line 154
    move-object v12, v14

    .line 155
    goto :goto_5

    .line 156
    :cond_7
    move-object v12, v13

    .line 157
    :goto_5
    invoke-static {v12}, Lch3;->J(Ljava/lang/String;)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v12

    .line 161
    :goto_6
    new-instance v15, Lz47;

    .line 162
    .line 163
    const/16 v3, 0x1d

    .line 164
    .line 165
    invoke-direct {v15, v3}, Lz47;-><init>(B)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v11}, Ljava/net/URL;->toString()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v3

    .line 172
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    new-instance v4, Lt23;

    .line 176
    .line 177
    const/4 v0, 0x0

    .line 178
    invoke-direct {v4, v0}, Lt23;-><init>(B)V

    .line 179
    .line 180
    .line 181
    const/4 v0, 0x0

    .line 182
    invoke-virtual {v4, v0, v3}, Lt23;->f(Lu23;Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v4}, Lt23;->b()Lu23;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    iput-object v0, v15, Lz47;->Z:Ljava/lang/Object;

    .line 190
    .line 191
    const-string v0, "Connection"

    .line 192
    .line 193
    const-string v3, "close"

    .line 194
    .line 195
    invoke-virtual {v15, v0, v3}, Lz47;->M(Ljava/lang/String;Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    const-string v0, "User-agent"

    .line 199
    .line 200
    invoke-virtual {v15, v0, v12}, Lz47;->M(Ljava/lang/String;Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    invoke-static {}, Lss8;->n()Ljava/util/Locale;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 212
    .line 213
    .line 214
    const-string v3, "X-Device-Locale"

    .line 215
    .line 216
    invoke-virtual {v15, v3, v0}, Lz47;->M(Ljava/lang/String;Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v11}, Ljava/net/URL;->getUserInfo()Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    if-eqz v0, :cond_8

    .line 224
    .line 225
    const/4 v3, 0x6

    .line 226
    invoke-static {v3, v0}, Leq8;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    invoke-static {v0}, Lss8;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    const-string v3, "Basic "

    .line 235
    .line 236
    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    const-string v3, "Authorization"

    .line 241
    .line 242
    invoke-virtual {v15, v3, v0}, Lz47;->M(Ljava/lang/String;Ljava/lang/String;)V

    .line 243
    .line 244
    .line 245
    :cond_8
    if-eqz v5, :cond_a

    .line 246
    .line 247
    const-string v0, "X-HWID"

    .line 248
    .line 249
    invoke-virtual {v15, v0, v9}, Lz47;->M(Ljava/lang/String;Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    invoke-static {v6}, Lue3;->y(Landroid/content/Context;)Z

    .line 253
    .line 254
    .line 255
    move-result v0

    .line 256
    if-eqz v0, :cond_9

    .line 257
    .line 258
    move-object v13, v14

    .line 259
    :cond_9
    const-string v0, "X-Device-OS"

    .line 260
    .line 261
    invoke-virtual {v15, v0, v13}, Lz47;->M(Ljava/lang/String;Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    const-string v0, "X-Ver-OS"

    .line 265
    .line 266
    invoke-virtual {v15, v0, v10}, Lz47;->M(Ljava/lang/String;Ljava/lang/String;)V

    .line 267
    .line 268
    .line 269
    const-string v0, "X-Device-model"

    .line 270
    .line 271
    invoke-virtual {v15, v0, v8}, Lz47;->M(Ljava/lang/String;Ljava/lang/String;)V

    .line 272
    .line 273
    .line 274
    :cond_a
    invoke-virtual {v15}, Lz47;->o()Ly5;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    sget-object v3, Lkw4;->a:Lkw4;

    .line 279
    .line 280
    invoke-static {v2}, Lkw4;->f(Ljava/lang/String;)Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 281
    .line 282
    .line 283
    move-result-object v2

    .line 284
    if-eqz v2, :cond_b

    .line 285
    .line 286
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/SubscriptionItem;->U()Z

    .line 287
    .line 288
    .line 289
    move-result v2

    .line 290
    goto :goto_7

    .line 291
    :cond_b
    const/4 v2, 0x0

    .line 292
    :goto_7
    if-eqz v1, :cond_c

    .line 293
    .line 294
    iget v1, v1, Lqs7;->h:I

    .line 295
    .line 296
    goto :goto_8

    .line 297
    :cond_c
    const/4 v1, 0x7

    .line 298
    :goto_8
    new-instance v3, Ljava/lang/Integer;

    .line 299
    .line 300
    invoke-direct {v3, v1}, Ljava/lang/Integer;-><init>(I)V

    .line 301
    .line 302
    .line 303
    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    .line 304
    .line 305
    .line 306
    move-result-wide v3

    .line 307
    const-wide/16 v5, 0x3e8

    .line 308
    .line 309
    mul-long/2addr v3, v5

    .line 310
    new-instance v1, Ljava/lang/Long;

    .line 311
    .line 312
    invoke-direct {v1, v3, v4}, Ljava/lang/Long;-><init>(J)V

    .line 313
    .line 314
    .line 315
    new-instance v6, Liq1;

    .line 316
    .line 317
    const/4 v3, 0x2

    .line 318
    invoke-direct {v6, v3, v0, v15, v2}, Liq1;-><init>(BLjava/lang/Object;Ljava/lang/Object;Z)V

    .line 319
    .line 320
    .line 321
    const/4 v0, 0x1

    .line 322
    iput v0, v7, Le84;->h0:I

    .line 323
    .line 324
    move-object/from16 v0, p0

    .line 325
    .line 326
    move-object/from16 v2, p3

    .line 327
    .line 328
    move-object/from16 v3, p4

    .line 329
    .line 330
    move-object/from16 v4, p5

    .line 331
    .line 332
    move/from16 v5, p6

    .line 333
    .line 334
    invoke-static/range {v0 .. v7}, Lf84;->c(Lf84;Ljava/lang/Long;Ljava/net/Proxy;Ljava/util/HashMap;Ljava/lang/String;ZLiq1;Ls51;)Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    move-result-object v0

    .line 338
    sget-object v1, Lc71;->X:Lc71;

    .line 339
    .line 340
    if-ne v0, v1, :cond_d

    .line 341
    .line 342
    return-object v1

    .line 343
    :cond_d
    return-object v0
.end method

.method public final b(Ly5;ZJLjava/net/Proxy;Ljava/util/HashMap;Ljava/lang/String;Z)Lzf6;
    .locals 3

    .line 1
    new-instance v0, Lk95;

    .line 2
    .line 3
    invoke-direct {v0}, Lk95;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-static {p3, p4}, Lks8;->b(J)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    iput v1, v0, Lk95;->q:I

    .line 16
    .line 17
    invoke-static {p3, p4}, Lks8;->b(J)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    iput v1, v0, Lk95;->s:I

    .line 22
    .line 23
    invoke-static {p3, p4}, Lks8;->b(J)I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    iput v1, v0, Lk95;->t:I

    .line 28
    .line 29
    invoke-static {p3, p4}, Lks8;->b(J)I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    iput v1, v0, Lk95;->r:I

    .line 34
    .line 35
    new-instance v1, Lvk1;

    .line 36
    .line 37
    iget-object p0, p0, Lf84;->b:Lvz7;

    .line 38
    .line 39
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    check-cast p0, Ljava/net/CookieManager;

    .line 44
    .line 45
    invoke-direct {v1, p0}, Lvk1;-><init>(Ljava/net/CookieManager;)V

    .line 46
    .line 47
    .line 48
    iput-object v1, v0, Lk95;->f:Ld61;

    .line 49
    .line 50
    new-instance p0, Lh70;

    .line 51
    .line 52
    const/4 v1, 0x4

    .line 53
    invoke-direct {p0, p2, p6, v1}, Lh70;-><init>(ZLjava/lang/Object;B)V

    .line 54
    .line 55
    .line 56
    iput-object p0, v0, Lk95;->g:Loq1;

    .line 57
    .line 58
    if-eqz p7, :cond_0

    .line 59
    .line 60
    new-instance p0, Lm80;

    .line 61
    .line 62
    invoke-direct {p0, p7}, Lm80;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    iget-object p2, v0, Lk95;->d:Ljava/util/ArrayList;

    .line 66
    .line 67
    invoke-virtual {p2, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    :cond_0
    new-instance p0, Lr11;

    .line 71
    .line 72
    const/4 p2, 0x3

    .line 73
    invoke-direct {p0, p2}, Lr11;-><init>(B)V

    .line 74
    .line 75
    .line 76
    iget-object p2, v0, Lk95;->c:Ljava/util/ArrayList;

    .line 77
    .line 78
    invoke-virtual {p2, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    const/4 p0, 0x1

    .line 82
    const/4 p2, 0x0

    .line 83
    const/4 p6, 0x0

    .line 84
    if-eqz p8, :cond_2

    .line 85
    .line 86
    new-instance p7, Ld72;

    .line 87
    .line 88
    invoke-direct {p7, p0}, Ld72;-><init>(B)V

    .line 89
    .line 90
    .line 91
    new-array p8, p0, [Ljavax/net/ssl/X509TrustManager;

    .line 92
    .line 93
    aput-object p7, p8, p2

    .line 94
    .line 95
    const-string p7, "SSL"

    .line 96
    .line 97
    invoke-static {p7}, Ljavax/net/ssl/SSLContext;->getInstance(Ljava/lang/String;)Ljavax/net/ssl/SSLContext;

    .line 98
    .line 99
    .line 100
    move-result-object p7

    .line 101
    move-object v1, p8

    .line 102
    check-cast v1, [Ljavax/net/ssl/TrustManager;

    .line 103
    .line 104
    new-instance v2, Ljava/security/SecureRandom;

    .line 105
    .line 106
    invoke-direct {v2}, Ljava/security/SecureRandom;-><init>()V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p7, p6, v1, v2}, Ljavax/net/ssl/SSLContext;->init([Ljavax/net/ssl/KeyManager;[Ljavax/net/ssl/TrustManager;Ljava/security/SecureRandom;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {p7}, Ljavax/net/ssl/SSLContext;->getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    .line 113
    .line 114
    .line 115
    move-result-object p7

    .line 116
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    aget-object p8, p8, p2

    .line 120
    .line 121
    invoke-virtual {p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    iget-object v1, v0, Lk95;->j:Ljavax/net/ssl/SSLSocketFactory;

    .line 125
    .line 126
    invoke-virtual {p7, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result v1

    .line 130
    if-eqz v1, :cond_1

    .line 131
    .line 132
    iget-object v1, v0, Lk95;->k:Ljavax/net/ssl/X509TrustManager;

    .line 133
    .line 134
    invoke-virtual {p8, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v1

    .line 138
    :cond_1
    iput-object p7, v0, Lk95;->j:Ljavax/net/ssl/SSLSocketFactory;

    .line 139
    .line 140
    sget-object p7, Llo5;->a:Llo5;

    .line 141
    .line 142
    sget-object p7, Llo5;->a:Llo5;

    .line 143
    .line 144
    invoke-virtual {p7, p8}, Llo5;->b(Ljavax/net/ssl/X509TrustManager;)Lg33;

    .line 145
    .line 146
    .line 147
    move-result-object p7

    .line 148
    iput-object p7, v0, Lk95;->p:Lg33;

    .line 149
    .line 150
    iput-object p8, v0, Lk95;->k:Ljavax/net/ssl/X509TrustManager;

    .line 151
    .line 152
    new-instance p7, Lrn;

    .line 153
    .line 154
    const/4 p8, 0x2

    .line 155
    invoke-direct {p7, p8}, Lrn;-><init>(B)V

    .line 156
    .line 157
    .line 158
    iput-object p7, v0, Lk95;->n:Ljavax/net/ssl/HostnameVerifier;

    .line 159
    .line 160
    :cond_2
    if-eqz p5, :cond_3

    .line 161
    .line 162
    iget-object p3, v0, Lk95;->h:Ljava/net/Proxy;

    .line 163
    .line 164
    invoke-static {p5, p3}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    iput-object p5, v0, Lk95;->h:Ljava/net/Proxy;

    .line 168
    .line 169
    goto :goto_0

    .line 170
    :cond_3
    sget-object p5, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 171
    .line 172
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 173
    .line 174
    .line 175
    move-result-object p5

    .line 176
    invoke-virtual {p5}, Lsu/happ/proxyutility/HappApplication;->e()Lc16;

    .line 177
    .line 178
    .line 179
    move-result-object p5

    .line 180
    invoke-virtual {p5}, Lc16;->g()Z

    .line 181
    .line 182
    .line 183
    move-result p5

    .line 184
    if-eqz p5, :cond_6

    .line 185
    .line 186
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 187
    .line 188
    .line 189
    move-result-object p5

    .line 190
    invoke-virtual {p5}, Lsu/happ/proxyutility/HappApplication;->e()Lc16;

    .line 191
    .line 192
    .line 193
    move-result-object p5

    .line 194
    long-to-int p3, p3

    .line 195
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    invoke-virtual {p5}, Lc16;->h()V

    .line 199
    .line 200
    .line 201
    invoke-virtual {p5}, Lc16;->g()Z

    .line 202
    .line 203
    .line 204
    move-result p4

    .line 205
    if-nez p4, :cond_4

    .line 206
    .line 207
    goto :goto_0

    .line 208
    :cond_4
    sget-object p4, Lss8;->a:Lss8;

    .line 209
    .line 210
    invoke-static {}, Lss8;->t()Z

    .line 211
    .line 212
    .line 213
    iget-object p4, p5, Lc16;->h:Ljava/lang/String;

    .line 214
    .line 215
    if-eqz p4, :cond_5

    .line 216
    .line 217
    new-instance p7, Lrw;

    .line 218
    .line 219
    invoke-static {}, Ln67;->d()I

    .line 220
    .line 221
    .line 222
    move-result p8

    .line 223
    iget-object p5, p5, Lc16;->g:Ljava/lang/String;

    .line 224
    .line 225
    invoke-direct {p7, p5, p8, p3, p4}, Lrw;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 226
    .line 227
    .line 228
    iput-object p7, v0, Lk95;->i:Ljavax/net/SocketFactory;

    .line 229
    .line 230
    goto :goto_0

    .line 231
    :cond_5
    new-instance p3, Ljava/net/Proxy;

    .line 232
    .line 233
    sget-object p4, Ljava/net/Proxy$Type;->SOCKS:Ljava/net/Proxy$Type;

    .line 234
    .line 235
    new-instance p5, Ljava/net/InetSocketAddress;

    .line 236
    .line 237
    const-string p7, "127.0.0.1"

    .line 238
    .line 239
    invoke-static {}, Ln67;->d()I

    .line 240
    .line 241
    .line 242
    move-result p8

    .line 243
    invoke-direct {p5, p7, p8}, Ljava/net/InetSocketAddress;-><init>(Ljava/lang/String;I)V

    .line 244
    .line 245
    .line 246
    invoke-direct {p3, p4, p5}, Ljava/net/Proxy;-><init>(Ljava/net/Proxy$Type;Ljava/net/SocketAddress;)V

    .line 247
    .line 248
    .line 249
    iget-object p4, v0, Lk95;->h:Ljava/net/Proxy;

    .line 250
    .line 251
    invoke-static {p3, p4}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 252
    .line 253
    .line 254
    iput-object p3, v0, Lk95;->h:Ljava/net/Proxy;

    .line 255
    .line 256
    :cond_6
    :goto_0
    new-instance p3, Ll95;

    .line 257
    .line 258
    invoke-direct {p3, v0}, Ll95;-><init>(Lk95;)V

    .line 259
    .line 260
    .line 261
    new-instance p4, Lm76;

    .line 262
    .line 263
    invoke-direct {p4, p3, p1}, Lm76;-><init>(Ll95;Ly5;)V

    .line 264
    .line 265
    .line 266
    iget-object p1, p4, Lm76;->g0:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 267
    .line 268
    invoke-virtual {p1, p2, p0}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 269
    .line 270
    .line 271
    move-result p0

    .line 272
    if-eqz p0, :cond_7

    .line 273
    .line 274
    iget-object p0, p4, Lm76;->f0:Ll76;

    .line 275
    .line 276
    invoke-virtual {p0}, Lnv;->enter()V

    .line 277
    .line 278
    .line 279
    sget-object p0, Llo5;->a:Llo5;

    .line 280
    .line 281
    sget-object p0, Llo5;->a:Llo5;

    .line 282
    .line 283
    invoke-virtual {p0}, Llo5;->g()Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object p0

    .line 287
    iput-object p0, p4, Lm76;->h0:Ljava/lang/Object;

    .line 288
    .line 289
    :try_start_0
    iget-object p0, p3, Ll95;->X:Lz47;

    .line 290
    .line 291
    monitor-enter p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 292
    :try_start_1
    iget-object p1, p0, Lz47;->f0:Ljava/lang/Object;

    .line 293
    .line 294
    check-cast p1, Ljava/util/ArrayDeque;

    .line 295
    .line 296
    invoke-virtual {p1, p4}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 297
    .line 298
    .line 299
    :try_start_2
    monitor-exit p0

    .line 300
    invoke-virtual {p4}, Lm76;->d()Lzf6;

    .line 301
    .line 302
    .line 303
    move-result-object p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 304
    iget-object p1, p3, Ll95;->X:Lz47;

    .line 305
    .line 306
    invoke-virtual {p1, p4}, Lz47;->B(Lm76;)V

    .line 307
    .line 308
    .line 309
    return-object p0

    .line 310
    :catchall_0
    move-exception p0

    .line 311
    goto :goto_1

    .line 312
    :catchall_1
    move-exception p1

    .line 313
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 314
    :try_start_4
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 315
    :goto_1
    iget-object p1, p4, Lm76;->X:Ll95;

    .line 316
    .line 317
    iget-object p1, p1, Ll95;->X:Lz47;

    .line 318
    .line 319
    invoke-virtual {p1, p4}, Lz47;->B(Lm76;)V

    .line 320
    .line 321
    .line 322
    throw p0

    .line 323
    :cond_7
    const-string p0, "Already Executed"

    .line 324
    .line 325
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 326
    .line 327
    .line 328
    return-object p6
.end method
