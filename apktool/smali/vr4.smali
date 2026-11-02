.class public final synthetic Lvr4;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ldn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Lwr4;


# direct methods
.method public synthetic constructor <init>(Lwr4;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lvr4;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lvr4;->Y:Lwr4;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, Lvr4;->X:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    sget-object v2, Ldn8;->a:Ldn8;

    .line 5
    .line 6
    iget-object p0, p0, Lvr4;->Y:Lwr4;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lwr4;->h0:Lr34;

    .line 12
    .line 13
    invoke-virtual {v0}, Lr34;->a()Li55;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    iget-object v3, v3, Li55;->y0:Li55;

    .line 18
    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    iget-object v3, v3, Lvi4;->r0:Lwi4;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iget-object v3, v0, Lr34;->a:Landroidx/compose/ui/node/LayoutNode;

    .line 25
    .line 26
    invoke-static {v3}, Lq34;->a(Landroidx/compose/ui/node/LayoutNode;)Lmf5;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-interface {v3}, Lmf5;->getPlacementScope()Ldo5;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    :goto_0
    iget-object v4, p0, Lwr4;->J0:Lgn2;

    .line 35
    .line 36
    iget-object v5, p0, Lwr4;->K0:Lxt2;

    .line 37
    .line 38
    if-eqz v5, :cond_1

    .line 39
    .line 40
    invoke-virtual {v0}, Lr34;->a()Li55;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iget-wide v6, p0, Lwr4;->L0:J

    .line 45
    .line 46
    iget p0, p0, Lwr4;->M0:F

    .line 47
    .line 48
    invoke-virtual {v3, v0}, Ldo5;->d(Leo5;)V

    .line 49
    .line 50
    .line 51
    iget-wide v3, v0, Leo5;->g0:J

    .line 52
    .line 53
    invoke-static {v6, v7, v3, v4}, Lhf3;->c(JJ)J

    .line 54
    .line 55
    .line 56
    move-result-wide v3

    .line 57
    invoke-virtual {v0, v3, v4, p0, v5}, Li55;->T(JFLxt2;)V

    .line 58
    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_1
    if-nez v4, :cond_2

    .line 62
    .line 63
    invoke-virtual {v0}, Lr34;->a()Li55;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    iget-wide v4, p0, Lwr4;->L0:J

    .line 68
    .line 69
    iget p0, p0, Lwr4;->M0:F

    .line 70
    .line 71
    invoke-virtual {v3, v0}, Ldo5;->d(Leo5;)V

    .line 72
    .line 73
    .line 74
    iget-wide v6, v0, Leo5;->g0:J

    .line 75
    .line 76
    invoke-static {v4, v5, v6, v7}, Lhf3;->c(JJ)J

    .line 77
    .line 78
    .line 79
    move-result-wide v3

    .line 80
    invoke-virtual {v0, v3, v4, p0, v1}, Leo5;->S(JFLgn2;)V

    .line 81
    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_2
    invoke-virtual {v0}, Lr34;->a()Li55;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    iget-wide v5, p0, Lwr4;->L0:J

    .line 89
    .line 90
    iget p0, p0, Lwr4;->M0:F

    .line 91
    .line 92
    invoke-virtual {v3, v0}, Ldo5;->d(Leo5;)V

    .line 93
    .line 94
    .line 95
    iget-wide v7, v0, Leo5;->g0:J

    .line 96
    .line 97
    invoke-static {v5, v6, v7, v8}, Lhf3;->c(JJ)J

    .line 98
    .line 99
    .line 100
    move-result-wide v5

    .line 101
    invoke-virtual {v0, v5, v6, p0, v4}, Leo5;->S(JFLgn2;)V

    .line 102
    .line 103
    .line 104
    :goto_1
    return-object v2

    .line 105
    :pswitch_0
    iget-object v0, p0, Lwr4;->h0:Lr34;

    .line 106
    .line 107
    const/4 v3, 0x0

    .line 108
    iput v3, v0, Lr34;->i:I

    .line 109
    .line 110
    iget-object v0, v0, Lr34;->a:Landroidx/compose/ui/node/LayoutNode;

    .line 111
    .line 112
    invoke-virtual {v0}, Landroidx/compose/ui/node/LayoutNode;->C()Lc15;

    .line 113
    .line 114
    .line 115
    move-result-object v4

    .line 116
    iget-object v5, v4, Lc15;->X:[Ljava/lang/Object;

    .line 117
    .line 118
    iget v4, v4, Lc15;->Z:I

    .line 119
    .line 120
    move v6, v3

    .line 121
    :goto_2
    const v7, 0x7fffffff

    .line 122
    .line 123
    .line 124
    if-ge v6, v4, :cond_4

    .line 125
    .line 126
    aget-object v8, v5, v6

    .line 127
    .line 128
    check-cast v8, Landroidx/compose/ui/node/LayoutNode;

    .line 129
    .line 130
    iget-object v8, v8, Landroidx/compose/ui/node/LayoutNode;->I0:Lr34;

    .line 131
    .line 132
    iget-object v8, v8, Lr34;->p:Lwr4;

    .line 133
    .line 134
    iget v9, v8, Lwr4;->k0:I

    .line 135
    .line 136
    iput v9, v8, Lwr4;->j0:I

    .line 137
    .line 138
    iput v7, v8, Lwr4;->k0:I

    .line 139
    .line 140
    iput-boolean v3, v8, Lwr4;->w0:Z

    .line 141
    .line 142
    iget-object v7, v8, Lwr4;->n0:Lm34;

    .line 143
    .line 144
    sget-object v9, Lm34;->Y:Lm34;

    .line 145
    .line 146
    if-ne v7, v9, :cond_3

    .line 147
    .line 148
    sget-object v7, Lm34;->Z:Lm34;

    .line 149
    .line 150
    iput-object v7, v8, Lwr4;->n0:Lm34;

    .line 151
    .line 152
    :cond_3
    add-int/lit8 v6, v6, 0x1

    .line 153
    .line 154
    goto :goto_2

    .line 155
    :cond_4
    invoke-virtual {v0}, Landroidx/compose/ui/node/LayoutNode;->C()Lc15;

    .line 156
    .line 157
    .line 158
    move-result-object v4

    .line 159
    iget-object v5, v4, Lc15;->X:[Ljava/lang/Object;

    .line 160
    .line 161
    iget v4, v4, Lc15;->Z:I

    .line 162
    .line 163
    move v6, v3

    .line 164
    :goto_3
    if-ge v6, v4, :cond_5

    .line 165
    .line 166
    aget-object v8, v5, v6

    .line 167
    .line 168
    check-cast v8, Landroidx/compose/ui/node/LayoutNode;

    .line 169
    .line 170
    iget-object v8, v8, Landroidx/compose/ui/node/LayoutNode;->I0:Lr34;

    .line 171
    .line 172
    iget-object v8, v8, Lr34;->p:Lwr4;

    .line 173
    .line 174
    iget-object v8, v8, Lwr4;->A0:Lo34;

    .line 175
    .line 176
    iput-boolean v3, v8, Lo34;->d:Z

    .line 177
    .line 178
    add-int/lit8 v6, v6, 0x1

    .line 179
    .line 180
    goto :goto_3

    .line 181
    :cond_5
    invoke-virtual {v0}, Landroidx/compose/ui/node/LayoutNode;->getChildren$ui()Ljava/util/List;

    .line 182
    .line 183
    .line 184
    move-result-object v4

    .line 185
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    .line 186
    .line 187
    .line 188
    move-result v5

    .line 189
    move v6, v3

    .line 190
    :goto_4
    if-ge v6, v5, :cond_8

    .line 191
    .line 192
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v8

    .line 196
    check-cast v8, Landroidx/compose/ui/node/LayoutNode;

    .line 197
    .line 198
    invoke-virtual {v8}, Landroidx/compose/ui/node/LayoutNode;->getOuterCoordinator$ui()Li55;

    .line 199
    .line 200
    .line 201
    move-result-object v9

    .line 202
    iget-boolean v9, v9, Lvi4;->q0:Z

    .line 203
    .line 204
    if-eqz v9, :cond_7

    .line 205
    .line 206
    if-nez v1, :cond_6

    .line 207
    .line 208
    new-instance v1, Lj05;

    .line 209
    .line 210
    invoke-direct {v1}, Lj05;-><init>()V

    .line 211
    .line 212
    .line 213
    :cond_6
    invoke-virtual {v1, v8}, Lj05;->a(Ljava/lang/Object;)V

    .line 214
    .line 215
    .line 216
    :cond_7
    invoke-virtual {v8}, Landroidx/compose/ui/node/LayoutNode;->getOuterCoordinator$ui()Li55;

    .line 217
    .line 218
    .line 219
    move-result-object v8

    .line 220
    invoke-virtual {p0}, Lwr4;->d()Lfd3;

    .line 221
    .line 222
    .line 223
    move-result-object v9

    .line 224
    iget-boolean v9, v9, Lvi4;->q0:Z

    .line 225
    .line 226
    iput-boolean v9, v8, Lvi4;->q0:Z

    .line 227
    .line 228
    add-int/lit8 v6, v6, 0x1

    .line 229
    .line 230
    goto :goto_4

    .line 231
    :cond_8
    invoke-virtual {p0}, Lwr4;->d()Lfd3;

    .line 232
    .line 233
    .line 234
    move-result-object p0

    .line 235
    invoke-virtual {p0}, Li55;->s0()Lyr4;

    .line 236
    .line 237
    .line 238
    move-result-object p0

    .line 239
    invoke-interface {p0}, Lyr4;->d()V

    .line 240
    .line 241
    .line 242
    invoke-virtual {v0}, Landroidx/compose/ui/node/LayoutNode;->getChildren$ui()Ljava/util/List;

    .line 243
    .line 244
    .line 245
    move-result-object p0

    .line 246
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    .line 247
    .line 248
    .line 249
    move-result v4

    .line 250
    move v5, v3

    .line 251
    :goto_5
    if-ge v5, v4, :cond_a

    .line 252
    .line 253
    invoke-interface {p0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v6

    .line 257
    check-cast v6, Landroidx/compose/ui/node/LayoutNode;

    .line 258
    .line 259
    if-eqz v1, :cond_9

    .line 260
    .line 261
    invoke-virtual {v1, v6}, Lj05;->e(Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    move-result v8

    .line 265
    const/4 v9, 0x1

    .line 266
    if-ne v8, v9, :cond_9

    .line 267
    .line 268
    goto :goto_6

    .line 269
    :cond_9
    move v9, v3

    .line 270
    :goto_6
    invoke-virtual {v6}, Landroidx/compose/ui/node/LayoutNode;->getOuterCoordinator$ui()Li55;

    .line 271
    .line 272
    .line 273
    move-result-object v6

    .line 274
    iput-boolean v9, v6, Lvi4;->q0:Z

    .line 275
    .line 276
    add-int/lit8 v5, v5, 0x1

    .line 277
    .line 278
    goto :goto_5

    .line 279
    :cond_a
    invoke-virtual {v0}, Landroidx/compose/ui/node/LayoutNode;->C()Lc15;

    .line 280
    .line 281
    .line 282
    move-result-object p0

    .line 283
    iget-object v1, p0, Lc15;->X:[Ljava/lang/Object;

    .line 284
    .line 285
    iget p0, p0, Lc15;->Z:I

    .line 286
    .line 287
    move v4, v3

    .line 288
    :goto_7
    if-ge v4, p0, :cond_e

    .line 289
    .line 290
    aget-object v5, v1, v4

    .line 291
    .line 292
    check-cast v5, Landroidx/compose/ui/node/LayoutNode;

    .line 293
    .line 294
    iget-object v6, v5, Landroidx/compose/ui/node/LayoutNode;->I0:Lr34;

    .line 295
    .line 296
    iget-object v8, v6, Lr34;->p:Lwr4;

    .line 297
    .line 298
    iget v8, v8, Lwr4;->j0:I

    .line 299
    .line 300
    invoke-virtual {v5}, Landroidx/compose/ui/node/LayoutNode;->x()I

    .line 301
    .line 302
    .line 303
    move-result v9

    .line 304
    if-eq v8, v9, :cond_d

    .line 305
    .line 306
    invoke-virtual {v0}, Landroidx/compose/ui/node/LayoutNode;->R()V

    .line 307
    .line 308
    .line 309
    invoke-virtual {v0}, Landroidx/compose/ui/node/LayoutNode;->F()V

    .line 310
    .line 311
    .line 312
    invoke-virtual {v5}, Landroidx/compose/ui/node/LayoutNode;->x()I

    .line 313
    .line 314
    .line 315
    move-result v8

    .line 316
    if-ne v8, v7, :cond_d

    .line 317
    .line 318
    iget-boolean v8, v6, Lr34;->c:Z

    .line 319
    .line 320
    if-nez v8, :cond_b

    .line 321
    .line 322
    invoke-static {v5}, Los4;->t(Landroidx/compose/ui/node/LayoutNode;)Z

    .line 323
    .line 324
    .line 325
    move-result v5

    .line 326
    if-eqz v5, :cond_c

    .line 327
    .line 328
    :cond_b
    iget-object v5, v6, Lr34;->q:Lbj4;

    .line 329
    .line 330
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 331
    .line 332
    .line 333
    invoke-virtual {v5, v3}, Lbj4;->e0(Z)V

    .line 334
    .line 335
    .line 336
    :cond_c
    iget-object v5, v6, Lr34;->p:Lwr4;

    .line 337
    .line 338
    invoke-virtual {v5}, Lwr4;->i0()V

    .line 339
    .line 340
    .line 341
    :cond_d
    add-int/lit8 v4, v4, 0x1

    .line 342
    .line 343
    goto :goto_7

    .line 344
    :cond_e
    invoke-virtual {v0}, Landroidx/compose/ui/node/LayoutNode;->C()Lc15;

    .line 345
    .line 346
    .line 347
    move-result-object p0

    .line 348
    iget-object v0, p0, Lc15;->X:[Ljava/lang/Object;

    .line 349
    .line 350
    iget p0, p0, Lc15;->Z:I

    .line 351
    .line 352
    :goto_8
    if-ge v3, p0, :cond_f

    .line 353
    .line 354
    aget-object v1, v0, v3

    .line 355
    .line 356
    check-cast v1, Landroidx/compose/ui/node/LayoutNode;

    .line 357
    .line 358
    iget-object v1, v1, Landroidx/compose/ui/node/LayoutNode;->I0:Lr34;

    .line 359
    .line 360
    iget-object v1, v1, Lr34;->p:Lwr4;

    .line 361
    .line 362
    iget-object v1, v1, Lwr4;->A0:Lo34;

    .line 363
    .line 364
    iget-boolean v4, v1, Lo34;->d:Z

    .line 365
    .line 366
    iput-boolean v4, v1, Lo34;->e:Z

    .line 367
    .line 368
    add-int/lit8 v3, v3, 0x1

    .line 369
    .line 370
    goto :goto_8

    .line 371
    :cond_f
    return-object v2

    .line 372
    :pswitch_1
    iget-object v0, p0, Lwr4;->h0:Lr34;

    .line 373
    .line 374
    invoke-virtual {v0}, Lr34;->a()Li55;

    .line 375
    .line 376
    .line 377
    move-result-object v0

    .line 378
    iget-wide v3, p0, Lwr4;->E0:J

    .line 379
    .line 380
    invoke-interface {v0, v3, v4}, Ltr4;->o(J)Leo5;

    .line 381
    .line 382
    .line 383
    return-object v2

    .line 384
    nop

    .line 385
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
