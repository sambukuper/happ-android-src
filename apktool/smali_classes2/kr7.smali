.class public final Lkr7;
.super Lxw8;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final b:Lov6;

.field public final c:Lvz7;

.field public final d:Lvz7;

.field public final e:Lvz7;

.field public final f:Lvz7;

.field public final g:Lh76;

.field public final h:Lu77;

.field public final i:Lf76;


# direct methods
.method public constructor <init>(Lov6;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lxw8;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lkr7;->b:Lov6;

    .line 8
    .line 9
    new-instance v0, Lmq7;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {v0, v1}, Lmq7;-><init>(B)V

    .line 13
    .line 14
    .line 15
    new-instance v1, Lvz7;

    .line 16
    .line 17
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 18
    .line 19
    .line 20
    iput-object v1, p0, Lkr7;->c:Lvz7;

    .line 21
    .line 22
    new-instance v0, Lmq7;

    .line 23
    .line 24
    const/4 v1, 0x2

    .line 25
    invoke-direct {v0, v1}, Lmq7;-><init>(B)V

    .line 26
    .line 27
    .line 28
    new-instance v1, Lvz7;

    .line 29
    .line 30
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 31
    .line 32
    .line 33
    iput-object v1, p0, Lkr7;->d:Lvz7;

    .line 34
    .line 35
    new-instance v0, Lmq7;

    .line 36
    .line 37
    const/4 v1, 0x3

    .line 38
    invoke-direct {v0, v1}, Lmq7;-><init>(B)V

    .line 39
    .line 40
    .line 41
    new-instance v1, Lvz7;

    .line 42
    .line 43
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 44
    .line 45
    .line 46
    iput-object v1, p0, Lkr7;->e:Lvz7;

    .line 47
    .line 48
    new-instance v0, Lmq7;

    .line 49
    .line 50
    const/4 v1, 0x4

    .line 51
    invoke-direct {v0, v1}, Lmq7;-><init>(B)V

    .line 52
    .line 53
    .line 54
    new-instance v1, Lvz7;

    .line 55
    .line 56
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 57
    .line 58
    .line 59
    iput-object v1, p0, Lkr7;->f:Lvz7;

    .line 60
    .line 61
    new-instance v0, Lsq7;

    .line 62
    .line 63
    invoke-direct {v0}, Lsq7;-><init>()V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1, v0}, Lov6;->a(Landroid/os/Parcelable;)Lh76;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    iput-object p1, p0, Lkr7;->g:Lh76;

    .line 71
    .line 72
    const/4 p1, 0x0

    .line 73
    const/4 v0, 0x7

    .line 74
    const/4 v1, 0x0

    .line 75
    invoke-static {v1, v0, p1}, Lv77;->b(IILl90;)Lu77;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    iput-object p1, p0, Lkr7;->h:Lu77;

    .line 80
    .line 81
    invoke-static {p1}, Ljm4;->m(Lu77;)Lf76;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    iput-object p1, p0, Lkr7;->i:Lf76;

    .line 86
    .line 87
    return-void
.end method


