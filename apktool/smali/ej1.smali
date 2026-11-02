.class public abstract Lej1;
.super Llb6;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final Y:Ltb6;

.field public final Z:Ltb6;

.field public final f0:Ltb6;

.field public final g0:Ltb6;

.field public final h0:Ltb6;


# direct methods
.method public constructor <init>(Lyu3;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1}, Llb6;-><init>(Lyu3;)V

    .line 5
    .line 6
    .line 7
    new-instance v0, Lcj1;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-direct {v0, p0, v1}, Lcj1;-><init>(Lej1;B)V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-static {v1, v0}, Lzc1;->X(Lld0;Ldn2;)Ltb6;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iput-object v0, p0, Lej1;->Y:Ltb6;

    .line 19
    .line 20
    new-instance v0, Lcj1;

    .line 21
    .line 22
    const/4 v2, 0x1

    .line 23
    invoke-direct {v0, p0, v2}, Lcj1;-><init>(Lej1;B)V

    .line 24
    .line 25
    .line 26
    invoke-static {v1, v0}, Lzc1;->X(Lld0;Ldn2;)Ltb6;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iput-object v0, p0, Lej1;->Z:Ltb6;

    .line 31
    .line 32
    new-instance v0, Lcj1;

    .line 33
    .line 34
    const/4 v2, 0x2

    .line 35
    invoke-direct {v0, p0, v2}, Lcj1;-><init>(Lej1;B)V

    .line 36
    .line 37
    .line 38
    invoke-static {v1, v0}, Lzc1;->X(Lld0;Ldn2;)Ltb6;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iput-object v0, p0, Lej1;->f0:Ltb6;

    .line 43
    .line 44
    new-instance v0, Lcj1;

    .line 45
    .line 46
    const/4 v2, 0x3

    .line 47
    invoke-direct {v0, p0, v2}, Lcj1;-><init>(Lej1;B)V

    .line 48
    .line 49
    .line 50
    invoke-static {v1, v0}, Lzc1;->X(Lld0;Ldn2;)Ltb6;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    iput-object v0, p0, Lej1;->g0:Ltb6;

    .line 55
    .line 56
    new-instance v0, Lc3;

    .line 57
    .line 58
    const/16 v2, 0x8

    .line 59
    .line 60
    invoke-direct {v0, p0, p1, v2}, Lc3;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 61
    .line 62
    .line 63
    invoke-static {v1, v0}, Lzc1;->X(Lld0;Ldn2;)Ltb6;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    iput-object p1, p0, Lej1;->h0:Ltb6;

    .line 68
    .line 69
    return-void
.end method


# virtual methods
.method public final Q()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lej1;->Y:Ltb6;

    .line 2
    .line 3
    invoke-virtual {p0}, Ltb6;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    check-cast p0, Ljava/util/List;

    .line 11
    .line 12
    return-object p0
.end method

.method public final R()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lej1;->V()Lld0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, Lts4;->e()Lfl1;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    sget-object v0, Lek3;->a:Lfl1;

    .line 10
    .line 11
    invoke-static {p0, v0}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0
.end method

