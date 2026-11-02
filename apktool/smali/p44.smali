.class public final Lp44;
.super Lks0;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final i0:Lz47;

.field public final j0:Lta6;

.field public final k0:Lsx4;

.field public final l0:Lz47;

.field public final m0:Lvz7;

.field public final n0:Lus0;

.field public final o0:Lfx4;

.field public final p0:Ll5;

.field public final q0:Z

.field public final r0:Lul1;

.field public final s0:Lt44;

.field public final t0:Lgx6;

.field public final u0:Ldd3;

.field public final v0:Lh54;

.field public final w0:Ln44;

.field public final x0:Lte4;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    const-string v5, "notifyAll"

    .line 2
    .line 3
    const-string v6, "toString"

    .line 4
    .line 5
    const-string v0, "equals"

    .line 6
    .line 7
    const-string v1, "hashCode"

    .line 8
    .line 9
    const-string v2, "getClass"

    .line 10
    .line 11
    const-string v3, "wait"

    .line 12
    .line 13
    const-string v4, "notify"

    .line 14
    .line 15
    filled-new-array/range {v0 .. v6}, [Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {v0}, Leu;->L0([Ljava/lang/Object;)Ljava/util/Set;

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public constructor <init>(Lz47;Led1;Lta6;Lsx4;)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object v0, p1, Lz47;->Y:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Lc6;

    .line 13
    .line 14
    iget-object v0, v0, Lc6;->f0:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Lve4;

    .line 17
    .line 18
    invoke-virtual {p3}, Lta6;->e()Lv15;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-static {p3}, Llh4;->Z0(Lfk3;)Lhr6;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-direct {p0, v0, p2, v1, v2}, Lks0;-><init>(Lve4;Led1;Lv15;Lke7;)V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Lp44;->i0:Lz47;

    .line 30
    .line 31
    iput-object p3, p0, Lp44;->j0:Lta6;

    .line 32
    .line 33
    iput-object p4, p0, Lp44;->k0:Lsx4;

    .line 34
    .line 35
    const/4 p2, 0x4

    .line 36
    invoke-static {p1, p0, p3, p2}, Lpu;->k(Lz47;Lbt0;Lta6;I)Lz47;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    iput-object v1, p0, Lp44;->l0:Lz47;

    .line 41
    .line 42
    iget-object p1, v1, Lz47;->Y:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p1, Lc6;

    .line 45
    .line 46
    iget-object p1, p1, Lc6;->f0:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p1, Lve4;

    .line 49
    .line 50
    new-instance p2, Lo44;

    .line 51
    .line 52
    const/4 v0, 0x0

    .line 53
    invoke-direct {p2, p0, v0}, Lo44;-><init>(Lp44;B)V

    .line 54
    .line 55
    .line 56
    new-instance v2, Lvz7;

    .line 57
    .line 58
    invoke-direct {v2, p2}, Lvz7;-><init>(Ldn2;)V

    .line 59
    .line 60
    .line 61
    iput-object v2, p0, Lp44;->m0:Lvz7;

    .line 62
    .line 63
    iget-object p2, p3, Lta6;->a:Ljava/lang/Class;

    .line 64
    .line 65
    invoke-virtual {p2}, Ljava/lang/Class;->isAnnotation()Z

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    if-eqz v2, :cond_0

    .line 70
    .line 71
    sget-object v2, Lus0;->g0:Lus0;

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Class;->isInterface()Z

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    if-eqz v2, :cond_1

    .line 79
    .line 80
    sget-object v2, Lus0;->Y:Lus0;

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_1
    invoke-virtual {p2}, Ljava/lang/Class;->isEnum()Z

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    if-eqz v2, :cond_2

    .line 88
    .line 89
    sget-object v2, Lus0;->Z:Lus0;

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_2
    sget-object v2, Lus0;->X:Lus0;

    .line 93
    .line 94
    :goto_0
    iput-object v2, p0, Lp44;->n0:Lus0;

    .line 95
    .line 96
    invoke-virtual {p2}, Ljava/lang/Class;->isAnnotation()Z

    .line 97
    .line 98
    .line 99
    move-result v2

    .line 100
    sget-object v3, Lfx4;->Y:Lfx4;

    .line 101
    .line 102
    const/4 v6, 0x1

    .line 103
    if-nez v2, :cond_a

    .line 104
    .line 105
    invoke-virtual {p2}, Ljava/lang/Class;->isEnum()Z

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    if-eqz v2, :cond_3

    .line 110
    .line 111
    goto :goto_5

    .line 112
    :cond_3
    invoke-static {p2}, Lz68;->r0(Ljava/lang/Class;)Ljava/lang/Boolean;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    if-eqz v2, :cond_4

    .line 117
    .line 118
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 119
    .line 120
    .line 121
    move-result v2

    .line 122
    goto :goto_1

    .line 123
    :cond_4
    move v2, v0

    .line 124
    :goto_1
    invoke-static {p2}, Lz68;->r0(Ljava/lang/Class;)Ljava/lang/Boolean;

    .line 125
    .line 126
    .line 127
    move-result-object v4

    .line 128
    if-eqz v4, :cond_5

    .line 129
    .line 130
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 131
    .line 132
    .line 133
    move-result v4

    .line 134
    goto :goto_2

    .line 135
    :cond_5
    move v4, v0

    .line 136
    :goto_2
    if-nez v4, :cond_7

    .line 137
    .line 138
    invoke-virtual {p2}, Ljava/lang/Class;->getModifiers()I

    .line 139
    .line 140
    .line 141
    move-result v4

    .line 142
    invoke-static {v4}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 143
    .line 144
    .line 145
    move-result v4

    .line 146
    if-nez v4, :cond_7

    .line 147
    .line 148
    invoke-virtual {p2}, Ljava/lang/Class;->isInterface()Z

    .line 149
    .line 150
    .line 151
    move-result v4

    .line 152
    if-eqz v4, :cond_6

    .line 153
    .line 154
    goto :goto_3

    .line 155
    :cond_6
    move v4, v0

    .line 156
    goto :goto_4

    .line 157
    :cond_7
    :goto_3
    move v4, v6

    .line 158
    :goto_4
    invoke-virtual {p2}, Ljava/lang/Class;->getModifiers()I

    .line 159
    .line 160
    .line 161
    move-result v5

    .line 162
    invoke-static {v5}, Ljava/lang/reflect/Modifier;->isFinal(I)Z

    .line 163
    .line 164
    .line 165
    move-result v5

    .line 166
    sget-object v7, Lfx4;->X:Lk32;

    .line 167
    .line 168
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 169
    .line 170
    .line 171
    if-eqz v2, :cond_8

    .line 172
    .line 173
    sget-object v3, Lfx4;->Z:Lfx4;

    .line 174
    .line 175
    goto :goto_5

    .line 176
    :cond_8
    if-eqz v4, :cond_9

    .line 177
    .line 178
    sget-object v3, Lfx4;->g0:Lfx4;

    .line 179
    .line 180
    goto :goto_5

    .line 181
    :cond_9
    if-nez v5, :cond_a

    .line 182
    .line 183
    sget-object v3, Lfx4;->f0:Lfx4;

    .line 184
    .line 185
    :cond_a
    :goto_5
    iput-object v3, p0, Lp44;->o0:Lfx4;

    .line 186
    .line 187
    invoke-virtual {p2}, Ljava/lang/Class;->getModifiers()I

    .line 188
    .line 189
    .line 190
    move-result v2

    .line 191
    invoke-static {v2}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    .line 192
    .line 193
    .line 194
    move-result v3

    .line 195
    if-eqz v3, :cond_b

    .line 196
    .line 197
    sget-object v2, Laz8;->f0:Laz8;

    .line 198
    .line 199
    goto :goto_6

    .line 200
    :cond_b
    invoke-static {v2}, Ljava/lang/reflect/Modifier;->isPrivate(I)Z

    .line 201
    .line 202
    .line 203
    move-result v3

    .line 204
    if-eqz v3, :cond_c

    .line 205
    .line 206
    sget-object v2, Lxy8;->f0:Lxy8;

    .line 207
    .line 208
    goto :goto_6

    .line 209
    :cond_c
    invoke-static {v2}, Ljava/lang/reflect/Modifier;->isProtected(I)Z

    .line 210
    .line 211
    .line 212
    move-result v3

    .line 213
    if-eqz v3, :cond_e

    .line 214
    .line 215
    invoke-static {v2}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 216
    .line 217
    .line 218
    move-result v2

    .line 219
    if-eqz v2, :cond_d

    .line 220
    .line 221
    sget-object v2, Lxl3;->f0:Lxl3;

    .line 222
    .line 223
    goto :goto_6

    .line 224
    :cond_d
    sget-object v2, Lwl3;->f0:Lwl3;

    .line 225
    .line 226
    goto :goto_6

    .line 227
    :cond_e
    sget-object v2, Lvl3;->f0:Lvl3;

    .line 228
    .line 229
    :goto_6
    iput-object v2, p0, Lp44;->p0:Ll5;

    .line 230
    .line 231
    invoke-virtual {p2}, Ljava/lang/Class;->getDeclaringClass()Ljava/lang/Class;

    .line 232
    .line 233
    .line 234
    move-result-object v2

    .line 235
    if-eqz v2, :cond_f

    .line 236
    .line 237
    new-instance v3, Lta6;

    .line 238
    .line 239
    invoke-direct {v3, v2}, Lta6;-><init>(Ljava/lang/Class;)V

    .line 240
    .line 241
    .line 242
    goto :goto_7

    .line 243
    :cond_f
    const/4 v3, 0x0

    .line 244
    :goto_7
    if-eqz v3, :cond_10

    .line 245
    .line 246
    invoke-virtual {p2}, Ljava/lang/Class;->getModifiers()I

    .line 247
    .line 248
    .line 249
    move-result p2

    .line 250
    invoke-static {p2}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 251
    .line 252
    .line 253
    move-result p2

    .line 254
    if-nez p2, :cond_10

    .line 255
    .line 256
    move p2, v6

    .line 257
    goto :goto_8

    .line 258
    :cond_10
    move p2, v0

    .line 259
    :goto_8
    iput-boolean p2, p0, Lp44;->q0:Z

    .line 260
    .line 261
    new-instance p2, Lul1;

    .line 262
    .line 263
    invoke-direct {p2, p0}, Lul1;-><init>(Lp44;)V

    .line 264
    .line 265
    .line 266
    iput-object p2, p0, Lp44;->r0:Lul1;

    .line 267
    .line 268
    move p2, v0

    .line 269
    new-instance v0, Lt44;

    .line 270
    .line 271
    if-eqz p4, :cond_11

    .line 272
    .line 273
    move v4, v6

    .line 274
    goto :goto_9

    .line 275
    :cond_11
    move v4, p2

    .line 276
    :goto_9
    const/4 v5, 0x0

    .line 277
    move-object v2, p0

    .line 278
    move-object v3, p3

    .line 279
    invoke-direct/range {v0 .. v5}, Lt44;-><init>(Lz47;Lsx4;Lta6;ZLt44;)V

    .line 280
    .line 281
    .line 282
    iput-object v0, v2, Lp44;->s0:Lt44;

    .line 283
    .line 284
    sget-object p0, Lgx6;->d:Lwe5;

    .line 285
    .line 286
    new-instance p2, Lf0;

    .line 287
    .line 288
    const/16 p3, 0x14

    .line 289
    .line 290
    invoke-direct {p2, v2, p3}, Lf0;-><init>(Ljava/lang/Object;B)V

    .line 291
    .line 292
    .line 293
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 294
    .line 295
    .line 296
    new-instance p0, Lgx6;

    .line 297
    .line 298
    invoke-direct {p0, v2, p1, p2}, Lgx6;-><init>(Lm0;Lve4;Lgn2;)V

    .line 299
    .line 300
    .line 301
    iput-object p0, v2, Lp44;->t0:Lgx6;

    .line 302
    .line 303
    new-instance p0, Ldd3;

    .line 304
    .line 305
    invoke-direct {p0, v0}, Ldd3;-><init>(Let4;)V

    .line 306
    .line 307
    .line 308
    iput-object p0, v2, Lp44;->u0:Ldd3;

    .line 309
    .line 310
    new-instance p0, Lh54;

    .line 311
    .line 312
    invoke-direct {p0, v1, v3, v2}, Lh54;-><init>(Lz47;Lta6;Lp44;)V

    .line 313
    .line 314
    .line 315
    iput-object p0, v2, Lp44;->v0:Lh54;

    .line 316
    .line 317
    invoke-static {v1, v3}, Lhi5;->w0(Lz47;Lvj3;)Ln44;

    .line 318
    .line 319
    .line 320
    move-result-object p0

    .line 321
    iput-object p0, v2, Lp44;->w0:Ln44;

    .line 322
    .line 323
    new-instance p0, Lo44;

    .line 324
    .line 325
    invoke-direct {p0, v2, v6}, Lo44;-><init>(Lp44;B)V

    .line 326
    .line 327
    .line 328
    new-instance p2, Lte4;

    .line 329
    .line 330
    invoke-direct {p2, p1, p0}, Lse4;-><init>(Lve4;Ldn2;)V

    .line 331
    .line 332
    .line 333
    iput-object p2, v2, Lp44;->x0:Lte4;

    .line 334
    .line 335
    return-void
.end method


# virtual methods
.method public final B()Ljava/util/Collection;
    .locals 0

    .line 1
    iget-object p0, p0, Lp44;->s0:Lt44;

    .line 2
    .line 3
    iget-object p0, p0, Lt44;->q:Lte4;

    .line 4
    .line 5
    invoke-virtual {p0}, Lte4;->invoke()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Ljava/util/List;

    .line 10
    .line 11
    return-object p0
.end method

.method public final B0()Lt44;
    .locals 0

    .line 1
    invoke-super {p0}, Lsx4;->r0()Let4;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lt44;

    .line 6
    .line 7
    return-object p0
.end method

.method public final C()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final e()Lfl1;
    .locals 2

    .line 1
    sget-object v0, Lgl1;->a:Lfl1;

    .line 2
    .line 3
    iget-object v1, p0, Lp44;->p0:Ll5;

    .line 4
    .line 5
    invoke-static {v1, v0}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    iget-object p0, p0, Lp44;->j0:Lta6;

    .line 12
    .line 13
    iget-object p0, p0, Lta6;->a:Ljava/lang/Class;

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaringClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    if-eqz p0, :cond_0

    .line 20
    .line 21
    new-instance v0, Lta6;

    .line 22
    .line 23
    invoke-direct {v0, p0}, Lta6;-><init>(Ljava/lang/Class;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 v0, 0x0

    .line 28
    :goto_0
    if-nez v0, :cond_1

    .line 29
    .line 30
    sget-object p0, Lek3;->a:Lfl1;

    .line 31
    .line 32
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    return-object p0

    .line 36
    :cond_1
    invoke-static {v1}, Ls08;->k(Ll5;)Lfl1;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0
.end method

.method public final g0()Lus0;
    .locals 0

    .line 1
    iget-object p0, p0, Lp44;->n0:Lus0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getAnnotations()Lsm;
    .locals 0

    .line 1
    iget-object p0, p0, Lp44;->w0:Ln44;

    .line 2
    .line 3
    return-object p0
.end method

.method public final i()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final j0()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final k0()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lp44;->x0:Lte4;

    .line 2
    .line 3
    invoke-virtual {p0}, Lte4;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/util/List;

    .line 8
    .line 9
    return-object p0
.end method

.method public final l()Llh8;
    .locals 0

    .line 1
    iget-object p0, p0, Lp44;->r0:Lul1;

    .line 2
    .line 3
    return-object p0
.end method

.method public final m()Lfx4;
    .locals 0

    .line 1
    iget-object p0, p0, Lp44;->o0:Lfx4;

    .line 2
    .line 3
    return-object p0
.end method

.method public final n()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lp44;->q0:Z

    .line 2
    .line 3
    return p0
.end method

.method public final o0()Let4;
    .locals 0

    .line 1
    iget-object p0, p0, Lp44;->v0:Lh54;

    .line 2
    .line 3
    return-object p0
.end method

.method public final q0()Let4;
    .locals 0

    .line 1
    iget-object p0, p0, Lp44;->u0:Ldd3;

    .line 2
    .line 3
    return-object p0
.end method

.method public final r0()Let4;
    .locals 0

    .line 1
    invoke-super {p0}, Lsx4;->r0()Let4;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lt44;

    .line 6
    .line 7
    return-object p0
.end method

.method public final s0(Lz14;)Let4;
    .locals 1

    .line 1
    iget-object p0, p0, Lp44;->t0:Lgx6;

    .line 2
    .line 3
    iget-object p1, p0, Lgx6;->a:Lm0;

    .line 4
    .line 5
    sget v0, Lel1;->a:I

    .line 6
    .line 7
    invoke-static {p1}, Lbl1;->c(Led1;)Lvx4;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, Lgx6;->c:Lte4;

    .line 15
    .line 16
    sget-object p1, Lgx6;->e:[Lnw3;

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    aget-object p1, p1, v0

    .line 20
    .line 21
    invoke-static {p0, p1}, Lhi5;->e0(Lh65;Lnw3;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, Let4;

    .line 26
    .line 27
    check-cast p0, Lt44;

    .line 28
    .line 29
    return-object p0
.end method

.method public final t0()Lgs0;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Lazy Java class "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sget v1, Lel1;->a:I

    .line 9
    .line 10
    invoke-static {p0}, Lbl1;->f(Led1;)Lgk2;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method

.method public final u0()Lft8;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final v0()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final w0()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final x0()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final y0()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method
