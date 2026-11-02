.class public final Lj8;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic X:Lrn2;

.field public final synthetic Y:Lrn2;

.field public final synthetic Z:J

.field public final synthetic f0:J

.field public final synthetic g0:J

.field public final synthetic h0:Lzy0;


# direct methods
.method public constructor <init>(Lrn2;Lrn2;JJJJLzy0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lj8;->X:Lrn2;

    .line 5
    .line 6
    iput-object p2, p0, Lj8;->Y:Lrn2;

    .line 7
    .line 8
    iput-wide p5, p0, Lj8;->Z:J

    .line 9
    .line 10
    iput-wide p7, p0, Lj8;->f0:J

    .line 11
    .line 12
    iput-wide p9, p0, Lj8;->g0:J

    .line 13
    .line 14
    iput-object p11, p0, Lj8;->h0:Lzy0;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    move-object v4, p1

    .line 2
    check-cast v4, Llp2;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Number;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    and-int/lit8 p2, p1, 0x3

    .line 11
    .line 12
    const/4 v0, 0x2

    .line 13
    const/4 v6, 0x1

    .line 14
    const/4 v7, 0x0

    .line 15
    if-eq p2, v0, :cond_0

    .line 16
    .line 17
    move p2, v6

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move p2, v7

    .line 20
    :goto_0
    and-int/2addr p1, v6

    .line 21
    invoke-virtual {v4, p1, p2}, Llp2;->N(IZ)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-eqz p1, :cond_9

    .line 26
    .line 27
    sget-object p1, Lhx4;->X:Lhx4;

    .line 28
    .line 29
    sget-object p2, Ln8;->a:Lig5;

    .line 30
    .line 31
    invoke-static {p1, p2}, Los4;->w(Lkx4;Lgg5;)Lkx4;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    sget-object p2, Lht;->c:Ldt;

    .line 36
    .line 37
    sget-object v0, Lpz2;->q0:Ln50;

    .line 38
    .line 39
    invoke-static {p2, v0, v4, v7}, Lrw0;->a(Lgt;Ln50;Llp2;I)Ltw0;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    invoke-static {v4}, Lkm4;->I(Llp2;)I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    invoke-virtual {v4}, Llp2;->l()Lkl5;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-static {v4, p1}, Lw45;->Q(Llp2;Lkx4;)Lkx4;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    sget-object v2, Luz0;->j:Lpz2;

    .line 56
    .line 57
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v4}, Llp2;->Z()V

    .line 61
    .line 62
    .line 63
    iget-boolean v2, v4, Llp2;->S:Z

    .line 64
    .line 65
    if-eqz v2, :cond_1

    .line 66
    .line 67
    invoke-virtual {v4}, Llp2;->k()V

    .line 68
    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_1
    invoke-virtual {v4}, Llp2;->j0()V

    .line 72
    .line 73
    .line 74
    :goto_1
    sget-object v8, Lpz2;->B0:Ldx0;

    .line 75
    .line 76
    invoke-static {v8, v4, p2}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    sget-object p2, Lpz2;->A0:Ldx0;

    .line 80
    .line 81
    invoke-static {p2, v4, v1}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    sget-object v9, Lpz2;->C0:Ldx0;

    .line 85
    .line 86
    iget-boolean v1, v4, Llp2;->S:Z

    .line 87
    .line 88
    if-nez v1, :cond_2

    .line 89
    .line 90
    invoke-virtual {v4}, Llp2;->K()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    invoke-static {v1, v2}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    if-nez v1, :cond_3

    .line 103
    .line 104
    :cond_2
    invoke-static {v0, v4, v0, v9}, Lp61;->v(ILlp2;ILdx0;)V

    .line 105
    .line 106
    .line 107
    :cond_3
    sget-object v10, Lpz2;->z0:Ldx0;

    .line 108
    .line 109
    invoke-static {v10, v4, p1}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    const p1, 0x14a0f326

    .line 113
    .line 114
    .line 115
    invoke-virtual {v4, p1}, Llp2;->W(I)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v4, v7}, Llp2;->p(Z)V

    .line 119
    .line 120
    .line 121
    iget-object p1, p0, Lj8;->X:Lrn2;

    .line 122
    .line 123
    if-nez p1, :cond_4

    .line 124
    .line 125
    const p1, 0x14a59771

    .line 126
    .line 127
    .line 128
    invoke-virtual {v4, p1}, Llp2;->W(I)V

    .line 129
    .line 130
    .line 131
    :goto_2
    invoke-virtual {v4, v7}, Llp2;->p(Z)V

    .line 132
    .line 133
    .line 134
    goto :goto_3

    .line 135
    :cond_4
    const v0, 0x14a59772

    .line 136
    .line 137
    .line 138
    invoke-virtual {v4, v0}, Llp2;->W(I)V

    .line 139
    .line 140
    .line 141
    sget-object v0, Lz68;->e:Lxj8;

    .line 142
    .line 143
    invoke-static {v0, v4}, Lyj8;->a(Lxj8;Llp2;)Lo88;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    new-instance v0, Li8;

    .line 148
    .line 149
    invoke-direct {v0, p1, v7}, Li8;-><init>(Lrn2;B)V

    .line 150
    .line 151
    .line 152
    const p1, 0x43fb671

    .line 153
    .line 154
    .line 155
    invoke-static {p1, v0, v4}, Ljm4;->U(ILon2;Llp2;)Lzy0;

    .line 156
    .line 157
    .line 158
    move-result-object v3

    .line 159
    const/16 v5, 0x180

    .line 160
    .line 161
    iget-wide v0, p0, Lj8;->Z:J

    .line 162
    .line 163
    invoke-static/range {v0 .. v5}, Ljm4;->l(JLo88;Lrn2;Llp2;I)V

    .line 164
    .line 165
    .line 166
    goto :goto_2

    .line 167
    :goto_3
    iget-object p1, p0, Lj8;->Y:Lrn2;

    .line 168
    .line 169
    if-nez p1, :cond_5

    .line 170
    .line 171
    const p1, 0x14b17479

    .line 172
    .line 173
    .line 174
    invoke-virtual {v4, p1}, Llp2;->W(I)V

    .line 175
    .line 176
    .line 177
    :goto_4
    invoke-virtual {v4, v7}, Llp2;->p(Z)V

    .line 178
    .line 179
    .line 180
    goto :goto_5

    .line 181
    :cond_5
    const v0, 0x14b1747a

    .line 182
    .line 183
    .line 184
    invoke-virtual {v4, v0}, Llp2;->W(I)V

    .line 185
    .line 186
    .line 187
    sget-object v0, Lz68;->g:Lxj8;

    .line 188
    .line 189
    invoke-static {v0, v4}, Lyj8;->a(Lxj8;Llp2;)Lo88;

    .line 190
    .line 191
    .line 192
    move-result-object v2

    .line 193
    new-instance v0, Li8;

    .line 194
    .line 195
    invoke-direct {v0, p1, v6}, Li8;-><init>(Lrn2;B)V

    .line 196
    .line 197
    .line 198
    const p1, 0x2a0e58f2

    .line 199
    .line 200
    .line 201
    invoke-static {p1, v0, v4}, Ljm4;->U(ILon2;Llp2;)Lzy0;

    .line 202
    .line 203
    .line 204
    move-result-object v3

    .line 205
    const/16 v5, 0x180

    .line 206
    .line 207
    iget-wide v0, p0, Lj8;->f0:J

    .line 208
    .line 209
    invoke-static/range {v0 .. v5}, Ljm4;->l(JLo88;Lrn2;Llp2;I)V

    .line 210
    .line 211
    .line 212
    goto :goto_4

    .line 213
    :goto_5
    sget-object p1, Lpz2;->s0:Ln50;

    .line 214
    .line 215
    new-instance v0, Lr03;

    .line 216
    .line 217
    invoke-direct {v0, p1}, Lr03;-><init>(Ln50;)V

    .line 218
    .line 219
    .line 220
    sget-object p1, Lpz2;->Z:Lp50;

    .line 221
    .line 222
    invoke-static {p1, v7}, Lg80;->c(Lp50;Z)Lxr4;

    .line 223
    .line 224
    .line 225
    move-result-object p1

    .line 226
    invoke-static {v4}, Lkm4;->I(Llp2;)I

    .line 227
    .line 228
    .line 229
    move-result v1

    .line 230
    invoke-virtual {v4}, Llp2;->l()Lkl5;

    .line 231
    .line 232
    .line 233
    move-result-object v2

    .line 234
    invoke-static {v4, v0}, Lw45;->Q(Llp2;Lkx4;)Lkx4;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    invoke-virtual {v4}, Llp2;->Z()V

    .line 239
    .line 240
    .line 241
    iget-boolean v3, v4, Llp2;->S:Z

    .line 242
    .line 243
    if-eqz v3, :cond_6

    .line 244
    .line 245
    invoke-virtual {v4}, Llp2;->k()V

    .line 246
    .line 247
    .line 248
    goto :goto_6

    .line 249
    :cond_6
    invoke-virtual {v4}, Llp2;->j0()V

    .line 250
    .line 251
    .line 252
    :goto_6
    invoke-static {v8, v4, p1}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 253
    .line 254
    .line 255
    invoke-static {p2, v4, v2}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 256
    .line 257
    .line 258
    iget-boolean p1, v4, Llp2;->S:Z

    .line 259
    .line 260
    if-nez p1, :cond_7

    .line 261
    .line 262
    invoke-virtual {v4}, Llp2;->K()Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object p1

    .line 266
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 267
    .line 268
    .line 269
    move-result-object p2

    .line 270
    invoke-static {p1, p2}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 271
    .line 272
    .line 273
    move-result p1

    .line 274
    if-nez p1, :cond_8

    .line 275
    .line 276
    :cond_7
    invoke-static {v1, v4, v1, v9}, Lp61;->v(ILlp2;ILdx0;)V

    .line 277
    .line 278
    .line 279
    :cond_8
    invoke-static {v10, v4, v0}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 280
    .line 281
    .line 282
    sget-object p1, Lz68;->c:Lxj8;

    .line 283
    .line 284
    invoke-static {p1, v4}, Lyj8;->a(Lxj8;Llp2;)Lo88;

    .line 285
    .line 286
    .line 287
    move-result-object v2

    .line 288
    const/4 v5, 0x0

    .line 289
    iget-wide v0, p0, Lj8;->g0:J

    .line 290
    .line 291
    iget-object v3, p0, Lj8;->h0:Lzy0;

    .line 292
    .line 293
    invoke-static/range {v0 .. v5}, Ljm4;->l(JLo88;Lrn2;Llp2;I)V

    .line 294
    .line 295
    .line 296
    invoke-virtual {v4, v6}, Llp2;->p(Z)V

    .line 297
    .line 298
    .line 299
    invoke-virtual {v4, v6}, Llp2;->p(Z)V

    .line 300
    .line 301
    .line 302
    goto :goto_7

    .line 303
    :cond_9
    invoke-virtual {v4}, Llp2;->Q()V

    .line 304
    .line 305
    .line 306
    :goto_7
    sget-object p0, Ldn8;->a:Ldn8;

    .line 307
    .line 308
    return-object p0
.end method