.method public final T(Z)Ljava/util/ArrayList;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Lej1;->V()Lld0;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    new-instance v13, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    const/4 v14, 0x0

    .line 13
    const/4 v15, 0x1

    .line 14
    if-eqz p1, :cond_9

    .line 15
    .line 16
    invoke-static {v0}, Lms8;->h(Lej1;)Li44;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    new-instance v3, Lqj1;

    .line 23
    .line 24
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    new-instance v5, Ldj1;

    .line 29
    .line 30
    invoke-direct {v5, v1, v14}, Ldj1;-><init>(Li44;B)V

    .line 31
    .line 32
    .line 33
    sget-object v1, Lfw3;->X:Lfw3;

    .line 34
    .line 35
    invoke-direct {v3, v0, v4, v1, v5}, Lqj1;-><init>(Lej1;ILfw3;Ldn2;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v13, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    :cond_0
    instance-of v1, v2, Ljm1;

    .line 42
    .line 43
    const/16 v16, 0x0

    .line 44
    .line 45
    if-eqz v1, :cond_1

    .line 46
    .line 47
    move-object v1, v2

    .line 48
    check-cast v1, Ljm1;

    .line 49
    .line 50
    iget-object v3, v1, Ljm1;->I0:Lw15;

    .line 51
    .line 52
    iget-object v1, v1, Ljm1;->H0:Lvy5;

    .line 53
    .line 54
    iget-object v1, v1, Lvy5;->q0:Ljava/util/List;

    .line 55
    .line 56
    new-instance v4, Lqg5;

    .line 57
    .line 58
    invoke-direct {v4, v3, v1}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_1
    instance-of v1, v2, Lim1;

    .line 63
    .line 64
    if-eqz v1, :cond_2

    .line 65
    .line 66
    move-object v1, v2

    .line 67
    check-cast v1, Lim1;

    .line 68
    .line 69
    iget-object v3, v1, Lim1;->F0:Lw15;

    .line 70
    .line 71
    iget-object v1, v1, Lim1;->E0:Lcz5;

    .line 72
    .line 73
    iget-object v1, v1, Lcz5;->q0:Ljava/util/List;

    .line 74
    .line 75
    new-instance v4, Lqg5;

    .line 76
    .line 77
    invoke-direct {v4, v3, v1}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_2
    instance-of v1, v2, Lcx5;

    .line 82
    .line 83
    if-eqz v1, :cond_4

    .line 84
    .line 85
    move-object v1, v2

    .line 86
    check-cast v1, Lcx5;

    .line 87
    .line 88
    iget-object v1, v1, Lcx5;->l0:Lfx5;

    .line 89
    .line 90
    instance-of v3, v1, Lim1;

    .line 91
    .line 92
    if-eqz v3, :cond_3

    .line 93
    .line 94
    check-cast v1, Lim1;

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_3
    move-object/from16 v1, v16

    .line 98
    .line 99
    :goto_0
    if-eqz v1, :cond_4

    .line 100
    .line 101
    iget-object v3, v1, Lim1;->F0:Lw15;

    .line 102
    .line 103
    iget-object v1, v1, Lim1;->E0:Lcz5;

    .line 104
    .line 105
    iget-object v1, v1, Lcz5;->q0:Ljava/util/List;

    .line 106
    .line 107
    new-instance v4, Lqg5;

    .line 108
    .line 109
    invoke-direct {v4, v3, v1}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_4
    move-object/from16 v4, v16

    .line 114
    .line 115
    :goto_1
    if-nez v4, :cond_5

    .line 116
    .line 117
    sget-object v1, Ld02;->X:Ld02;

    .line 118
    .line 119
    goto/16 :goto_3

    .line 120
    .line 121
    :cond_5
    iget-object v1, v4, Lqg5;->X:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v1, Lw15;

    .line 124
    .line 125
    iget-object v3, v4, Lqg5;->Y:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast v3, Ljava/util/List;

    .line 128
    .line 129
    invoke-interface {v2}, Ljd0;->Y()Ljava/util/List;

    .line 130
    .line 131
    .line 132
    move-result-object v4

    .line 133
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    new-instance v5, Ljava/util/ArrayList;

    .line 137
    .line 138
    const/16 v6, 0xa

    .line 139
    .line 140
    invoke-static {v4, v6}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 141
    .line 142
    .line 143
    move-result v6

    .line 144
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 145
    .line 146
    .line 147
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 148
    .line 149
    .line 150
    move-result-object v17

    .line 151
    move v4, v14

    .line 152
    :goto_2
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    .line 153
    .line 154
    .line 155
    move-result v6

    .line 156
    if-eqz v6, :cond_7

    .line 157
    .line 158
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v6

    .line 162
    add-int/lit8 v18, v4, 0x1

    .line 163
    .line 164
    if-ltz v4, :cond_6

    .line 165
    .line 166
    check-cast v6, Li44;

    .line 167
    .line 168
    new-instance v7, Lot8;

    .line 169
    .line 170
    move-object v8, v5

    .line 171
    invoke-virtual {v6}, Lcw0;->getAnnotations()Lsm;

    .line 172
    .line 173
    .line 174
    move-result-object v5

    .line 175
    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v9

    .line 179
    check-cast v9, Lvz5;

    .line 180
    .line 181
    iget v9, v9, Lvz5;->g0:I

    .line 182
    .line 183
    invoke-interface {v1, v9}, Lw15;->getString(I)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v9

    .line 187
    invoke-static {v9}, Lv15;->d(Ljava/lang/String;)Lv15;

    .line 188
    .line 189
    .line 190
    move-result-object v9

    .line 191
    invoke-virtual {v6}, Li44;->c()Lt14;

    .line 192
    .line 193
    .line 194
    move-result-object v6

    .line 195
    const/4 v11, 0x0

    .line 196
    sget-object v12, Lke7;->G:Lg55;

    .line 197
    .line 198
    move-object v10, v3

    .line 199
    const/4 v3, 0x0

    .line 200
    move-object/from16 v19, v8

    .line 201
    .line 202
    const/4 v8, 0x0

    .line 203
    move-object/from16 v20, v1

    .line 204
    .line 205
    move-object v1, v7

    .line 206
    move-object v7, v6

    .line 207
    move-object v6, v9

    .line 208
    const/4 v9, 0x0

    .line 209
    move-object/from16 v21, v10

    .line 210
    .line 211
    const/4 v10, 0x0

    .line 212
    move-object/from16 v14, v19

    .line 213
    .line 214
    invoke-direct/range {v1 .. v12}, Lot8;-><init>(Ljd0;Lot8;ILsm;Lv15;Lt14;ZZZLt14;Lke7;)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v14, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 218
    .line 219
    .line 220
    move-object v5, v14

    .line 221
    move/from16 v4, v18

    .line 222
    .line 223
    move-object/from16 v1, v20

    .line 224
    .line 225
    move-object/from16 v3, v21

    .line 226
    .line 227
    const/4 v14, 0x0

    .line 228
    goto :goto_2

    .line 229
    :cond_6
    invoke-static {}, Li21;->X()V

    .line 230
    .line 231
    .line 232
    throw v16

    .line 233
    :cond_7
    move-object v14, v5

    .line 234
    move-object v1, v14

    .line 235
    :goto_3
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 236
    .line 237
    .line 238
    move-result v3

    .line 239
    const/4 v4, 0x0

    .line 240
    :goto_4
    if-ge v4, v3, :cond_8

    .line 241
    .line 242
    new-instance v5, Lqj1;

    .line 243
    .line 244
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 245
    .line 246
    .line 247
    move-result v6

    .line 248
    new-instance v7, Ly51;

    .line 249
    .line 250
    invoke-direct {v7, v1, v4, v15}, Ly51;-><init>(Ljava/lang/Object;IB)V

    .line 251
    .line 252
    .line 253
    sget-object v8, Lfw3;->Y:Lfw3;

    .line 254
    .line 255
    invoke-direct {v5, v0, v6, v8, v7}, Lqj1;-><init>(Lej1;ILfw3;Ldn2;)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v13, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 259
    .line 260
    .line 261
    add-int/lit8 v4, v4, 0x1

    .line 262
    .line 263
    goto :goto_4

    .line 264
    :cond_8
    invoke-interface {v2}, Ljd0;->S()Li44;

    .line 265
    .line 266
    .line 267
    move-result-object v1

    .line 268
    if-eqz v1, :cond_9

    .line 269
    .line 270
    new-instance v3, Lqj1;

    .line 271
    .line 272
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 273
    .line 274
    .line 275
    move-result v4

    .line 276
    new-instance v5, Ldj1;

    .line 277
    .line 278
    invoke-direct {v5, v1, v15}, Ldj1;-><init>(Li44;B)V

    .line 279
    .line 280
    .line 281
    sget-object v1, Lfw3;->Z:Lfw3;

    .line 282
    .line 283
    invoke-direct {v3, v0, v4, v1, v5}, Lqj1;-><init>(Lej1;ILfw3;Ldn2;)V

    .line 284
    .line 285
    .line 286
    invoke-virtual {v13, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 287
    .line 288
    .line 289
    :cond_9
    invoke-interface {v2}, Ljd0;->L()Ljava/util/List;

    .line 290
    .line 291
    .line 292
    move-result-object v1

    .line 293
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 294
    .line 295
    .line 296
    move-result v1

    .line 297
    const/4 v14, 0x0

    .line 298
    :goto_5
    if-ge v14, v1, :cond_a

    .line 299
    .line 300
    new-instance v3, Lqj1;

    .line 301
    .line 302
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 303
    .line 304
    .line 305
    move-result v4

    .line 306
    new-instance v5, Ly51;

    .line 307
    .line 308
    const/4 v6, 0x2

    .line 309
    invoke-direct {v5, v2, v14, v6}, Ly51;-><init>(Ljava/lang/Object;IB)V

    .line 310
    .line 311
    .line 312
    sget-object v6, Lfw3;->f0:Lfw3;

    .line 313
    .line 314
    invoke-direct {v3, v0, v4, v6, v5}, Lqj1;-><init>(Lej1;ILfw3;Ldn2;)V

    .line 315
    .line 316
    .line 317
    invoke-virtual {v13, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 318
    .line 319
    .line 320
    add-int/lit8 v14, v14, 0x1

    .line 321
    .line 322
    goto :goto_5

    .line 323
    :cond_a
    invoke-static {v0}, Lmb6;->J(Lkb6;)Z

    .line 324
    .line 325
    .line 326
    move-result v0

    .line 327
    if-eqz v0, :cond_b

    .line 328
    .line 329
    instance-of v0, v2, Lxj3;

    .line 330
    .line 331
    if-eqz v0, :cond_b

    .line 332
    .line 333
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 334
    .line 335
    .line 336
    move-result v0

    .line 337
    if-le v0, v15, :cond_b

    .line 338
    .line 339
    new-instance v0, Ll71;

    .line 340
    .line 341
    const/16 v1, 0xf

    .line 342
    .line 343
    invoke-direct {v0, v1}, Ll71;-><init>(B)V

    .line 344
    .line 345
    .line 346
    invoke-static {v13, v0}, Law0;->c0(Ljava/util/List;Ljava/util/Comparator;)V

    .line 347
    .line 348
    .line 349
    :cond_b
    invoke-virtual {v13}, Ljava/util/ArrayList;->trimToSize()V

    .line 350
    .line 351
    .line 352
    return-object v13
.end method

.method public abstract U()Lkk1;
.end method

.method public abstract V()Lld0;
.end method

.method public final e()Lzw3;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lej1;->V()Lld0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, Lts4;->e()Lfl1;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    sget-object v0, Lms8;->a:Lfk2;

    .line 13
    .line 14
    sget-object v0, Lgl1;->e:Lfl1;

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    sget-object p0, Lzw3;->X:Lzw3;

    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_0
    sget-object v0, Lgl1;->c:Lfl1;

    .line 26
    .line 27
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    sget-object p0, Lzw3;->Y:Lzw3;

    .line 34
    .line 35
    return-object p0

    .line 36
    :cond_1
    sget-object v0, Lgl1;->d:Lfl1;

    .line 37
    .line 38
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    sget-object p0, Lzw3;->Z:Lzw3;

    .line 45
    .line 46
    return-object p0

    .line 47
    :cond_2
    sget-object v0, Lgl1;->a:Lfl1;

    .line 48
    .line 49
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-nez v0, :cond_4

    .line 54
    .line 55
    sget-object v0, Lgl1;->b:Lfl1;

    .line 56
    .line 57
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result p0

    .line 61
    if-eqz p0, :cond_3

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_3
    const/4 p0, 0x0

    .line 65
    return-object p0

    .line 66
    :cond_4
    :goto_0
    sget-object p0, Lzw3;->f0:Lzw3;

    .line 67
    .line 68
    return-object p0
.end method

.method public final g()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lej1;->f0:Ltb6;

    .line 2
    .line 3
    invoke-virtual {p0}, Ltb6;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    check-cast p0, Ljava/util/List;

    .line 11
    .line 12
    return-object p0
.end method

.method public final getTypeParameters()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lej1;->h0:Ltb6;

    .line 2
    .line 3
    invoke-virtual {p0}, Ltb6;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    check-cast p0, Ljava/util/List;

    .line 11
    .line 12
    return-object p0
.end method

.method public final j()Lpw3;
    .locals 0

    .line 1
    iget-object p0, p0, Lej1;->g0:Ltb6;

    .line 2
    .line 3
    invoke-virtual {p0}, Ltb6;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    check-cast p0, Lpw3;

    .line 11
    .line 12
    return-object p0
.end method

.method public final l()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lej1;->Z:Ltb6;

    .line 2
    .line 3
    invoke-virtual {p0}, Ltb6;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    check-cast p0, Ljava/util/List;

    .line 11
    .line 12
    return-object p0
.end method

.method public final m()Lex4;
    .locals 1

    .line 1
    iget-object v0, p0, Llb6;->X:Lyu3;

    .line 2
    .line 3
    iget-object v0, v0, Lyu3;->b:Lex4;

    .line 4
    .line 5
    if-nez v0, :cond_4

    .line 6
    .line 7
    invoke-virtual {p0}, Lej1;->V()Lld0;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-interface {p0}, Lts4;->m()Lfx4;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    if-eqz p0, :cond_3

    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    if-eq p0, v0, :cond_2

    .line 26
    .line 27
    const/4 v0, 0x2

    .line 28
    if-eq p0, v0, :cond_1

    .line 29
    .line 30
    const/4 v0, 0x3

    .line 31
    if-ne p0, v0, :cond_0

    .line 32
    .line 33
    sget-object p0, Lex4;->f0:Lex4;

    .line 34
    .line 35
    return-object p0

    .line 36
    :cond_0
    invoke-static {}, Lb61;->c()V

    .line 37
    .line 38
    .line 39
    const/4 p0, 0x0

    .line 40
    return-object p0

    .line 41
    :cond_1
    sget-object p0, Lex4;->Z:Lex4;

    .line 42
    .line 43
    return-object p0

    .line 44
    :cond_2
    sget-object p0, Lex4;->g0:Lex4;

    .line 45
    .line 46
    return-object p0

    .line 47
    :cond_3
    sget-object p0, Lex4;->Y:Lex4;

    .line 48
    .line 49
    return-object p0

    .line 50
    :cond_4
    return-object v0
.end method
