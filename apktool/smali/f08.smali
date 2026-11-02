.class public final Lf08;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lqd7;
.implements Lbw6;
.implements Lr61;
.implements Ly23;
.implements Llu8;
.implements Llibxray/XRayVPNServiceSupportsSet;
.implements Lr51;


# static fields
.field public static Y:Lf08;

.field public static final synthetic Z:Lf08;

.field public static final synthetic f0:Lf08;


# instance fields
.field public final synthetic X:B


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lf08;

    .line 2
    .line 3
    const/16 v1, 0x12

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lf08;-><init>(B)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lf08;->Z:Lf08;

    .line 9
    .line 10
    new-instance v0, Lf08;

    .line 11
    .line 12
    const/16 v1, 0x13

    .line 13
    .line 14
    invoke-direct {v0, v1}, Lf08;-><init>(B)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lf08;->f0:Lf08;

    .line 18
    .line 19
    return-void
.end method

.method public synthetic constructor <init>(B)V
    .locals 0

    .line 8
    iput-byte p1, p0, Lf08;->X:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lo7;)V
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    iput-byte p1, p0, Lf08;->X:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public static b(Lxr6;Ljava/lang/Object;)V
    .locals 5

    .line 1
    check-cast p1, Ll49;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p1, Ll49;->a:Ljava/lang/String;

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    invoke-interface {p0, v1, v0}, Lxr6;->T(ILjava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iget-object v1, p1, Ll49;->b:Lu39;

    .line 13
    .line 14
    invoke-static {v1}, La28;->u(Lu39;)I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const/4 v2, 0x2

    .line 19
    int-to-long v3, v1

    .line 20
    invoke-interface {p0, v2, v3, v4}, Lxr6;->i(IJ)V

    .line 21
    .line 22
    .line 23
    const/4 v1, 0x3

    .line 24
    iget-object v2, p1, Ll49;->c:Ljava/lang/String;

    .line 25
    .line 26
    invoke-interface {p0, v1, v2}, Lxr6;->T(ILjava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const/4 v1, 0x4

    .line 30
    iget-object v2, p1, Ll49;->d:Ljava/lang/String;

    .line 31
    .line 32
    invoke-interface {p0, v1, v2}, Lxr6;->T(ILjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sget-object v1, Lu91;->b:Lu91;

    .line 36
    .line 37
    iget-object v1, p1, Ll49;->e:Lu91;

    .line 38
    .line 39
    invoke-static {v1}, Lwl7;->c0(Lu91;)[B

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    const/4 v2, 0x5

    .line 44
    invoke-interface {p0, v2, v1}, Lxr6;->j(I[B)V

    .line 45
    .line 46
    .line 47
    iget-object v1, p1, Ll49;->f:Lu91;

    .line 48
    .line 49
    invoke-static {v1}, Lwl7;->c0(Lu91;)[B

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    const/4 v2, 0x6

    .line 54
    invoke-interface {p0, v2, v1}, Lxr6;->j(I[B)V

    .line 55
    .line 56
    .line 57
    const/4 v1, 0x7

    .line 58
    iget-wide v2, p1, Ll49;->g:J

    .line 59
    .line 60
    invoke-interface {p0, v1, v2, v3}, Lxr6;->i(IJ)V

    .line 61
    .line 62
    .line 63
    const/16 v1, 0x8

    .line 64
    .line 65
    iget-wide v2, p1, Ll49;->h:J

    .line 66
    .line 67
    invoke-interface {p0, v1, v2, v3}, Lxr6;->i(IJ)V

    .line 68
    .line 69
    .line 70
    const/16 v1, 0x9

    .line 71
    .line 72
    iget-wide v2, p1, Ll49;->i:J

    .line 73
    .line 74
    invoke-interface {p0, v1, v2, v3}, Lxr6;->i(IJ)V

    .line 75
    .line 76
    .line 77
    iget v1, p1, Ll49;->k:I

    .line 78
    .line 79
    int-to-long v1, v1

    .line 80
    const/16 v3, 0xa

    .line 81
    .line 82
    invoke-interface {p0, v3, v1, v2}, Lxr6;->i(IJ)V

    .line 83
    .line 84
    .line 85
    iget-object v1, p1, Ll49;->l:Lz00;

    .line 86
    .line 87
    invoke-static {v1}, La28;->a(Lz00;)I

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    const/16 v2, 0xb

    .line 92
    .line 93
    int-to-long v3, v1

    .line 94
    invoke-interface {p0, v2, v3, v4}, Lxr6;->i(IJ)V

    .line 95
    .line 96
    .line 97
    const/16 v1, 0xc

    .line 98
    .line 99
    iget-wide v2, p1, Ll49;->m:J

    .line 100
    .line 101
    invoke-interface {p0, v1, v2, v3}, Lxr6;->i(IJ)V

    .line 102
    .line 103
    .line 104
    const/16 v1, 0xd

    .line 105
    .line 106
    iget-wide v2, p1, Ll49;->n:J

    .line 107
    .line 108
    invoke-interface {p0, v1, v2, v3}, Lxr6;->i(IJ)V

    .line 109
    .line 110
    .line 111
    const/16 v1, 0xe

    .line 112
    .line 113
    iget-wide v2, p1, Ll49;->o:J

    .line 114
    .line 115
    invoke-interface {p0, v1, v2, v3}, Lxr6;->i(IJ)V

    .line 116
    .line 117
    .line 118
    const/16 v1, 0xf

    .line 119
    .line 120
    iget-wide v2, p1, Ll49;->p:J

    .line 121
    .line 122
    invoke-interface {p0, v1, v2, v3}, Lxr6;->i(IJ)V

    .line 123
    .line 124
    .line 125
    iget-boolean v1, p1, Ll49;->q:Z

    .line 126
    .line 127
    const/16 v2, 0x10

    .line 128
    .line 129
    int-to-long v3, v1

    .line 130
    invoke-interface {p0, v2, v3, v4}, Lxr6;->i(IJ)V

    .line 131
    .line 132
    .line 133
    iget-object v1, p1, Ll49;->r:Lyd5;

    .line 134
    .line 135
    invoke-static {v1}, La28;->r(Lyd5;)I

    .line 136
    .line 137
    .line 138
    move-result v1

    .line 139
    const/16 v2, 0x11

    .line 140
    .line 141
    int-to-long v3, v1

    .line 142
    invoke-interface {p0, v2, v3, v4}, Lxr6;->i(IJ)V

    .line 143
    .line 144
    .line 145
    iget v1, p1, Ll49;->s:I

    .line 146
    .line 147
    int-to-long v1, v1

    .line 148
    const/16 v3, 0x12

    .line 149
    .line 150
    invoke-interface {p0, v3, v1, v2}, Lxr6;->i(IJ)V

    .line 151
    .line 152
    .line 153
    iget v1, p1, Ll49;->t:I

    .line 154
    .line 155
    int-to-long v1, v1

    .line 156
    const/16 v3, 0x13

    .line 157
    .line 158
    invoke-interface {p0, v3, v1, v2}, Lxr6;->i(IJ)V

    .line 159
    .line 160
    .line 161
    const/16 v1, 0x14

    .line 162
    .line 163
    iget-wide v2, p1, Ll49;->u:J

    .line 164
    .line 165
    invoke-interface {p0, v1, v2, v3}, Lxr6;->i(IJ)V

    .line 166
    .line 167
    .line 168
    iget v1, p1, Ll49;->v:I

    .line 169
    .line 170
    int-to-long v1, v1

    .line 171
    const/16 v3, 0x15

    .line 172
    .line 173
    invoke-interface {p0, v3, v1, v2}, Lxr6;->i(IJ)V

    .line 174
    .line 175
    .line 176
    iget v1, p1, Ll49;->w:I

    .line 177
    .line 178
    int-to-long v1, v1

    .line 179
    const/16 v3, 0x16

    .line 180
    .line 181
    invoke-interface {p0, v3, v1, v2}, Lxr6;->i(IJ)V

    .line 182
    .line 183
    .line 184
    iget-object v1, p1, Ll49;->x:Ljava/lang/String;

    .line 185
    .line 186
    const/16 v2, 0x17

    .line 187
    .line 188
    if-nez v1, :cond_0

    .line 189
    .line 190
    invoke-interface {p0, v2}, Lxr6;->l(I)V

    .line 191
    .line 192
    .line 193
    goto :goto_0

    .line 194
    :cond_0
    invoke-interface {p0, v2, v1}, Lxr6;->T(ILjava/lang/String;)V

    .line 195
    .line 196
    .line 197
    :goto_0
    iget-object v1, p1, Ll49;->y:Ljava/lang/Boolean;

    .line 198
    .line 199
    if-eqz v1, :cond_1

    .line 200
    .line 201
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 202
    .line 203
    .line 204
    move-result v1

    .line 205
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    goto :goto_1

    .line 210
    :cond_1
    const/4 v1, 0x0

    .line 211
    :goto_1
    const/16 v2, 0x18

    .line 212
    .line 213
    if-nez v1, :cond_2

    .line 214
    .line 215
    invoke-interface {p0, v2}, Lxr6;->l(I)V

    .line 216
    .line 217
    .line 218
    goto :goto_2

    .line 219
    :cond_2
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 220
    .line 221
    .line 222
    move-result v1

    .line 223
    int-to-long v3, v1

    .line 224
    invoke-interface {p0, v2, v3, v4}, Lxr6;->i(IJ)V

    .line 225
    .line 226
    .line 227
    :goto_2
    iget-object p1, p1, Ll49;->j:Lp31;

    .line 228
    .line 229
    iget-object v1, p1, Lp31;->a:Lb45;

    .line 230
    .line 231
    invoke-static {v1}, La28;->p(Lb45;)I

    .line 232
    .line 233
    .line 234
    move-result v1

    .line 235
    const/16 v2, 0x19

    .line 236
    .line 237
    int-to-long v3, v1

    .line 238
    invoke-interface {p0, v2, v3, v4}, Lxr6;->i(IJ)V

    .line 239
    .line 240
    .line 241
    iget-object v1, p1, Lp31;->b:Lu35;

    .line 242
    .line 243
    invoke-static {v1}, La28;->d(Lu35;)[B

    .line 244
    .line 245
    .line 246
    move-result-object v1

    .line 247
    const/16 v2, 0x1a

    .line 248
    .line 249
    invoke-interface {p0, v2, v1}, Lxr6;->j(I[B)V

    .line 250
    .line 251
    .line 252
    iget-boolean v1, p1, Lp31;->c:Z

    .line 253
    .line 254
    const/16 v2, 0x1b

    .line 255
    .line 256
    int-to-long v3, v1

    .line 257
    invoke-interface {p0, v2, v3, v4}, Lxr6;->i(IJ)V

    .line 258
    .line 259
    .line 260
    iget-boolean v1, p1, Lp31;->d:Z

    .line 261
    .line 262
    const/16 v2, 0x1c

    .line 263
    .line 264
    int-to-long v3, v1

    .line 265
    invoke-interface {p0, v2, v3, v4}, Lxr6;->i(IJ)V

    .line 266
    .line 267
    .line 268
    iget-boolean v1, p1, Lp31;->e:Z

    .line 269
    .line 270
    const/16 v2, 0x1d

    .line 271
    .line 272
    int-to-long v3, v1

    .line 273
    invoke-interface {p0, v2, v3, v4}, Lxr6;->i(IJ)V

    .line 274
    .line 275
    .line 276
    iget-boolean v1, p1, Lp31;->f:Z

    .line 277
    .line 278
    const/16 v2, 0x1e

    .line 279
    .line 280
    int-to-long v3, v1

    .line 281
    invoke-interface {p0, v2, v3, v4}, Lxr6;->i(IJ)V

    .line 282
    .line 283
    .line 284
    const/16 v1, 0x1f

    .line 285
    .line 286
    iget-wide v2, p1, Lp31;->g:J

    .line 287
    .line 288
    invoke-interface {p0, v1, v2, v3}, Lxr6;->i(IJ)V

    .line 289
    .line 290
    .line 291
    const/16 v1, 0x20

    .line 292
    .line 293
    iget-wide v2, p1, Lp31;->h:J

    .line 294
    .line 295
    invoke-interface {p0, v1, v2, v3}, Lxr6;->i(IJ)V

    .line 296
    .line 297
    .line 298
    iget-object p1, p1, Lp31;->i:Ljava/util/Set;

    .line 299
    .line 300
    invoke-static {p1}, La28;->s(Ljava/util/Set;)[B

    .line 301
    .line 302
    .line 303
    move-result-object p1

    .line 304
    const/16 v1, 0x21

    .line 305
    .line 306
    invoke-interface {p0, v1, p1}, Lxr6;->j(I[B)V

    .line 307
    .line 308
    .line 309
    const/16 p1, 0x22

    .line 310
    .line 311
    invoke-interface {p0, p1, v0}, Lxr6;->T(ILjava/lang/String;)V

    .line 312
    .line 313
    .line 314
    return-void
.end method

.method public static i(I)Le69;
    .locals 1

    .line 1
    sget-object v0, Le69;->i0:Ln22;

    .line 2
    .line 3
    invoke-static {p0, v0}, Lwv0;->u0(ILjava/util/List;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Le69;

    .line 8
    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    sget-object p0, Le69;->f0:Le69;

    .line 12
    .line 13
    :cond_0
    return-object p0
.end method


# virtual methods
.method public U(Lhv6;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    check-cast p2, Lu88;

    .line 2
    .line 3
    iget p0, p2, Lu88;->a:I

    .line 4
    .line 5
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p2, Lu88;->b:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v2, p2, Lu88;->c:Ljava/lang/String;

    .line 12
    .line 13
    iget-wide p0, p2, Lu88;->d:J

    .line 14
    .line 15
    sget v3, Lf88;->c:I

    .line 16
    .line 17
    const/16 v3, 0x20

    .line 18
    .line 19
    shr-long v4, p0, v3

    .line 20
    .line 21
    long-to-int v4, v4

    .line 22
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    const-wide v5, 0xffffffffL

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    and-long/2addr p0, v5

    .line 32
    long-to-int p0, p0

    .line 33
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    iget-wide v7, p2, Lu88;->e:J

    .line 38
    .line 39
    shr-long v9, v7, v3

    .line 40
    .line 41
    long-to-int p1, v9

    .line 42
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    and-long/2addr v5, v7

    .line 47
    long-to-int v3, v5

    .line 48
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 49
    .line 50
    .line 51
    move-result-object v6

    .line 52
    iget-wide v7, p2, Lu88;->f:J

    .line 53
    .line 54
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 55
    .line 56
    .line 57
    move-result-object v7

    .line 58
    move-object v5, p1

    .line 59
    move-object v3, v4

    .line 60
    move-object v4, p0

    .line 61
    filled-new-array/range {v0 .. v7}, [Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    invoke-static {p0}, Li21;->L([Ljava/lang/Object;)Ljava/util/List;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    return-object p0
.end method

.method public X(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 3

    .line 1
    check-cast p1, Lt58;

    .line 2
    .line 3
    check-cast p2, Lt58;

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    const/4 v0, 0x1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    if-eqz p2, :cond_0

    .line 10
    .line 11
    iget-object v1, p1, Lt58;->a:Lkd8;

    .line 12
    .line 13
    iget-object v2, p2, Lt58;->a:Lkd8;

    .line 14
    .line 15
    if-ne v1, v2, :cond_3

    .line 16
    .line 17
    iget-object v1, p1, Lt58;->b:Lo88;

    .line 18
    .line 19
    iget-object v2, p2, Lt58;->b:Lo88;

    .line 20
    .line 21
    invoke-static {v1, v2}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_3

    .line 26
    .line 27
    iget-boolean v1, p1, Lt58;->c:Z

    .line 28
    .line 29
    iget-boolean v2, p2, Lt58;->c:Z

    .line 30
    .line 31
    if-ne v1, v2, :cond_3

    .line 32
    .line 33
    iget-boolean v1, p1, Lt58;->d:Z

    .line 34
    .line 35
    iget-boolean v2, p2, Lt58;->d:Z

    .line 36
    .line 37
    if-ne v1, v2, :cond_3

    .line 38
    .line 39
    iget-boolean p1, p1, Lt58;->e:Z

    .line 40
    .line 41
    iget-boolean p2, p2, Lt58;->e:Z

    .line 42
    .line 43
    if-ne p1, p2, :cond_3

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_0
    if-nez p1, :cond_1

    .line 47
    .line 48
    move p1, v0

    .line 49
    goto :goto_0

    .line 50
    :cond_1
    move p1, p0

    .line 51
    :goto_0
    if-nez p2, :cond_2

    .line 52
    .line 53
    move p2, v0

    .line 54
    goto :goto_1

    .line 55
    :cond_2
    move p2, p0

    .line 56
    :goto_1
    xor-int/2addr p1, p2

    .line 57
    if-nez p1, :cond_3

    .line 58
    .line 59
    :goto_2
    return v0

    .line 60
    :cond_3
    return p0
.end method

.method public c(Lsm;Lsm;)V
    .locals 1

    .line 1
    new-instance p0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Lgm;

    .line 21
    .line 22
    invoke-interface {v0}, Lgm;->d()Lfk2;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {p0, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result p2

    .line 38
    if-eqz p2, :cond_1

    .line 39
    .line 40
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    check-cast p2, Lgm;

    .line 45
    .line 46
    invoke-interface {p2}, Lgm;->d()Lfk2;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    invoke-virtual {p0, p2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    return-void
.end method

.method public e(Lyr6;Lch8;ZIZ)Laa7;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move/from16 v3, p3

    .line 8
    .line 9
    new-instance v4, Lwg7;

    .line 10
    .line 11
    iget-object v5, v1, Lyr6;->Z:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v5, Lkm1;

    .line 14
    .line 15
    invoke-virtual {v5}, Lkm1;->J0()Laa7;

    .line 16
    .line 17
    .line 18
    move-result-object v6

    .line 19
    sget-object v7, Lrt8;->Z:Lrt8;

    .line 20
    .line 21
    invoke-direct {v4, v6, v7}, Lwg7;-><init>(Lt14;Lrt8;)V

    .line 22
    .line 23
    .line 24
    const/4 v6, 0x0

    .line 25
    move/from16 v7, p4

    .line 26
    .line 27
    invoke-virtual {v0, v4, v1, v6, v7}, Lf08;->f(Lni8;Lyr6;Lhi8;I)Lni8;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    invoke-virtual {v4}, Lni8;->b()Lt14;

    .line 32
    .line 33
    .line 34
    move-result-object v7

    .line 35
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    invoke-static {v7}, Ls08;->a(Lt14;)Laa7;

    .line 39
    .line 40
    .line 41
    move-result-object v7

    .line 42
    invoke-static {v7}, Lvr3;->J(Lt14;)Z

    .line 43
    .line 44
    .line 45
    move-result v8

    .line 46
    if-eqz v8, :cond_0

    .line 47
    .line 48
    return-object v7

    .line 49
    :cond_0
    invoke-virtual {v4}, Lni8;->a()Lrt8;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v7}, Lt14;->getAnnotations()Lsm;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    invoke-static {v2}, Lxm;->a(Lch8;)Lsm;

    .line 57
    .line 58
    .line 59
    move-result-object v8

    .line 60
    invoke-virtual {v0, v4, v8}, Lf08;->c(Lsm;Lsm;)V

    .line 61
    .line 62
    .line 63
    invoke-static {v7}, Lvr3;->J(Lt14;)Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-eqz v0, :cond_1

    .line 68
    .line 69
    goto/16 :goto_6

    .line 70
    .line 71
    :cond_1
    invoke-static {v7}, Lvr3;->J(Lt14;)Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    const/4 v4, 0x1

    .line 76
    if-eqz v0, :cond_2

    .line 77
    .line 78
    invoke-virtual {v7}, Lt14;->m0()Lch8;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    goto/16 :goto_5

    .line 83
    .line 84
    :cond_2
    invoke-virtual {v7}, Lt14;->m0()Lch8;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    sget-object v8, Lch8;->Y:Lxd6;

    .line 89
    .line 90
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v2}, Lch8;->isEmpty()Z

    .line 94
    .line 95
    .line 96
    move-result v9

    .line 97
    if-eqz v9, :cond_3

    .line 98
    .line 99
    invoke-virtual {v0}, Lch8;->isEmpty()Z

    .line 100
    .line 101
    .line 102
    move-result v9

    .line 103
    if-eqz v9, :cond_3

    .line 104
    .line 105
    move-object v0, v2

    .line 106
    goto/16 :goto_5

    .line 107
    .line 108
    :cond_3
    new-instance v9, Ljava/util/ArrayList;

    .line 109
    .line 110
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 111
    .line 112
    .line 113
    iget-object v8, v8, Lxd6;->Y:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast v8, Ljava/util/concurrent/ConcurrentHashMap;

    .line 116
    .line 117
    invoke-virtual {v8}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 118
    .line 119
    .line 120
    move-result-object v8

    .line 121
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    invoke-interface {v8}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 125
    .line 126
    .line 127
    move-result-object v8

    .line 128
    :cond_4
    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 129
    .line 130
    .line 131
    move-result v10

    .line 132
    if-eqz v10, :cond_d

    .line 133
    .line 134
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v10

    .line 138
    check-cast v10, Ljava/lang/Number;

    .line 139
    .line 140
    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    .line 141
    .line 142
    .line 143
    move-result v10

    .line 144
    iget-object v11, v2, Lch8;->X:Lut;

    .line 145
    .line 146
    invoke-virtual {v11, v10}, Lut;->get(I)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v11

    .line 150
    check-cast v11, Lwm;

    .line 151
    .line 152
    iget-object v12, v0, Lch8;->X:Lut;

    .line 153
    .line 154
    invoke-virtual {v12, v10}, Lut;->get(I)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v10

    .line 158
    check-cast v10, Lwm;

    .line 159
    .line 160
    const/4 v12, 0x0

    .line 161
    const/4 v13, 0x2

    .line 162
    if-nez v11, :cond_9

    .line 163
    .line 164
    if-eqz v10, :cond_8

    .line 165
    .line 166
    if-nez v11, :cond_5

    .line 167
    .line 168
    goto/16 :goto_4

    .line 169
    .line 170
    :cond_5
    new-instance v14, Lwm;

    .line 171
    .line 172
    iget-object v10, v10, Lwm;->a:Lsm;

    .line 173
    .line 174
    iget-object v11, v11, Lwm;->a:Lsm;

    .line 175
    .line 176
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    invoke-interface {v10}, Lsm;->isEmpty()Z

    .line 183
    .line 184
    .line 185
    move-result v15

    .line 186
    if-eqz v15, :cond_6

    .line 187
    .line 188
    move-object v10, v11

    .line 189
    goto :goto_1

    .line 190
    :cond_6
    invoke-interface {v11}, Lsm;->isEmpty()Z

    .line 191
    .line 192
    .line 193
    move-result v15

    .line 194
    if-eqz v15, :cond_7

    .line 195
    .line 196
    goto :goto_1

    .line 197
    :cond_7
    new-instance v15, Lvm;

    .line 198
    .line 199
    new-array v13, v13, [Lsm;

    .line 200
    .line 201
    aput-object v10, v13, v12

    .line 202
    .line 203
    aput-object v11, v13, v4

    .line 204
    .line 205
    invoke-direct {v15, v13}, Lvm;-><init>([Lsm;)V

    .line 206
    .line 207
    .line 208
    move-object v10, v15

    .line 209
    :goto_1
    invoke-direct {v14, v10}, Lwm;-><init>(Lsm;)V

    .line 210
    .line 211
    .line 212
    move-object v10, v14

    .line 213
    goto :goto_4

    .line 214
    :cond_8
    move-object v10, v6

    .line 215
    goto :goto_4

    .line 216
    :cond_9
    if-nez v10, :cond_a

    .line 217
    .line 218
    goto :goto_3

    .line 219
    :cond_a
    new-instance v14, Lwm;

    .line 220
    .line 221
    iget-object v11, v11, Lwm;->a:Lsm;

    .line 222
    .line 223
    iget-object v10, v10, Lwm;->a:Lsm;

    .line 224
    .line 225
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 226
    .line 227
    .line 228
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 229
    .line 230
    .line 231
    invoke-interface {v11}, Lsm;->isEmpty()Z

    .line 232
    .line 233
    .line 234
    move-result v15

    .line 235
    if-eqz v15, :cond_b

    .line 236
    .line 237
    move-object v11, v10

    .line 238
    goto :goto_2

    .line 239
    :cond_b
    invoke-interface {v10}, Lsm;->isEmpty()Z

    .line 240
    .line 241
    .line 242
    move-result v15

    .line 243
    if-eqz v15, :cond_c

    .line 244
    .line 245
    goto :goto_2

    .line 246
    :cond_c
    new-instance v15, Lvm;

    .line 247
    .line 248
    new-array v13, v13, [Lsm;

    .line 249
    .line 250
    aput-object v11, v13, v12

    .line 251
    .line 252
    aput-object v10, v13, v4

    .line 253
    .line 254
    invoke-direct {v15, v13}, Lvm;-><init>([Lsm;)V

    .line 255
    .line 256
    .line 257
    move-object v11, v15

    .line 258
    :goto_2
    invoke-direct {v14, v11}, Lwm;-><init>(Lsm;)V

    .line 259
    .line 260
    .line 261
    move-object v11, v14

    .line 262
    :goto_3
    move-object v10, v11

    .line 263
    :goto_4
    if-eqz v10, :cond_4

    .line 264
    .line 265
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 266
    .line 267
    .line 268
    goto/16 :goto_0

    .line 269
    .line 270
    :cond_d
    invoke-static {v9}, Lxd6;->k(Ljava/util/List;)Lch8;

    .line 271
    .line 272
    .line 273
    move-result-object v0

    .line 274
    :goto_5
    invoke-static {v7, v6, v0, v4}, Ls08;->f(Laa7;Ljava/util/List;Lch8;I)Laa7;

    .line 275
    .line 276
    .line 277
    move-result-object v7

    .line 278
    :goto_6
    invoke-static {v7, v3}, Lcj8;->i(Laa7;Z)Laa7;

    .line 279
    .line 280
    .line 281
    move-result-object v0

    .line 282
    if-eqz p5, :cond_e

    .line 283
    .line 284
    iget-object v4, v5, Lkm1;->l0:Lg3;

    .line 285
    .line 286
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 287
    .line 288
    .line 289
    iget-object v1, v1, Lyr6;->f0:Ljava/lang/Object;

    .line 290
    .line 291
    check-cast v1, Ljava/util/List;

    .line 292
    .line 293
    sget-object v5, Ldt4;->b:Ldt4;

    .line 294
    .line 295
    invoke-static {v5, v2, v4, v1, v3}, Ldh3;->O(Let4;Lch8;Llh8;Ljava/util/List;Z)Laa7;

    .line 296
    .line 297
    .line 298
    move-result-object v1

    .line 299
    invoke-static {v0, v1}, Ljm4;->d0(Laa7;Laa7;)Laa7;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    :cond_e
    return-object v0
.end method

.method public f(Lni8;Lyr6;Lhi8;I)Lni8;
    .locals 14

    .line 1
    move-object/from16 v1, p2

    .line 2
    .line 3
    move/from16 v6, p4

    .line 4
    .line 5
    iget-object v0, v1, Lyr6;->Z:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lkm1;

    .line 8
    .line 9
    const/16 v2, 0x64

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    if-gt v6, v2, :cond_24

    .line 13
    .line 14
    invoke-virtual {p1}, Lni8;->c()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-virtual/range {p3 .. p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-static/range {p3 .. p3}, Lcj8;->j(Lhi8;)Lwg7;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0

    .line 28
    :cond_0
    invoke-virtual {p1}, Lni8;->b()Lt14;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Lt14;->n0()Llh8;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    invoke-interface {v2}, Llh8;->x()Lot0;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    instance-of v4, v2, Lhi8;

    .line 47
    .line 48
    if-eqz v4, :cond_1

    .line 49
    .line 50
    iget-object v4, v1, Lyr6;->g0:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v4, Ljava/util/Map;

    .line 53
    .line 54
    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    check-cast v2, Lni8;

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_1
    move-object v2, v3

    .line 62
    :goto_0
    const/4 v4, 0x0

    .line 63
    sget-object v5, Lrt8;->Z:Lrt8;

    .line 64
    .line 65
    if-nez v2, :cond_d

    .line 66
    .line 67
    invoke-virtual {p1}, Lni8;->b()Lt14;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-virtual {v0}, Lt14;->q0()Lmo8;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-static {v0}, Ls08;->a(Lt14;)Laa7;

    .line 76
    .line 77
    .line 78
    move-result-object v7

    .line 79
    invoke-static {v7}, Lvr3;->J(Lt14;)Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-nez v0, :cond_c

    .line 84
    .line 85
    sget-object v0, Lve7;->l0:Lve7;

    .line 86
    .line 87
    invoke-static {v7, v0, v3}, Lcj8;->c(Lt14;Lgn2;Lpc7;)Z

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    if-nez v0, :cond_2

    .line 92
    .line 93
    goto/16 :goto_4

    .line 94
    .line 95
    :cond_2
    invoke-virtual {v7}, Lt14;->n0()Llh8;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-interface {v0}, Llh8;->x()Lot0;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    invoke-interface {v0}, Llh8;->g()Ljava/util/List;

    .line 104
    .line 105
    .line 106
    move-result-object v8

    .line 107
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 108
    .line 109
    .line 110
    invoke-virtual {v7}, Lt14;->l0()Ljava/util/List;

    .line 111
    .line 112
    .line 113
    move-result-object v8

    .line 114
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 115
    .line 116
    .line 117
    instance-of v8, v2, Lhi8;

    .line 118
    .line 119
    if-eqz v8, :cond_3

    .line 120
    .line 121
    goto/16 :goto_4

    .line 122
    .line 123
    :cond_3
    instance-of v8, v2, Lkm1;

    .line 124
    .line 125
    if-eqz v8, :cond_8

    .line 126
    .line 127
    check-cast v2, Lkm1;

    .line 128
    .line 129
    invoke-virtual {v1, v2}, Lyr6;->i(Lkm1;)Z

    .line 130
    .line 131
    .line 132
    move-result v8

    .line 133
    if-eqz v8, :cond_4

    .line 134
    .line 135
    new-instance p0, Lwg7;

    .line 136
    .line 137
    invoke-virtual {v2}, Lfd1;->getName()Lv15;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    iget-object p1, p1, Lv15;->X:Ljava/lang/String;

    .line 142
    .line 143
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    filled-new-array {p1}, [Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    sget-object v0, Ls32;->h0:Ls32;

    .line 151
    .line 152
    invoke-static {v0, p1}, Lu32;->c(Ls32;[Ljava/lang/String;)Lq32;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    invoke-direct {p0, p1, v5}, Lwg7;-><init>(Lt14;Lrt8;)V

    .line 157
    .line 158
    .line 159
    return-object p0

    .line 160
    :cond_4
    invoke-virtual {v7}, Lt14;->l0()Ljava/util/List;

    .line 161
    .line 162
    .line 163
    move-result-object v5

    .line 164
    move-object v8, v3

    .line 165
    new-instance v3, Ljava/util/ArrayList;

    .line 166
    .line 167
    const/16 v9, 0xa

    .line 168
    .line 169
    invoke-static {v5, v9}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 170
    .line 171
    .line 172
    move-result v10

    .line 173
    invoke-direct {v3, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 174
    .line 175
    .line 176
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 177
    .line 178
    .line 179
    move-result-object v5

    .line 180
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 181
    .line 182
    .line 183
    move-result v10

    .line 184
    if-eqz v10, :cond_6

    .line 185
    .line 186
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v10

    .line 190
    add-int/lit8 v11, v4, 0x1

    .line 191
    .line 192
    if-ltz v4, :cond_5

    .line 193
    .line 194
    check-cast v10, Lni8;

    .line 195
    .line 196
    invoke-interface {v0}, Llh8;->g()Ljava/util/List;

    .line 197
    .line 198
    .line 199
    move-result-object v12

    .line 200
    invoke-interface {v12, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v4

    .line 204
    check-cast v4, Lhi8;

    .line 205
    .line 206
    add-int/lit8 v12, v6, 0x1

    .line 207
    .line 208
    invoke-virtual {p0, v10, v1, v4, v12}, Lf08;->f(Lni8;Lyr6;Lhi8;I)Lni8;

    .line 209
    .line 210
    .line 211
    move-result-object v4

    .line 212
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    move v4, v11

    .line 216
    goto :goto_1

    .line 217
    :cond_5
    invoke-static {}, Li21;->X()V

    .line 218
    .line 219
    .line 220
    throw v8

    .line 221
    :cond_6
    iget-object v0, v2, Lkm1;->l0:Lg3;

    .line 222
    .line 223
    invoke-virtual {v0}, Lg3;->g()Ljava/util/List;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    new-instance v4, Ljava/util/ArrayList;

    .line 228
    .line 229
    invoke-static {v0, v9}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 230
    .line 231
    .line 232
    move-result v5

    .line 233
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 234
    .line 235
    .line 236
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 241
    .line 242
    .line 243
    move-result v5

    .line 244
    if-eqz v5, :cond_7

    .line 245
    .line 246
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v5

    .line 250
    check-cast v5, Lhi8;

    .line 251
    .line 252
    invoke-interface {v5}, Lhi8;->a()Lhi8;

    .line 253
    .line 254
    .line 255
    move-result-object v5

    .line 256
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 257
    .line 258
    .line 259
    goto :goto_2

    .line 260
    :cond_7
    invoke-static {v4, v3}, Lwv0;->e1(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    invoke-static {v0}, Lzp4;->P(Ljava/util/List;)Ljava/util/Map;

    .line 265
    .line 266
    .line 267
    move-result-object v4

    .line 268
    new-instance v0, Lyr6;

    .line 269
    .line 270
    const/16 v5, 0x8

    .line 271
    .line 272
    invoke-direct/range {v0 .. v5}, Lyr6;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 273
    .line 274
    .line 275
    invoke-virtual {v7}, Lt14;->m0()Lch8;

    .line 276
    .line 277
    .line 278
    move-result-object v10

    .line 279
    invoke-virtual {v7}, Lt14;->o0()Z

    .line 280
    .line 281
    .line 282
    move-result v11

    .line 283
    add-int/lit8 v12, v6, 0x1

    .line 284
    .line 285
    const/4 v13, 0x0

    .line 286
    move-object v8, p0

    .line 287
    move-object v9, v0

    .line 288
    invoke-virtual/range {v8 .. v13}, Lf08;->e(Lyr6;Lch8;ZIZ)Laa7;

    .line 289
    .line 290
    .line 291
    move-result-object v0

    .line 292
    invoke-virtual {p0, v7, v1, v6}, Lf08;->k(Laa7;Lyr6;I)Laa7;

    .line 293
    .line 294
    .line 295
    move-result-object p0

    .line 296
    invoke-static {v0, p0}, Ljm4;->d0(Laa7;Laa7;)Laa7;

    .line 297
    .line 298
    .line 299
    move-result-object p0

    .line 300
    new-instance v0, Lwg7;

    .line 301
    .line 302
    invoke-virtual {p1}, Lni8;->a()Lrt8;

    .line 303
    .line 304
    .line 305
    move-result-object p1

    .line 306
    invoke-direct {v0, p0, p1}, Lwg7;-><init>(Lt14;Lrt8;)V

    .line 307
    .line 308
    .line 309
    return-object v0

    .line 310
    :cond_8
    move-object v8, v3

    .line 311
    invoke-virtual {p0, v7, v1, v6}, Lf08;->k(Laa7;Lyr6;I)Laa7;

    .line 312
    .line 313
    .line 314
    move-result-object p0

    .line 315
    invoke-static {p0}, Lwi8;->d(Lt14;)Lwi8;

    .line 316
    .line 317
    .line 318
    invoke-virtual {p0}, Lt14;->l0()Ljava/util/List;

    .line 319
    .line 320
    .line 321
    move-result-object v0

    .line 322
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 323
    .line 324
    .line 325
    move-result-object v0

    .line 326
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 327
    .line 328
    .line 329
    move-result v1

    .line 330
    if-eqz v1, :cond_b

    .line 331
    .line 332
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    move-result-object v1

    .line 336
    add-int/lit8 v2, v4, 0x1

    .line 337
    .line 338
    if-ltz v4, :cond_a

    .line 339
    .line 340
    check-cast v1, Lni8;

    .line 341
    .line 342
    invoke-virtual {v1}, Lni8;->c()Z

    .line 343
    .line 344
    .line 345
    move-result v3

    .line 346
    if-nez v3, :cond_9

    .line 347
    .line 348
    invoke-virtual {v1}, Lni8;->b()Lt14;

    .line 349
    .line 350
    .line 351
    move-result-object v1

    .line 352
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 353
    .line 354
    .line 355
    sget-object v3, Lve7;->k0:Lve7;

    .line 356
    .line 357
    invoke-static {v1, v3, v8}, Lcj8;->c(Lt14;Lgn2;Lpc7;)Z

    .line 358
    .line 359
    .line 360
    move-result v1

    .line 361
    if-nez v1, :cond_9

    .line 362
    .line 363
    invoke-virtual {v7}, Lt14;->l0()Ljava/util/List;

    .line 364
    .line 365
    .line 366
    move-result-object v1

    .line 367
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 368
    .line 369
    .line 370
    move-result-object v1

    .line 371
    check-cast v1, Lni8;

    .line 372
    .line 373
    invoke-virtual {v7}, Lt14;->n0()Llh8;

    .line 374
    .line 375
    .line 376
    move-result-object v1

    .line 377
    invoke-interface {v1}, Llh8;->g()Ljava/util/List;

    .line 378
    .line 379
    .line 380
    move-result-object v1

    .line 381
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object v1

    .line 385
    check-cast v1, Lhi8;

    .line 386
    .line 387
    :cond_9
    move v4, v2

    .line 388
    goto :goto_3

    .line 389
    :cond_a
    invoke-static {}, Li21;->X()V

    .line 390
    .line 391
    .line 392
    throw v8

    .line 393
    :cond_b
    new-instance v0, Lwg7;

    .line 394
    .line 395
    invoke-virtual {p1}, Lni8;->a()Lrt8;

    .line 396
    .line 397
    .line 398
    move-result-object p1

    .line 399
    invoke-direct {v0, p0, p1}, Lwg7;-><init>(Lt14;Lrt8;)V

    .line 400
    .line 401
    .line 402
    return-object v0

    .line 403
    :cond_c
    :goto_4
    return-object p1

    .line 404
    :cond_d
    move-object v8, v3

    .line 405
    invoke-virtual {v2}, Lni8;->c()Z

    .line 406
    .line 407
    .line 408
    move-result v1

    .line 409
    if-eqz v1, :cond_e

    .line 410
    .line 411
    invoke-virtual/range {p3 .. p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 412
    .line 413
    .line 414
    invoke-static/range {p3 .. p3}, Lcj8;->j(Lhi8;)Lwg7;

    .line 415
    .line 416
    .line 417
    move-result-object p0

    .line 418
    return-object p0

    .line 419
    :cond_e
    invoke-virtual {v2}, Lni8;->b()Lt14;

    .line 420
    .line 421
    .line 422
    move-result-object v1

    .line 423
    invoke-virtual {v1}, Lt14;->q0()Lmo8;

    .line 424
    .line 425
    .line 426
    move-result-object v1

    .line 427
    invoke-virtual {v2}, Lni8;->a()Lrt8;

    .line 428
    .line 429
    .line 430
    move-result-object v2

    .line 431
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 432
    .line 433
    .line 434
    invoke-virtual {p1}, Lni8;->a()Lrt8;

    .line 435
    .line 436
    .line 437
    move-result-object p1

    .line 438
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 439
    .line 440
    .line 441
    if-ne p1, v2, :cond_f

    .line 442
    .line 443
    goto :goto_5

    .line 444
    :cond_f
    if-ne p1, v5, :cond_10

    .line 445
    .line 446
    goto :goto_5

    .line 447
    :cond_10
    if-ne v2, v5, :cond_11

    .line 448
    .line 449
    move-object v2, p1

    .line 450
    :cond_11
    :goto_5
    if-eqz p3, :cond_12

    .line 451
    .line 452
    invoke-interface/range {p3 .. p3}, Lhi8;->D()Lrt8;

    .line 453
    .line 454
    .line 455
    move-result-object p1

    .line 456
    if-nez p1, :cond_13

    .line 457
    .line 458
    :cond_12
    move-object p1, v5

    .line 459
    :cond_13
    if-ne p1, v2, :cond_14

    .line 460
    .line 461
    goto :goto_6

    .line 462
    :cond_14
    if-ne p1, v5, :cond_15

    .line 463
    .line 464
    goto :goto_6

    .line 465
    :cond_15
    if-ne v2, v5, :cond_16

    .line 466
    .line 467
    goto :goto_7

    .line 468
    :cond_16
    :goto_6
    move-object v5, v2

    .line 469
    :goto_7
    invoke-virtual {v0}, Lt14;->getAnnotations()Lsm;

    .line 470
    .line 471
    .line 472
    move-result-object p1

    .line 473
    invoke-virtual {v1}, Lt14;->getAnnotations()Lsm;

    .line 474
    .line 475
    .line 476
    move-result-object v2

    .line 477
    invoke-virtual {p0, p1, v2}, Lf08;->c(Lsm;Lsm;)V

    .line 478
    .line 479
    .line 480
    invoke-static {v1}, Ls08;->a(Lt14;)Laa7;

    .line 481
    .line 482
    .line 483
    move-result-object p0

    .line 484
    invoke-virtual {v0}, Lt14;->o0()Z

    .line 485
    .line 486
    .line 487
    move-result p1

    .line 488
    invoke-static {p0, p1}, Lcj8;->i(Laa7;Z)Laa7;

    .line 489
    .line 490
    .line 491
    move-result-object p0

    .line 492
    invoke-virtual {v0}, Lt14;->m0()Lch8;

    .line 493
    .line 494
    .line 495
    move-result-object p1

    .line 496
    invoke-static {p0}, Lvr3;->J(Lt14;)Z

    .line 497
    .line 498
    .line 499
    move-result v0

    .line 500
    if-eqz v0, :cond_17

    .line 501
    .line 502
    goto/16 :goto_e

    .line 503
    .line 504
    :cond_17
    invoke-static {p0}, Lvr3;->J(Lt14;)Z

    .line 505
    .line 506
    .line 507
    move-result v0

    .line 508
    const/4 v1, 0x1

    .line 509
    if-eqz v0, :cond_18

    .line 510
    .line 511
    invoke-virtual {p0}, Lt14;->m0()Lch8;

    .line 512
    .line 513
    .line 514
    move-result-object p1

    .line 515
    goto/16 :goto_d

    .line 516
    .line 517
    :cond_18
    invoke-virtual {p0}, Lt14;->m0()Lch8;

    .line 518
    .line 519
    .line 520
    move-result-object v0

    .line 521
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 522
    .line 523
    .line 524
    sget-object v2, Lch8;->Y:Lxd6;

    .line 525
    .line 526
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 527
    .line 528
    .line 529
    invoke-virtual {p1}, Lch8;->isEmpty()Z

    .line 530
    .line 531
    .line 532
    move-result v3

    .line 533
    if-eqz v3, :cond_19

    .line 534
    .line 535
    invoke-virtual {v0}, Lch8;->isEmpty()Z

    .line 536
    .line 537
    .line 538
    move-result v3

    .line 539
    if-eqz v3, :cond_19

    .line 540
    .line 541
    goto/16 :goto_d

    .line 542
    .line 543
    :cond_19
    new-instance v3, Ljava/util/ArrayList;

    .line 544
    .line 545
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 546
    .line 547
    .line 548
    iget-object v2, v2, Lxd6;->Y:Ljava/lang/Object;

    .line 549
    .line 550
    check-cast v2, Ljava/util/concurrent/ConcurrentHashMap;

    .line 551
    .line 552
    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 553
    .line 554
    .line 555
    move-result-object v2

    .line 556
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 557
    .line 558
    .line 559
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 560
    .line 561
    .line 562
    move-result-object v2

    .line 563
    :cond_1a
    :goto_8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 564
    .line 565
    .line 566
    move-result v6

    .line 567
    if-eqz v6, :cond_23

    .line 568
    .line 569
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 570
    .line 571
    .line 572
    move-result-object v6

    .line 573
    check-cast v6, Ljava/lang/Number;

    .line 574
    .line 575
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 576
    .line 577
    .line 578
    move-result v6

    .line 579
    iget-object v7, p1, Lch8;->X:Lut;

    .line 580
    .line 581
    invoke-virtual {v7, v6}, Lut;->get(I)Ljava/lang/Object;

    .line 582
    .line 583
    .line 584
    move-result-object v7

    .line 585
    check-cast v7, Lwm;

    .line 586
    .line 587
    iget-object v9, v0, Lch8;->X:Lut;

    .line 588
    .line 589
    invoke-virtual {v9, v6}, Lut;->get(I)Ljava/lang/Object;

    .line 590
    .line 591
    .line 592
    move-result-object v6

    .line 593
    check-cast v6, Lwm;

    .line 594
    .line 595
    const/4 v9, 0x2

    .line 596
    if-nez v7, :cond_1f

    .line 597
    .line 598
    if-eqz v6, :cond_1e

    .line 599
    .line 600
    if-nez v7, :cond_1b

    .line 601
    .line 602
    goto/16 :goto_c

    .line 603
    .line 604
    :cond_1b
    new-instance v10, Lwm;

    .line 605
    .line 606
    iget-object v6, v6, Lwm;->a:Lsm;

    .line 607
    .line 608
    iget-object v7, v7, Lwm;->a:Lsm;

    .line 609
    .line 610
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 611
    .line 612
    .line 613
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 614
    .line 615
    .line 616
    invoke-interface {v6}, Lsm;->isEmpty()Z

    .line 617
    .line 618
    .line 619
    move-result v11

    .line 620
    if-eqz v11, :cond_1c

    .line 621
    .line 622
    move-object v6, v7

    .line 623
    goto :goto_9

    .line 624
    :cond_1c
    invoke-interface {v7}, Lsm;->isEmpty()Z

    .line 625
    .line 626
    .line 627
    move-result v11

    .line 628
    if-eqz v11, :cond_1d

    .line 629
    .line 630
    goto :goto_9

    .line 631
    :cond_1d
    new-instance v11, Lvm;

    .line 632
    .line 633
    new-array v9, v9, [Lsm;

    .line 634
    .line 635
    aput-object v6, v9, v4

    .line 636
    .line 637
    aput-object v7, v9, v1

    .line 638
    .line 639
    invoke-direct {v11, v9}, Lvm;-><init>([Lsm;)V

    .line 640
    .line 641
    .line 642
    move-object v6, v11

    .line 643
    :goto_9
    invoke-direct {v10, v6}, Lwm;-><init>(Lsm;)V

    .line 644
    .line 645
    .line 646
    move-object v6, v10

    .line 647
    goto :goto_c

    .line 648
    :cond_1e
    move-object v6, v8

    .line 649
    goto :goto_c

    .line 650
    :cond_1f
    if-nez v6, :cond_20

    .line 651
    .line 652
    goto :goto_b

    .line 653
    :cond_20
    new-instance v10, Lwm;

    .line 654
    .line 655
    iget-object v7, v7, Lwm;->a:Lsm;

    .line 656
    .line 657
    iget-object v6, v6, Lwm;->a:Lsm;

    .line 658
    .line 659
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 660
    .line 661
    .line 662
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 663
    .line 664
    .line 665
    invoke-interface {v7}, Lsm;->isEmpty()Z

    .line 666
    .line 667
    .line 668
    move-result v11

    .line 669
    if-eqz v11, :cond_21

    .line 670
    .line 671
    move-object v7, v6

    .line 672
    goto :goto_a

    .line 673
    :cond_21
    invoke-interface {v6}, Lsm;->isEmpty()Z

    .line 674
    .line 675
    .line 676
    move-result v11

    .line 677
    if-eqz v11, :cond_22

    .line 678
    .line 679
    goto :goto_a

    .line 680
    :cond_22
    new-instance v11, Lvm;

    .line 681
    .line 682
    new-array v9, v9, [Lsm;

    .line 683
    .line 684
    aput-object v7, v9, v4

    .line 685
    .line 686
    aput-object v6, v9, v1

    .line 687
    .line 688
    invoke-direct {v11, v9}, Lvm;-><init>([Lsm;)V

    .line 689
    .line 690
    .line 691
    move-object v7, v11

    .line 692
    :goto_a
    invoke-direct {v10, v7}, Lwm;-><init>(Lsm;)V

    .line 693
    .line 694
    .line 695
    move-object v7, v10

    .line 696
    :goto_b
    move-object v6, v7

    .line 697
    :goto_c
    if-eqz v6, :cond_1a

    .line 698
    .line 699
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 700
    .line 701
    .line 702
    goto/16 :goto_8

    .line 703
    .line 704
    :cond_23
    invoke-static {v3}, Lxd6;->k(Ljava/util/List;)Lch8;

    .line 705
    .line 706
    .line 707
    move-result-object p1

    .line 708
    :goto_d
    invoke-static {p0, v8, p1, v1}, Ls08;->f(Laa7;Ljava/util/List;Lch8;I)Laa7;

    .line 709
    .line 710
    .line 711
    move-result-object p0

    .line 712
    :goto_e
    new-instance p1, Lwg7;

    .line 713
    .line 714
    invoke-direct {p1, p0, v5}, Lwg7;-><init>(Lt14;Lrt8;)V

    .line 715
    .line 716
    .line 717
    return-object p1

    .line 718
    :cond_24
    move-object v8, v3

    .line 719
    const-string p0, "Too deep recursion while expanding type alias "

    .line 720
    .line 721
    invoke-virtual {v0}, Lfd1;->getName()Lv15;

    .line 722
    .line 723
    .line 724
    move-result-object p1

    .line 725
    invoke-static {p1, p0}, Lom0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 726
    .line 727
    .line 728
    return-object v8
.end method

.method public synthetic g(Lfb9;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte p0, p0, Lf08;->X:B

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lfb9;->i()Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p1}, Lfb9;->g()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Landroid/os/Bundle;

    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_0
    const-string p0, "Rpc"

    .line 20
    .line 21
    const/4 v0, 0x3

    .line 22
    invoke-static {p0, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    if-nez p0, :cond_1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    invoke-virtual {p1}, Lfb9;->f()Ljava/lang/Exception;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    const-string v0, "Error making request: "

    .line 38
    .line 39
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    :goto_0
    new-instance p0, Ljava/io/IOException;

    .line 43
    .line 44
    invoke-virtual {p1}, Lfb9;->f()Ljava/lang/Exception;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    const-string v0, "SERVICE_NOT_AVAILABLE"

    .line 49
    .line 50
    invoke-direct {p0, v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 51
    .line 52
    .line 53
    throw p0

    .line 54
    :pswitch_0
    invoke-virtual {p1}, Lfb9;->g()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    check-cast p0, Landroid/os/Bundle;

    .line 59
    .line 60
    const-string p1, "notification_data"

    .line 61
    .line 62
    invoke-virtual {p0, p1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    check-cast p0, Landroid/content/Intent;

    .line 67
    .line 68
    if-eqz p0, :cond_2

    .line 69
    .line 70
    new-instance p1, Lav0;

    .line 71
    .line 72
    invoke-direct {p1, p0}, Lav0;-><init>(Landroid/content/Intent;)V

    .line 73
    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_2
    const/4 p1, 0x0

    .line 77
    :goto_1
    return-object p1

    .line 78
    nop

    .line 79
    :pswitch_data_0
    .packed-switch 0x12
        :pswitch_0
    .end packed-switch
.end method

.method public h([B)Z
    .locals 1

    .line 1
    const/4 p0, 0x0

    .line 2
    aget-byte p1, p1, p0

    .line 3
    .line 4
    const/4 v0, 0x2

    .line 5
    if-ne p1, v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    :cond_0
    return p0
.end method

.method public j()J
    .locals 2

    .line 1
    iget-byte p0, p0, Lf08;->X:B

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    return-wide v0

    .line 11
    :pswitch_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    return-wide v0

    .line 16
    nop

    .line 17
    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_0
    .end packed-switch
.end method

.method public k(Laa7;Lyr6;I)Laa7;
    .locals 8

    .line 1
    invoke-virtual {p1}, Lt14;->n0()Llh8;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Lt14;->l0()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    new-instance v2, Ljava/util/ArrayList;

    .line 10
    .line 11
    const/16 v3, 0xa

    .line 12
    .line 13
    invoke-static {v1, v3}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 18
    .line 19
    .line 20
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    const/4 v3, 0x0

    .line 25
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    const/4 v5, 0x0

    .line 30
    if-eqz v4, :cond_2

    .line 31
    .line 32
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    add-int/lit8 v6, v3, 0x1

    .line 37
    .line 38
    if-ltz v3, :cond_1

    .line 39
    .line 40
    check-cast v4, Lni8;

    .line 41
    .line 42
    invoke-interface {v0}, Llh8;->g()Ljava/util/List;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    check-cast v3, Lhi8;

    .line 51
    .line 52
    add-int/lit8 v5, p3, 0x1

    .line 53
    .line 54
    invoke-virtual {p0, v4, p2, v3, v5}, Lf08;->f(Lni8;Lyr6;Lhi8;I)Lni8;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    invoke-virtual {v3}, Lni8;->c()Z

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    if-eqz v5, :cond_0

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_0
    new-instance v5, Lwg7;

    .line 66
    .line 67
    invoke-virtual {v3}, Lni8;->a()Lrt8;

    .line 68
    .line 69
    .line 70
    move-result-object v7

    .line 71
    invoke-virtual {v3}, Lni8;->b()Lt14;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    invoke-virtual {v4}, Lni8;->b()Lt14;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    invoke-virtual {v4}, Lt14;->o0()Z

    .line 80
    .line 81
    .line 82
    move-result v4

    .line 83
    invoke-static {v3, v4}, Lcj8;->h(Lt14;Z)Lt14;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    invoke-direct {v5, v3, v7}, Lwg7;-><init>(Lt14;Lrt8;)V

    .line 88
    .line 89
    .line 90
    move-object v3, v5

    .line 91
    :goto_1
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move v3, v6

    .line 95
    goto :goto_0

    .line 96
    :cond_1
    invoke-static {}, Li21;->X()V

    .line 97
    .line 98
    .line 99
    throw v5

    .line 100
    :cond_2
    const/4 p0, 0x2

    .line 101
    invoke-static {p1, v2, v5, p0}, Ls08;->f(Laa7;Ljava/util/List;Lch8;I)Laa7;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    return-object p0
.end method

.method public m(JLwk;Lwk;Lwk;)Lwk;
    .locals 0

    .line 1
    return-object p5
.end method

.method public onEmitStatus(JLjava/lang/String;)J
    .locals 0

    .line 1
    const-wide/16 p0, 0x0

    .line 2
    .line 3
    return-wide p0
.end method

.method public shutdown()J
    .locals 4

    .line 1
    sget-object p0, Lx59;->c:Ljava/lang/ref/SoftReference;

    .line 2
    .line 3
    const-wide/16 v0, -0x1

    .line 4
    .line 5
    if-eqz p0, :cond_3

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Lw47;

    .line 12
    .line 13
    if-nez p0, :cond_0

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_0
    :try_start_0
    invoke-interface {p0}, Lw47;->b()V

    .line 17
    .line 18
    .line 19
    const-wide/16 v2, 0x0

    .line 20
    .line 21
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 22
    .line 23
    .line 24
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception p0

    .line 27
    instance-of v2, p0, Ljava/lang/InterruptedException;

    .line 28
    .line 29
    if-nez v2, :cond_2

    .line 30
    .line 31
    instance-of v2, p0, Ljava/util/concurrent/CancellationException;

    .line 32
    .line 33
    if-nez v2, :cond_2

    .line 34
    .line 35
    new-instance v2, Lrj6;

    .line 36
    .line 37
    invoke-direct {v2, p0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 38
    .line 39
    .line 40
    move-object p0, v2

    .line 41
    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    instance-of v1, p0, Lrj6;

    .line 46
    .line 47
    if-eqz v1, :cond_1

    .line 48
    .line 49
    move-object p0, v0

    .line 50
    :cond_1
    check-cast p0, Ljava/lang/Number;

    .line 51
    .line 52
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 53
    .line 54
    .line 55
    move-result-wide v0

    .line 56
    return-wide v0

    .line 57
    :cond_2
    throw p0

    .line 58
    :cond_3
    :goto_1
    return-wide v0
.end method

.method public startup()J
    .locals 4

    .line 1
    sget-object p0, Lx59;->c:Ljava/lang/ref/SoftReference;

    .line 2
    .line 3
    const-wide/16 v0, -0x1

    .line 4
    .line 5
    if-eqz p0, :cond_3

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Lw47;

    .line 12
    .line 13
    if-nez p0, :cond_0

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_0
    const/4 v2, 0x0

    .line 17
    :try_start_0
    invoke-interface {p0, v2}, Lw47;->j(Lsu/happ/proxyutility/dto/ServerConfig;)V

    .line 18
    .line 19
    .line 20
    const-wide/16 v2, 0x0

    .line 21
    .line 22
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 23
    .line 24
    .line 25
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception p0

    .line 28
    instance-of v2, p0, Ljava/lang/InterruptedException;

    .line 29
    .line 30
    if-nez v2, :cond_2

    .line 31
    .line 32
    instance-of v2, p0, Ljava/util/concurrent/CancellationException;

    .line 33
    .line 34
    if-nez v2, :cond_2

    .line 35
    .line 36
    new-instance v2, Lrj6;

    .line 37
    .line 38
    invoke-direct {v2, p0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 39
    .line 40
    .line 41
    move-object p0, v2

    .line 42
    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    instance-of v1, p0, Lrj6;

    .line 47
    .line 48
    if-eqz v1, :cond_1

    .line 49
    .line 50
    move-object p0, v0

    .line 51
    :cond_1
    check-cast p0, Ljava/lang/Number;

    .line 52
    .line 53
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 54
    .line 55
    .line 56
    move-result-wide v0

    .line 57
    return-wide v0

    .line 58
    :cond_2
    throw p0

    .line 59
    :cond_3
    :goto_1
    return-wide v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    iget-byte v0, p0, Lf08;->X:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    const/16 v0, 0x10

    .line 16
    .line 17
    invoke-static {v0}, Lkm4;->q(I)V

    .line 18
    .line 19
    .line 20
    invoke-static {p0, v0}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    const-class v0, Landroid/app/Application;

    .line 28
    .line 29
    sget-object v1, Lyb6;->a:Lzb6;

    .line 30
    .line 31
    invoke-virtual {v1, v0}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-interface {v0}, Lzu3;->E()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    const-string v1, "<"

    .line 40
    .line 41
    const-string v2, ">"

    .line 42
    .line 43
    const-string v3, "CreationExtras.Key@"

    .line 44
    .line 45
    invoke-static {v3, p0, v1, v0, v2}, Lpc6;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    return-object p0

    .line 50
    nop

    .line 51
    :pswitch_data_0
    .packed-switch 0xc
        :pswitch_0
    .end packed-switch
.end method

.method public v()I
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public x()I
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public y(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    check-cast p1, Ljava/util/List;

    .line 5
    .line 6
    new-instance v0, Lu88;

    .line 7
    .line 8
    const/4 p0, 0x0

    .line 9
    invoke-interface {p1, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    check-cast p0, Ljava/lang/Integer;

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    const/4 p0, 0x1

    .line 23
    invoke-interface {p1, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-object v2, p0

    .line 31
    check-cast v2, Ljava/lang/String;

    .line 32
    .line 33
    const/4 p0, 0x2

    .line 34
    invoke-interface {p1, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    move-object v3, p0

    .line 42
    check-cast v3, Ljava/lang/String;

    .line 43
    .line 44
    const/4 p0, 0x3

    .line 45
    invoke-interface {p1, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    check-cast p0, Ljava/lang/Integer;

    .line 53
    .line 54
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    const/4 v4, 0x4

    .line 59
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    check-cast v4, Ljava/lang/Integer;

    .line 67
    .line 68
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    invoke-static {p0, v4}, Lct7;->c(II)J

    .line 73
    .line 74
    .line 75
    move-result-wide v4

    .line 76
    const/4 p0, 0x5

    .line 77
    invoke-interface {p1, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    check-cast p0, Ljava/lang/Integer;

    .line 85
    .line 86
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 87
    .line 88
    .line 89
    move-result p0

    .line 90
    const/4 v6, 0x6

    .line 91
    invoke-interface {p1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v6

    .line 95
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    check-cast v6, Ljava/lang/Integer;

    .line 99
    .line 100
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 101
    .line 102
    .line 103
    move-result v6

    .line 104
    invoke-static {p0, v6}, Lct7;->c(II)J

    .line 105
    .line 106
    .line 107
    move-result-wide v6

    .line 108
    const/4 p0, 0x7

    .line 109
    invoke-interface {p1, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    check-cast p0, Ljava/lang/Long;

    .line 117
    .line 118
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 119
    .line 120
    .line 121
    move-result-wide v8

    .line 122
    const/4 v10, 0x0

    .line 123
    const/16 v11, 0x40

    .line 124
    .line 125
    invoke-direct/range {v0 .. v11}, Lu88;-><init>(ILjava/lang/String;Ljava/lang/String;JJJZI)V

    .line 126
    .line 127
    .line 128
    return-object v0
.end method

.method public z(JLwk;Lwk;Lwk;)Lwk;
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long p0, p1, v0

    .line 4
    .line 5
    if-gez p0, :cond_0

    .line 6
    .line 7
    return-object p3

    .line 8
    :cond_0
    return-object p4
.end method
