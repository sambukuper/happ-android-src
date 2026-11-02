.class public final Luy5;
.super Lxp2;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public f0:I

.field public g0:I

.field public h0:I

.field public i0:I

.field public j0:Lnz5;

.field public k0:I

.field public l0:Ljava/util/List;

.field public m0:Lnz5;

.field public n0:I

.field public o0:Ljava/util/List;

.field public p0:Ljava/util/List;

.field public q0:Ljava/util/List;

.field public r0:Ljava/util/List;

.field public s0:Ltz5;

.field public t0:Ljava/util/List;

.field public u0:Lky5;

.field public v0:Ljava/util/List;

.field public w0:Ljava/util/List;

.field public x0:Ljava/util/List;


# direct methods
.method public static h()Luy5;
    .locals 3

    .line 1
    new-instance v0, Luy5;

    .line 2
    .line 3
    invoke-direct {v0}, Lxp2;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x6

    .line 7
    iput v1, v0, Luy5;->g0:I

    .line 8
    .line 9
    iput v1, v0, Luy5;->h0:I

    .line 10
    .line 11
    sget-object v1, Lnz5;->w0:Lnz5;

    .line 12
    .line 13
    iput-object v1, v0, Luy5;->j0:Lnz5;

    .line 14
    .line 15
    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 16
    .line 17
    iput-object v2, v0, Luy5;->l0:Ljava/util/List;

    .line 18
    .line 19
    iput-object v1, v0, Luy5;->m0:Lnz5;

    .line 20
    .line 21
    iput-object v2, v0, Luy5;->o0:Ljava/util/List;

    .line 22
    .line 23
    iput-object v2, v0, Luy5;->p0:Ljava/util/List;

    .line 24
    .line 25
    iput-object v2, v0, Luy5;->q0:Ljava/util/List;

    .line 26
    .line 27
    iput-object v2, v0, Luy5;->r0:Ljava/util/List;

    .line 28
    .line 29
    sget-object v1, Ltz5;->i0:Ltz5;

    .line 30
    .line 31
    iput-object v1, v0, Luy5;->s0:Ltz5;

    .line 32
    .line 33
    iput-object v2, v0, Luy5;->t0:Ljava/util/List;

    .line 34
    .line 35
    sget-object v1, Lky5;->g0:Lky5;

    .line 36
    .line 37
    iput-object v1, v0, Luy5;->u0:Lky5;

    .line 38
    .line 39
    iput-object v2, v0, Luy5;->v0:Ljava/util/List;

    .line 40
    .line 41
    iput-object v2, v0, Luy5;->w0:Ljava/util/List;

    .line 42
    .line 43
    iput-object v2, v0, Luy5;->x0:Ljava/util/List;

    .line 44
    .line 45
    return-object v0
.end method


# virtual methods
.method public final b()Ld2;
    .locals 1

    .line 1
    invoke-virtual {p0}, Luy5;->g()Lvy5;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lvy5;->d()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    new-instance p0, Lxm8;

    .line 13
    .line 14
    invoke-direct {p0}, Lxm8;-><init>()V

    .line 15
    .line 16
    .line 17
    throw p0
.end method

