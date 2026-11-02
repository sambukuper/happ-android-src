.class public final Le57;
.super La57;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final j:Ly73;

.field public k:Z

.field public final l:Ljava/lang/StringBuilder;

.field public m:Z

.field public final n:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, La57;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ly73;

    .line 5
    .line 6
    invoke-direct {v0}, Ly73;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Le57;->j:Ly73;

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    iput-boolean v0, p0, Le57;->k:Z

    .line 13
    .line 14
    new-instance v0, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Le57;->l:Ljava/lang/StringBuilder;

    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    iput-boolean v0, p0, Le57;->m:Z

    .line 23
    .line 24
    new-instance v0, Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, Le57;->n:Ljava/util/ArrayList;

    .line 30
    .line 31
    return-void
.end method


# virtual methods
.method public final a(Lf57;)V
    .locals 13

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    iget-object v2, p0, La57;->b:Lxm0;

    .line 7
    .line 8
    iget-object v3, v2, Lxm0;->f0:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v3, Ljava/util/HashSet;

    .line 11
    .line 12
    iget-object v4, p1, Lf57;->g:Lym0;

    .line 13
    .line 14
    iget-object v5, v4, Lym0;->b:Lqd5;

    .line 15
    .line 16
    iget v6, v4, Lym0;->c:I

    .line 17
    .line 18
    const/4 v7, -0x1

    .line 19
    if-eq v6, v7, :cond_1

    .line 20
    .line 21
    const/4 v7, 0x1

    .line 22
    iput-boolean v7, p0, Le57;->m:Z

    .line 23
    .line 24
    iget v7, v2, Lxm0;->Y:I

    .line 25
    .line 26
    sget-object v8, Lf57;->j:Ljava/util/List;

    .line 27
    .line 28
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 29
    .line 30
    .line 31
    move-result-object v9

    .line 32
    invoke-interface {v8, v9}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 33
    .line 34
    .line 35
    move-result v9

    .line 36
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 37
    .line 38
    .line 39
    move-result-object v10

    .line 40
    invoke-interface {v8, v10}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 41
    .line 42
    .line 43
    move-result v8

    .line 44
    if-lt v9, v8, :cond_0

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    move v6, v7

    .line 48
    :goto_0
    iput v6, v2, Lxm0;->Y:I

    .line 49
    .line 50
    :cond_1
    invoke-virtual {v4}, Lym0;->a()Landroid/util/Range;

    .line 51
    .line 52
    .line 53
    move-result-object v6

    .line 54
    sget-object v7, Liz;->h:Landroid/util/Range;

    .line 55
    .line 56
    invoke-virtual {v6, v7}, Landroid/util/Range;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v8

    .line 60
    iget-object v9, p0, Le57;->l:Ljava/lang/StringBuilder;

    .line 61
    .line 62
    const-string v10, "ValidatingBuilder"

    .line 63
    .line 64
    if-eqz v8, :cond_2

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_2
    iget-object v8, v2, Lxm0;->g0:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v8, Lk05;

    .line 70
    .line 71
    sget-object v11, Lym0;->f:Lzx;

    .line 72
    .line 73
    invoke-virtual {v8, v11, v7}, Lqd5;->a(Lzx;Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v8

    .line 77
    check-cast v8, Landroid/util/Range;

    .line 78
    .line 79
    invoke-virtual {v8, v7}, Landroid/util/Range;->equals(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v8

    .line 83
    iget-object v12, v2, Lxm0;->g0:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v12, Lk05;

    .line 86
    .line 87
    if-eqz v8, :cond_3

    .line 88
    .line 89
    invoke-virtual {v12, v11, v6}, Lk05;->o(Lzx;Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_3
    invoke-virtual {v12, v11, v7}, Lqd5;->a(Lzx;Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v8

    .line 97
    check-cast v8, Landroid/util/Range;

    .line 98
    .line 99
    invoke-virtual {v8, v6}, Landroid/util/Range;->equals(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v8

    .line 103
    if-nez v8, :cond_4

    .line 104
    .line 105
    iput-boolean v0, p0, Le57;->k:Z

    .line 106
    .line 107
    new-instance v8, Ljava/lang/StringBuilder;

    .line 108
    .line 109
    const-string v12, "Different ExpectedFrameRateRange values; current = "

    .line 110
    .line 111
    invoke-direct {v8, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    iget-object v12, v2, Lxm0;->g0:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v12, Lk05;

    .line 117
    .line 118
    invoke-virtual {v12, v11, v7}, Lqd5;->a(Lzx;Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v7

    .line 122
    check-cast v7, Landroid/util/Range;

    .line 123
    .line 124
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    const-string v7, ", new = "

    .line 128
    .line 129
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v6

    .line 139
    invoke-static {v10}, Lhi5;->z0(Ljava/lang/String;)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    :cond_4
    :goto_1
    sget-object v6, Ler8;->a0:Lzx;

    .line 146
    .line 147
    invoke-virtual {v5, v6, v1}, Lqd5;->a(Lzx;Ljava/lang/Object;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v7

    .line 151
    check-cast v7, Ljava/lang/Integer;

    .line 152
    .line 153
    invoke-static {v7}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 157
    .line 158
    .line 159
    move-result v8

    .line 160
    if-eqz v8, :cond_5

    .line 161
    .line 162
    if-eqz v8, :cond_5

    .line 163
    .line 164
    iget-object v8, v2, Lxm0;->g0:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast v8, Lk05;

    .line 167
    .line 168
    invoke-virtual {v8, v6, v7}, Lk05;->o(Lzx;Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    :cond_5
    sget-object v6, Ler8;->b0:Lzx;

    .line 172
    .line 173
    invoke-virtual {v5, v6, v1}, Lqd5;->a(Lzx;Ljava/lang/Object;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    check-cast v1, Ljava/lang/Integer;

    .line 178
    .line 179
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 183
    .line 184
    .line 185
    move-result v7

    .line 186
    if-eqz v7, :cond_6

    .line 187
    .line 188
    if-eqz v7, :cond_6

    .line 189
    .line 190
    iget-object v7, v2, Lxm0;->g0:Ljava/lang/Object;

    .line 191
    .line 192
    check-cast v7, Lk05;

    .line 193
    .line 194
    invoke-virtual {v7, v6, v1}, Lk05;->o(Lzx;Ljava/lang/Object;)V

    .line 195
    .line 196
    .line 197
    :cond_6
    iget-object v1, v4, Lym0;->e:Ld18;

    .line 198
    .line 199
    iget-object v6, v2, Lxm0;->h0:Ljava/lang/Object;

    .line 200
    .line 201
    check-cast v6, La15;

    .line 202
    .line 203
    iget-object v6, v6, Ld18;->a:Landroid/util/ArrayMap;

    .line 204
    .line 205
    iget-object v1, v1, Ld18;->a:Landroid/util/ArrayMap;

    .line 206
    .line 207
    invoke-virtual {v6, v1}, Landroid/util/ArrayMap;->putAll(Ljava/util/Map;)V

    .line 208
    .line 209
    .line 210
    iget-object v1, p0, La57;->c:Ljava/util/ArrayList;

    .line 211
    .line 212
    iget-object v6, p1, Lf57;->c:Ljava/util/List;

    .line 213
    .line 214
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 215
    .line 216
    .line 217
    iget-object v1, p0, La57;->d:Ljava/util/ArrayList;

    .line 218
    .line 219
    iget-object v6, p1, Lf57;->d:Ljava/util/List;

    .line 220
    .line 221
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 222
    .line 223
    .line 224
    iget-object v1, v4, Lym0;->d:Ljava/util/List;

    .line 225
    .line 226
    invoke-virtual {v2, v1}, Lxm0;->b(Ljava/util/Collection;)V

    .line 227
    .line 228
    .line 229
    iget-object v1, p0, La57;->e:Ljava/util/ArrayList;

    .line 230
    .line 231
    iget-object v6, p1, Lf57;->e:Ljava/util/List;

    .line 232
    .line 233
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 234
    .line 235
    .line 236
    iget-object v1, p1, Lf57;->f:Ld57;

    .line 237
    .line 238
    if-eqz v1, :cond_7

    .line 239
    .line 240
    iget-object v6, p0, Le57;->n:Ljava/util/ArrayList;

    .line 241
    .line 242
    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 243
    .line 244
    .line 245
    :cond_7
    iget-object v1, p1, Lf57;->i:Landroid/hardware/camera2/params/InputConfiguration;

    .line 246
    .line 247
    if-eqz v1, :cond_8

    .line 248
    .line 249
    iput-object v1, p0, La57;->g:Landroid/hardware/camera2/params/InputConfiguration;

    .line 250
    .line 251
    :cond_8
    iget-object v1, p1, Lf57;->a:Ljava/util/ArrayList;

    .line 252
    .line 253
    iget-object v6, p0, La57;->a:Ljava/util/LinkedHashSet;

    .line 254
    .line 255
    invoke-interface {v6, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 256
    .line 257
    .line 258
    iget-object v1, v4, Lym0;->a:Ljava/util/ArrayList;

    .line 259
    .line 260
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 261
    .line 262
    .line 263
    move-result-object v1

    .line 264
    invoke-interface {v3, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 265
    .line 266
    .line 267
    new-instance v1, Ljava/util/ArrayList;

    .line 268
    .line 269
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 270
    .line 271
    .line 272
    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 273
    .line 274
    .line 275
    move-result-object v4

    .line 276
    :cond_9
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 277
    .line 278
    .line 279
    move-result v6

    .line 280
    if-eqz v6, :cond_a

    .line 281
    .line 282
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v6

    .line 286
    check-cast v6, Lfz;

    .line 287
    .line 288
    iget-object v7, v6, Lfz;->a:Lwg1;

    .line 289
    .line 290
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 291
    .line 292
    .line 293
    iget-object v6, v6, Lfz;->b:Ljava/util/List;

    .line 294
    .line 295
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 296
    .line 297
    .line 298
    move-result-object v6

    .line 299
    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 300
    .line 301
    .line 302
    move-result v7

    .line 303
    if-eqz v7, :cond_9

    .line 304
    .line 305
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    move-result-object v7

    .line 309
    check-cast v7, Lwg1;

    .line 310
    .line 311
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 312
    .line 313
    .line 314
    goto :goto_2

    .line 315
    :cond_a
    invoke-interface {v1, v3}, Ljava/util/List;->containsAll(Ljava/util/Collection;)Z

    .line 316
    .line 317
    .line 318
    move-result v1

    .line 319
    if-nez v1, :cond_b

    .line 320
    .line 321
    invoke-static {v10}, Lhi5;->z0(Ljava/lang/String;)Ljava/lang/String;

    .line 322
    .line 323
    .line 324
    iput-boolean v0, p0, Le57;->k:Z

    .line 325
    .line 326
    const-string v1, "Invalid configuration due to capture request surfaces are not a subset of surfaces"

    .line 327
    .line 328
    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 329
    .line 330
    .line 331
    :cond_b
    iget v1, p1, Lf57;->h:I

    .line 332
    .line 333
    iget v3, p0, La57;->h:I

    .line 334
    .line 335
    if-eq v1, v3, :cond_c

    .line 336
    .line 337
    if-eqz v1, :cond_c

    .line 338
    .line 339
    if-eqz v3, :cond_c

    .line 340
    .line 341
    invoke-static {v10}, Lhi5;->z0(Ljava/lang/String;)Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    iput-boolean v0, p0, Le57;->k:Z

    .line 345
    .line 346
    const-string v1, "Invalid configuration due to that two non-default session types are set"

    .line 347
    .line 348
    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 349
    .line 350
    .line 351
    goto :goto_3

    .line 352
    :cond_c
    if-eqz v1, :cond_d

    .line 353
    .line 354
    iput v1, p0, La57;->h:I

    .line 355
    .line 356
    :cond_d
    :goto_3
    iget-object p1, p1, Lf57;->b:Lfz;

    .line 357
    .line 358
    if-eqz p1, :cond_f

    .line 359
    .line 360
    iget-object v1, p0, La57;->i:Lfz;

    .line 361
    .line 362
    if-eq v1, p1, :cond_e

    .line 363
    .line 364
    if-eqz v1, :cond_e

    .line 365
    .line 366
    invoke-static {v10}, Lhi5;->z0(Ljava/lang/String;)Ljava/lang/String;

    .line 367
    .line 368
    .line 369
    iput-boolean v0, p0, Le57;->k:Z

    .line 370
    .line 371
    const-string p0, "Invalid configuration due to that two different postview output configs are set"

    .line 372
    .line 373
    invoke-virtual {v9, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 374
    .line 375
    .line 376
    goto :goto_4

    .line 377
    :cond_e
    iput-object p1, p0, La57;->i:Lfz;

    .line 378
    .line 379
    :cond_f
    :goto_4
    invoke-virtual {v2, v5}, Lxm0;->d(Ll11;)V

    .line 380
    .line 381
    .line 382
    return-void
.end method

.method public final b()Lf57;
    .locals 12

    .line 1
    iget-boolean v0, p0, Le57;->k:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_9

    .line 5
    .line 6
    new-instance v3, Ljava/util/ArrayList;

    .line 7
    .line 8
    iget-object v0, p0, La57;->a:Ljava/util/LinkedHashSet;

    .line 9
    .line 10
    invoke-direct {v3, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Le57;->j:Ly73;

    .line 14
    .line 15
    iget-boolean v2, v0, Ly73;->X:Z

    .line 16
    .line 17
    if-nez v2, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v2, Lcg;

    .line 21
    .line 22
    invoke-direct {v2, v0}, Lcg;-><init>(Ly73;)V

    .line 23
    .line 24
    .line 25
    invoke-static {v3, v2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 26
    .line 27
    .line 28
    :goto_0
    iget v0, p0, La57;->h:I

    .line 29
    .line 30
    const/4 v2, 0x1

    .line 31
    const/4 v4, 0x2

    .line 32
    iget-object v5, p0, La57;->b:Lxm0;

    .line 33
    .line 34
    if-ne v0, v2, :cond_7

    .line 35
    .line 36
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-ne v0, v4, :cond_7

    .line 41
    .line 42
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_1

    .line 47
    .line 48
    goto/16 :goto_3

    .line 49
    .line 50
    :cond_1
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-eqz v2, :cond_7

    .line 59
    .line 60
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    check-cast v2, Lfz;

    .line 65
    .line 66
    iget-object v2, v2, Lfz;->a:Lwg1;

    .line 67
    .line 68
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    iget-object v2, v2, Lwg1;->j:Ljava/lang/Class;

    .line 72
    .line 73
    const-class v6, Landroid/media/MediaCodec;

    .line 74
    .line 75
    invoke-static {v2, v6}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    if-eqz v2, :cond_2

    .line 80
    .line 81
    iget-object v0, v5, Lxm0;->f0:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v0, Ljava/util/HashSet;

    .line 84
    .line 85
    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    if-eqz v2, :cond_3

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_3
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 97
    .line 98
    .line 99
    move-result v2

    .line 100
    if-eqz v2, :cond_5

    .line 101
    .line 102
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    check-cast v2, Lwg1;

    .line 107
    .line 108
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    iget-object v2, v2, Lwg1;->j:Ljava/lang/Class;

    .line 112
    .line 113
    invoke-static {v2, v6}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v2

    .line 117
    if-eqz v2, :cond_4

    .line 118
    .line 119
    goto :goto_3

    .line 120
    :cond_5
    :goto_1
    iget-object v0, v5, Lxm0;->g0:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v0, Lk05;

    .line 123
    .line 124
    sget-object v2, Lym0;->f:Lzx;

    .line 125
    .line 126
    sget-object v6, Liz;->h:Landroid/util/Range;

    .line 127
    .line 128
    invoke-virtual {v0, v2, v6}, Lqd5;->a(Lzx;Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    check-cast v0, Landroid/util/Range;

    .line 133
    .line 134
    if-eqz v0, :cond_7

    .line 135
    .line 136
    invoke-virtual {v0}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    .line 137
    .line 138
    .line 139
    move-result-object v6

    .line 140
    check-cast v6, Ljava/lang/Number;

    .line 141
    .line 142
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 143
    .line 144
    .line 145
    move-result v6

    .line 146
    const/16 v7, 0x78

    .line 147
    .line 148
    if-lt v6, v7, :cond_6

    .line 149
    .line 150
    invoke-virtual {v0}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    .line 151
    .line 152
    .line 153
    move-result-object v6

    .line 154
    invoke-virtual {v0}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    .line 155
    .line 156
    .line 157
    move-result-object v7

    .line 158
    invoke-static {v6, v7}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result v6

    .line 162
    if-eqz v6, :cond_6

    .line 163
    .line 164
    goto :goto_2

    .line 165
    :cond_6
    move-object v0, v1

    .line 166
    :goto_2
    if-eqz v0, :cond_7

    .line 167
    .line 168
    new-instance v6, Landroid/util/Range;

    .line 169
    .line 170
    const/16 v7, 0x1e

    .line 171
    .line 172
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 173
    .line 174
    .line 175
    move-result-object v7

    .line 176
    invoke-virtual {v0}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    .line 177
    .line 178
    .line 179
    move-result-object v8

    .line 180
    invoke-direct {v6, v7, v8}, Landroid/util/Range;-><init>(Ljava/lang/Comparable;Ljava/lang/Comparable;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    const-string v0, "HighSpeedFpsModifier"

    .line 190
    .line 191
    invoke-static {v0}, Lhi5;->z0(Ljava/lang/String;)Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    iget-object v0, v5, Lxm0;->g0:Ljava/lang/Object;

    .line 195
    .line 196
    check-cast v0, Lk05;

    .line 197
    .line 198
    invoke-virtual {v0, v2, v6}, Lk05;->o(Lzx;Ljava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    :cond_7
    :goto_3
    iget-object v0, p0, Le57;->n:Ljava/util/ArrayList;

    .line 202
    .line 203
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 204
    .line 205
    .line 206
    move-result v0

    .line 207
    if-nez v0, :cond_8

    .line 208
    .line 209
    new-instance v1, Lt53;

    .line 210
    .line 211
    invoke-direct {v1, p0, v4}, Lt53;-><init>(Ljava/lang/Object;B)V

    .line 212
    .line 213
    .line 214
    :cond_8
    move-object v8, v1

    .line 215
    new-instance v2, Lf57;

    .line 216
    .line 217
    new-instance v4, Ljava/util/ArrayList;

    .line 218
    .line 219
    iget-object v0, p0, La57;->c:Ljava/util/ArrayList;

    .line 220
    .line 221
    invoke-direct {v4, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 222
    .line 223
    .line 224
    move-object v0, v5

    .line 225
    new-instance v5, Ljava/util/ArrayList;

    .line 226
    .line 227
    iget-object v1, p0, La57;->d:Ljava/util/ArrayList;

    .line 228
    .line 229
    invoke-direct {v5, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 230
    .line 231
    .line 232
    new-instance v6, Ljava/util/ArrayList;

    .line 233
    .line 234
    iget-object v1, p0, La57;->e:Ljava/util/ArrayList;

    .line 235
    .line 236
    invoke-direct {v6, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v0}, Lxm0;->e()Lym0;

    .line 240
    .line 241
    .line 242
    move-result-object v7

    .line 243
    iget-object v9, p0, La57;->g:Landroid/hardware/camera2/params/InputConfiguration;

    .line 244
    .line 245
    iget v10, p0, La57;->h:I

    .line 246
    .line 247
    iget-object v11, p0, La57;->i:Lfz;

    .line 248
    .line 249
    invoke-direct/range {v2 .. v11}, Lf57;-><init>(Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Lym0;Ld57;Landroid/hardware/camera2/params/InputConfiguration;ILfz;)V

    .line 250
    .line 251
    .line 252
    return-object v2

    .line 253
    :cond_9
    const-string p0, "Unsupported session configuration combination"

    .line 254
    .line 255
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 256
    .line 257
    .line 258
    return-object v1
.end method

.method public final c()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Le57;->m:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean p0, p0, Le57;->k:Z

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method
