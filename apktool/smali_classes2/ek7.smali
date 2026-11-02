.class public final Lek7;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:Lvz7;

.field public final b:Lvz7;

.field public final c:Lvz7;

.field public final d:Lvz7;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lr47;

    .line 5
    .line 6
    const/16 v1, 0x10

    .line 7
    .line 8
    invoke-direct {v0, v1}, Lr47;-><init>(B)V

    .line 9
    .line 10
    .line 11
    new-instance v1, Lvz7;

    .line 12
    .line 13
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 14
    .line 15
    .line 16
    iput-object v1, p0, Lek7;->a:Lvz7;

    .line 17
    .line 18
    new-instance v0, Lr47;

    .line 19
    .line 20
    const/16 v1, 0x11

    .line 21
    .line 22
    invoke-direct {v0, v1}, Lr47;-><init>(B)V

    .line 23
    .line 24
    .line 25
    new-instance v1, Lvz7;

    .line 26
    .line 27
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 28
    .line 29
    .line 30
    iput-object v1, p0, Lek7;->b:Lvz7;

    .line 31
    .line 32
    new-instance v0, Lr47;

    .line 33
    .line 34
    const/16 v1, 0x12

    .line 35
    .line 36
    invoke-direct {v0, v1}, Lr47;-><init>(B)V

    .line 37
    .line 38
    .line 39
    new-instance v1, Lvz7;

    .line 40
    .line 41
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 42
    .line 43
    .line 44
    iput-object v1, p0, Lek7;->c:Lvz7;

    .line 45
    .line 46
    new-instance v0, Lr47;

    .line 47
    .line 48
    const/16 v1, 0x13

    .line 49
    .line 50
    invoke-direct {v0, v1}, Lr47;-><init>(B)V

    .line 51
    .line 52
    .line 53
    new-instance v1, Lvz7;

    .line 54
    .line 55
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 56
    .line 57
    .line 58
    new-instance v0, Lr47;

    .line 59
    .line 60
    const/16 v1, 0x14

    .line 61
    .line 62
    invoke-direct {v0, v1}, Lr47;-><init>(B)V

    .line 63
    .line 64
    .line 65
    new-instance v1, Lvz7;

    .line 66
    .line 67
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 68
    .line 69
    .line 70
    iput-object v1, p0, Lek7;->d:Lvz7;

    .line 71
    .line 72
    return-void
.end method


# virtual methods
.method public final a()Lcom/tencent/mmkv/MMKV;
    .locals 0

    .line 1
    iget-object p0, p0, Lek7;->a:Lvz7;

    .line 2
    .line 3
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/tencent/mmkv/MMKV;

    .line 8
    .line 9
    return-object p0
.end method

.method public final b()Lzt7;
    .locals 0

    .line 1
    iget-object p0, p0, Lek7;->c:Lvz7;

    .line 2
    .line 3
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lzt7;

    .line 8
    .line 9
    return-object p0
.end method