# virtual methods
.method public final e(Lsu/happ/proxyutility/dto/SubscriptionItem;Ls51;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v0, p2

    .line 6
    .line 7
    instance-of v3, v0, Lhr7;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    move-object v3, v0

    .line 12
    check-cast v3, Lhr7;

    .line 13
    .line 14
    iget v4, v3, Lhr7;->j0:I

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
    iput v4, v3, Lhr7;->j0:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v3, Lhr7;

    .line 27
    .line 28
    invoke-direct {v3, v1, v0}, Lhr7;-><init>(Lkr7;Ls51;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v0, v3, Lhr7;->h0:Ljava/lang/Object;

    .line 32
    .line 33
    iget v4, v3, Lhr7;->j0:I

    .line 34
    .line 35
    iget-object v5, v1, Lkr7;->g:Lh76;

    .line 36
    .line 37
    const/4 v6, 0x3

    .line 38
    const/4 v7, 0x0

    .line 39
    const/4 v8, 0x2

    .line 40
    const/4 v9, 0x1

    .line 41
    const/4 v10, 0x0

    .line 42
    sget-object v11, Lc71;->X:Lc71;

    .line 43
    .line 44
    if-eqz v4, :cond_4

    .line 45
    .line 46
    if-eq v4, v9, :cond_3

    .line 47
    .line 48
    if-eq v4, v8, :cond_2

    .line 49
    .line 50
    if-ne v4, v6, :cond_1

    .line 51
    .line 52
    iget v1, v3, Lhr7;->g0:I

    .line 53
    .line 54
    :try_start_0
    invoke-static {v0}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    .line 56
    .line 57
    goto/16 :goto_10

    .line 58
    .line 59
    :catchall_0
    move-exception v0

    .line 60
    goto/16 :goto_12

    .line 61
    .line 62
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 63
    .line 64
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    return-object v10

    .line 68
    :cond_2
    iget v2, v3, Lhr7;->g0:I

    .line 69
    .line 70
    iget-object v4, v3, Lhr7;->f0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 71
    .line 72
    :try_start_1
    invoke-static {v0}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 73
    .line 74
    .line 75
    goto/16 :goto_e

    .line 76
    .line 77
    :catchall_1
    move-exception v0

    .line 78
    move v1, v2

    .line 79
    goto/16 :goto_12

    .line 80
    .line 81
    :cond_3
    iget v2, v3, Lhr7;->g0:I

    .line 82
    .line 83
    iget-object v4, v3, Lhr7;->f0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 84
    .line 85
    :try_start_2
    invoke-static {v0}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 86
    .line 87
    .line 88
    move-object/from16 v23, v4

    .line 89
    .line 90
    move v4, v2

    .line 91
    move-object/from16 v2, v23

    .line 92
    .line 93
    goto/16 :goto_b

    .line 94
    .line 95
    :cond_4
    invoke-static {v0}, Lw39;->n0(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    :try_start_3
    iget-object v0, v5, Lh76;->X:Loh7;

    .line 99
    .line 100
    invoke-virtual {v0}, Loh7;->getValue()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    check-cast v0, Lsq7;

    .line 105
    .line 106
    iget-object v0, v0, Lsq7;->l0:Ljava/lang/String;

    .line 107
    .line 108
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/SubscriptionItem;->m()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v4

    .line 112
    sget-object v12, Lss8;->a:Lss8;

    .line 113
    .line 114
    invoke-static {v4}, Lss8;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v4

    .line 118
    new-instance v12, Ljava/net/URI;

    .line 119
    .line 120
    invoke-direct {v12, v4}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v12}, Ljava/net/URI;->getFragment()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v4

    .line 127
    if-eqz v4, :cond_5

    .line 128
    .line 129
    sget-object v12, Lzl7;->a:Lkc6;

    .line 130
    .line 131
    const-string v12, "?"

    .line 132
    .line 133
    invoke-static {v4, v12, v7}, Lfm7;->d0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 134
    .line 135
    .line 136
    move-result v12

    .line 137
    if-eqz v12, :cond_5

    .line 138
    .line 139
    invoke-static {v4}, Lzl7;->b(Ljava/lang/String;)Lsu/happ/proxyutility/dto/MetaParams;

    .line 140
    .line 141
    .line 142
    move-result-object v4

    .line 143
    goto :goto_1

    .line 144
    :catchall_2
    move-exception v0

    .line 145
    move v1, v7

    .line 146
    goto/16 :goto_12

    .line 147
    .line 148
    :cond_5
    move-object v4, v10

    .line 149
    :goto_1
    if-eqz v4, :cond_7

    .line 150
    .line 151
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/SubscriptionItem;->P()Lsu/happ/proxyutility/dto/MetaParams;

    .line 152
    .line 153
    .line 154
    move-result-object v12

    .line 155
    if-eqz v12, :cond_6

    .line 156
    .line 157
    sget-object v13, Lsu/happ/proxyutility/dto/MetaParams;->Companion:Lsu/happ/proxyutility/dto/MetaParams$Companion;

    .line 158
    .line 159
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    invoke-static {v4, v12, v9}, Lsu/happ/proxyutility/dto/MetaParams$Companion;->c(Lsu/happ/proxyutility/dto/MetaParams;Lsu/happ/proxyutility/dto/MetaParams;Z)Lsu/happ/proxyutility/dto/MetaParams;

    .line 163
    .line 164
    .line 165
    move-result-object v4

    .line 166
    goto :goto_2

    .line 167
    :cond_6
    move-object v4, v10

    .line 168
    :goto_2
    if-nez v4, :cond_8

    .line 169
    .line 170
    :cond_7
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/SubscriptionItem;->P()Lsu/happ/proxyutility/dto/MetaParams;

    .line 171
    .line 172
    .line 173
    move-result-object v4

    .line 174
    :cond_8
    invoke-virtual {v2, v4}, Lsu/happ/proxyutility/dto/SubscriptionItem;->r0(Lsu/happ/proxyutility/dto/MetaParams;)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/SubscriptionItem;->G()Z

    .line 178
    .line 179
    .line 180
    move-result v4

    .line 181
    if-nez v4, :cond_d

    .line 182
    .line 183
    invoke-static {v0}, Lae1;->b(Ljava/lang/String;)Lsu/happ/proxyutility/dto/enums/EDeeplinkType;

    .line 184
    .line 185
    .line 186
    move-result-object v4

    .line 187
    sget-object v12, Lsu/happ/proxyutility/dto/enums/EDeeplinkType;->CRYPTO:Lsu/happ/proxyutility/dto/enums/EDeeplinkType;

    .line 188
    .line 189
    if-eq v4, v12, :cond_a

    .line 190
    .line 191
    sget-object v12, Lsu/happ/proxyutility/dto/enums/EDeeplinkType;->CRYPTO2:Lsu/happ/proxyutility/dto/enums/EDeeplinkType;

    .line 192
    .line 193
    if-eq v4, v12, :cond_a

    .line 194
    .line 195
    sget-object v12, Lsu/happ/proxyutility/dto/enums/EDeeplinkType;->CRYPTO3:Lsu/happ/proxyutility/dto/enums/EDeeplinkType;

    .line 196
    .line 197
    if-eq v4, v12, :cond_a

    .line 198
    .line 199
    sget-object v12, Lsu/happ/proxyutility/dto/enums/EDeeplinkType;->CRYPTO4:Lsu/happ/proxyutility/dto/enums/EDeeplinkType;

    .line 200
    .line 201
    if-eq v4, v12, :cond_a

    .line 202
    .line 203
    sget-object v12, Lsu/happ/proxyutility/dto/enums/EDeeplinkType;->CRYPTO5:Lsu/happ/proxyutility/dto/enums/EDeeplinkType;

    .line 204
    .line 205
    if-ne v4, v12, :cond_9

    .line 206
    .line 207
    goto :goto_3

    .line 208
    :cond_9
    move v12, v7

    .line 209
    goto :goto_4

    .line 210
    :cond_a
    :goto_3
    move v12, v9

    .line 211
    :goto_4
    invoke-virtual {v2, v12}, Lsu/happ/proxyutility/dto/SubscriptionItem;->j0(Z)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/SubscriptionItem;->u()Z

    .line 215
    .line 216
    .line 217
    move-result v12

    .line 218
    if-eqz v12, :cond_b

    .line 219
    .line 220
    if-eqz v4, :cond_c

    .line 221
    .line 222
    const-string v12, "happ://"

    .line 223
    .line 224
    invoke-static {v12, v0}, Lfm7;->x0(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v12

    .line 228
    invoke-static {v12, v4}, Lae1;->c(Ljava/lang/String;Lsu/happ/proxyutility/dto/enums/EDeeplinkType;)Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v12

    .line 232
    invoke-virtual {v2, v12}, Lsu/happ/proxyutility/dto/SubscriptionItem;->w0(Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    invoke-static {v4}, Lae1;->a(Lsu/happ/proxyutility/dto/enums/EDeeplinkType;)Lb12;

    .line 236
    .line 237
    .line 238
    move-result-object v4

    .line 239
    invoke-virtual {v2, v4}, Lsu/happ/proxyutility/dto/SubscriptionItem;->k0(Lb12;)V

    .line 240
    .line 241
    .line 242
    goto :goto_5

    .line 243
    :cond_b
    invoke-virtual {v2, v0}, Lsu/happ/proxyutility/dto/SubscriptionItem;->w0(Ljava/lang/String;)V

    .line 244
    .line 245
    .line 246
    :cond_c
    :goto_5
    iget-object v4, v5, Lh76;->X:Loh7;

    .line 247
    .line 248
    invoke-virtual {v4}, Loh7;->getValue()Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v4

    .line 252
    check-cast v4, Lsq7;

    .line 253
    .line 254
    iget-boolean v4, v4, Lsq7;->Z:Z

    .line 255
    .line 256
    invoke-virtual {v2, v4}, Lsu/happ/proxyutility/dto/SubscriptionItem;->n0(Z)V

    .line 257
    .line 258
    .line 259
    invoke-static {v0}, Lc12;->d(Ljava/lang/String;)Z

    .line 260
    .line 261
    .line 262
    move-result v0

    .line 263
    invoke-virtual {v2, v0}, Lsu/happ/proxyutility/dto/SubscriptionItem;->i0(Z)V

    .line 264
    .line 265
    .line 266
    :cond_d
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/SubscriptionItem;->h0()V

    .line 267
    .line 268
    .line 269
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/SubscriptionItem;->g0()V

    .line 270
    .line 271
    .line 272
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/SubscriptionItem;->P()Lsu/happ/proxyutility/dto/MetaParams;

    .line 273
    .line 274
    .line 275
    move-result-object v12

    .line 276
    if-eqz v12, :cond_e

    .line 277
    .line 278
    iget-object v0, v5, Lh76;->X:Loh7;

    .line 279
    .line 280
    invoke-virtual {v0}, Loh7;->getValue()Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object v0

    .line 284
    check-cast v0, Lsq7;

    .line 285
    .line 286
    iget-boolean v0, v0, Lsq7;->h0:Z

    .line 287
    .line 288
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 289
    .line 290
    .line 291
    move-result-object v13

    .line 292
    const/16 v21, -0x1

    .line 293
    .line 294
    const v22, 0xfffffff

    .line 295
    .line 296
    .line 297
    const/4 v14, 0x0

    .line 298
    const/4 v15, 0x0

    .line 299
    const/16 v16, 0x0

    .line 300
    .line 301
    const/16 v17, 0x0

    .line 302
    .line 303
    const/16 v18, 0x0

    .line 304
    .line 305
    const/16 v19, 0x0

    .line 306
    .line 307
    const/16 v20, -0x81

    .line 308
    .line 309
    invoke-static/range {v12 .. v22}, Lsu/happ/proxyutility/dto/MetaParams;->c(Lsu/happ/proxyutility/dto/MetaParams;Ljava/lang/Boolean;Lsu/happ/proxyutility/dto/enums/SubInfoColor;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;III)Lsu/happ/proxyutility/dto/MetaParams;

    .line 310
    .line 311
    .line 312
    move-result-object v0

    .line 313
    goto :goto_6

    .line 314
    :cond_e
    new-instance v0, Lsu/happ/proxyutility/dto/MetaParams;

    .line 315
    .line 316
    iget-object v4, v5, Lh76;->X:Loh7;

    .line 317
    .line 318
    invoke-virtual {v4}, Loh7;->getValue()Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object v4

    .line 322
    check-cast v4, Lsq7;

    .line 323
    .line 324
    iget-boolean v4, v4, Lsq7;->h0:Z

    .line 325
    .line 326
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 327
    .line 328
    .line 329
    move-result-object v4

    .line 330
    const/16 v12, -0x81

    .line 331
    .line 332
    invoke-direct {v0, v4, v12}, Lsu/happ/proxyutility/dto/MetaParams;-><init>(Ljava/lang/Boolean;I)V

    .line 333
    .line 334
    .line 335
    :goto_6
    invoke-virtual {v2, v0}, Lsu/happ/proxyutility/dto/SubscriptionItem;->r0(Lsu/happ/proxyutility/dto/MetaParams;)V

    .line 336
    .line 337
    .line 338
    iget-object v0, v5, Lh76;->X:Loh7;

    .line 339
    .line 340
    invoke-virtual {v0}, Loh7;->getValue()Ljava/lang/Object;

    .line 341
    .line 342
    .line 343
    move-result-object v0

    .line 344
    check-cast v0, Lsq7;

    .line 345
    .line 346
    iget-object v0, v0, Lsq7;->k0:Ljava/lang/String;

    .line 347
    .line 348
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 349
    .line 350
    .line 351
    move-result v0

    .line 352
    if-lez v0, :cond_f

    .line 353
    .line 354
    iget-object v0, v5, Lh76;->X:Loh7;

    .line 355
    .line 356
    invoke-virtual {v0}, Loh7;->getValue()Ljava/lang/Object;

    .line 357
    .line 358
    .line 359
    move-result-object v0

    .line 360
    check-cast v0, Lsq7;

    .line 361
    .line 362
    iget-object v0, v0, Lsq7;->k0:Ljava/lang/String;

    .line 363
    .line 364
    invoke-virtual {v2, v0, v9}, Lsu/happ/proxyutility/dto/SubscriptionItem;->v0(Ljava/lang/String;Z)V

    .line 365
    .line 366
    .line 367
    goto :goto_a

    .line 368
    :cond_f
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/SubscriptionItem;->G()Z

    .line 369
    .line 370
    .line 371
    move-result v0

    .line 372
    if-eqz v0, :cond_10

    .line 373
    .line 374
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/SubscriptionItem;->W()Ljava/lang/String;

    .line 375
    .line 376
    .line 377
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 378
    goto :goto_9

    .line 379
    :cond_10
    :try_start_4
    new-instance v0, Ljava/net/URL;

    .line 380
    .line 381
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/SubscriptionItem;->X()Ljava/lang/String;

    .line 382
    .line 383
    .line 384
    move-result-object v4

    .line 385
    invoke-direct {v0, v4}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 386
    .line 387
    .line 388
    invoke-virtual {v0}, Ljava/net/URL;->getHost()Ljava/lang/String;

    .line 389
    .line 390
    .line 391
    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 392
    goto :goto_7

    .line 393
    :catchall_3
    move-exception v0

    .line 394
    :try_start_5
    instance-of v4, v0, Ljava/lang/InterruptedException;

    .line 395
    .line 396
    if-nez v4, :cond_19

    .line 397
    .line 398
    instance-of v4, v0, Ljava/util/concurrent/CancellationException;

    .line 399
    .line 400
    if-nez v4, :cond_19

    .line 401
    .line 402
    new-instance v4, Lrj6;

    .line 403
    .line 404
    invoke-direct {v4, v0}, Lrj6;-><init>(Ljava/lang/Throwable;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 405
    .line 406
    .line 407
    move-object v0, v4

    .line 408
    :goto_7
    :try_start_6
    invoke-static {v0}, Lsj6;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 409
    .line 410
    .line 411
    move-result-object v4

    .line 412
    if-nez v4, :cond_11

    .line 413
    .line 414
    goto :goto_8

    .line 415
    :cond_11
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/SubscriptionItem;->X()Ljava/lang/String;

    .line 416
    .line 417
    .line 418
    move-result-object v0

    .line 419
    :goto_8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 420
    .line 421
    .line 422
    check-cast v0, Ljava/lang/String;

    .line 423
    .line 424
    const/4 v4, 0x6

    .line 425
    invoke-static {v4, v0}, Leq8;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 426
    .line 427
    .line 428
    move-result-object v0

    .line 429
    :goto_9
    invoke-virtual {v2, v0, v9}, Lsu/happ/proxyutility/dto/SubscriptionItem;->v0(Ljava/lang/String;Z)V

    .line 430
    .line 431
    .line 432
    :goto_a
    iget-object v0, v1, Lkr7;->d:Lvz7;

    .line 433
    .line 434
    invoke-virtual {v0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 435
    .line 436
    .line 437
    move-result-object v0

    .line 438
    check-cast v0, Lqq0;

    .line 439
    .line 440
    iget-object v4, v5, Lh76;->X:Loh7;

    .line 441
    .line 442
    invoke-virtual {v4}, Loh7;->getValue()Ljava/lang/Object;

    .line 443
    .line 444
    .line 445
    move-result-object v4

    .line 446
    check-cast v4, Lsq7;

    .line 447
    .line 448
    iget-object v4, v4, Lsq7;->X:Ljava/lang/String;

    .line 449
    .line 450
    iput-object v2, v3, Lhr7;->f0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 451
    .line 452
    iput v7, v3, Lhr7;->g0:I

    .line 453
    .line 454
    iput v9, v3, Lhr7;->j0:I

    .line 455
    .line 456
    const/16 v9, 0x7c

    .line 457
    .line 458
    invoke-static {v0, v2, v4, v3, v9}, Lqq0;->d(Lqq0;Lsu/happ/proxyutility/dto/SubscriptionItem;Ljava/lang/String;Ls51;I)Ljava/lang/Object;

    .line 459
    .line 460
    .line 461
    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 462
    if-ne v0, v11, :cond_12

    .line 463
    .line 464
    goto/16 :goto_f

    .line 465
    .line 466
    :cond_12
    move v4, v7

    .line 467
    :goto_b
    :try_start_7
    check-cast v0, Lx83;

    .line 468
    .line 469
    instance-of v0, v0, Lv83;

    .line 470
    .line 471
    if-nez v0, :cond_18

    .line 472
    .line 473
    sget-object v0, Lkw4;->a:Lkw4;

    .line 474
    .line 475
    iget-object v0, v5, Lh76;->X:Loh7;

    .line 476
    .line 477
    invoke-virtual {v0}, Loh7;->getValue()Ljava/lang/Object;

    .line 478
    .line 479
    .line 480
    move-result-object v0

    .line 481
    check-cast v0, Lsq7;

    .line 482
    .line 483
    iget-object v0, v0, Lsq7;->X:Ljava/lang/String;

    .line 484
    .line 485
    invoke-static {v2, v0}, Lkw4;->u(Lsu/happ/proxyutility/dto/SubscriptionItem;Ljava/lang/String;)V

    .line 486
    .line 487
    .line 488
    iget-object v0, v1, Lkr7;->f:Lvz7;

    .line 489
    .line 490
    invoke-virtual {v0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 491
    .line 492
    .line 493
    move-result-object v0

    .line 494
    check-cast v0, Lus;

    .line 495
    .line 496
    iget-object v5, v5, Lh76;->X:Loh7;

    .line 497
    .line 498
    invoke-virtual {v5}, Loh7;->getValue()Ljava/lang/Object;

    .line 499
    .line 500
    .line 501
    move-result-object v5

    .line 502
    check-cast v5, Lsq7;

    .line 503
    .line 504
    iget-object v5, v5, Lsq7;->X:Ljava/lang/String;

    .line 505
    .line 506
    if-eqz v5, :cond_13

    .line 507
    .line 508
    new-instance v9, Lsu/happ/proxyutility/domain/sub/SubId;

    .line 509
    .line 510
    invoke-direct {v9, v5}, Lsu/happ/proxyutility/domain/sub/SubId;-><init>(Ljava/lang/String;)V

    .line 511
    .line 512
    .line 513
    goto :goto_d

    .line 514
    :goto_c
    move v1, v4

    .line 515
    goto :goto_12

    .line 516
    :cond_13
    move-object v9, v10

    .line 517
    :goto_d
    if-eqz v9, :cond_17

    .line 518
    .line 519
    invoke-virtual {v9}, Lsu/happ/proxyutility/domain/sub/SubId;->d()Ljava/lang/String;

    .line 520
    .line 521
    .line 522
    move-result-object v5

    .line 523
    iput-object v2, v3, Lhr7;->f0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 524
    .line 525
    iput v4, v3, Lhr7;->g0:I

    .line 526
    .line 527
    iput v8, v3, Lhr7;->j0:I

    .line 528
    .line 529
    invoke-virtual {v0, v5, v3}, Lus;->a(Ljava/lang/String;Ls51;)Ljava/lang/Object;

    .line 530
    .line 531
    .line 532
    move-result-object v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 533
    if-ne v0, v11, :cond_14

    .line 534
    .line 535
    goto :goto_f

    .line 536
    :cond_14
    move/from16 v23, v4

    .line 537
    .line 538
    move-object v4, v2

    .line 539
    move/from16 v2, v23

    .line 540
    .line 541
    :goto_e
    :try_start_8
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/SubscriptionItem;->R()Ljava/lang/String;

    .line 542
    .line 543
    .line 544
    move-result-object v0

    .line 545
    if-eqz v0, :cond_15

    .line 546
    .line 547
    iget-object v4, v1, Lkr7;->e:Lvz7;

    .line 548
    .line 549
    invoke-virtual {v4}, Lvz7;->getValue()Ljava/lang/Object;

    .line 550
    .line 551
    .line 552
    move-result-object v4

    .line 553
    check-cast v4, Ls24;

    .line 554
    .line 555
    invoke-virtual {v4, v0}, Ls24;->a(Ljava/lang/String;)V

    .line 556
    .line 557
    .line 558
    :cond_15
    sget-object v0, Lvq7;->a:Lvq7;

    .line 559
    .line 560
    iput-object v10, v3, Lhr7;->f0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 561
    .line 562
    iput v2, v3, Lhr7;->g0:I

    .line 563
    .line 564
    iput v6, v3, Lhr7;->j0:I

    .line 565
    .line 566
    invoke-virtual {v1, v0, v3}, Lkr7;->g(Lxq7;Ls51;)Ljava/lang/Object;

    .line 567
    .line 568
    .line 569
    move-result-object v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 570
    if-ne v0, v11, :cond_16

    .line 571
    .line 572
    :goto_f
    return-object v11

    .line 573
    :cond_16
    move v1, v2

    .line 574
    :goto_10
    :try_start_9
    sget-object v0, Ldn8;->a:Ldn8;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 575
    .line 576
    goto :goto_13

    .line 577
    :catchall_4
    move-exception v0

    .line 578
    goto :goto_c

    .line 579
    :cond_17
    :try_start_a
    const-string v0, "Required value was null."

    .line 580
    .line 581
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 582
    .line 583
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 584
    .line 585
    .line 586
    throw v1

    .line 587
    :cond_18
    sget-object v0, Lkw4;->a:Lkw4;

    .line 588
    .line 589
    iget-object v0, v5, Lh76;->X:Loh7;

    .line 590
    .line 591
    invoke-virtual {v0}, Loh7;->getValue()Ljava/lang/Object;

    .line 592
    .line 593
    .line 594
    move-result-object v0

    .line 595
    check-cast v0, Lsq7;

    .line 596
    .line 597
    iget-object v0, v0, Lsq7;->X:Ljava/lang/String;

    .line 598
    .line 599
    invoke-static {v2, v0}, Lkw4;->u(Lsu/happ/proxyutility/dto/SubscriptionItem;Ljava/lang/String;)V

    .line 600
    .line 601
    .line 602
    new-instance v0, Lpj6;

    .line 603
    .line 604
    invoke-direct {v0}, Ljava/lang/Exception;-><init>()V

    .line 605
    .line 606
    .line 607
    throw v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    .line 608
    :catchall_5
    move-exception v0

    .line 609
    goto :goto_11

    .line 610
    :cond_19
    :try_start_b
    throw v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_5

    .line 611
    :goto_11
    :try_start_c
    throw v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    .line 612
    :goto_12
    if-eqz v1, :cond_1a

    .line 613
    .line 614
    invoke-static {v0}, Lgv3;->W(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 615
    .line 616
    .line 617
    move-result-object v1

    .line 618
    const-string v2, "util.protection"

    .line 619
    .line 620
    invoke-static {v1, v2, v7}, Lfm7;->d0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 621
    .line 622
    .line 623
    move-result v1

    .line 624
    if-nez v1, :cond_1a

    .line 625
    .line 626
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 627
    .line 628
    .line 629
    :cond_1a
    instance-of v1, v0, Ljava/lang/InterruptedException;

    .line 630
    .line 631
    if-nez v1, :cond_1b

    .line 632
    .line 633
    instance-of v1, v0, Ljava/util/concurrent/CancellationException;

    .line 634
    .line 635
    if-nez v1, :cond_1b

    .line 636
    .line 637
    new-instance v1, Lrj6;

    .line 638
    .line 639
    invoke-direct {v1, v0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 640
    .line 641
    .line 642
    move-object v0, v1

    .line 643
    :goto_13
    return-object v0

    .line 644
    :cond_1b
    throw v0
.end method

.method public final f(Lgr7;)V
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    instance-of v2, v1, Lzq7;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    iget-object v4, v0, Lkr7;->g:Lh76;

    .line 9
    .line 10
    const/4 v5, 0x0

    .line 11
    iget-object v6, v0, Lkr7;->b:Lov6;

    .line 12
    .line 13
    if-eqz v2, :cond_e

    .line 14
    .line 15
    check-cast v1, Lzq7;

    .line 16
    .line 17
    iget-object v8, v1, Lzq7;->a:Ljava/lang/String;

    .line 18
    .line 19
    iget-object v1, v4, Lh76;->X:Loh7;

    .line 20
    .line 21
    invoke-virtual {v1}, Loh7;->getValue()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Lsq7;

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    new-instance v1, Lsq7;

    .line 31
    .line 32
    invoke-direct {v1}, Lsq7;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v6, v1}, Lov6;->b(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    iget-object v1, v4, Lh76;->X:Loh7;

    .line 39
    .line 40
    invoke-virtual {v1}, Loh7;->getValue()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    move-object v7, v1

    .line 45
    check-cast v7, Lsq7;

    .line 46
    .line 47
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    const/16 v19, 0x0

    .line 51
    .line 52
    const/16 v20, 0x1ffe

    .line 53
    .line 54
    const/4 v9, 0x0

    .line 55
    const/4 v10, 0x0

    .line 56
    const/4 v11, 0x0

    .line 57
    const/4 v12, 0x0

    .line 58
    const/4 v13, 0x0

    .line 59
    const/4 v14, 0x0

    .line 60
    const/4 v15, 0x0

    .line 61
    const/16 v16, 0x0

    .line 62
    .line 63
    const/16 v17, 0x0

    .line 64
    .line 65
    const/16 v18, 0x0

    .line 66
    .line 67
    invoke-static/range {v7 .. v20}, Lsq7;->c(Lsq7;Ljava/lang/String;ZZZZZZZLjava/lang/String;Ljava/lang/String;ZZI)Lsq7;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-virtual {v6, v1}, Lov6;->b(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    sget-object v1, Lkw4;->a:Lkw4;

    .line 75
    .line 76
    if-nez v8, :cond_0

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_0
    invoke-static {v8}, Lkw4;->f(Ljava/lang/String;)Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    if-eqz v1, :cond_1

    .line 84
    .line 85
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/SubscriptionItem;->X()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    goto :goto_0

    .line 90
    :cond_1
    move-object v1, v5

    .line 91
    :goto_0
    if-nez v1, :cond_2

    .line 92
    .line 93
    const-string v1, ""

    .line 94
    .line 95
    :cond_2
    invoke-virtual {v0, v1}, Lkr7;->i(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    :goto_1
    const/4 v1, 0x1

    .line 99
    if-eqz v8, :cond_3

    .line 100
    .line 101
    move v11, v1

    .line 102
    goto :goto_2

    .line 103
    :cond_3
    move v11, v3

    .line 104
    :goto_2
    iget-object v2, v4, Lh76;->X:Loh7;

    .line 105
    .line 106
    invoke-virtual {v2}, Loh7;->getValue()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    move-object v9, v2

    .line 111
    check-cast v9, Lsq7;

    .line 112
    .line 113
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    const/16 v21, 0x0

    .line 117
    .line 118
    const/16 v22, 0x1ffd

    .line 119
    .line 120
    const/4 v10, 0x0

    .line 121
    const/4 v12, 0x0

    .line 122
    const/4 v13, 0x0

    .line 123
    const/4 v14, 0x0

    .line 124
    const/4 v15, 0x0

    .line 125
    const/16 v16, 0x0

    .line 126
    .line 127
    const/16 v17, 0x0

    .line 128
    .line 129
    const/16 v18, 0x0

    .line 130
    .line 131
    const/16 v19, 0x0

    .line 132
    .line 133
    const/16 v20, 0x0

    .line 134
    .line 135
    invoke-static/range {v9 .. v22}, Lsq7;->c(Lsq7;Ljava/lang/String;ZZZZZZZLjava/lang/String;Ljava/lang/String;ZZI)Lsq7;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    invoke-virtual {v6, v2}, Lov6;->b(Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    if-eqz v8, :cond_4

    .line 143
    .line 144
    sget-object v2, Lkw4;->a:Lkw4;

    .line 145
    .line 146
    invoke-static {v8}, Lkw4;->f(Ljava/lang/String;)Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 147
    .line 148
    .line 149
    move-result-object v5

    .line 150
    :cond_4
    if-eqz v5, :cond_8

    .line 151
    .line 152
    iget-object v2, v4, Lh76;->X:Loh7;

    .line 153
    .line 154
    invoke-virtual {v2}, Loh7;->getValue()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    move-object v7, v2

    .line 159
    check-cast v7, Lsq7;

    .line 160
    .line 161
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v5}, Lsu/happ/proxyutility/dto/SubscriptionItem;->W()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v16

    .line 168
    invoke-virtual {v5}, Lsu/happ/proxyutility/dto/SubscriptionItem;->X()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v17

    .line 172
    invoke-virtual {v5}, Lsu/happ/proxyutility/dto/SubscriptionItem;->G()Z

    .line 173
    .line 174
    .line 175
    move-result v2

    .line 176
    xor-int/lit8 v18, v2, 0x1

    .line 177
    .line 178
    invoke-virtual {v5}, Lsu/happ/proxyutility/dto/SubscriptionItem;->G()Z

    .line 179
    .line 180
    .line 181
    move-result v10

    .line 182
    invoke-virtual {v5}, Lsu/happ/proxyutility/dto/SubscriptionItem;->G()Z

    .line 183
    .line 184
    .line 185
    move-result v11

    .line 186
    invoke-virtual {v5}, Lsu/happ/proxyutility/dto/SubscriptionItem;->p()Z

    .line 187
    .line 188
    .line 189
    move-result v2

    .line 190
    if-nez v2, :cond_6

    .line 191
    .line 192
    invoke-virtual {v5}, Lsu/happ/proxyutility/dto/SubscriptionItem;->u()Z

    .line 193
    .line 194
    .line 195
    move-result v2

    .line 196
    if-eqz v2, :cond_5

    .line 197
    .line 198
    goto :goto_3

    .line 199
    :cond_5
    move v12, v3

    .line 200
    goto :goto_4

    .line 201
    :cond_6
    :goto_3
    move v12, v1

    .line 202
    :goto_4
    invoke-virtual {v5}, Lsu/happ/proxyutility/dto/SubscriptionItem;->P()Lsu/happ/proxyutility/dto/MetaParams;

    .line 203
    .line 204
    .line 205
    move-result-object v2

    .line 206
    if-eqz v2, :cond_7

    .line 207
    .line 208
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/MetaParams;->U()Ljava/lang/Boolean;

    .line 209
    .line 210
    .line 211
    move-result-object v2

    .line 212
    sget-object v8, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 213
    .line 214
    invoke-static {v2, v8}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    move-result v2

    .line 218
    move v13, v2

    .line 219
    goto :goto_5

    .line 220
    :cond_7
    move v13, v3

    .line 221
    :goto_5
    invoke-virtual {v5}, Lsu/happ/proxyutility/dto/SubscriptionItem;->U()Z

    .line 222
    .line 223
    .line 224
    move-result v14

    .line 225
    invoke-virtual {v5}, Lsu/happ/proxyutility/dto/SubscriptionItem;->f0()Z

    .line 226
    .line 227
    .line 228
    move-result v15

    .line 229
    const/16 v19, 0x0

    .line 230
    .line 231
    const/16 v20, 0x1803

    .line 232
    .line 233
    const/4 v8, 0x0

    .line 234
    const/4 v9, 0x0

    .line 235
    invoke-static/range {v7 .. v20}, Lsq7;->c(Lsq7;Ljava/lang/String;ZZZZZZZLjava/lang/String;Ljava/lang/String;ZZI)Lsq7;

    .line 236
    .line 237
    .line 238
    move-result-object v2

    .line 239
    invoke-virtual {v6, v2}, Lov6;->b(Ljava/lang/Object;)V

    .line 240
    .line 241
    .line 242
    :cond_8
    iget-object v2, v4, Lh76;->X:Loh7;

    .line 243
    .line 244
    invoke-virtual {v2}, Loh7;->getValue()Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v2

    .line 248
    check-cast v2, Lsq7;

    .line 249
    .line 250
    iget-object v2, v2, Lsq7;->X:Ljava/lang/String;

    .line 251
    .line 252
    if-eqz v2, :cond_d

    .line 253
    .line 254
    invoke-static {v2}, Lkw4;->f(Ljava/lang/String;)Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 255
    .line 256
    .line 257
    move-result-object v2

    .line 258
    if-nez v2, :cond_9

    .line 259
    .line 260
    goto :goto_7

    .line 261
    :cond_9
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/SubscriptionItem;->R()Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v4

    .line 265
    if-eqz v4, :cond_a

    .line 266
    .line 267
    move v4, v1

    .line 268
    goto :goto_6

    .line 269
    :cond_a
    move v4, v3

    .line 270
    :goto_6
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/SubscriptionItem;->M()Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object v5

    .line 274
    if-eqz v5, :cond_b

    .line 275
    .line 276
    move v3, v1

    .line 277
    :cond_b
    iget-object v0, v0, Lkr7;->c:Lvz7;

    .line 278
    .line 279
    invoke-virtual {v0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object v5

    .line 283
    check-cast v5, Lkf4;

    .line 284
    .line 285
    new-instance v6, Ljg;

    .line 286
    .line 287
    invoke-direct {v6, v2, v4, v3, v1}, Ljg;-><init>(Ljava/lang/Object;ZZB)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {v5, v6}, Lkf4;->h(Lgn2;)V

    .line 291
    .line 292
    .line 293
    if-nez v4, :cond_c

    .line 294
    .line 295
    if-nez v3, :cond_c

    .line 296
    .line 297
    goto :goto_7

    .line 298
    :cond_c
    invoke-virtual {v0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    move-result-object v0

    .line 302
    check-cast v0, Lkf4;

    .line 303
    .line 304
    new-instance v1, Luq0;

    .line 305
    .line 306
    const/16 v3, 0xf

    .line 307
    .line 308
    invoke-direct {v1, v2, v3}, Luq0;-><init>(Lsu/happ/proxyutility/dto/SubscriptionItem;B)V

    .line 309
    .line 310
    .line 311
    invoke-virtual {v0, v1}, Lkf4;->h(Lgn2;)V

    .line 312
    .line 313
    .line 314
    :cond_d
    :goto_7
    return-void

    .line 315
    :cond_e
    instance-of v2, v1, Lfr7;

    .line 316
    .line 317
    if-eqz v2, :cond_f

    .line 318
    .line 319
    check-cast v1, Lfr7;

    .line 320
    .line 321
    iget-object v1, v1, Lfr7;->a:Ljava/lang/String;

    .line 322
    .line 323
    invoke-virtual {v0, v1}, Lkr7;->i(Ljava/lang/String;)V

    .line 324
    .line 325
    .line 326
    return-void

    .line 327
    :cond_f
    instance-of v2, v1, Lcr7;

    .line 328
    .line 329
    if-eqz v2, :cond_10

    .line 330
    .line 331
    move-object v0, v1

    .line 332
    check-cast v0, Lcr7;

    .line 333
    .line 334
    iget-boolean v10, v0, Lcr7;->a:Z

    .line 335
    .line 336
    iget-object v0, v4, Lh76;->X:Loh7;

    .line 337
    .line 338
    invoke-virtual {v0}, Loh7;->getValue()Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    move-result-object v0

    .line 342
    move-object v7, v0

    .line 343
    check-cast v7, Lsq7;

    .line 344
    .line 345
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 346
    .line 347
    .line 348
    const/16 v19, 0x0

    .line 349
    .line 350
    const/16 v20, 0x1ffb

    .line 351
    .line 352
    const/4 v8, 0x0

    .line 353
    const/4 v9, 0x0

    .line 354
    const/4 v11, 0x0

    .line 355
    const/4 v12, 0x0

    .line 356
    const/4 v13, 0x0

    .line 357
    const/4 v14, 0x0

    .line 358
    const/4 v15, 0x0

    .line 359
    const/16 v16, 0x0

    .line 360
    .line 361
    const/16 v17, 0x0

    .line 362
    .line 363
    const/16 v18, 0x0

    .line 364
    .line 365
    invoke-static/range {v7 .. v20}, Lsq7;->c(Lsq7;Ljava/lang/String;ZZZZZZZLjava/lang/String;Ljava/lang/String;ZZI)Lsq7;

    .line 366
    .line 367
    .line 368
    move-result-object v0

    .line 369
    invoke-virtual {v6, v0}, Lov6;->b(Ljava/lang/Object;)V

    .line 370
    .line 371
    .line 372
    return-void

    .line 373
    :cond_10
    instance-of v2, v1, Lar7;

    .line 374
    .line 375
    if-eqz v2, :cond_11

    .line 376
    .line 377
    iget-object v1, v4, Lh76;->X:Loh7;

    .line 378
    .line 379
    invoke-virtual {v1}, Loh7;->getValue()Ljava/lang/Object;

    .line 380
    .line 381
    .line 382
    move-result-object v1

    .line 383
    move-object v7, v1

    .line 384
    check-cast v7, Lsq7;

    .line 385
    .line 386
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 387
    .line 388
    .line 389
    const/16 v19, 0x0

    .line 390
    .line 391
    const/16 v20, 0x17ff

    .line 392
    .line 393
    const/4 v8, 0x0

    .line 394
    const/4 v9, 0x0

    .line 395
    const/4 v10, 0x0

    .line 396
    const/4 v11, 0x0

    .line 397
    const/4 v12, 0x0

    .line 398
    const/4 v13, 0x0

    .line 399
    const/4 v14, 0x0

    .line 400
    const/4 v15, 0x0

    .line 401
    const/16 v16, 0x0

    .line 402
    .line 403
    const/16 v17, 0x0

    .line 404
    .line 405
    const/16 v18, 0x0

    .line 406
    .line 407
    invoke-static/range {v7 .. v20}, Lsq7;->c(Lsq7;Ljava/lang/String;ZZZZZZZLjava/lang/String;Ljava/lang/String;ZZI)Lsq7;

    .line 408
    .line 409
    .line 410
    move-result-object v1

    .line 411
    invoke-virtual {v6, v1}, Lov6;->b(Ljava/lang/Object;)V

    .line 412
    .line 413
    .line 414
    invoke-static {v0}, Lzw8;->a(Lxw8;)Ltu0;

    .line 415
    .line 416
    .line 417
    move-result-object v1

    .line 418
    new-instance v2, Lir7;

    .line 419
    .line 420
    invoke-direct {v2, v0, v5, v3}, Lir7;-><init>(Lkr7;Lq51;B)V

    .line 421
    .line 422
    .line 423
    const/4 v0, 0x3

    .line 424
    invoke-static {v1, v5, v2, v0}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 425
    .line 426
    .line 427
    return-void

    .line 428
    :cond_11
    instance-of v0, v1, Lbr7;

    .line 429
    .line 430
    if-eqz v0, :cond_12

    .line 431
    .line 432
    move-object v0, v1

    .line 433
    check-cast v0, Lbr7;

    .line 434
    .line 435
    iget-boolean v13, v0, Lbr7;->a:Z

    .line 436
    .line 437
    iget-object v0, v4, Lh76;->X:Loh7;

    .line 438
    .line 439
    invoke-virtual {v0}, Loh7;->getValue()Ljava/lang/Object;

    .line 440
    .line 441
    .line 442
    move-result-object v0

    .line 443
    move-object v7, v0

    .line 444
    check-cast v7, Lsq7;

    .line 445
    .line 446
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 447
    .line 448
    .line 449
    const/16 v19, 0x0

    .line 450
    .line 451
    const/16 v20, 0x1fdf

    .line 452
    .line 453
    const/4 v8, 0x0

    .line 454
    const/4 v9, 0x0

    .line 455
    const/4 v10, 0x0

    .line 456
    const/4 v11, 0x0

    .line 457
    const/4 v12, 0x0

    .line 458
    const/4 v14, 0x0

    .line 459
    const/4 v15, 0x0

    .line 460
    const/16 v16, 0x0

    .line 461
    .line 462
    const/16 v17, 0x0

    .line 463
    .line 464
    const/16 v18, 0x0

    .line 465
    .line 466
    invoke-static/range {v7 .. v20}, Lsq7;->c(Lsq7;Ljava/lang/String;ZZZZZZZLjava/lang/String;Ljava/lang/String;ZZI)Lsq7;

    .line 467
    .line 468
    .line 469
    move-result-object v0

    .line 470
    invoke-virtual {v6, v0}, Lov6;->b(Ljava/lang/Object;)V

    .line 471
    .line 472
    .line 473
    return-void

    .line 474
    :cond_12
    instance-of v0, v1, Ldr7;

    .line 475
    .line 476
    if-eqz v0, :cond_13

    .line 477
    .line 478
    move-object v0, v1

    .line 479
    check-cast v0, Ldr7;

    .line 480
    .line 481
    iget-boolean v14, v0, Ldr7;->a:Z

    .line 482
    .line 483
    iget-object v0, v4, Lh76;->X:Loh7;

    .line 484
    .line 485
    invoke-virtual {v0}, Loh7;->getValue()Ljava/lang/Object;

    .line 486
    .line 487
    .line 488
    move-result-object v0

    .line 489
    move-object v7, v0

    .line 490
    check-cast v7, Lsq7;

    .line 491
    .line 492
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 493
    .line 494
    .line 495
    const/16 v19, 0x0

    .line 496
    .line 497
    const/16 v20, 0x1fbf

    .line 498
    .line 499
    const/4 v8, 0x0

    .line 500
    const/4 v9, 0x0

    .line 501
    const/4 v10, 0x0

    .line 502
    const/4 v11, 0x0

    .line 503
    const/4 v12, 0x0

    .line 504
    const/4 v13, 0x0

    .line 505
    const/4 v15, 0x0

    .line 506
    const/16 v16, 0x0

    .line 507
    .line 508
    const/16 v17, 0x0

    .line 509
    .line 510
    const/16 v18, 0x0

    .line 511
    .line 512
    invoke-static/range {v7 .. v20}, Lsq7;->c(Lsq7;Ljava/lang/String;ZZZZZZZLjava/lang/String;Ljava/lang/String;ZZI)Lsq7;

    .line 513
    .line 514
    .line 515
    move-result-object v0

    .line 516
    invoke-virtual {v6, v0}, Lov6;->b(Ljava/lang/Object;)V

    .line 517
    .line 518
    .line 519
    return-void

    .line 520
    :cond_13
    instance-of v0, v1, Ler7;

    .line 521
    .line 522
    if-eqz v0, :cond_14

    .line 523
    .line 524
    move-object v0, v1

    .line 525
    check-cast v0, Ler7;

    .line 526
    .line 527
    iget-object v0, v0, Ler7;->a:Ljava/lang/String;

    .line 528
    .line 529
    iget-object v1, v4, Lh76;->X:Loh7;

    .line 530
    .line 531
    invoke-virtual {v1}, Loh7;->getValue()Ljava/lang/Object;

    .line 532
    .line 533
    .line 534
    move-result-object v1

    .line 535
    move-object v7, v1

    .line 536
    check-cast v7, Lsq7;

    .line 537
    .line 538
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 539
    .line 540
    .line 541
    const/16 v19, 0x0

    .line 542
    .line 543
    const/16 v20, 0x1eff

    .line 544
    .line 545
    const/4 v8, 0x0

    .line 546
    const/4 v9, 0x0

    .line 547
    const/4 v10, 0x0

    .line 548
    const/4 v11, 0x0

    .line 549
    const/4 v12, 0x0

    .line 550
    const/4 v13, 0x0

    .line 551
    const/4 v14, 0x0

    .line 552
    const/4 v15, 0x0

    .line 553
    const/16 v17, 0x0

    .line 554
    .line 555
    const/16 v18, 0x0

    .line 556
    .line 557
    move-object/from16 v16, v0

    .line 558
    .line 559
    invoke-static/range {v7 .. v20}, Lsq7;->c(Lsq7;Ljava/lang/String;ZZZZZZZLjava/lang/String;Ljava/lang/String;ZZI)Lsq7;

    .line 560
    .line 561
    .line 562
    move-result-object v0

    .line 563
    invoke-virtual {v6, v0}, Lov6;->b(Ljava/lang/Object;)V

    .line 564
    .line 565
    .line 566
    return-void

    .line 567
    :cond_14
    invoke-static {}, Lb61;->c()V

    .line 568
    .line 569
    .line 570
    return-void
.end method

.method public final g(Lxq7;Ls51;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lkr7;->h:Lu77;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lu77;->l(Ljava/lang/Object;Lq51;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    sget-object p1, Lc71;->X:Lc71;

    .line 8
    .line 9
    if-ne p0, p1, :cond_0

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    sget-object p0, Ldn8;->a:Ldn8;

    .line 13
    .line 14
    return-object p0
.end method

.method public final h(Ls51;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    instance-of v2, v0, Ljr7;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v0

    .line 10
    check-cast v2, Ljr7;

    .line 11
    .line 12
    iget v3, v2, Ljr7;->j0:I

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
    iput v3, v2, Ljr7;->j0:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Ljr7;

    .line 25
    .line 26
    invoke-direct {v2, v1, v0}, Ljr7;-><init>(Lkr7;Ls51;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v0, v2, Ljr7;->h0:Ljava/lang/Object;

    .line 30
    .line 31
    iget v3, v2, Ljr7;->j0:I

    .line 32
    .line 33
    iget-object v4, v1, Lkr7;->g:Lh76;

    .line 34
    .line 35
    const/4 v5, 0x0

    .line 36
    const/4 v6, 0x3

    .line 37
    const/4 v7, 0x1

    .line 38
    const/4 v8, 0x2

    .line 39
    const/4 v9, 0x0

    .line 40
    sget-object v10, Lc71;->X:Lc71;

    .line 41
    .line 42
    if-eqz v3, :cond_4

    .line 43
    .line 44
    if-eq v3, v7, :cond_3

    .line 45
    .line 46
    if-eq v3, v8, :cond_1

    .line 47
    .line 48
    if-ne v3, v6, :cond_2

    .line 49
    .line 50
    :cond_1
    iget v2, v2, Ljr7;->f0:I

    .line 51
    .line 52
    :try_start_0
    invoke-static {v0}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    .line 54
    .line 55
    goto/16 :goto_5

    .line 56
    .line 57
    :catchall_0
    move-exception v0

    .line 58
    goto/16 :goto_6

    .line 59
    .line 60
    :cond_2
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 61
    .line 62
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    return-object v9

    .line 66
    :cond_3
    iget v3, v2, Ljr7;->f0:I

    .line 67
    .line 68
    iget-object v11, v2, Ljr7;->g0:Ljava/lang/String;

    .line 69
    .line 70
    :try_start_1
    invoke-static {v0}, Lw39;->n0(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    check-cast v0, Lsj6;

    .line 74
    .line 75
    iget-object v0, v0, Lsj6;->X:Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 76
    .line 77
    goto :goto_3

    .line 78
    :catchall_1
    move-exception v0

    .line 79
    move v2, v3

    .line 80
    goto/16 :goto_6

    .line 81
    .line 82
    :cond_4
    invoke-static {v0}, Lw39;->n0(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    :try_start_2
    iget-object v0, v4, Lh76;->X:Loh7;

    .line 86
    .line 87
    invoke-virtual {v0}, Loh7;->getValue()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    check-cast v0, Lsq7;

    .line 92
    .line 93
    iget-object v11, v0, Lsq7;->X:Ljava/lang/String;

    .line 94
    .line 95
    if-eqz v11, :cond_7

    .line 96
    .line 97
    sget-object v0, Lkw4;->a:Lkw4;

    .line 98
    .line 99
    invoke-static {v11}, Lkw4;->f(Ljava/lang/String;)Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 100
    .line 101
    .line 102
    move-result-object v12

    .line 103
    if-nez v12, :cond_5

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_5
    iget-object v0, v4, Lh76;->X:Loh7;

    .line 107
    .line 108
    invoke-virtual {v0}, Loh7;->getValue()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    check-cast v0, Lsq7;

    .line 113
    .line 114
    iget-boolean v0, v0, Lsq7;->i0:Z

    .line 115
    .line 116
    invoke-virtual {v12}, Lsu/happ/proxyutility/dto/SubscriptionItem;->f0()Z

    .line 117
    .line 118
    .line 119
    move-result v3

    .line 120
    if-nez v3, :cond_6

    .line 121
    .line 122
    const/16 v18, 0x0

    .line 123
    .line 124
    const v19, 0xfbfffff

    .line 125
    .line 126
    .line 127
    const-wide/16 v13, 0x0

    .line 128
    .line 129
    const/4 v15, 0x0

    .line 130
    const/16 v16, 0x0

    .line 131
    .line 132
    move/from16 v17, v0

    .line 133
    .line 134
    invoke-static/range {v12 .. v19}, Lsu/happ/proxyutility/dto/SubscriptionItem;->d(Lsu/happ/proxyutility/dto/SubscriptionItem;JZLsu/happ/proxyutility/dto/MetaParams;ZLjava/lang/Long;I)Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 135
    .line 136
    .line 137
    move-result-object v12

    .line 138
    :cond_6
    invoke-static {v12, v11}, Lkw4;->u(Lsu/happ/proxyutility/dto/SubscriptionItem;Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    goto :goto_2

    .line 142
    :catchall_2
    move-exception v0

    .line 143
    move v2, v5

    .line 144
    goto/16 :goto_6

    .line 145
    .line 146
    :cond_7
    :goto_1
    move-object v12, v9

    .line 147
    :goto_2
    if-eqz v12, :cond_a

    .line 148
    .line 149
    iput-object v11, v2, Ljr7;->g0:Ljava/lang/String;

    .line 150
    .line 151
    iput v5, v2, Ljr7;->f0:I

    .line 152
    .line 153
    iput v7, v2, Ljr7;->j0:I

    .line 154
    .line 155
    invoke-virtual {v1, v12, v2}, Lkr7;->e(Lsu/happ/proxyutility/dto/SubscriptionItem;Ls51;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 159
    if-ne v0, v10, :cond_8

    .line 160
    .line 161
    goto :goto_4

    .line 162
    :cond_8
    move v3, v5

    .line 163
    :goto_3
    :try_start_3
    invoke-static {v0}, Lw39;->n0(Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    new-instance v0, Lwq7;

    .line 167
    .line 168
    iget-object v4, v4, Lh76;->X:Loh7;

    .line 169
    .line 170
    invoke-virtual {v4}, Loh7;->getValue()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v4

    .line 174
    check-cast v4, Lsq7;

    .line 175
    .line 176
    iget-boolean v4, v4, Lsq7;->Y:Z

    .line 177
    .line 178
    invoke-direct {v0, v11, v4}, Lwq7;-><init>(Ljava/lang/String;Z)V

    .line 179
    .line 180
    .line 181
    iput-object v9, v2, Ljr7;->g0:Ljava/lang/String;

    .line 182
    .line 183
    iput v3, v2, Ljr7;->f0:I

    .line 184
    .line 185
    iput v8, v2, Ljr7;->j0:I

    .line 186
    .line 187
    invoke-virtual {v1, v0, v2}, Lkr7;->g(Lxq7;Ls51;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 191
    if-ne v0, v10, :cond_9

    .line 192
    .line 193
    goto :goto_4

    .line 194
    :cond_9
    move v2, v3

    .line 195
    goto :goto_5

    .line 196
    :cond_a
    :try_start_4
    new-instance v0, Ltq7;

    .line 197
    .line 198
    iget-object v3, v4, Lh76;->X:Loh7;

    .line 199
    .line 200
    invoke-virtual {v3}, Loh7;->getValue()Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v3

    .line 204
    check-cast v3, Lsq7;

    .line 205
    .line 206
    iget-object v3, v3, Lsq7;->l0:Ljava/lang/String;

    .line 207
    .line 208
    iget-object v8, v4, Lh76;->X:Loh7;

    .line 209
    .line 210
    invoke-virtual {v8}, Loh7;->getValue()Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v8

    .line 214
    check-cast v8, Lsq7;

    .line 215
    .line 216
    iget-object v8, v8, Lsq7;->k0:Ljava/lang/String;

    .line 217
    .line 218
    iget-object v11, v4, Lh76;->X:Loh7;

    .line 219
    .line 220
    invoke-virtual {v11}, Loh7;->getValue()Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v11

    .line 224
    check-cast v11, Lsq7;

    .line 225
    .line 226
    iget-boolean v11, v11, Lsq7;->Z:Z

    .line 227
    .line 228
    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 229
    .line 230
    .line 231
    move-result-object v11

    .line 232
    iget-object v4, v4, Lh76;->X:Loh7;

    .line 233
    .line 234
    invoke-virtual {v4}, Loh7;->getValue()Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v4

    .line 238
    check-cast v4, Lsq7;

    .line 239
    .line 240
    iget-boolean v4, v4, Lsq7;->h0:Z

    .line 241
    .line 242
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 243
    .line 244
    .line 245
    move-result-object v4

    .line 246
    invoke-direct {v0, v3, v8, v11, v4}, Ltq7;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    .line 247
    .line 248
    .line 249
    iput-object v9, v2, Ljr7;->g0:Ljava/lang/String;

    .line 250
    .line 251
    iput v5, v2, Ljr7;->f0:I

    .line 252
    .line 253
    iput v6, v2, Ljr7;->j0:I

    .line 254
    .line 255
    invoke-virtual {v1, v0, v2}, Lkr7;->g(Lxq7;Ls51;)Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 259
    if-ne v0, v10, :cond_b

    .line 260
    .line 261
    :goto_4
    return-object v10

    .line 262
    :cond_b
    move v2, v5

    .line 263
    :goto_5
    :try_start_5
    sget-object v0, Ldn8;->a:Ldn8;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 264
    .line 265
    goto :goto_7

    .line 266
    :goto_6
    if-eqz v2, :cond_c

    .line 267
    .line 268
    invoke-static {v0}, Lgv3;->W(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v2

    .line 272
    const-string v3, "util.protection"

    .line 273
    .line 274
    invoke-static {v2, v3, v5}, Lfm7;->d0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 275
    .line 276
    .line 277
    move-result v2

    .line 278
    if-nez v2, :cond_c

    .line 279
    .line 280
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 281
    .line 282
    .line 283
    :cond_c
    instance-of v2, v0, Ljava/lang/InterruptedException;

    .line 284
    .line 285
    if-nez v2, :cond_e

    .line 286
    .line 287
    instance-of v2, v0, Ljava/util/concurrent/CancellationException;

    .line 288
    .line 289
    if-nez v2, :cond_e

    .line 290
    .line 291
    new-instance v2, Lrj6;

    .line 292
    .line 293
    invoke-direct {v2, v0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 294
    .line 295
    .line 296
    move-object v0, v2

    .line 297
    :goto_7
    invoke-static {v0}, Lsj6;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 298
    .line 299
    .line 300
    move-result-object v2

    .line 301
    if-eqz v2, :cond_d

    .line 302
    .line 303
    instance-of v2, v2, Lpj6;

    .line 304
    .line 305
    if-nez v2, :cond_d

    .line 306
    .line 307
    invoke-static {v1}, Lzw8;->a(Lxw8;)Ltu0;

    .line 308
    .line 309
    .line 310
    move-result-object v2

    .line 311
    new-instance v3, Lir7;

    .line 312
    .line 313
    invoke-direct {v3, v1, v9, v7}, Lir7;-><init>(Lkr7;Lq51;B)V

    .line 314
    .line 315
    .line 316
    invoke-static {v2, v9, v3, v6}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 317
    .line 318
    .line 319
    :cond_d
    return-object v0

    .line 320
    :cond_e
    throw v0
.end method

.method public final i(Ljava/lang/String;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lkr7;->g:Lh76;

    .line 4
    .line 5
    iget-object v2, v1, Lh76;->X:Loh7;

    .line 6
    .line 7
    invoke-virtual {v2}, Loh7;->getValue()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    move-object v3, v2

    .line 12
    check-cast v3, Lsq7;

    .line 13
    .line 14
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    sget-object v2, Lss8;->a:Lss8;

    .line 18
    .line 19
    invoke-static/range {p1 .. p1}, Lss8;->z(Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    const/4 v4, 0x0

    .line 24
    if-nez v2, :cond_1

    .line 25
    .line 26
    const-string v2, "happ://crypt"

    .line 27
    .line 28
    move-object/from16 v13, p1

    .line 29
    .line 30
    invoke-static {v13, v4, v2}, Lmm7;->Z(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-nez v2, :cond_0

    .line 35
    .line 36
    const/4 v4, 0x1

    .line 37
    :cond_0
    :goto_0
    move v15, v4

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    move-object/from16 v13, p1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :goto_1
    const/16 v16, 0xdff

    .line 43
    .line 44
    const/4 v4, 0x0

    .line 45
    const/4 v5, 0x0

    .line 46
    const/4 v6, 0x0

    .line 47
    const/4 v7, 0x0

    .line 48
    const/4 v8, 0x0

    .line 49
    const/4 v9, 0x0

    .line 50
    const/4 v10, 0x0

    .line 51
    const/4 v11, 0x0

    .line 52
    const/4 v12, 0x0

    .line 53
    const/4 v14, 0x0

    .line 54
    invoke-static/range {v3 .. v16}, Lsq7;->c(Lsq7;Ljava/lang/String;ZZZZZZZLjava/lang/String;Ljava/lang/String;ZZI)Lsq7;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    iget-object v0, v0, Lkr7;->b:Lov6;

    .line 59
    .line 60
    invoke-virtual {v0, v2}, Lov6;->b(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    iget-object v2, v1, Lh76;->X:Loh7;

    .line 64
    .line 65
    invoke-virtual {v2}, Loh7;->getValue()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    check-cast v2, Lsq7;

    .line 70
    .line 71
    iget-boolean v2, v2, Lsq7;->g0:Z

    .line 72
    .line 73
    invoke-static/range {p1 .. p1}, Lc12;->d(Ljava/lang/String;)Z

    .line 74
    .line 75
    .line 76
    move-result v8

    .line 77
    if-eq v2, v8, :cond_2

    .line 78
    .line 79
    iget-object v1, v1, Lh76;->X:Loh7;

    .line 80
    .line 81
    invoke-virtual {v1}, Loh7;->getValue()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    move-object v3, v1

    .line 86
    check-cast v3, Lsq7;

    .line 87
    .line 88
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    const/4 v15, 0x0

    .line 92
    const/16 v16, 0x1fef

    .line 93
    .line 94
    const/4 v4, 0x0

    .line 95
    const/4 v5, 0x0

    .line 96
    const/4 v6, 0x0

    .line 97
    const/4 v7, 0x0

    .line 98
    const/4 v9, 0x0

    .line 99
    const/4 v10, 0x0

    .line 100
    const/4 v11, 0x0

    .line 101
    const/4 v12, 0x0

    .line 102
    const/4 v13, 0x0

    .line 103
    const/4 v14, 0x0

    .line 104
    invoke-static/range {v3 .. v16}, Lsq7;->c(Lsq7;Ljava/lang/String;ZZZZZZZLjava/lang/String;Ljava/lang/String;ZZI)Lsq7;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    invoke-virtual {v0, v1}, Lov6;->b(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    :cond_2
    return-void
.end method