.method public final c(Liv0;Lr62;)Lup2;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    sget-object v1, Lvy5;->B0:Lau3;

    .line 3
    .line 4
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v1, Lvy5;

    .line 8
    .line 9
    invoke-direct {v1, p1, p2}, Lvy5;-><init>(Liv0;Lr62;)V
    :try_end_0
    .catch Lrh3; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v1}, Luy5;->i(Lvy5;)V

    .line 13
    .line 14
    .line 15
    return-object p0

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    goto :goto_0

    .line 18
    :catch_0
    move-exception p1

    .line 19
    :try_start_1
    iget-object p2, p1, Lrh3;->X:Ld2;

    .line 20
    .line 21
    check-cast p2, Lvy5;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22
    .line 23
    :try_start_2
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 24
    :catchall_1
    move-exception p1

    .line 25
    move-object v0, p2

    .line 26
    :goto_0
    if-eqz v0, :cond_0

    .line 27
    .line 28
    invoke-virtual {p0, v0}, Luy5;->i(Lvy5;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    throw p1
.end method

.method public final clone()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-static {}, Luy5;->h()Luy5;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Luy5;->g()Lvy5;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {v0, p0}, Luy5;->i(Lvy5;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public final bridge synthetic e(Lbq2;)Lup2;
    .locals 0

    .line 1
    check-cast p1, Lvy5;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Luy5;->i(Lvy5;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final g()Lvy5;
    .locals 6

    .line 1
    new-instance v0, Lvy5;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lvy5;-><init>(Luy5;)V

    .line 4
    .line 5
    .line 6
    iget v1, p0, Luy5;->f0:I

    .line 7
    .line 8
    and-int/lit8 v2, v1, 0x1

    .line 9
    .line 10
    const/4 v3, 0x1

    .line 11
    if-ne v2, v3, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v3, 0x0

    .line 15
    :goto_0
    iget v2, p0, Luy5;->g0:I

    .line 16
    .line 17
    iput v2, v0, Lvy5;->f0:I

    .line 18
    .line 19
    and-int/lit8 v2, v1, 0x2

    .line 20
    .line 21
    const/4 v4, 0x2

    .line 22
    if-ne v2, v4, :cond_1

    .line 23
    .line 24
    or-int/lit8 v3, v3, 0x2

    .line 25
    .line 26
    :cond_1
    iget v2, p0, Luy5;->h0:I

    .line 27
    .line 28
    iput v2, v0, Lvy5;->g0:I

    .line 29
    .line 30
    and-int/lit8 v2, v1, 0x4

    .line 31
    .line 32
    const/4 v4, 0x4

    .line 33
    if-ne v2, v4, :cond_2

    .line 34
    .line 35
    or-int/lit8 v3, v3, 0x4

    .line 36
    .line 37
    :cond_2
    iget v2, p0, Luy5;->i0:I

    .line 38
    .line 39
    iput v2, v0, Lvy5;->h0:I

    .line 40
    .line 41
    and-int/lit8 v2, v1, 0x8

    .line 42
    .line 43
    const/16 v4, 0x8

    .line 44
    .line 45
    if-ne v2, v4, :cond_3

    .line 46
    .line 47
    or-int/lit8 v3, v3, 0x8

    .line 48
    .line 49
    :cond_3
    iget-object v2, p0, Luy5;->j0:Lnz5;

    .line 50
    .line 51
    iput-object v2, v0, Lvy5;->i0:Lnz5;

    .line 52
    .line 53
    and-int/lit8 v2, v1, 0x10

    .line 54
    .line 55
    const/16 v4, 0x10

    .line 56
    .line 57
    if-ne v2, v4, :cond_4

    .line 58
    .line 59
    or-int/lit8 v3, v3, 0x10

    .line 60
    .line 61
    :cond_4
    iget v2, p0, Luy5;->k0:I

    .line 62
    .line 63
    iput v2, v0, Lvy5;->j0:I

    .line 64
    .line 65
    and-int/lit8 v2, v1, 0x20

    .line 66
    .line 67
    const/16 v4, 0x20

    .line 68
    .line 69
    if-ne v2, v4, :cond_5

    .line 70
    .line 71
    iget-object v2, p0, Luy5;->l0:Ljava/util/List;

    .line 72
    .line 73
    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    iput-object v2, p0, Luy5;->l0:Ljava/util/List;

    .line 78
    .line 79
    iget v2, p0, Luy5;->f0:I

    .line 80
    .line 81
    and-int/lit8 v2, v2, -0x21

    .line 82
    .line 83
    iput v2, p0, Luy5;->f0:I

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_5
    move v2, v1

    .line 87
    :goto_1
    iget-object v4, p0, Luy5;->l0:Ljava/util/List;

    .line 88
    .line 89
    iput-object v4, v0, Lvy5;->k0:Ljava/util/List;

    .line 90
    .line 91
    and-int/lit8 v4, v1, 0x40

    .line 92
    .line 93
    const/16 v5, 0x40

    .line 94
    .line 95
    if-ne v4, v5, :cond_6

    .line 96
    .line 97
    or-int/lit8 v3, v3, 0x20

    .line 98
    .line 99
    :cond_6
    iget-object v4, p0, Luy5;->m0:Lnz5;

    .line 100
    .line 101
    iput-object v4, v0, Lvy5;->l0:Lnz5;

    .line 102
    .line 103
    and-int/lit16 v4, v1, 0x80

    .line 104
    .line 105
    const/16 v5, 0x80

    .line 106
    .line 107
    if-ne v4, v5, :cond_7

    .line 108
    .line 109
    or-int/lit8 v3, v3, 0x40

    .line 110
    .line 111
    :cond_7
    iget v4, p0, Luy5;->n0:I

    .line 112
    .line 113
    iput v4, v0, Lvy5;->m0:I

    .line 114
    .line 115
    and-int/lit16 v4, v2, 0x100

    .line 116
    .line 117
    const/16 v5, 0x100

    .line 118
    .line 119
    if-ne v4, v5, :cond_8

    .line 120
    .line 121
    iget-object v2, p0, Luy5;->o0:Ljava/util/List;

    .line 122
    .line 123
    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    iput-object v2, p0, Luy5;->o0:Ljava/util/List;

    .line 128
    .line 129
    iget v2, p0, Luy5;->f0:I

    .line 130
    .line 131
    and-int/lit16 v2, v2, -0x101

    .line 132
    .line 133
    iput v2, p0, Luy5;->f0:I

    .line 134
    .line 135
    :cond_8
    iget-object v4, p0, Luy5;->o0:Ljava/util/List;

    .line 136
    .line 137
    iput-object v4, v0, Lvy5;->n0:Ljava/util/List;

    .line 138
    .line 139
    and-int/lit16 v4, v2, 0x200

    .line 140
    .line 141
    const/16 v5, 0x200

    .line 142
    .line 143
    if-ne v4, v5, :cond_9

    .line 144
    .line 145
    iget-object v2, p0, Luy5;->p0:Ljava/util/List;

    .line 146
    .line 147
    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    iput-object v2, p0, Luy5;->p0:Ljava/util/List;

    .line 152
    .line 153
    iget v2, p0, Luy5;->f0:I

    .line 154
    .line 155
    and-int/lit16 v2, v2, -0x201

    .line 156
    .line 157
    iput v2, p0, Luy5;->f0:I

    .line 158
    .line 159
    :cond_9
    iget-object v4, p0, Luy5;->p0:Ljava/util/List;

    .line 160
    .line 161
    iput-object v4, v0, Lvy5;->o0:Ljava/util/List;

    .line 162
    .line 163
    and-int/lit16 v4, v2, 0x400

    .line 164
    .line 165
    const/16 v5, 0x400

    .line 166
    .line 167
    if-ne v4, v5, :cond_a

    .line 168
    .line 169
    iget-object v2, p0, Luy5;->q0:Ljava/util/List;

    .line 170
    .line 171
    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 172
    .line 173
    .line 174
    move-result-object v2

    .line 175
    iput-object v2, p0, Luy5;->q0:Ljava/util/List;

    .line 176
    .line 177
    iget v2, p0, Luy5;->f0:I

    .line 178
    .line 179
    and-int/lit16 v2, v2, -0x401

    .line 180
    .line 181
    iput v2, p0, Luy5;->f0:I

    .line 182
    .line 183
    :cond_a
    iget-object v4, p0, Luy5;->q0:Ljava/util/List;

    .line 184
    .line 185
    iput-object v4, v0, Lvy5;->q0:Ljava/util/List;

    .line 186
    .line 187
    and-int/lit16 v4, v2, 0x800

    .line 188
    .line 189
    const/16 v5, 0x800

    .line 190
    .line 191
    if-ne v4, v5, :cond_b

    .line 192
    .line 193
    iget-object v2, p0, Luy5;->r0:Ljava/util/List;

    .line 194
    .line 195
    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 196
    .line 197
    .line 198
    move-result-object v2

    .line 199
    iput-object v2, p0, Luy5;->r0:Ljava/util/List;

    .line 200
    .line 201
    iget v2, p0, Luy5;->f0:I

    .line 202
    .line 203
    and-int/lit16 v2, v2, -0x801

    .line 204
    .line 205
    iput v2, p0, Luy5;->f0:I

    .line 206
    .line 207
    :cond_b
    iget-object v4, p0, Luy5;->r0:Ljava/util/List;

    .line 208
    .line 209
    iput-object v4, v0, Lvy5;->r0:Ljava/util/List;

    .line 210
    .line 211
    and-int/lit16 v4, v1, 0x1000

    .line 212
    .line 213
    const/16 v5, 0x1000

    .line 214
    .line 215
    if-ne v4, v5, :cond_c

    .line 216
    .line 217
    or-int/lit16 v3, v3, 0x80

    .line 218
    .line 219
    :cond_c
    iget-object v4, p0, Luy5;->s0:Ltz5;

    .line 220
    .line 221
    iput-object v4, v0, Lvy5;->s0:Ltz5;

    .line 222
    .line 223
    and-int/lit16 v4, v2, 0x2000

    .line 224
    .line 225
    const/16 v5, 0x2000

    .line 226
    .line 227
    if-ne v4, v5, :cond_d

    .line 228
    .line 229
    iget-object v2, p0, Luy5;->t0:Ljava/util/List;

    .line 230
    .line 231
    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 232
    .line 233
    .line 234
    move-result-object v2

    .line 235
    iput-object v2, p0, Luy5;->t0:Ljava/util/List;

    .line 236
    .line 237
    iget v2, p0, Luy5;->f0:I

    .line 238
    .line 239
    and-int/lit16 v2, v2, -0x2001

    .line 240
    .line 241
    iput v2, p0, Luy5;->f0:I

    .line 242
    .line 243
    :cond_d
    iget-object v4, p0, Luy5;->t0:Ljava/util/List;

    .line 244
    .line 245
    iput-object v4, v0, Lvy5;->t0:Ljava/util/List;

    .line 246
    .line 247
    const/16 v4, 0x4000

    .line 248
    .line 249
    and-int/2addr v1, v4

    .line 250
    if-ne v1, v4, :cond_e

    .line 251
    .line 252
    or-int/lit16 v3, v3, 0x100

    .line 253
    .line 254
    :cond_e
    iget-object v1, p0, Luy5;->u0:Lky5;

    .line 255
    .line 256
    iput-object v1, v0, Lvy5;->u0:Lky5;

    .line 257
    .line 258
    const v1, 0x8000

    .line 259
    .line 260
    .line 261
    and-int v4, v2, v1

    .line 262
    .line 263
    if-ne v4, v1, :cond_f

    .line 264
    .line 265
    iget-object v1, p0, Luy5;->v0:Ljava/util/List;

    .line 266
    .line 267
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 268
    .line 269
    .line 270
    move-result-object v1

    .line 271
    iput-object v1, p0, Luy5;->v0:Ljava/util/List;

    .line 272
    .line 273
    iget v1, p0, Luy5;->f0:I

    .line 274
    .line 275
    const v2, -0x8001

    .line 276
    .line 277
    .line 278
    and-int/2addr v2, v1

    .line 279
    iput v2, p0, Luy5;->f0:I

    .line 280
    .line 281
    :cond_f
    iget-object v1, p0, Luy5;->v0:Ljava/util/List;

    .line 282
    .line 283
    iput-object v1, v0, Lvy5;->v0:Ljava/util/List;

    .line 284
    .line 285
    const/high16 v1, 0x10000

    .line 286
    .line 287
    and-int v4, v2, v1

    .line 288
    .line 289
    if-ne v4, v1, :cond_10

    .line 290
    .line 291
    iget-object v1, p0, Luy5;->w0:Ljava/util/List;

    .line 292
    .line 293
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 294
    .line 295
    .line 296
    move-result-object v1

    .line 297
    iput-object v1, p0, Luy5;->w0:Ljava/util/List;

    .line 298
    .line 299
    iget v1, p0, Luy5;->f0:I

    .line 300
    .line 301
    const v2, -0x10001

    .line 302
    .line 303
    .line 304
    and-int/2addr v2, v1

    .line 305
    iput v2, p0, Luy5;->f0:I

    .line 306
    .line 307
    :cond_10
    iget-object v1, p0, Luy5;->w0:Ljava/util/List;

    .line 308
    .line 309
    iput-object v1, v0, Lvy5;->w0:Ljava/util/List;

    .line 310
    .line 311
    const/high16 v1, 0x20000

    .line 312
    .line 313
    and-int/2addr v2, v1

    .line 314
    if-ne v2, v1, :cond_11

    .line 315
    .line 316
    iget-object v1, p0, Luy5;->x0:Ljava/util/List;

    .line 317
    .line 318
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 319
    .line 320
    .line 321
    move-result-object v1

    .line 322
    iput-object v1, p0, Luy5;->x0:Ljava/util/List;

    .line 323
    .line 324
    iget v1, p0, Luy5;->f0:I

    .line 325
    .line 326
    const v2, -0x20001

    .line 327
    .line 328
    .line 329
    and-int/2addr v1, v2

    .line 330
    iput v1, p0, Luy5;->f0:I

    .line 331
    .line 332
    :cond_11
    iget-object p0, p0, Luy5;->x0:Ljava/util/List;

    .line 333
    .line 334
    iput-object p0, v0, Lvy5;->x0:Ljava/util/List;

    .line 335
    .line 336
    iput v3, v0, Lvy5;->Z:I

    .line 337
    .line 338
    return-object v0
.end method

.method public final i(Lvy5;)V
    .locals 5

    .line 1
    sget-object v0, Lvy5;->A0:Lvy5;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget v0, p1, Lvy5;->Z:I

    .line 7
    .line 8
    and-int/lit8 v1, v0, 0x1

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    if-ne v1, v2, :cond_1

    .line 12
    .line 13
    iget v1, p1, Lvy5;->f0:I

    .line 14
    .line 15
    iget v3, p0, Luy5;->f0:I

    .line 16
    .line 17
    or-int/2addr v2, v3

    .line 18
    iput v2, p0, Luy5;->f0:I

    .line 19
    .line 20
    iput v1, p0, Luy5;->g0:I

    .line 21
    .line 22
    :cond_1
    and-int/lit8 v1, v0, 0x2

    .line 23
    .line 24
    const/4 v2, 0x2

    .line 25
    if-ne v1, v2, :cond_2

    .line 26
    .line 27
    iget v1, p1, Lvy5;->g0:I

    .line 28
    .line 29
    iget v3, p0, Luy5;->f0:I

    .line 30
    .line 31
    or-int/2addr v2, v3

    .line 32
    iput v2, p0, Luy5;->f0:I

    .line 33
    .line 34
    iput v1, p0, Luy5;->h0:I

    .line 35
    .line 36
    :cond_2
    and-int/lit8 v1, v0, 0x4

    .line 37
    .line 38
    const/4 v2, 0x4

    .line 39
    if-ne v1, v2, :cond_3

    .line 40
    .line 41
    iget v1, p1, Lvy5;->h0:I

    .line 42
    .line 43
    iget v3, p0, Luy5;->f0:I

    .line 44
    .line 45
    or-int/2addr v2, v3

    .line 46
    iput v2, p0, Luy5;->f0:I

    .line 47
    .line 48
    iput v1, p0, Luy5;->i0:I

    .line 49
    .line 50
    :cond_3
    const/16 v1, 0x8

    .line 51
    .line 52
    and-int/2addr v0, v1

    .line 53
    if-ne v0, v1, :cond_5

    .line 54
    .line 55
    iget-object v0, p1, Lvy5;->i0:Lnz5;

    .line 56
    .line 57
    iget v2, p0, Luy5;->f0:I

    .line 58
    .line 59
    and-int/2addr v2, v1

    .line 60
    if-ne v2, v1, :cond_4

    .line 61
    .line 62
    iget-object v2, p0, Luy5;->j0:Lnz5;

    .line 63
    .line 64
    sget-object v3, Lnz5;->w0:Lnz5;

    .line 65
    .line 66
    if-eq v2, v3, :cond_4

    .line 67
    .line 68
    invoke-static {v2}, Lnz5;->r(Lnz5;)Lmz5;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    invoke-virtual {v2, v0}, Lmz5;->i(Lnz5;)Lmz5;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2}, Lmz5;->g()Lnz5;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    iput-object v0, p0, Luy5;->j0:Lnz5;

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_4
    iput-object v0, p0, Luy5;->j0:Lnz5;

    .line 83
    .line 84
    :goto_0
    iget v0, p0, Luy5;->f0:I

    .line 85
    .line 86
    or-int/2addr v0, v1

    .line 87
    iput v0, p0, Luy5;->f0:I

    .line 88
    .line 89
    :cond_5
    iget v0, p1, Lvy5;->Z:I

    .line 90
    .line 91
    const/16 v1, 0x10

    .line 92
    .line 93
    and-int/2addr v0, v1

    .line 94
    if-ne v0, v1, :cond_6

    .line 95
    .line 96
    iget v0, p1, Lvy5;->j0:I

    .line 97
    .line 98
    iget v2, p0, Luy5;->f0:I

    .line 99
    .line 100
    or-int/2addr v1, v2

    .line 101
    iput v1, p0, Luy5;->f0:I

    .line 102
    .line 103
    iput v0, p0, Luy5;->k0:I

    .line 104
    .line 105
    :cond_6
    iget-object v0, p1, Lvy5;->k0:Ljava/util/List;

    .line 106
    .line 107
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    const/16 v1, 0x20

    .line 112
    .line 113
    if-nez v0, :cond_9

    .line 114
    .line 115
    iget-object v0, p0, Luy5;->l0:Ljava/util/List;

    .line 116
    .line 117
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    if-eqz v0, :cond_7

    .line 122
    .line 123
    iget-object v0, p1, Lvy5;->k0:Ljava/util/List;

    .line 124
    .line 125
    iput-object v0, p0, Luy5;->l0:Ljava/util/List;

    .line 126
    .line 127
    iget v0, p0, Luy5;->f0:I

    .line 128
    .line 129
    and-int/lit8 v0, v0, -0x21

    .line 130
    .line 131
    iput v0, p0, Luy5;->f0:I

    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_7
    iget v0, p0, Luy5;->f0:I

    .line 135
    .line 136
    and-int/2addr v0, v1

    .line 137
    if-eq v0, v1, :cond_8

    .line 138
    .line 139
    new-instance v0, Ljava/util/ArrayList;

    .line 140
    .line 141
    iget-object v2, p0, Luy5;->l0:Ljava/util/List;

    .line 142
    .line 143
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 144
    .line 145
    .line 146
    iput-object v0, p0, Luy5;->l0:Ljava/util/List;

    .line 147
    .line 148
    iget v0, p0, Luy5;->f0:I

    .line 149
    .line 150
    or-int/2addr v0, v1

    .line 151
    iput v0, p0, Luy5;->f0:I

    .line 152
    .line 153
    :cond_8
    iget-object v0, p0, Luy5;->l0:Ljava/util/List;

    .line 154
    .line 155
    iget-object v2, p1, Lvy5;->k0:Ljava/util/List;

    .line 156
    .line 157
    invoke-interface {v0, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 158
    .line 159
    .line 160
    :cond_9
    :goto_1
    iget v0, p1, Lvy5;->Z:I

    .line 161
    .line 162
    and-int/2addr v0, v1

    .line 163
    const/16 v2, 0x40

    .line 164
    .line 165
    if-ne v0, v1, :cond_b

    .line 166
    .line 167
    iget-object v0, p1, Lvy5;->l0:Lnz5;

    .line 168
    .line 169
    iget v1, p0, Luy5;->f0:I

    .line 170
    .line 171
    and-int/2addr v1, v2

    .line 172
    if-ne v1, v2, :cond_a

    .line 173
    .line 174
    iget-object v1, p0, Luy5;->m0:Lnz5;

    .line 175
    .line 176
    sget-object v3, Lnz5;->w0:Lnz5;

    .line 177
    .line 178
    if-eq v1, v3, :cond_a

    .line 179
    .line 180
    invoke-static {v1}, Lnz5;->r(Lnz5;)Lmz5;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    invoke-virtual {v1, v0}, Lmz5;->i(Lnz5;)Lmz5;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v1}, Lmz5;->g()Lnz5;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    iput-object v0, p0, Luy5;->m0:Lnz5;

    .line 192
    .line 193
    goto :goto_2

    .line 194
    :cond_a
    iput-object v0, p0, Luy5;->m0:Lnz5;

    .line 195
    .line 196
    :goto_2
    iget v0, p0, Luy5;->f0:I

    .line 197
    .line 198
    or-int/2addr v0, v2

    .line 199
    iput v0, p0, Luy5;->f0:I

    .line 200
    .line 201
    :cond_b
    iget v0, p1, Lvy5;->Z:I

    .line 202
    .line 203
    and-int/2addr v0, v2

    .line 204
    const/16 v1, 0x80

    .line 205
    .line 206
    if-ne v0, v2, :cond_c

    .line 207
    .line 208
    iget v0, p1, Lvy5;->m0:I

    .line 209
    .line 210
    iget v2, p0, Luy5;->f0:I

    .line 211
    .line 212
    or-int/2addr v2, v1

    .line 213
    iput v2, p0, Luy5;->f0:I

    .line 214
    .line 215
    iput v0, p0, Luy5;->n0:I

    .line 216
    .line 217
    :cond_c
    iget-object v0, p1, Lvy5;->n0:Ljava/util/List;

    .line 218
    .line 219
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 220
    .line 221
    .line 222
    move-result v0

    .line 223
    const/16 v2, 0x100

    .line 224
    .line 225
    if-nez v0, :cond_f

    .line 226
    .line 227
    iget-object v0, p0, Luy5;->o0:Ljava/util/List;

    .line 228
    .line 229
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 230
    .line 231
    .line 232
    move-result v0

    .line 233
    if-eqz v0, :cond_d

    .line 234
    .line 235
    iget-object v0, p1, Lvy5;->n0:Ljava/util/List;

    .line 236
    .line 237
    iput-object v0, p0, Luy5;->o0:Ljava/util/List;

    .line 238
    .line 239
    iget v0, p0, Luy5;->f0:I

    .line 240
    .line 241
    and-int/lit16 v0, v0, -0x101

    .line 242
    .line 243
    iput v0, p0, Luy5;->f0:I

    .line 244
    .line 245
    goto :goto_3

    .line 246
    :cond_d
    iget v0, p0, Luy5;->f0:I

    .line 247
    .line 248
    and-int/2addr v0, v2

    .line 249
    if-eq v0, v2, :cond_e

    .line 250
    .line 251
    new-instance v0, Ljava/util/ArrayList;

    .line 252
    .line 253
    iget-object v3, p0, Luy5;->o0:Ljava/util/List;

    .line 254
    .line 255
    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 256
    .line 257
    .line 258
    iput-object v0, p0, Luy5;->o0:Ljava/util/List;

    .line 259
    .line 260
    iget v0, p0, Luy5;->f0:I

    .line 261
    .line 262
    or-int/2addr v0, v2

    .line 263
    iput v0, p0, Luy5;->f0:I

    .line 264
    .line 265
    :cond_e
    iget-object v0, p0, Luy5;->o0:Ljava/util/List;

    .line 266
    .line 267
    iget-object v3, p1, Lvy5;->n0:Ljava/util/List;

    .line 268
    .line 269
    invoke-interface {v0, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 270
    .line 271
    .line 272
    :cond_f
    :goto_3
    iget-object v0, p1, Lvy5;->o0:Ljava/util/List;

    .line 273
    .line 274
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 275
    .line 276
    .line 277
    move-result v0

    .line 278
    if-nez v0, :cond_12

    .line 279
    .line 280
    iget-object v0, p0, Luy5;->p0:Ljava/util/List;

    .line 281
    .line 282
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 283
    .line 284
    .line 285
    move-result v0

    .line 286
    if-eqz v0, :cond_10

    .line 287
    .line 288
    iget-object v0, p1, Lvy5;->o0:Ljava/util/List;

    .line 289
    .line 290
    iput-object v0, p0, Luy5;->p0:Ljava/util/List;

    .line 291
    .line 292
    iget v0, p0, Luy5;->f0:I

    .line 293
    .line 294
    and-int/lit16 v0, v0, -0x201

    .line 295
    .line 296
    iput v0, p0, Luy5;->f0:I

    .line 297
    .line 298
    goto :goto_4

    .line 299
    :cond_10
    iget v0, p0, Luy5;->f0:I

    .line 300
    .line 301
    const/16 v3, 0x200

    .line 302
    .line 303
    and-int/2addr v0, v3

    .line 304
    if-eq v0, v3, :cond_11

    .line 305
    .line 306
    new-instance v0, Ljava/util/ArrayList;

    .line 307
    .line 308
    iget-object v4, p0, Luy5;->p0:Ljava/util/List;

    .line 309
    .line 310
    invoke-direct {v0, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 311
    .line 312
    .line 313
    iput-object v0, p0, Luy5;->p0:Ljava/util/List;

    .line 314
    .line 315
    iget v0, p0, Luy5;->f0:I

    .line 316
    .line 317
    or-int/2addr v0, v3

    .line 318
    iput v0, p0, Luy5;->f0:I

    .line 319
    .line 320
    :cond_11
    iget-object v0, p0, Luy5;->p0:Ljava/util/List;

    .line 321
    .line 322
    iget-object v3, p1, Lvy5;->o0:Ljava/util/List;

    .line 323
    .line 324
    invoke-interface {v0, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 325
    .line 326
    .line 327
    :cond_12
    :goto_4
    iget-object v0, p1, Lvy5;->q0:Ljava/util/List;

    .line 328
    .line 329
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 330
    .line 331
    .line 332
    move-result v0

    .line 333
    if-nez v0, :cond_15

    .line 334
    .line 335
    iget-object v0, p0, Luy5;->q0:Ljava/util/List;

    .line 336
    .line 337
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 338
    .line 339
    .line 340
    move-result v0

    .line 341
    if-eqz v0, :cond_13

    .line 342
    .line 343
    iget-object v0, p1, Lvy5;->q0:Ljava/util/List;

    .line 344
    .line 345
    iput-object v0, p0, Luy5;->q0:Ljava/util/List;

    .line 346
    .line 347
    iget v0, p0, Luy5;->f0:I

    .line 348
    .line 349
    and-int/lit16 v0, v0, -0x401

    .line 350
    .line 351
    iput v0, p0, Luy5;->f0:I

    .line 352
    .line 353
    goto :goto_5

    .line 354
    :cond_13
    iget v0, p0, Luy5;->f0:I

    .line 355
    .line 356
    const/16 v3, 0x400

    .line 357
    .line 358
    and-int/2addr v0, v3

    .line 359
    if-eq v0, v3, :cond_14

    .line 360
    .line 361
    new-instance v0, Ljava/util/ArrayList;

    .line 362
    .line 363
    iget-object v4, p0, Luy5;->q0:Ljava/util/List;

    .line 364
    .line 365
    invoke-direct {v0, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 366
    .line 367
    .line 368
    iput-object v0, p0, Luy5;->q0:Ljava/util/List;

    .line 369
    .line 370
    iget v0, p0, Luy5;->f0:I

    .line 371
    .line 372
    or-int/2addr v0, v3

    .line 373
    iput v0, p0, Luy5;->f0:I

    .line 374
    .line 375
    :cond_14
    iget-object v0, p0, Luy5;->q0:Ljava/util/List;

    .line 376
    .line 377
    iget-object v3, p1, Lvy5;->q0:Ljava/util/List;

    .line 378
    .line 379
    invoke-interface {v0, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 380
    .line 381
    .line 382
    :cond_15
    :goto_5
    iget-object v0, p1, Lvy5;->r0:Ljava/util/List;

    .line 383
    .line 384
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 385
    .line 386
    .line 387
    move-result v0

    .line 388
    if-nez v0, :cond_18

    .line 389
    .line 390
    iget-object v0, p0, Luy5;->r0:Ljava/util/List;

    .line 391
    .line 392
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 393
    .line 394
    .line 395
    move-result v0

    .line 396
    if-eqz v0, :cond_16

    .line 397
    .line 398
    iget-object v0, p1, Lvy5;->r0:Ljava/util/List;

    .line 399
    .line 400
    iput-object v0, p0, Luy5;->r0:Ljava/util/List;

    .line 401
    .line 402
    iget v0, p0, Luy5;->f0:I

    .line 403
    .line 404
    and-int/lit16 v0, v0, -0x801

    .line 405
    .line 406
    iput v0, p0, Luy5;->f0:I

    .line 407
    .line 408
    goto :goto_6

    .line 409
    :cond_16
    iget v0, p0, Luy5;->f0:I

    .line 410
    .line 411
    const/16 v3, 0x800

    .line 412
    .line 413
    and-int/2addr v0, v3

    .line 414
    if-eq v0, v3, :cond_17

    .line 415
    .line 416
    new-instance v0, Ljava/util/ArrayList;

    .line 417
    .line 418
    iget-object v4, p0, Luy5;->r0:Ljava/util/List;

    .line 419
    .line 420
    invoke-direct {v0, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 421
    .line 422
    .line 423
    iput-object v0, p0, Luy5;->r0:Ljava/util/List;

    .line 424
    .line 425
    iget v0, p0, Luy5;->f0:I

    .line 426
    .line 427
    or-int/2addr v0, v3

    .line 428
    iput v0, p0, Luy5;->f0:I

    .line 429
    .line 430
    :cond_17
    iget-object v0, p0, Luy5;->r0:Ljava/util/List;

    .line 431
    .line 432
    iget-object v3, p1, Lvy5;->r0:Ljava/util/List;

    .line 433
    .line 434
    invoke-interface {v0, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 435
    .line 436
    .line 437
    :cond_18
    :goto_6
    iget v0, p1, Lvy5;->Z:I

    .line 438
    .line 439
    and-int/2addr v0, v1

    .line 440
    if-ne v0, v1, :cond_1a

    .line 441
    .line 442
    iget-object v0, p1, Lvy5;->s0:Ltz5;

    .line 443
    .line 444
    iget v1, p0, Luy5;->f0:I

    .line 445
    .line 446
    const/16 v3, 0x1000

    .line 447
    .line 448
    and-int/2addr v1, v3

    .line 449
    if-ne v1, v3, :cond_19

    .line 450
    .line 451
    iget-object v1, p0, Luy5;->s0:Ltz5;

    .line 452
    .line 453
    sget-object v4, Ltz5;->i0:Ltz5;

    .line 454
    .line 455
    if-eq v1, v4, :cond_19

    .line 456
    .line 457
    invoke-static {v1}, Ltz5;->i(Ltz5;)Lby5;

    .line 458
    .line 459
    .line 460
    move-result-object v1

    .line 461
    invoke-virtual {v1, v0}, Lby5;->i(Ltz5;)V

    .line 462
    .line 463
    .line 464
    invoke-virtual {v1}, Lby5;->g()Ltz5;

    .line 465
    .line 466
    .line 467
    move-result-object v0

    .line 468
    iput-object v0, p0, Luy5;->s0:Ltz5;

    .line 469
    .line 470
    goto :goto_7

    .line 471
    :cond_19
    iput-object v0, p0, Luy5;->s0:Ltz5;

    .line 472
    .line 473
    :goto_7
    iget v0, p0, Luy5;->f0:I

    .line 474
    .line 475
    or-int/2addr v0, v3

    .line 476
    iput v0, p0, Luy5;->f0:I

    .line 477
    .line 478
    :cond_1a
    iget-object v0, p1, Lvy5;->t0:Ljava/util/List;

    .line 479
    .line 480
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 481
    .line 482
    .line 483
    move-result v0

    .line 484
    if-nez v0, :cond_1d

    .line 485
    .line 486
    iget-object v0, p0, Luy5;->t0:Ljava/util/List;

    .line 487
    .line 488
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 489
    .line 490
    .line 491
    move-result v0

    .line 492
    if-eqz v0, :cond_1b

    .line 493
    .line 494
    iget-object v0, p1, Lvy5;->t0:Ljava/util/List;

    .line 495
    .line 496
    iput-object v0, p0, Luy5;->t0:Ljava/util/List;

    .line 497
    .line 498
    iget v0, p0, Luy5;->f0:I

    .line 499
    .line 500
    and-int/lit16 v0, v0, -0x2001

    .line 501
    .line 502
    iput v0, p0, Luy5;->f0:I

    .line 503
    .line 504
    goto :goto_8

    .line 505
    :cond_1b
    iget v0, p0, Luy5;->f0:I

    .line 506
    .line 507
    const/16 v1, 0x2000

    .line 508
    .line 509
    and-int/2addr v0, v1

    .line 510
    if-eq v0, v1, :cond_1c

    .line 511
    .line 512
    new-instance v0, Ljava/util/ArrayList;

    .line 513
    .line 514
    iget-object v3, p0, Luy5;->t0:Ljava/util/List;

    .line 515
    .line 516
    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 517
    .line 518
    .line 519
    iput-object v0, p0, Luy5;->t0:Ljava/util/List;

    .line 520
    .line 521
    iget v0, p0, Luy5;->f0:I

    .line 522
    .line 523
    or-int/2addr v0, v1

    .line 524
    iput v0, p0, Luy5;->f0:I

    .line 525
    .line 526
    :cond_1c
    iget-object v0, p0, Luy5;->t0:Ljava/util/List;

    .line 527
    .line 528
    iget-object v1, p1, Lvy5;->t0:Ljava/util/List;

    .line 529
    .line 530
    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 531
    .line 532
    .line 533
    :cond_1d
    :goto_8
    iget v0, p1, Lvy5;->Z:I

    .line 534
    .line 535
    and-int/2addr v0, v2

    .line 536
    if-ne v0, v2, :cond_1f

    .line 537
    .line 538
    iget-object v0, p1, Lvy5;->u0:Lky5;

    .line 539
    .line 540
    iget v1, p0, Luy5;->f0:I

    .line 541
    .line 542
    const/16 v2, 0x4000

    .line 543
    .line 544
    and-int/2addr v1, v2

    .line 545
    if-ne v1, v2, :cond_1e

    .line 546
    .line 547
    iget-object v1, p0, Luy5;->u0:Lky5;

    .line 548
    .line 549
    sget-object v3, Lky5;->g0:Lky5;

    .line 550
    .line 551
    if-eq v1, v3, :cond_1e

    .line 552
    .line 553
    invoke-static {v1}, Lky5;->i(Lky5;)Ljy5;

    .line 554
    .line 555
    .line 556
    move-result-object v1

    .line 557
    invoke-virtual {v1, v0}, Ljy5;->j(Lky5;)V

    .line 558
    .line 559
    .line 560
    invoke-virtual {v1}, Ljy5;->f()Lky5;

    .line 561
    .line 562
    .line 563
    move-result-object v0

    .line 564
    iput-object v0, p0, Luy5;->u0:Lky5;

    .line 565
    .line 566
    goto :goto_9

    .line 567
    :cond_1e
    iput-object v0, p0, Luy5;->u0:Lky5;

    .line 568
    .line 569
    :goto_9
    iget v0, p0, Luy5;->f0:I

    .line 570
    .line 571
    or-int/2addr v0, v2

    .line 572
    iput v0, p0, Luy5;->f0:I

    .line 573
    .line 574
    :cond_1f
    iget-object v0, p1, Lvy5;->v0:Ljava/util/List;

    .line 575
    .line 576
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 577
    .line 578
    .line 579
    move-result v0

    .line 580
    if-nez v0, :cond_22

    .line 581
    .line 582
    iget-object v0, p0, Luy5;->v0:Ljava/util/List;

    .line 583
    .line 584
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 585
    .line 586
    .line 587
    move-result v0

    .line 588
    if-eqz v0, :cond_20

    .line 589
    .line 590
    iget-object v0, p1, Lvy5;->v0:Ljava/util/List;

    .line 591
    .line 592
    iput-object v0, p0, Luy5;->v0:Ljava/util/List;

    .line 593
    .line 594
    iget v0, p0, Luy5;->f0:I

    .line 595
    .line 596
    const v1, -0x8001

    .line 597
    .line 598
    .line 599
    and-int/2addr v0, v1

    .line 600
    iput v0, p0, Luy5;->f0:I

    .line 601
    .line 602
    goto :goto_a

    .line 603
    :cond_20
    iget v0, p0, Luy5;->f0:I

    .line 604
    .line 605
    const v1, 0x8000

    .line 606
    .line 607
    .line 608
    and-int/2addr v0, v1

    .line 609
    if-eq v0, v1, :cond_21

    .line 610
    .line 611
    new-instance v0, Ljava/util/ArrayList;

    .line 612
    .line 613
    iget-object v2, p0, Luy5;->v0:Ljava/util/List;

    .line 614
    .line 615
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 616
    .line 617
    .line 618
    iput-object v0, p0, Luy5;->v0:Ljava/util/List;

    .line 619
    .line 620
    iget v0, p0, Luy5;->f0:I

    .line 621
    .line 622
    or-int/2addr v0, v1

    .line 623
    iput v0, p0, Luy5;->f0:I

    .line 624
    .line 625
    :cond_21
    iget-object v0, p0, Luy5;->v0:Ljava/util/List;

    .line 626
    .line 627
    iget-object v1, p1, Lvy5;->v0:Ljava/util/List;

    .line 628
    .line 629
    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 630
    .line 631
    .line 632
    :cond_22
    :goto_a
    iget-object v0, p1, Lvy5;->w0:Ljava/util/List;

    .line 633
    .line 634
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 635
    .line 636
    .line 637
    move-result v0

    .line 638
    if-nez v0, :cond_25

    .line 639
    .line 640
    iget-object v0, p0, Luy5;->w0:Ljava/util/List;

    .line 641
    .line 642
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 643
    .line 644
    .line 645
    move-result v0

    .line 646
    if-eqz v0, :cond_23

    .line 647
    .line 648
    iget-object v0, p1, Lvy5;->w0:Ljava/util/List;

    .line 649
    .line 650
    iput-object v0, p0, Luy5;->w0:Ljava/util/List;

    .line 651
    .line 652
    iget v0, p0, Luy5;->f0:I

    .line 653
    .line 654
    const v1, -0x10001

    .line 655
    .line 656
    .line 657
    and-int/2addr v0, v1

    .line 658
    iput v0, p0, Luy5;->f0:I

    .line 659
    .line 660
    goto :goto_b

    .line 661
    :cond_23
    iget v0, p0, Luy5;->f0:I

    .line 662
    .line 663
    const/high16 v1, 0x10000

    .line 664
    .line 665
    and-int/2addr v0, v1

    .line 666
    if-eq v0, v1, :cond_24

    .line 667
    .line 668
    new-instance v0, Ljava/util/ArrayList;

    .line 669
    .line 670
    iget-object v2, p0, Luy5;->w0:Ljava/util/List;

    .line 671
    .line 672
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 673
    .line 674
    .line 675
    iput-object v0, p0, Luy5;->w0:Ljava/util/List;

    .line 676
    .line 677
    iget v0, p0, Luy5;->f0:I

    .line 678
    .line 679
    or-int/2addr v0, v1

    .line 680
    iput v0, p0, Luy5;->f0:I

    .line 681
    .line 682
    :cond_24
    iget-object v0, p0, Luy5;->w0:Ljava/util/List;

    .line 683
    .line 684
    iget-object v1, p1, Lvy5;->w0:Ljava/util/List;

    .line 685
    .line 686
    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 687
    .line 688
    .line 689
    :cond_25
    :goto_b
    iget-object v0, p1, Lvy5;->x0:Ljava/util/List;

    .line 690
    .line 691
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 692
    .line 693
    .line 694
    move-result v0

    .line 695
    if-nez v0, :cond_28

    .line 696
    .line 697
    iget-object v0, p0, Luy5;->x0:Ljava/util/List;

    .line 698
    .line 699
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 700
    .line 701
    .line 702
    move-result v0

    .line 703
    if-eqz v0, :cond_26

    .line 704
    .line 705
    iget-object v0, p1, Lvy5;->x0:Ljava/util/List;

    .line 706
    .line 707
    iput-object v0, p0, Luy5;->x0:Ljava/util/List;

    .line 708
    .line 709
    iget v0, p0, Luy5;->f0:I

    .line 710
    .line 711
    const v1, -0x20001

    .line 712
    .line 713
    .line 714
    and-int/2addr v0, v1

    .line 715
    iput v0, p0, Luy5;->f0:I

    .line 716
    .line 717
    goto :goto_c

    .line 718
    :cond_26
    iget v0, p0, Luy5;->f0:I

    .line 719
    .line 720
    const/high16 v1, 0x20000

    .line 721
    .line 722
    and-int/2addr v0, v1

    .line 723
    if-eq v0, v1, :cond_27

    .line 724
    .line 725
    new-instance v0, Ljava/util/ArrayList;

    .line 726
    .line 727
    iget-object v2, p0, Luy5;->x0:Ljava/util/List;

    .line 728
    .line 729
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 730
    .line 731
    .line 732
    iput-object v0, p0, Luy5;->x0:Ljava/util/List;

    .line 733
    .line 734
    iget v0, p0, Luy5;->f0:I

    .line 735
    .line 736
    or-int/2addr v0, v1

    .line 737
    iput v0, p0, Luy5;->f0:I

    .line 738
    .line 739
    :cond_27
    iget-object v0, p0, Luy5;->x0:Ljava/util/List;

    .line 740
    .line 741
    iget-object v1, p1, Lvy5;->x0:Ljava/util/List;

    .line 742
    .line 743
    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 744
    .line 745
    .line 746
    :cond_28
    :goto_c
    invoke-virtual {p0, p1}, Lxp2;->f(Lyp2;)V

    .line 747
    .line 748
    .line 749
    iget-object v0, p0, Lup2;->X:Ljb0;

    .line 750
    .line 751
    iget-object p1, p1, Lvy5;->Y:Ljb0;

    .line 752
    .line 753
    invoke-virtual {v0, p1}, Ljb0;->b(Ljb0;)Ljb0;

    .line 754
    .line 755
    .line 756
    move-result-object p1

    .line 757
    iput-object p1, p0, Lup2;->X:Ljb0;

    .line 758
    .line 759
    return-void
.end method