.method public final c(Ljava/lang/String;Lsu/happ/proxyutility/dto/MetaParams;Ls51;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v0, p3

    .line 6
    .line 7
    instance-of v3, v0, Lck7;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    move-object v3, v0

    .line 12
    check-cast v3, Lck7;

    .line 13
    .line 14
    iget v4, v3, Lck7;->k0:I

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
    iput v4, v3, Lck7;->k0:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v3, Lck7;

    .line 27
    .line 28
    invoke-direct {v3, v1, v0}, Lck7;-><init>(Lek7;Ls51;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v0, v3, Lck7;->i0:Ljava/lang/Object;

    .line 32
    .line 33
    iget v4, v3, Lck7;->k0:I

    .line 34
    .line 35
    const/4 v5, 0x6

    .line 36
    const/16 v6, 0xa

    .line 37
    .line 38
    const-string v7, "pref_per_app_proxy_set"

    .line 39
    .line 40
    const-string v8, "content"

    .line 41
    .line 42
    const-string v9, "key"

    .line 43
    .line 44
    const-string v10, "su.happ.proxyutility"

    .line 45
    .line 46
    const-string v11, "su.happ.proxyutility.action.activity"

    .line 47
    .line 48
    const/4 v12, 0x2

    .line 49
    const/4 v13, 0x1

    .line 50
    const/4 v14, 0x0

    .line 51
    sget-object v15, Lc71;->X:Lc71;

    .line 52
    .line 53
    if-eqz v4, :cond_3

    .line 54
    .line 55
    if-eq v4, v13, :cond_2

    .line 56
    .line 57
    if-ne v4, v12, :cond_1

    .line 58
    .line 59
    iget-object v2, v3, Lck7;->h0:Ljava/util/List;

    .line 60
    .line 61
    iget-object v4, v3, Lck7;->g0:Lsu/happ/proxyutility/dto/MetaParams;

    .line 62
    .line 63
    iget-object v3, v3, Lck7;->f0:Ljava/lang/String;

    .line 64
    .line 65
    invoke-static {v0}, Lw39;->n0(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    goto/16 :goto_7

    .line 69
    .line 70
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 71
    .line 72
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    return-object v14

    .line 76
    :cond_2
    iget-object v2, v3, Lck7;->h0:Ljava/util/List;

    .line 77
    .line 78
    iget-object v4, v3, Lck7;->g0:Lsu/happ/proxyutility/dto/MetaParams;

    .line 79
    .line 80
    iget-object v12, v3, Lck7;->f0:Ljava/lang/String;

    .line 81
    .line 82
    invoke-static {v0}, Lw39;->n0(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    goto/16 :goto_4

    .line 86
    .line 87
    :cond_3
    invoke-static {v0}, Lw39;->n0(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual/range {p2 .. p2}, Lsu/happ/proxyutility/dto/MetaParams;->I()Ljava/lang/Boolean;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    if-eqz v0, :cond_4

    .line 95
    .line 96
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    invoke-virtual {v1}, Lek7;->a()Lcom/tencent/mmkv/MMKV;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    const-string v12, "pref_fragment_enabled"

    .line 105
    .line 106
    invoke-virtual {v4, v12, v0}, Lcom/tencent/mmkv/MMKV;->p(Ljava/lang/String;Z)V

    .line 107
    .line 108
    .line 109
    :cond_4
    invoke-virtual/range {p2 .. p2}, Lsu/happ/proxyutility/dto/MetaParams;->M()Lsu/happ/proxyutility/dto/enums/FragmentationPackets;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    if-eqz v0, :cond_5

    .line 114
    .line 115
    invoke-virtual {v1}, Lek7;->a()Lcom/tencent/mmkv/MMKV;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    const-string v12, "pref_fragment_packets"

    .line 120
    .line 121
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/enums/FragmentationPackets;->d()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    invoke-virtual {v4, v12, v0}, Lcom/tencent/mmkv/MMKV;->q(Ljava/lang/String;Ljava/lang/String;)Z

    .line 126
    .line 127
    .line 128
    :cond_5
    invoke-virtual/range {p2 .. p2}, Lsu/happ/proxyutility/dto/MetaParams;->K()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    if-eqz v0, :cond_6

    .line 133
    .line 134
    invoke-virtual {v1}, Lek7;->a()Lcom/tencent/mmkv/MMKV;

    .line 135
    .line 136
    .line 137
    move-result-object v4

    .line 138
    const-string v12, "pref_fragment_length"

    .line 139
    .line 140
    invoke-virtual {v4, v12, v0}, Lcom/tencent/mmkv/MMKV;->q(Ljava/lang/String;Ljava/lang/String;)Z

    .line 141
    .line 142
    .line 143
    :cond_6
    invoke-virtual/range {p2 .. p2}, Lsu/happ/proxyutility/dto/MetaParams;->H()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    if-nez v0, :cond_7

    .line 148
    .line 149
    invoke-virtual/range {p2 .. p2}, Lsu/happ/proxyutility/dto/MetaParams;->J()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    :cond_7
    if-eqz v0, :cond_8

    .line 154
    .line 155
    invoke-virtual {v1}, Lek7;->a()Lcom/tencent/mmkv/MMKV;

    .line 156
    .line 157
    .line 158
    move-result-object v4

    .line 159
    const-string v12, "pref_fragment_interval"

    .line 160
    .line 161
    invoke-virtual {v4, v12, v0}, Lcom/tencent/mmkv/MMKV;->q(Ljava/lang/String;Ljava/lang/String;)Z

    .line 162
    .line 163
    .line 164
    :cond_8
    invoke-virtual/range {p2 .. p2}, Lsu/happ/proxyutility/dto/MetaParams;->N()Lsu/happ/proxyutility/dto/enums/FragmentationType;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    if-eqz v0, :cond_9

    .line 169
    .line 170
    invoke-virtual {v1}, Lek7;->a()Lcom/tencent/mmkv/MMKV;

    .line 171
    .line 172
    .line 173
    move-result-object v4

    .line 174
    const-string v12, "pref_fragment_type"

    .line 175
    .line 176
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/enums/FragmentationType;->d()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    invoke-virtual {v4, v12, v0}, Lcom/tencent/mmkv/MMKV;->q(Ljava/lang/String;Ljava/lang/String;)Z

    .line 181
    .line 182
    .line 183
    :cond_9
    invoke-virtual/range {p2 .. p2}, Lsu/happ/proxyutility/dto/MetaParams;->G()Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    if-eqz v0, :cond_a

    .line 188
    .line 189
    invoke-virtual {v1}, Lek7;->a()Lcom/tencent/mmkv/MMKV;

    .line 190
    .line 191
    .line 192
    move-result-object v4

    .line 193
    const-string v12, "pref_antifilter_params"

    .line 194
    .line 195
    invoke-virtual {v4, v12, v0}, Lcom/tencent/mmkv/MMKV;->q(Ljava/lang/String;Ljava/lang/String;)Z

    .line 196
    .line 197
    .line 198
    :cond_a
    invoke-virtual/range {p2 .. p2}, Lsu/happ/proxyutility/dto/MetaParams;->L()Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    if-eqz v0, :cond_b

    .line 203
    .line 204
    invoke-virtual {v1}, Lek7;->a()Lcom/tencent/mmkv/MMKV;

    .line 205
    .line 206
    .line 207
    move-result-object v4

    .line 208
    const-string v12, "pref_fragment_max_split"

    .line 209
    .line 210
    invoke-virtual {v4, v12, v0}, Lcom/tencent/mmkv/MMKV;->q(Ljava/lang/String;Ljava/lang/String;)Z

    .line 211
    .line 212
    .line 213
    :cond_b
    invoke-virtual/range {p2 .. p2}, Lsu/happ/proxyutility/dto/MetaParams;->f0()Ljava/lang/Boolean;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    if-eqz v0, :cond_c

    .line 218
    .line 219
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 220
    .line 221
    .line 222
    move-result v0

    .line 223
    invoke-virtual {v1}, Lek7;->a()Lcom/tencent/mmkv/MMKV;

    .line 224
    .line 225
    .line 226
    move-result-object v4

    .line 227
    const-string v12, "pref_noises_enabled"

    .line 228
    .line 229
    invoke-virtual {v4, v12, v0}, Lcom/tencent/mmkv/MMKV;->p(Ljava/lang/String;Z)V

    .line 230
    .line 231
    .line 232
    :cond_c
    invoke-virtual/range {p2 .. p2}, Lsu/happ/proxyutility/dto/MetaParams;->h0()Lsu/happ/proxyutility/dto/enums/NoisesPacketType;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    if-eqz v0, :cond_d

    .line 237
    .line 238
    invoke-virtual {v1}, Lek7;->a()Lcom/tencent/mmkv/MMKV;

    .line 239
    .line 240
    .line 241
    move-result-object v4

    .line 242
    const-string v12, "pref_noises_type"

    .line 243
    .line 244
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/enums/NoisesPacketType;->c()Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    invoke-virtual {v4, v12, v0}, Lcom/tencent/mmkv/MMKV;->q(Ljava/lang/String;Ljava/lang/String;)Z

    .line 249
    .line 250
    .line 251
    :cond_d
    invoke-virtual/range {p2 .. p2}, Lsu/happ/proxyutility/dto/MetaParams;->g0()Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    if-eqz v0, :cond_e

    .line 256
    .line 257
    invoke-virtual {v1}, Lek7;->a()Lcom/tencent/mmkv/MMKV;

    .line 258
    .line 259
    .line 260
    move-result-object v4

    .line 261
    const-string v12, "pref_noises_packet"

    .line 262
    .line 263
    invoke-virtual {v4, v12, v0}, Lcom/tencent/mmkv/MMKV;->q(Ljava/lang/String;Ljava/lang/String;)Z

    .line 264
    .line 265
    .line 266
    :cond_e
    invoke-virtual/range {p2 .. p2}, Lsu/happ/proxyutility/dto/MetaParams;->e0()Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v0

    .line 270
    if-eqz v0, :cond_f

    .line 271
    .line 272
    invoke-virtual {v1}, Lek7;->a()Lcom/tencent/mmkv/MMKV;

    .line 273
    .line 274
    .line 275
    move-result-object v4

    .line 276
    const-string v12, "pref_noises_delay"

    .line 277
    .line 278
    invoke-virtual {v4, v12, v0}, Lcom/tencent/mmkv/MMKV;->q(Ljava/lang/String;Ljava/lang/String;)Z

    .line 279
    .line 280
    .line 281
    :cond_f
    invoke-virtual/range {p2 .. p2}, Lsu/happ/proxyutility/dto/MetaParams;->i0()Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object v0

    .line 285
    if-eqz v0, :cond_10

    .line 286
    .line 287
    invoke-virtual {v1}, Lek7;->a()Lcom/tencent/mmkv/MMKV;

    .line 288
    .line 289
    .line 290
    move-result-object v4

    .line 291
    const-string v12, "pref_noises_rand"

    .line 292
    .line 293
    invoke-virtual {v4, v12, v0}, Lcom/tencent/mmkv/MMKV;->q(Ljava/lang/String;Ljava/lang/String;)Z

    .line 294
    .line 295
    .line 296
    :cond_10
    invoke-virtual/range {p2 .. p2}, Lsu/happ/proxyutility/dto/MetaParams;->j0()Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    if-eqz v0, :cond_11

    .line 301
    .line 302
    invoke-virtual {v1}, Lek7;->a()Lcom/tencent/mmkv/MMKV;

    .line 303
    .line 304
    .line 305
    move-result-object v4

    .line 306
    const-string v12, "pref_noises_rand_range"

    .line 307
    .line 308
    invoke-virtual {v4, v12, v0}, Lcom/tencent/mmkv/MMKV;->q(Ljava/lang/String;Ljava/lang/String;)Z

    .line 309
    .line 310
    .line 311
    :cond_11
    invoke-virtual/range {p2 .. p2}, Lsu/happ/proxyutility/dto/MetaParams;->W()Ljava/lang/Boolean;

    .line 312
    .line 313
    .line 314
    move-result-object v0

    .line 315
    if-eqz v0, :cond_12

    .line 316
    .line 317
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 318
    .line 319
    .line 320
    move-result v0

    .line 321
    invoke-virtual {v1}, Lek7;->a()Lcom/tencent/mmkv/MMKV;

    .line 322
    .line 323
    .line 324
    move-result-object v4

    .line 325
    const-string v12, "pref_local_dns_enabled"

    .line 326
    .line 327
    invoke-virtual {v4, v12, v0}, Lcom/tencent/mmkv/MMKV;->p(Ljava/lang/String;Z)V

    .line 328
    .line 329
    .line 330
    :cond_12
    if-eqz v2, :cond_1f

    .line 331
    .line 332
    invoke-virtual/range {p2 .. p2}, Lsu/happ/proxyutility/dto/MetaParams;->T0()Ljava/lang/Boolean;

    .line 333
    .line 334
    .line 335
    move-result-object v0

    .line 336
    if-eqz v0, :cond_13

    .line 337
    .line 338
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 339
    .line 340
    .line 341
    move-result v0

    .line 342
    invoke-virtual {v1}, Lek7;->b()Lzt7;

    .line 343
    .line 344
    .line 345
    move-result-object v4

    .line 346
    new-instance v12, Las;

    .line 347
    .line 348
    invoke-direct {v12, v6, v0}, Las;-><init>(BZ)V

    .line 349
    .line 350
    .line 351
    invoke-virtual {v4, v2, v12}, Lzt7;->b(Ljava/lang/String;Lgn2;)Lqs7;

    .line 352
    .line 353
    .line 354
    :cond_13
    invoke-virtual/range {p2 .. p2}, Lsu/happ/proxyutility/dto/MetaParams;->W0()Ljava/lang/Boolean;

    .line 355
    .line 356
    .line 357
    move-result-object v0

    .line 358
    if-eqz v0, :cond_14

    .line 359
    .line 360
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 361
    .line 362
    .line 363
    move-result v0

    .line 364
    invoke-virtual {v1}, Lek7;->b()Lzt7;

    .line 365
    .line 366
    .line 367
    move-result-object v4

    .line 368
    new-instance v12, Las;

    .line 369
    .line 370
    const/16 v6, 0xb

    .line 371
    .line 372
    invoke-direct {v12, v6, v0}, Las;-><init>(BZ)V

    .line 373
    .line 374
    .line 375
    invoke-virtual {v4, v2, v12}, Lzt7;->b(Ljava/lang/String;Lgn2;)Lqs7;

    .line 376
    .line 377
    .line 378
    :cond_14
    invoke-virtual/range {p2 .. p2}, Lsu/happ/proxyutility/dto/MetaParams;->R0()Ljava/lang/Boolean;

    .line 379
    .line 380
    .line 381
    move-result-object v0

    .line 382
    if-eqz v0, :cond_15

    .line 383
    .line 384
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 385
    .line 386
    .line 387
    move-result v0

    .line 388
    invoke-virtual {v1}, Lek7;->b()Lzt7;

    .line 389
    .line 390
    .line 391
    move-result-object v4

    .line 392
    new-instance v6, Las;

    .line 393
    .line 394
    const/4 v12, 0x4

    .line 395
    invoke-direct {v6, v12, v0}, Las;-><init>(BZ)V

    .line 396
    .line 397
    .line 398
    invoke-virtual {v4, v2, v6}, Lzt7;->b(Ljava/lang/String;Lgn2;)Lqs7;

    .line 399
    .line 400
    .line 401
    :cond_15
    invoke-virtual/range {p2 .. p2}, Lsu/happ/proxyutility/dto/MetaParams;->S0()Lsu/happ/proxyutility/dto/enums/SubscriptionAutoConnectType;

    .line 402
    .line 403
    .line 404
    move-result-object v0

    .line 405
    if-eqz v0, :cond_16

    .line 406
    .line 407
    invoke-virtual {v1}, Lek7;->b()Lzt7;

    .line 408
    .line 409
    .line 410
    move-result-object v4

    .line 411
    new-instance v6, Lt16;

    .line 412
    .line 413
    const/16 v12, 0x17

    .line 414
    .line 415
    invoke-direct {v6, v0, v12}, Lt16;-><init>(Ljava/lang/Object;B)V

    .line 416
    .line 417
    .line 418
    invoke-virtual {v4, v2, v6}, Lzt7;->b(Ljava/lang/String;Lgn2;)Lqs7;

    .line 419
    .line 420
    .line 421
    :cond_16
    invoke-virtual/range {p2 .. p2}, Lsu/happ/proxyutility/dto/MetaParams;->a1()Ljava/lang/Boolean;

    .line 422
    .line 423
    .line 424
    move-result-object v0

    .line 425
    if-eqz v0, :cond_17

    .line 426
    .line 427
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 428
    .line 429
    .line 430
    move-result v0

    .line 431
    invoke-virtual {v1}, Lek7;->b()Lzt7;

    .line 432
    .line 433
    .line 434
    move-result-object v4

    .line 435
    new-instance v6, Las;

    .line 436
    .line 437
    const/4 v12, 0x5

    .line 438
    invoke-direct {v6, v12, v0}, Las;-><init>(BZ)V

    .line 439
    .line 440
    .line 441
    invoke-virtual {v4, v2, v6}, Lzt7;->b(Ljava/lang/String;Lgn2;)Lqs7;

    .line 442
    .line 443
    .line 444
    :cond_17
    invoke-virtual/range {p2 .. p2}, Lsu/happ/proxyutility/dto/MetaParams;->p()Ljava/lang/Boolean;

    .line 445
    .line 446
    .line 447
    move-result-object v0

    .line 448
    if-eqz v0, :cond_18

    .line 449
    .line 450
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 451
    .line 452
    .line 453
    move-result v0

    .line 454
    invoke-virtual {v1}, Lek7;->b()Lzt7;

    .line 455
    .line 456
    .line 457
    move-result-object v4

    .line 458
    new-instance v6, Las;

    .line 459
    .line 460
    invoke-direct {v6, v5, v0}, Las;-><init>(BZ)V

    .line 461
    .line 462
    .line 463
    invoke-virtual {v4, v2, v6}, Lzt7;->b(Ljava/lang/String;Lgn2;)Lqs7;

    .line 464
    .line 465
    .line 466
    :cond_18
    invoke-virtual/range {p2 .. p2}, Lsu/happ/proxyutility/dto/MetaParams;->Y0()Ljava/lang/Boolean;

    .line 467
    .line 468
    .line 469
    move-result-object v0

    .line 470
    if-eqz v0, :cond_19

    .line 471
    .line 472
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 473
    .line 474
    .line 475
    move-result v0

    .line 476
    invoke-virtual {v1}, Lek7;->b()Lzt7;

    .line 477
    .line 478
    .line 479
    move-result-object v4

    .line 480
    new-instance v6, Las;

    .line 481
    .line 482
    const/4 v12, 0x7

    .line 483
    invoke-direct {v6, v12, v0}, Las;-><init>(BZ)V

    .line 484
    .line 485
    .line 486
    invoke-virtual {v4, v2, v6}, Lzt7;->b(Ljava/lang/String;Lgn2;)Lqs7;

    .line 487
    .line 488
    .line 489
    :cond_19
    invoke-virtual/range {p2 .. p2}, Lsu/happ/proxyutility/dto/MetaParams;->Q0()Ljava/lang/Boolean;

    .line 490
    .line 491
    .line 492
    move-result-object v0

    .line 493
    const/16 v4, 0x8

    .line 494
    .line 495
    if-eqz v0, :cond_1a

    .line 496
    .line 497
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 498
    .line 499
    .line 500
    move-result v0

    .line 501
    invoke-virtual {v1}, Lek7;->b()Lzt7;

    .line 502
    .line 503
    .line 504
    move-result-object v6

    .line 505
    new-instance v12, Las;

    .line 506
    .line 507
    invoke-direct {v12, v4, v0}, Las;-><init>(BZ)V

    .line 508
    .line 509
    .line 510
    invoke-virtual {v6, v2, v12}, Lzt7;->b(Ljava/lang/String;Lgn2;)Lqs7;

    .line 511
    .line 512
    .line 513
    :cond_1a
    invoke-virtual/range {p2 .. p2}, Lsu/happ/proxyutility/dto/MetaParams;->X0()Ljava/lang/Integer;

    .line 514
    .line 515
    .line 516
    move-result-object v0

    .line 517
    if-eqz v0, :cond_1b

    .line 518
    .line 519
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 520
    .line 521
    .line 522
    move-result v0

    .line 523
    invoke-virtual {v1}, Lek7;->b()Lzt7;

    .line 524
    .line 525
    .line 526
    move-result-object v6

    .line 527
    new-instance v12, Lqb;

    .line 528
    .line 529
    invoke-direct {v12, v4, v0}, Lqb;-><init>(BI)V

    .line 530
    .line 531
    .line 532
    invoke-virtual {v6, v2, v12}, Lzt7;->b(Ljava/lang/String;Lgn2;)Lqs7;

    .line 533
    .line 534
    .line 535
    :cond_1b
    invoke-virtual/range {p2 .. p2}, Lsu/happ/proxyutility/dto/MetaParams;->X()Ljava/lang/Boolean;

    .line 536
    .line 537
    .line 538
    move-result-object v0

    .line 539
    if-eqz v0, :cond_1c

    .line 540
    .line 541
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 542
    .line 543
    .line 544
    move-result v0

    .line 545
    invoke-virtual {v1}, Lek7;->b()Lzt7;

    .line 546
    .line 547
    .line 548
    move-result-object v4

    .line 549
    new-instance v6, Las;

    .line 550
    .line 551
    const/16 v12, 0x9

    .line 552
    .line 553
    invoke-direct {v6, v12, v0}, Las;-><init>(BZ)V

    .line 554
    .line 555
    .line 556
    invoke-virtual {v4, v2, v6}, Lzt7;->b(Ljava/lang/String;Lgn2;)Lqs7;

    .line 557
    .line 558
    .line 559
    :cond_1c
    invoke-virtual/range {p2 .. p2}, Lsu/happ/proxyutility/dto/MetaParams;->k()Ljava/lang/String;

    .line 560
    .line 561
    .line 562
    move-result-object v0

    .line 563
    if-eqz v0, :cond_1d

    .line 564
    .line 565
    invoke-virtual {v1}, Lek7;->b()Lzt7;

    .line 566
    .line 567
    .line 568
    move-result-object v4

    .line 569
    new-instance v6, Lm40;

    .line 570
    .line 571
    const/16 v12, 0x1c

    .line 572
    .line 573
    invoke-direct {v6, v0, v12}, Lm40;-><init>(Ljava/lang/String;B)V

    .line 574
    .line 575
    .line 576
    invoke-virtual {v4, v2, v6}, Lzt7;->b(Ljava/lang/String;Lgn2;)Lqs7;

    .line 577
    .line 578
    .line 579
    :cond_1d
    invoke-virtual/range {p2 .. p2}, Lsu/happ/proxyutility/dto/MetaParams;->c1()Lsu/happ/proxyutility/dto/enums/SubscriptionSortType;

    .line 580
    .line 581
    .line 582
    move-result-object v0

    .line 583
    if-eqz v0, :cond_1f

    .line 584
    .line 585
    invoke-virtual {v1}, Lek7;->b()Lzt7;

    .line 586
    .line 587
    .line 588
    move-result-object v4

    .line 589
    new-instance v6, Lt16;

    .line 590
    .line 591
    const/16 v12, 0x18

    .line 592
    .line 593
    invoke-direct {v6, v0, v12}, Lt16;-><init>(Ljava/lang/Object;B)V

    .line 594
    .line 595
    .line 596
    invoke-virtual {v4, v2, v6}, Lzt7;->b(Ljava/lang/String;Lgn2;)Lqs7;

    .line 597
    .line 598
    .line 599
    sget-object v4, Lsu/happ/proxyutility/dto/enums/SubscriptionSortType;->PING:Lsu/happ/proxyutility/dto/enums/SubscriptionSortType;

    .line 600
    .line 601
    if-ne v0, v4, :cond_1f

    .line 602
    .line 603
    sget-object v0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 604
    .line 605
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 606
    .line 607
    .line 608
    move-result-object v0

    .line 609
    :try_start_0
    new-instance v4, Landroid/content/Intent;

    .line 610
    .line 611
    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 612
    .line 613
    .line 614
    invoke-virtual {v4, v11}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 615
    .line 616
    .line 617
    invoke-virtual {v4, v10}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 618
    .line 619
    .line 620
    const/16 v6, 0x80

    .line 621
    .line 622
    invoke-virtual {v4, v9, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 623
    .line 624
    .line 625
    invoke-virtual {v4, v8, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 626
    .line 627
    .line 628
    invoke-virtual {v0, v4}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 629
    .line 630
    .line 631
    goto :goto_1

    .line 632
    :catchall_0
    move-exception v0

    .line 633
    instance-of v4, v0, Ljava/lang/InterruptedException;

    .line 634
    .line 635
    if-nez v4, :cond_1e

    .line 636
    .line 637
    instance-of v4, v0, Ljava/util/concurrent/CancellationException;

    .line 638
    .line 639
    if-nez v4, :cond_1e

    .line 640
    .line 641
    goto :goto_1

    .line 642
    :cond_1e
    throw v0

    .line 643
    :cond_1f
    :goto_1
    invoke-virtual/range {p2 .. p2}, Lsu/happ/proxyutility/dto/MetaParams;->q0()Lsu/happ/proxyutility/dto/enums/EPingType;

    .line 644
    .line 645
    .line 646
    move-result-object v0

    .line 647
    if-eqz v0, :cond_20

    .line 648
    .line 649
    invoke-virtual {v1}, Lek7;->a()Lcom/tencent/mmkv/MMKV;

    .line 650
    .line 651
    .line 652
    move-result-object v4

    .line 653
    const-string v6, "pref_ping_type"

    .line 654
    .line 655
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 656
    .line 657
    .line 658
    move-result v0

    .line 659
    invoke-virtual {v4, v0, v6}, Lcom/tencent/mmkv/MMKV;->l(ILjava/lang/String;)V

    .line 660
    .line 661
    .line 662
    :cond_20
    invoke-virtual/range {p2 .. p2}, Lsu/happ/proxyutility/dto/MetaParams;->l()Ljava/lang/String;

    .line 663
    .line 664
    .line 665
    move-result-object v0

    .line 666
    if-eqz v0, :cond_23

    .line 667
    .line 668
    sget-object v4, Lss8;->a:Lss8;

    .line 669
    .line 670
    :try_start_1
    sget-object v4, Lokhttp3/HttpUrl;->Companion:Lokhttp3/HttpUrl$Companion;

    .line 671
    .line 672
    invoke-static {v0}, Lss8;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 673
    .line 674
    .line 675
    move-result-object v0

    .line 676
    invoke-virtual {v4, v0}, Lokhttp3/HttpUrl$Companion;->get(Ljava/lang/String;)Lokhttp3/HttpUrl;

    .line 677
    .line 678
    .line 679
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 680
    goto :goto_2

    .line 681
    :catchall_1
    move-exception v0

    .line 682
    instance-of v4, v0, Ljava/lang/InterruptedException;

    .line 683
    .line 684
    if-nez v4, :cond_22

    .line 685
    .line 686
    instance-of v4, v0, Ljava/util/concurrent/CancellationException;

    .line 687
    .line 688
    if-nez v4, :cond_22

    .line 689
    .line 690
    new-instance v4, Lrj6;

    .line 691
    .line 692
    invoke-direct {v4, v0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 693
    .line 694
    .line 695
    move-object v0, v4

    .line 696
    :goto_2
    nop

    .line 697
    instance-of v4, v0, Lrj6;

    .line 698
    .line 699
    if-eqz v4, :cond_21

    .line 700
    .line 701
    move-object v0, v14

    .line 702
    :cond_21
    check-cast v0, Lokhttp3/HttpUrl;

    .line 703
    .line 704
    if-eqz v0, :cond_23

    .line 705
    .line 706
    invoke-virtual {v1}, Lek7;->a()Lcom/tencent/mmkv/MMKV;

    .line 707
    .line 708
    .line 709
    move-result-object v4

    .line 710
    const-string v6, "pref_delay_test_url"

    .line 711
    .line 712
    invoke-virtual {v0}, Lokhttp3/HttpUrl;->toString()Ljava/lang/String;

    .line 713
    .line 714
    .line 715
    move-result-object v0

    .line 716
    invoke-virtual {v4, v6, v0}, Lcom/tencent/mmkv/MMKV;->q(Ljava/lang/String;Ljava/lang/String;)Z

    .line 717
    .line 718
    .line 719
    goto :goto_3

    .line 720
    :cond_22
    throw v0

    .line 721
    :cond_23
    :goto_3
    invoke-virtual/range {p2 .. p2}, Lsu/happ/proxyutility/dto/MetaParams;->e()Ljava/lang/Boolean;

    .line 722
    .line 723
    .line 724
    move-result-object v0

    .line 725
    if-eqz v0, :cond_24

    .line 726
    .line 727
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 728
    .line 729
    .line 730
    move-result v0

    .line 731
    invoke-virtual {v1}, Lek7;->a()Lcom/tencent/mmkv/MMKV;

    .line 732
    .line 733
    .line 734
    move-result-object v4

    .line 735
    const-string v6, "pref_auto_start_vpn"

    .line 736
    .line 737
    invoke-virtual {v4, v6, v0}, Lcom/tencent/mmkv/MMKV;->p(Ljava/lang/String;Z)V

    .line 738
    .line 739
    .line 740
    :cond_24
    invoke-virtual/range {p2 .. p2}, Lsu/happ/proxyutility/dto/MetaParams;->D0()Ljava/lang/Boolean;

    .line 741
    .line 742
    .line 743
    move-result-object v0

    .line 744
    if-eqz v0, :cond_25

    .line 745
    .line 746
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 747
    .line 748
    .line 749
    move-result v0

    .line 750
    invoke-virtual {v1}, Lek7;->a()Lcom/tencent/mmkv/MMKV;

    .line 751
    .line 752
    .line 753
    move-result-object v4

    .line 754
    const-string v6, "pref_resolve_server_before_start_enabled"

    .line 755
    .line 756
    invoke-virtual {v4, v6, v0}, Lcom/tencent/mmkv/MMKV;->p(Ljava/lang/String;Z)V

    .line 757
    .line 758
    .line 759
    :cond_25
    invoke-virtual/range {p2 .. p2}, Lsu/happ/proxyutility/dto/MetaParams;->C0()Ljava/lang/String;

    .line 760
    .line 761
    .line 762
    move-result-object v0

    .line 763
    if-eqz v0, :cond_26

    .line 764
    .line 765
    invoke-virtual {v1}, Lek7;->a()Lcom/tencent/mmkv/MMKV;

    .line 766
    .line 767
    .line 768
    move-result-object v4

    .line 769
    const-string v6, "pref_resolve_server_before_start_dns_ip"

    .line 770
    .line 771
    invoke-virtual {v4, v6, v0}, Lcom/tencent/mmkv/MMKV;->q(Ljava/lang/String;Ljava/lang/String;)Z

    .line 772
    .line 773
    .line 774
    :cond_26
    invoke-virtual/range {p2 .. p2}, Lsu/happ/proxyutility/dto/MetaParams;->B0()Ljava/lang/String;

    .line 775
    .line 776
    .line 777
    move-result-object v0

    .line 778
    if-eqz v0, :cond_27

    .line 779
    .line 780
    invoke-virtual {v1}, Lek7;->a()Lcom/tencent/mmkv/MMKV;

    .line 781
    .line 782
    .line 783
    move-result-object v4

    .line 784
    const-string v6, "pref_resolve_server_before_start_dns_domain"

    .line 785
    .line 786
    invoke-virtual {v4, v6, v0}, Lcom/tencent/mmkv/MMKV;->q(Ljava/lang/String;Ljava/lang/String;)Z

    .line 787
    .line 788
    .line 789
    :cond_27
    invoke-virtual/range {p2 .. p2}, Lsu/happ/proxyutility/dto/MetaParams;->o0()Ljk5;

    .line 790
    .line 791
    .line 792
    move-result-object v0

    .line 793
    if-eqz v0, :cond_28

    .line 794
    .line 795
    invoke-virtual {v1}, Lek7;->a()Lcom/tencent/mmkv/MMKV;

    .line 796
    .line 797
    .line 798
    move-result-object v4

    .line 799
    const-string v6, "perAppProxyMode"

    .line 800
    .line 801
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 802
    .line 803
    .line 804
    move-result v0

    .line 805
    invoke-virtual {v4, v0, v6}, Lcom/tencent/mmkv/MMKV;->l(ILjava/lang/String;)V

    .line 806
    .line 807
    .line 808
    :cond_28
    invoke-virtual/range {p2 .. p2}, Lsu/happ/proxyutility/dto/MetaParams;->l0()Ljava/util/List;

    .line 809
    .line 810
    .line 811
    move-result-object v0

    .line 812
    if-eqz v0, :cond_2a

    .line 813
    .line 814
    sget-object v4, Lx06;->a:Lvz7;

    .line 815
    .line 816
    iput-object v2, v3, Lck7;->f0:Ljava/lang/String;

    .line 817
    .line 818
    move-object/from16 v4, p2

    .line 819
    .line 820
    iput-object v4, v3, Lck7;->g0:Lsu/happ/proxyutility/dto/MetaParams;

    .line 821
    .line 822
    iput-object v0, v3, Lck7;->h0:Ljava/util/List;

    .line 823
    .line 824
    iput v13, v3, Lck7;->k0:I

    .line 825
    .line 826
    sget-object v6, Ltp1;->a:Lnf1;

    .line 827
    .line 828
    sget-object v6, Lye1;->Z:Lye1;

    .line 829
    .line 830
    new-instance v12, Lvh;

    .line 831
    .line 832
    const/4 v13, 0x3

    .line 833
    const/4 v5, 0x2

    .line 834
    invoke-direct {v12, v5, v14, v13}, Lvh;-><init>(ILq51;B)V

    .line 835
    .line 836
    .line 837
    invoke-static {v6, v12, v3}, Lw51;->W(Ls61;Lrn2;Lq51;)Ljava/lang/Object;

    .line 838
    .line 839
    .line 840
    move-result-object v5

    .line 841
    if-ne v5, v15, :cond_29

    .line 842
    .line 843
    goto :goto_6

    .line 844
    :cond_29
    move-object v12, v2

    .line 845
    move-object v2, v0

    .line 846
    move-object v0, v5

    .line 847
    :goto_4
    check-cast v0, Ljava/util/Set;

    .line 848
    .line 849
    sget-object v5, Lx06;->a:Lvz7;

    .line 850
    .line 851
    check-cast v0, Ljava/lang/Iterable;

    .line 852
    .line 853
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 854
    .line 855
    .line 856
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 857
    .line 858
    .line 859
    invoke-static {v0}, Lwv0;->b1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 860
    .line 861
    .line 862
    move-result-object v0

    .line 863
    invoke-static {v0, v2}, Lbw0;->d0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 864
    .line 865
    .line 866
    sget-object v2, Lx06;->a:Lvz7;

    .line 867
    .line 868
    invoke-virtual {v2}, Lvz7;->getValue()Ljava/lang/Object;

    .line 869
    .line 870
    .line 871
    move-result-object v2

    .line 872
    check-cast v2, Lcom/tencent/mmkv/MMKV;

    .line 873
    .line 874
    invoke-virtual {v2, v7, v0}, Lcom/tencent/mmkv/MMKV;->n(Ljava/lang/String;Ljava/util/Set;)V

    .line 875
    .line 876
    .line 877
    goto :goto_5

    .line 878
    :cond_2a
    move-object/from16 v4, p2

    .line 879
    .line 880
    move-object v12, v2

    .line 881
    :goto_5
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/MetaParams;->m0()Ljava/util/List;

    .line 882
    .line 883
    .line 884
    move-result-object v2

    .line 885
    if-eqz v2, :cond_2c

    .line 886
    .line 887
    sget-object v0, Lx06;->a:Lvz7;

    .line 888
    .line 889
    sget-object v0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 890
    .line 891
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 892
    .line 893
    .line 894
    move-result-object v0

    .line 895
    iput-object v12, v3, Lck7;->f0:Ljava/lang/String;

    .line 896
    .line 897
    iput-object v4, v3, Lck7;->g0:Lsu/happ/proxyutility/dto/MetaParams;

    .line 898
    .line 899
    iput-object v2, v3, Lck7;->h0:Ljava/util/List;

    .line 900
    .line 901
    const/4 v5, 0x2

    .line 902
    iput v5, v3, Lck7;->k0:I

    .line 903
    .line 904
    sget-object v5, Ltp1;->a:Lnf1;

    .line 905
    .line 906
    sget-object v5, Lye1;->Z:Lye1;

    .line 907
    .line 908
    new-instance v6, Ll40;

    .line 909
    .line 910
    const/16 v13, 0xa

    .line 911
    .line 912
    invoke-direct {v6, v0, v14, v13}, Ll40;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 913
    .line 914
    .line 915
    invoke-static {v5, v6, v3}, Lw51;->W(Ls61;Lrn2;Lq51;)Ljava/lang/Object;

    .line 916
    .line 917
    .line 918
    move-result-object v0

    .line 919
    if-ne v0, v15, :cond_2b

    .line 920
    .line 921
    :goto_6
    return-object v15

    .line 922
    :cond_2b
    move-object v3, v12

    .line 923
    :goto_7
    check-cast v0, Ljava/lang/Iterable;

    .line 924
    .line 925
    invoke-static {v0}, Lwv0;->l0(Ljava/lang/Iterable;)Lhu;

    .line 926
    .line 927
    .line 928
    move-result-object v0

    .line 929
    sget-object v5, Ldk7;->X:Ldk7;

    .line 930
    .line 931
    invoke-static {v0, v5}, Lw27;->l0(Lu27;Lgn2;)Lmd8;

    .line 932
    .line 933
    .line 934
    move-result-object v0

    .line 935
    invoke-static {v0}, Lw27;->o0(Lu27;)Ljava/util/Set;

    .line 936
    .line 937
    .line 938
    move-result-object v0

    .line 939
    invoke-static {v2}, Lwv0;->c1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 940
    .line 941
    .line 942
    move-result-object v2

    .line 943
    sget-object v5, Lx06;->a:Lvz7;

    .line 944
    .line 945
    check-cast v2, Ljava/lang/Iterable;

    .line 946
    .line 947
    invoke-static {v0, v2}, Lq57;->Y(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    .line 948
    .line 949
    .line 950
    move-result-object v0

    .line 951
    sget-object v2, Lx06;->a:Lvz7;

    .line 952
    .line 953
    invoke-virtual {v2}, Lvz7;->getValue()Ljava/lang/Object;

    .line 954
    .line 955
    .line 956
    move-result-object v2

    .line 957
    check-cast v2, Lcom/tencent/mmkv/MMKV;

    .line 958
    .line 959
    invoke-virtual {v2, v7, v0}, Lcom/tencent/mmkv/MMKV;->n(Ljava/lang/String;Ljava/util/Set;)V

    .line 960
    .line 961
    .line 962
    move-object v12, v3

    .line 963
    :cond_2c
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/MetaParams;->n0()Ljava/util/List;

    .line 964
    .line 965
    .line 966
    move-result-object v0

    .line 967
    if-eqz v0, :cond_2d

    .line 968
    .line 969
    sget-object v2, Lx06;->a:Lvz7;

    .line 970
    .line 971
    invoke-static {v0}, Lwv0;->c1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 972
    .line 973
    .line 974
    move-result-object v0

    .line 975
    sget-object v2, Lx06;->a:Lvz7;

    .line 976
    .line 977
    invoke-virtual {v2}, Lvz7;->getValue()Ljava/lang/Object;

    .line 978
    .line 979
    .line 980
    move-result-object v2

    .line 981
    check-cast v2, Lcom/tencent/mmkv/MMKV;

    .line 982
    .line 983
    invoke-virtual {v2, v7, v0}, Lcom/tencent/mmkv/MMKV;->n(Ljava/lang/String;Ljava/util/Set;)V

    .line 984
    .line 985
    .line 986
    :cond_2d
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/MetaParams;->Y()Ljava/lang/Boolean;

    .line 987
    .line 988
    .line 989
    move-result-object v0

    .line 990
    if-eqz v0, :cond_2e

    .line 991
    .line 992
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 993
    .line 994
    .line 995
    move-result v0

    .line 996
    invoke-virtual {v1}, Lek7;->a()Lcom/tencent/mmkv/MMKV;

    .line 997
    .line 998
    .line 999
    move-result-object v2

    .line 1000
    const-string v3, "pref_mux_enabled"

    .line 1001
    .line 1002
    invoke-virtual {v2, v3, v0}, Lcom/tencent/mmkv/MMKV;->p(Ljava/lang/String;Z)V

    .line 1003
    .line 1004
    .line 1005
    :cond_2e
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/MetaParams;->a0()Ljava/lang/Integer;

    .line 1006
    .line 1007
    .line 1008
    move-result-object v0

    .line 1009
    if-eqz v0, :cond_2f

    .line 1010
    .line 1011
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 1012
    .line 1013
    .line 1014
    move-result v0

    .line 1015
    invoke-virtual {v1}, Lek7;->a()Lcom/tencent/mmkv/MMKV;

    .line 1016
    .line 1017
    .line 1018
    move-result-object v2

    .line 1019
    const-string v3, "pref_mux_concurency"

    .line 1020
    .line 1021
    invoke-virtual {v2, v0, v3}, Lcom/tencent/mmkv/MMKV;->l(ILjava/lang/String;)V

    .line 1022
    .line 1023
    .line 1024
    :cond_2f
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/MetaParams;->b0()Ljava/lang/Integer;

    .line 1025
    .line 1026
    .line 1027
    move-result-object v0

    .line 1028
    if-eqz v0, :cond_30

    .line 1029
    .line 1030
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 1031
    .line 1032
    .line 1033
    move-result v0

    .line 1034
    invoke-virtual {v1}, Lek7;->a()Lcom/tencent/mmkv/MMKV;

    .line 1035
    .line 1036
    .line 1037
    move-result-object v2

    .line 1038
    const-string v3, "pref_mux_xudp_concurency"

    .line 1039
    .line 1040
    invoke-virtual {v2, v0, v3}, Lcom/tencent/mmkv/MMKV;->l(ILjava/lang/String;)V

    .line 1041
    .line 1042
    .line 1043
    :cond_30
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/MetaParams;->Z()Lsu/happ/proxyutility/dto/enums/MuxQuicType;

    .line 1044
    .line 1045
    .line 1046
    move-result-object v0

    .line 1047
    if-eqz v0, :cond_31

    .line 1048
    .line 1049
    invoke-virtual {v1}, Lek7;->a()Lcom/tencent/mmkv/MMKV;

    .line 1050
    .line 1051
    .line 1052
    move-result-object v2

    .line 1053
    const-string v3, "pref_mux_xudp_quic"

    .line 1054
    .line 1055
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/enums/MuxQuicType;->b()Ljava/lang/String;

    .line 1056
    .line 1057
    .line 1058
    move-result-object v0

    .line 1059
    invoke-virtual {v2, v3, v0}, Lcom/tencent/mmkv/MMKV;->q(Ljava/lang/String;Ljava/lang/String;)Z

    .line 1060
    .line 1061
    .line 1062
    :cond_31
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/MetaParams;->G0()Ljava/lang/Boolean;

    .line 1063
    .line 1064
    .line 1065
    move-result-object v0

    .line 1066
    if-eqz v0, :cond_32

    .line 1067
    .line 1068
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1069
    .line 1070
    .line 1071
    move-result v0

    .line 1072
    invoke-virtual {v1}, Lek7;->a()Lcom/tencent/mmkv/MMKV;

    .line 1073
    .line 1074
    .line 1075
    move-result-object v2

    .line 1076
    const-string v3, "pref_sniffing_enabled"

    .line 1077
    .line 1078
    invoke-virtual {v2, v3, v0}, Lcom/tencent/mmkv/MMKV;->p(Ljava/lang/String;Z)V

    .line 1079
    .line 1080
    .line 1081
    :cond_32
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/MetaParams;->p0()Lvn5;

    .line 1082
    .line 1083
    .line 1084
    move-result-object v0

    .line 1085
    if-eqz v0, :cond_33

    .line 1086
    .line 1087
    invoke-virtual {v1}, Lek7;->a()Lcom/tencent/mmkv/MMKV;

    .line 1088
    .line 1089
    .line 1090
    move-result-object v2

    .line 1091
    const-string v3, "pref_ping_result"

    .line 1092
    .line 1093
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 1094
    .line 1095
    .line 1096
    move-result v0

    .line 1097
    invoke-virtual {v2, v0, v3}, Lcom/tencent/mmkv/MMKV;->l(ILjava/lang/String;)V

    .line 1098
    .line 1099
    .line 1100
    :cond_33
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/MetaParams;->u()Ljava/lang/String;

    .line 1101
    .line 1102
    .line 1103
    move-result-object v0

    .line 1104
    iget-object v2, v1, Lek7;->b:Lvz7;

    .line 1105
    .line 1106
    if-eqz v0, :cond_34

    .line 1107
    .line 1108
    invoke-virtual {v2}, Lvz7;->getValue()Ljava/lang/Object;

    .line 1109
    .line 1110
    .line 1111
    move-result-object v3

    .line 1112
    check-cast v3, Lu42;

    .line 1113
    .line 1114
    invoke-virtual {v3, v0, v14, v14}, Lu42;->a(Ljava/lang/String;Lub;Lub;)Ldn8;

    .line 1115
    .line 1116
    .line 1117
    :cond_34
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/MetaParams;->y()Ljava/lang/String;

    .line 1118
    .line 1119
    .line 1120
    move-result-object v0

    .line 1121
    if-eqz v0, :cond_39

    .line 1122
    .line 1123
    invoke-virtual {v2}, Lvz7;->getValue()Ljava/lang/Object;

    .line 1124
    .line 1125
    .line 1126
    move-result-object v2

    .line 1127
    check-cast v2, Lu42;

    .line 1128
    .line 1129
    iget-object v3, v2, Lu42;->b:Loh7;

    .line 1130
    .line 1131
    :try_start_2
    const-string v5, "reset"

    .line 1132
    .line 1133
    invoke-virtual {v0, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1134
    .line 1135
    .line 1136
    move-result v5

    .line 1137
    if-eqz v5, :cond_36

    .line 1138
    .line 1139
    :cond_35
    invoke-virtual {v3}, Loh7;->getValue()Ljava/lang/Object;

    .line 1140
    .line 1141
    .line 1142
    move-result-object v0

    .line 1143
    move-object v5, v0

    .line 1144
    check-cast v5, Ljava/util/Set;

    .line 1145
    .line 1146
    sget-object v5, Lm02;->X:Lm02;

    .line 1147
    .line 1148
    invoke-virtual {v3, v0, v5}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1149
    .line 1150
    .line 1151
    move-result v0

    .line 1152
    if-eqz v0, :cond_35

    .line 1153
    .line 1154
    goto :goto_8

    .line 1155
    :catchall_2
    move-exception v0

    .line 1156
    goto :goto_9

    .line 1157
    :cond_36
    invoke-static {v0}, Lu42;->c(Ljava/lang/String;)Ljava/util/Set;

    .line 1158
    .line 1159
    .line 1160
    move-result-object v0

    .line 1161
    :cond_37
    invoke-virtual {v3}, Loh7;->getValue()Ljava/lang/Object;

    .line 1162
    .line 1163
    .line 1164
    move-result-object v5

    .line 1165
    move-object v6, v5

    .line 1166
    check-cast v6, Ljava/util/Set;

    .line 1167
    .line 1168
    invoke-virtual {v3, v5, v0}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1169
    .line 1170
    .line 1171
    move-result v5

    .line 1172
    if-eqz v5, :cond_37

    .line 1173
    .line 1174
    :goto_8
    invoke-virtual {v2}, Lu42;->d()Ljava/lang/Object;

    .line 1175
    .line 1176
    .line 1177
    move-result-object v0

    .line 1178
    new-instance v2, Lsj6;

    .line 1179
    .line 1180
    invoke-direct {v2, v0}, Lsj6;-><init>(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 1181
    .line 1182
    .line 1183
    goto :goto_a

    .line 1184
    :goto_9
    instance-of v2, v0, Ljava/lang/InterruptedException;

    .line 1185
    .line 1186
    if-nez v2, :cond_38

    .line 1187
    .line 1188
    instance-of v2, v0, Ljava/util/concurrent/CancellationException;

    .line 1189
    .line 1190
    if-nez v2, :cond_38

    .line 1191
    .line 1192
    new-instance v2, Lrj6;

    .line 1193
    .line 1194
    invoke-direct {v2, v0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 1195
    .line 1196
    .line 1197
    :goto_a
    invoke-static {v2}, Lsj6;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1198
    .line 1199
    .line 1200
    move-result-object v0

    .line 1201
    if-nez v0, :cond_39

    .line 1202
    .line 1203
    check-cast v2, Lsj6;

    .line 1204
    .line 1205
    goto :goto_b

    .line 1206
    :cond_38
    throw v0

    .line 1207
    :cond_39
    :goto_b
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/MetaParams;->m()Ljava/lang/Boolean;

    .line 1208
    .line 1209
    .line 1210
    move-result-object v0

    .line 1211
    if-eqz v0, :cond_3a

    .line 1212
    .line 1213
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1214
    .line 1215
    .line 1216
    move-result v0

    .line 1217
    invoke-virtual {v1}, Lek7;->a()Lcom/tencent/mmkv/MMKV;

    .line 1218
    .line 1219
    .line 1220
    move-result-object v2

    .line 1221
    const-string v3, "pref_dns_from_json"

    .line 1222
    .line 1223
    invoke-virtual {v2, v3, v0}, Lcom/tencent/mmkv/MMKV;->p(Ljava/lang/String;Z)V

    .line 1224
    .line 1225
    .line 1226
    :cond_3a
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/MetaParams;->f1()Lsu/happ/proxyutility/dto/enums/GeoUserAgent;

    .line 1227
    .line 1228
    .line 1229
    move-result-object v0

    .line 1230
    if-eqz v0, :cond_3b

    .line 1231
    .line 1232
    invoke-virtual {v1}, Lek7;->a()Lcom/tencent/mmkv/MMKV;

    .line 1233
    .line 1234
    .line 1235
    move-result-object v2

    .line 1236
    const-string v3, "pref_geo_custom_ua"

    .line 1237
    .line 1238
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 1239
    .line 1240
    .line 1241
    move-result v0

    .line 1242
    invoke-virtual {v2, v0, v3}, Lcom/tencent/mmkv/MMKV;->l(ILjava/lang/String;)V

    .line 1243
    .line 1244
    .line 1245
    :cond_3b
    iget-object v0, v1, Lek7;->d:Lvz7;

    .line 1246
    .line 1247
    invoke-virtual {v0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 1248
    .line 1249
    .line 1250
    move-result-object v2

    .line 1251
    check-cast v2, Lak7;

    .line 1252
    .line 1253
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1254
    .line 1255
    .line 1256
    iget-object v2, v2, Lak7;->a:Landroid/content/SharedPreferences;

    .line 1257
    .line 1258
    const-string v3, "pinSubIdInStorage"

    .line 1259
    .line 1260
    invoke-interface {v2, v3, v14}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1261
    .line 1262
    .line 1263
    move-result-object v2

    .line 1264
    if-eqz v2, :cond_3c

    .line 1265
    .line 1266
    goto :goto_c

    .line 1267
    :cond_3c
    move-object v2, v14

    .line 1268
    :goto_c
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/MetaParams;->V0()Ljava/lang/Boolean;

    .line 1269
    .line 1270
    .line 1271
    move-result-object v5

    .line 1272
    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1273
    .line 1274
    invoke-static {v5, v6}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1275
    .line 1276
    .line 1277
    move-result v7

    .line 1278
    const/4 v13, 0x0

    .line 1279
    if-eqz v7, :cond_40

    .line 1280
    .line 1281
    if-nez v2, :cond_3e

    .line 1282
    .line 1283
    if-nez v12, :cond_3d

    .line 1284
    .line 1285
    const/4 v7, 0x1

    .line 1286
    goto :goto_e

    .line 1287
    :cond_3d
    :goto_d
    move v7, v13

    .line 1288
    goto :goto_e

    .line 1289
    :cond_3e
    if-nez v12, :cond_3f

    .line 1290
    .line 1291
    goto :goto_d

    .line 1292
    :cond_3f
    invoke-virtual {v2, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1293
    .line 1294
    .line 1295
    move-result v7

    .line 1296
    :goto_e
    if-nez v7, :cond_40

    .line 1297
    .line 1298
    if-eqz v12, :cond_40

    .line 1299
    .line 1300
    invoke-virtual {v0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 1301
    .line 1302
    .line 1303
    move-result-object v0

    .line 1304
    check-cast v0, Lak7;

    .line 1305
    .line 1306
    invoke-virtual {v0, v3, v12}, Lak7;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1307
    .line 1308
    .line 1309
    goto :goto_10

    .line 1310
    :cond_40
    sget-object v7, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 1311
    .line 1312
    invoke-static {v5, v7}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1313
    .line 1314
    .line 1315
    move-result v5

    .line 1316
    if-eqz v5, :cond_44

    .line 1317
    .line 1318
    if-nez v2, :cond_41

    .line 1319
    .line 1320
    if-nez v12, :cond_43

    .line 1321
    .line 1322
    const/4 v13, 0x1

    .line 1323
    goto :goto_f

    .line 1324
    :cond_41
    if-nez v12, :cond_42

    .line 1325
    .line 1326
    goto :goto_f

    .line 1327
    :cond_42
    invoke-virtual {v2, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1328
    .line 1329
    .line 1330
    move-result v13

    .line 1331
    :cond_43
    :goto_f
    if-eqz v13, :cond_44

    .line 1332
    .line 1333
    invoke-virtual {v0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 1334
    .line 1335
    .line 1336
    move-result-object v0

    .line 1337
    check-cast v0, Lak7;

    .line 1338
    .line 1339
    invoke-virtual {v0, v3}, Lak7;->b(Ljava/lang/String;)V

    .line 1340
    .line 1341
    .line 1342
    :cond_44
    :goto_10
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/MetaParams;->T()Ljava/lang/Boolean;

    .line 1343
    .line 1344
    .line 1345
    move-result-object v0

    .line 1346
    if-eqz v0, :cond_45

    .line 1347
    .line 1348
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1349
    .line 1350
    .line 1351
    move-result v0

    .line 1352
    invoke-virtual {v1}, Lek7;->a()Lcom/tencent/mmkv/MMKV;

    .line 1353
    .line 1354
    .line 1355
    move-result-object v2

    .line 1356
    const-string v3, "pref_http_auth_enabled"

    .line 1357
    .line 1358
    invoke-virtual {v2, v3, v0}, Lcom/tencent/mmkv/MMKV;->p(Ljava/lang/String;Z)V

    .line 1359
    .line 1360
    .line 1361
    :cond_45
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/MetaParams;->g1()Ljava/lang/Boolean;

    .line 1362
    .line 1363
    .line 1364
    move-result-object v0

    .line 1365
    if-eqz v0, :cond_46

    .line 1366
    .line 1367
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1368
    .line 1369
    .line 1370
    move-result v0

    .line 1371
    invoke-virtual {v1}, Lek7;->a()Lcom/tencent/mmkv/MMKV;

    .line 1372
    .line 1373
    .line 1374
    move-result-object v2

    .line 1375
    const-string v3, "pref_xray_tun_enabled"

    .line 1376
    .line 1377
    invoke-virtual {v2, v3, v0}, Lcom/tencent/mmkv/MMKV;->p(Ljava/lang/String;Z)V

    .line 1378
    .line 1379
    .line 1380
    :cond_46
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/MetaParams;->h1()Ljava/lang/Integer;

    .line 1381
    .line 1382
    .line 1383
    move-result-object v0

    .line 1384
    if-eqz v0, :cond_47

    .line 1385
    .line 1386
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 1387
    .line 1388
    .line 1389
    move-result v0

    .line 1390
    invoke-virtual {v1}, Lek7;->a()Lcom/tencent/mmkv/MMKV;

    .line 1391
    .line 1392
    .line 1393
    move-result-object v2

    .line 1394
    const-string v3, "pref_tun_mtu"

    .line 1395
    .line 1396
    invoke-virtual {v2, v0, v3}, Lcom/tencent/mmkv/MMKV;->l(ILjava/lang/String;)V

    .line 1397
    .line 1398
    .line 1399
    :cond_47
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/MetaParams;->g()Ljava/lang/Boolean;

    .line 1400
    .line 1401
    .line 1402
    move-result-object v0

    .line 1403
    if-eqz v0, :cond_48

    .line 1404
    .line 1405
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1406
    .line 1407
    .line 1408
    move-result v0

    .line 1409
    invoke-virtual {v1}, Lek7;->a()Lcom/tencent/mmkv/MMKV;

    .line 1410
    .line 1411
    .line 1412
    move-result-object v2

    .line 1413
    const-string v3, "pref_block_bindtodevice_enabled"

    .line 1414
    .line 1415
    invoke-virtual {v2, v3, v0}, Lcom/tencent/mmkv/MMKV;->p(Ljava/lang/String;Z)V

    .line 1416
    .line 1417
    .line 1418
    :cond_48
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/MetaParams;->w0()Lsu/happ/proxyutility/dto/enums/GoPingType;

    .line 1419
    .line 1420
    .line 1421
    move-result-object v0

    .line 1422
    if-eqz v0, :cond_49

    .line 1423
    .line 1424
    invoke-virtual {v1}, Lek7;->a()Lcom/tencent/mmkv/MMKV;

    .line 1425
    .line 1426
    .line 1427
    move-result-object v2

    .line 1428
    const-string v3, "pref_ping_mode"

    .line 1429
    .line 1430
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 1431
    .line 1432
    .line 1433
    move-result v0

    .line 1434
    invoke-virtual {v2, v0, v3}, Lcom/tencent/mmkv/MMKV;->l(ILjava/lang/String;)V

    .line 1435
    .line 1436
    .line 1437
    :cond_49
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/MetaParams;->x0()Ljava/lang/Integer;

    .line 1438
    .line 1439
    .line 1440
    move-result-object v0

    .line 1441
    if-eqz v0, :cond_4a

    .line 1442
    .line 1443
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 1444
    .line 1445
    .line 1446
    move-result v0

    .line 1447
    invoke-virtual {v1}, Lek7;->a()Lcom/tencent/mmkv/MMKV;

    .line 1448
    .line 1449
    .line 1450
    move-result-object v1

    .line 1451
    const-string v2, "pref_proxy_ping_timeout"

    .line 1452
    .line 1453
    invoke-virtual {v1, v0, v2}, Lcom/tencent/mmkv/MMKV;->l(ILjava/lang/String;)V

    .line 1454
    .line 1455
    .line 1456
    :cond_4a
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/MetaParams;->y0()Ljava/lang/Boolean;

    .line 1457
    .line 1458
    .line 1459
    move-result-object v0

    .line 1460
    if-eqz v12, :cond_4b

    .line 1461
    .line 1462
    sget-object v1, Lkw4;->a:Lkw4;

    .line 1463
    .line 1464
    invoke-static {v12}, Lkw4;->f(Ljava/lang/String;)Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 1465
    .line 1466
    .line 1467
    move-result-object v14

    .line 1468
    :cond_4b
    sget-object v1, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 1469
    .line 1470
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 1471
    .line 1472
    .line 1473
    move-result-object v1

    .line 1474
    invoke-virtual {v1}, Lsu/happ/proxyutility/HappApplication;->d()Lkf4;

    .line 1475
    .line 1476
    .line 1477
    move-result-object v1

    .line 1478
    new-instance v2, Lgq6;

    .line 1479
    .line 1480
    const/4 v3, 0x6

    .line 1481
    invoke-direct {v2, v0, v14, v3}, Lgq6;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1482
    .line 1483
    .line 1484
    invoke-virtual {v1, v2}, Lkf4;->h(Lgn2;)V

    .line 1485
    .line 1486
    .line 1487
    invoke-static {v0, v6}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1488
    .line 1489
    .line 1490
    move-result v0

    .line 1491
    if-eqz v0, :cond_4f

    .line 1492
    .line 1493
    if-eqz v14, :cond_4f

    .line 1494
    .line 1495
    invoke-virtual {v14}, Lsu/happ/proxyutility/dto/SubscriptionItem;->S()Z

    .line 1496
    .line 1497
    .line 1498
    move-result v0

    .line 1499
    if-nez v0, :cond_4f

    .line 1500
    .line 1501
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 1502
    .line 1503
    .line 1504
    move-result-object v0

    .line 1505
    invoke-virtual {v14}, Lsu/happ/proxyutility/dto/SubscriptionItem;->Q()Ljava/lang/String;

    .line 1506
    .line 1507
    .line 1508
    move-result-object v1

    .line 1509
    const-string v2, ""

    .line 1510
    .line 1511
    if-nez v1, :cond_4c

    .line 1512
    .line 1513
    move-object v1, v2

    .line 1514
    :cond_4c
    const-string v3, "reset=1&"

    .line 1515
    .line 1516
    const/4 v4, 0x1

    .line 1517
    invoke-static {v1, v3, v2, v4}, Lmm7;->W(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 1518
    .line 1519
    .line 1520
    move-result-object v1

    .line 1521
    const-string v3, "reset=true&"

    .line 1522
    .line 1523
    invoke-static {v1, v3, v2, v4}, Lmm7;->W(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 1524
    .line 1525
    .line 1526
    move-result-object v1

    .line 1527
    const-string v3, "reset=1"

    .line 1528
    .line 1529
    invoke-static {v1, v3, v2, v4}, Lmm7;->W(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 1530
    .line 1531
    .line 1532
    move-result-object v1

    .line 1533
    const-string v3, "reset=true"

    .line 1534
    .line 1535
    invoke-static {v1, v3, v2, v4}, Lmm7;->W(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 1536
    .line 1537
    .line 1538
    move-result-object v1

    .line 1539
    :try_start_3
    new-instance v2, Landroid/content/Intent;

    .line 1540
    .line 1541
    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 1542
    .line 1543
    .line 1544
    invoke-virtual {v2, v11}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 1545
    .line 1546
    .line 1547
    invoke-virtual {v2, v10}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 1548
    .line 1549
    .line 1550
    const/16 v3, 0x83

    .line 1551
    .line 1552
    invoke-virtual {v2, v9, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 1553
    .line 1554
    .line 1555
    invoke-virtual {v2, v8, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 1556
    .line 1557
    .line 1558
    invoke-virtual {v0, v2}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 1559
    .line 1560
    .line 1561
    goto :goto_11

    .line 1562
    :catchall_3
    move-exception v0

    .line 1563
    instance-of v1, v0, Ljava/lang/InterruptedException;

    .line 1564
    .line 1565
    if-nez v1, :cond_4e

    .line 1566
    .line 1567
    instance-of v1, v0, Ljava/util/concurrent/CancellationException;

    .line 1568
    .line 1569
    if-nez v1, :cond_4e

    .line 1570
    .line 1571
    :goto_11
    sget-object v0, Lkw4;->a:Lkw4;

    .line 1572
    .line 1573
    invoke-static {v12}, Lkw4;->f(Ljava/lang/String;)Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 1574
    .line 1575
    .line 1576
    move-result-object v1

    .line 1577
    if-nez v1, :cond_4d

    .line 1578
    .line 1579
    goto :goto_12

    .line 1580
    :cond_4d
    const/4 v7, 0x0

    .line 1581
    const v8, 0x7ffffff

    .line 1582
    .line 1583
    .line 1584
    const-wide/16 v2, 0x0

    .line 1585
    .line 1586
    const/4 v4, 0x0

    .line 1587
    const/4 v5, 0x0

    .line 1588
    const/4 v6, 0x0

    .line 1589
    invoke-static/range {v1 .. v8}, Lsu/happ/proxyutility/dto/SubscriptionItem;->d(Lsu/happ/proxyutility/dto/SubscriptionItem;JZLsu/happ/proxyutility/dto/MetaParams;ZLjava/lang/Long;I)Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 1590
    .line 1591
    .line 1592
    move-result-object v0

    .line 1593
    invoke-static {v0, v12}, Lkw4;->u(Lsu/happ/proxyutility/dto/SubscriptionItem;Ljava/lang/String;)V

    .line 1594
    .line 1595
    .line 1596
    goto :goto_12

    .line 1597
    :cond_4e
    throw v0

    .line 1598
    :cond_4f
    :goto_12
    sget-object v0, Ldn8;->a:Ldn8;

    .line 1599
    .line 1600
    return-object v0
.end method
