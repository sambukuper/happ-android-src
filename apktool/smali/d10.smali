.class public final Ld10;
.super Ljx4;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lg34;
.implements Lrv1;
.implements Lw07;
.implements Lkq5;
.implements Lnx4;
.implements Lci5;
.implements Lw24;
.implements Las2;
.implements Lvg2;
.implements Llh2;
.implements Lqh2;
.implements Lnf5;
.implements Lea0;


# instance fields
.field public q0:Lix4;

.field public r0:Lc10;

.field public s0:Ljava/util/HashSet;


# virtual methods
.method public final B0()Z
    .locals 0

    .line 1
    iget-object p0, p0, Ld10;->q0:Lix4;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance p0, Ljava/lang/ClassCastException;

    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/ClassCastException;-><init>()V

    .line 9
    .line 10
    .line 11
    throw p0
.end method

.method public final E(Lhh2;)V
    .locals 0

    .line 1
    iget-object p0, p0, Ld10;->q0:Lix4;

    .line 2
    .line 3
    const-string p1, "applyFocusProperties called on wrong node"

    .line 4
    .line 5
    invoke-static {p1}, Lwc3;->b(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    new-instance p0, Ljava/lang/ClassCastException;

    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/ClassCastException;-><init>()V

    .line 14
    .line 15
    .line 16
    throw p0
.end method

.method public final H(Lyh2;)V
    .locals 0

    .line 1
    iget-object p0, p0, Ld10;->q0:Lix4;

    .line 2
    .line 3
    const-string p1, "onFocusEvent called on wrong node"

    .line 4
    .line 5
    invoke-static {p1}, Lwc3;->b(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    new-instance p0, Ljava/lang/ClassCastException;

    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/ClassCastException;-><init>()V

    .line 14
    .line 15
    .line 16
    throw p0
.end method

.method public final I()V
    .locals 0

    .line 1
    iget-object p0, p0, Ld10;->q0:Lix4;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance p0, Ljava/lang/ClassCastException;

    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/ClassCastException;-><init>()V

    .line 9
    .line 10
    .line 11
    throw p0
.end method

.method public final J0(Lug3;Ltr4;I)I
    .locals 4

    .line 1
    iget-object p0, p0, Ld10;->q0:Lix4;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    check-cast p0, Lu31;

    .line 7
    .line 8
    new-instance v0, Lxe1;

    .line 9
    .line 10
    sget-object v1, Lcs4;->Y:Lcs4;

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    sget-object v3, Lbs4;->Y:Lbs4;

    .line 14
    .line 15
    invoke-direct {v0, p2, v3, v1, v2}, Lxe1;-><init>(Ltr4;Ljava/lang/Enum;Ljava/lang/Enum;B)V

    .line 16
    .line 17
    .line 18
    const/4 p2, 0x0

    .line 19
    const/16 v1, 0xd

    .line 20
    .line 21
    invoke-static {p2, p3, p2, p2, v1}, Ls31;->b(IIIII)J

    .line 22
    .line 23
    .line 24
    move-result-wide p2

    .line 25
    new-instance v1, Llh3;

    .line 26
    .line 27
    invoke-interface {p1}, Lug3;->getLayoutDirection()Lz24;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-direct {v1, p1, v2}, Llh3;-><init>(Lug3;Lz24;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v1, v0, p2, p3}, Lu31;->c(Lzr4;Ltr4;J)Lyr4;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-interface {p0}, Lyr4;->a()I

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    return p0
.end method

.method public final K(Lzr4;Ltr4;J)Lyr4;
    .locals 0

    .line 1
    iget-object p0, p0, Ld10;->q0:Lix4;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    check-cast p0, Lu31;

    .line 7
    .line 8
    invoke-virtual {p0, p1, p2, p3, p4}, Lu31;->c(Lzr4;Ltr4;J)Lyr4;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method public final O()V
    .locals 0

    .line 1
    invoke-static {p0}, Lz68;->W(Lrv1;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final P()Z
    .locals 0

    .line 1
    iget-object p0, p0, Ld10;->q0:Lix4;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance p0, Ljava/lang/ClassCastException;

    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/ClassCastException;-><init>()V

    .line 9
    .line 10
    .line 11
    throw p0
.end method

.method public final Q0()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Ld10;->Y0(Z)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public final R0()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ld10;->Z0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final Y0(Z)V
    .locals 5

    .line 1
    iget-boolean v0, p0, Ljx4;->p0:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "initializeModifier called on unattached node"

    .line 6
    .line 7
    invoke-static {v0}, Lwc3;->b(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Ld10;->q0:Lix4;

    .line 11
    .line 12
    iget v1, p0, Ljx4;->Z:I

    .line 13
    .line 14
    and-int/lit8 v1, v1, 0x20

    .line 15
    .line 16
    if-eqz v1, :cond_6

    .line 17
    .line 18
    instance-of v1, v0, Lox4;

    .line 19
    .line 20
    if-eqz v1, :cond_6

    .line 21
    .line 22
    move-object v1, v0

    .line 23
    check-cast v1, Lox4;

    .line 24
    .line 25
    sget-object v2, Lbh1;->a:Lr06;

    .line 26
    .line 27
    iget-object v3, p0, Ld10;->r0:Lc10;

    .line 28
    .line 29
    if-eqz v3, :cond_3

    .line 30
    .line 31
    invoke-virtual {v3, v2}, Lc10;->v(Lr06;)Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-eqz v4, :cond_3

    .line 36
    .line 37
    iput-object v1, v3, Lc10;->g:Lox4;

    .line 38
    .line 39
    invoke-static {p0}, Lyn0;->a0(Lnh1;)Lmf5;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-interface {v1}, Lmf5;->getModifierLocalManager()Lmx4;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    iget-object v3, v1, Lmx4;->b:Lj05;

    .line 48
    .line 49
    if-nez v3, :cond_1

    .line 50
    .line 51
    new-instance v3, Lj05;

    .line 52
    .line 53
    invoke-direct {v3}, Lj05;-><init>()V

    .line 54
    .line 55
    .line 56
    iput-object v3, v1, Lmx4;->b:Lj05;

    .line 57
    .line 58
    :cond_1
    invoke-virtual {v3, p0}, Lj05;->a(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    iget-object v3, v1, Lmx4;->c:Lj05;

    .line 62
    .line 63
    if-nez v3, :cond_2

    .line 64
    .line 65
    new-instance v3, Lj05;

    .line 66
    .line 67
    invoke-direct {v3}, Lj05;-><init>()V

    .line 68
    .line 69
    .line 70
    iput-object v3, v1, Lmx4;->c:Lj05;

    .line 71
    .line 72
    :cond_2
    invoke-virtual {v3, v2}, Lj05;->a(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1}, Lmx4;->a()V

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_3
    new-instance v3, Lc10;

    .line 80
    .line 81
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 82
    .line 83
    .line 84
    iput-object v1, v3, Lc10;->g:Lox4;

    .line 85
    .line 86
    iput-object v3, p0, Ld10;->r0:Lc10;

    .line 87
    .line 88
    invoke-static {p0}, Lyn0;->Z(Lnh1;)Landroidx/compose/ui/node/LayoutNode;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    iget-object v1, v1, Landroidx/compose/ui/node/LayoutNode;->H0:Lt6;

    .line 93
    .line 94
    iget-object v1, v1, Lt6;->h0:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v1, Lf18;

    .line 97
    .line 98
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    iget-boolean v1, v1, Lf18;->q0:Z

    .line 102
    .line 103
    if-eqz v1, :cond_6

    .line 104
    .line 105
    invoke-static {p0}, Lyn0;->a0(Lnh1;)Lmf5;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    invoke-interface {v1}, Lmf5;->getModifierLocalManager()Lmx4;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    iget-object v3, v1, Lmx4;->b:Lj05;

    .line 114
    .line 115
    if-nez v3, :cond_4

    .line 116
    .line 117
    new-instance v3, Lj05;

    .line 118
    .line 119
    invoke-direct {v3}, Lj05;-><init>()V

    .line 120
    .line 121
    .line 122
    iput-object v3, v1, Lmx4;->b:Lj05;

    .line 123
    .line 124
    :cond_4
    invoke-virtual {v3, p0}, Lj05;->a(Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    iget-object v3, v1, Lmx4;->c:Lj05;

    .line 128
    .line 129
    if-nez v3, :cond_5

    .line 130
    .line 131
    new-instance v3, Lj05;

    .line 132
    .line 133
    invoke-direct {v3}, Lj05;-><init>()V

    .line 134
    .line 135
    .line 136
    iput-object v3, v1, Lmx4;->c:Lj05;

    .line 137
    .line 138
    :cond_5
    invoke-virtual {v3, v2}, Lj05;->a(Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v1}, Lmx4;->a()V

    .line 142
    .line 143
    .line 144
    :cond_6
    :goto_0
    iget v1, p0, Ljx4;->Z:I

    .line 145
    .line 146
    and-int/lit8 v1, v1, 0x4

    .line 147
    .line 148
    const/4 v2, 0x2

    .line 149
    if-eqz v1, :cond_7

    .line 150
    .line 151
    if-nez p1, :cond_7

    .line 152
    .line 153
    invoke-static {p0, v2}, Lyn0;->X(Lnh1;I)Li55;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    invoke-virtual {v1}, Li55;->d1()V

    .line 158
    .line 159
    .line 160
    :cond_7
    iget v1, p0, Ljx4;->Z:I

    .line 161
    .line 162
    and-int/2addr v1, v2

    .line 163
    if-eqz v1, :cond_9

    .line 164
    .line 165
    invoke-static {p0}, Lyn0;->Z(Lnh1;)Landroidx/compose/ui/node/LayoutNode;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    iget-object v1, v1, Landroidx/compose/ui/node/LayoutNode;->H0:Lt6;

    .line 170
    .line 171
    iget-object v1, v1, Lt6;->h0:Ljava/lang/Object;

    .line 172
    .line 173
    check-cast v1, Lf18;

    .line 174
    .line 175
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    iget-boolean v1, v1, Lf18;->q0:Z

    .line 179
    .line 180
    if-eqz v1, :cond_8

    .line 181
    .line 182
    iget-object v1, p0, Ljx4;->j0:Li55;

    .line 183
    .line 184
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 185
    .line 186
    .line 187
    move-object v3, v1

    .line 188
    check-cast v3, Li34;

    .line 189
    .line 190
    invoke-virtual {v3, p0}, Li34;->x1(Lg34;)V

    .line 191
    .line 192
    .line 193
    iget-object v1, v1, Li55;->V0:Llf5;

    .line 194
    .line 195
    if-eqz v1, :cond_8

    .line 196
    .line 197
    check-cast v1, Lau2;

    .line 198
    .line 199
    invoke-virtual {v1}, Lau2;->c()V

    .line 200
    .line 201
    .line 202
    :cond_8
    if-nez p1, :cond_9

    .line 203
    .line 204
    invoke-static {p0, v2}, Lyn0;->X(Lnh1;I)Li55;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    invoke-virtual {p1}, Li55;->d1()V

    .line 209
    .line 210
    .line 211
    invoke-static {p0}, Lyn0;->Z(Lnh1;)Landroidx/compose/ui/node/LayoutNode;

    .line 212
    .line 213
    .line 214
    move-result-object p1

    .line 215
    invoke-virtual {p1}, Landroidx/compose/ui/node/LayoutNode;->H()V

    .line 216
    .line 217
    .line 218
    :cond_9
    instance-of p1, v0, Lg74;

    .line 219
    .line 220
    if-eqz p1, :cond_a

    .line 221
    .line 222
    move-object p1, v0

    .line 223
    check-cast p1, Lg74;

    .line 224
    .line 225
    invoke-static {p0}, Lyn0;->Z(Lnh1;)Landroidx/compose/ui/node/LayoutNode;

    .line 226
    .line 227
    .line 228
    move-result-object v1

    .line 229
    iget-object p1, p1, Lg74;->X:Lj74;

    .line 230
    .line 231
    iput-object v1, p1, Lj74;->m0:Landroidx/compose/ui/node/LayoutNode;

    .line 232
    .line 233
    :cond_a
    iget p1, p0, Ljx4;->Z:I

    .line 234
    .line 235
    and-int/lit16 p1, p1, 0x100

    .line 236
    .line 237
    if-eqz p1, :cond_b

    .line 238
    .line 239
    instance-of p1, v0, Ly58;

    .line 240
    .line 241
    if-eqz p1, :cond_b

    .line 242
    .line 243
    invoke-static {p0}, Lyn0;->Z(Lnh1;)Landroidx/compose/ui/node/LayoutNode;

    .line 244
    .line 245
    .line 246
    move-result-object p1

    .line 247
    iget-object p1, p1, Landroidx/compose/ui/node/LayoutNode;->H0:Lt6;

    .line 248
    .line 249
    iget-object p1, p1, Lt6;->h0:Ljava/lang/Object;

    .line 250
    .line 251
    check-cast p1, Lf18;

    .line 252
    .line 253
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 254
    .line 255
    .line 256
    iget-boolean p1, p1, Lf18;->q0:Z

    .line 257
    .line 258
    if-eqz p1, :cond_b

    .line 259
    .line 260
    invoke-static {p0}, Lyn0;->Z(Lnh1;)Landroidx/compose/ui/node/LayoutNode;

    .line 261
    .line 262
    .line 263
    move-result-object p1

    .line 264
    invoke-virtual {p1}, Landroidx/compose/ui/node/LayoutNode;->H()V

    .line 265
    .line 266
    .line 267
    :cond_b
    iget p1, p0, Ljx4;->Z:I

    .line 268
    .line 269
    and-int/lit8 p1, p1, 0x8

    .line 270
    .line 271
    if-eqz p1, :cond_c

    .line 272
    .line 273
    invoke-static {p0}, Lyn0;->a0(Lnh1;)Lmf5;

    .line 274
    .line 275
    .line 276
    move-result-object p0

    .line 277
    check-cast p0, Landroidx/compose/ui/platform/AndroidComposeView;

    .line 278
    .line 279
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->w()V

    .line 280
    .line 281
    .line 282
    :cond_c
    return-void
.end method

.method public final Z()Lwl7;
    .locals 0

    .line 1
    iget-object p0, p0, Ld10;->r0:Lc10;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    sget-object p0, Lf02;->g:Lf02;

    .line 7
    .line 8
    return-object p0
.end method

.method public final Z0()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Ljx4;->p0:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "unInitializeModifier called on unattached node"

    .line 6
    .line 7
    invoke-static {v0}, Lwc3;->b(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Ld10;->q0:Lix4;

    .line 11
    .line 12
    iget v1, p0, Ljx4;->Z:I

    .line 13
    .line 14
    and-int/lit8 v1, v1, 0x20

    .line 15
    .line 16
    if-eqz v1, :cond_3

    .line 17
    .line 18
    instance-of v0, v0, Lox4;

    .line 19
    .line 20
    if-eqz v0, :cond_3

    .line 21
    .line 22
    invoke-static {p0}, Lyn0;->a0(Lnh1;)Lmf5;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-interface {v0}, Lmf5;->getModifierLocalManager()Lmx4;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    sget-object v1, Lbh1;->a:Lr06;

    .line 31
    .line 32
    iget-object v2, v0, Lmx4;->d:Lj05;

    .line 33
    .line 34
    if-nez v2, :cond_1

    .line 35
    .line 36
    new-instance v2, Lj05;

    .line 37
    .line 38
    invoke-direct {v2}, Lj05;-><init>()V

    .line 39
    .line 40
    .line 41
    iput-object v2, v0, Lmx4;->d:Lj05;

    .line 42
    .line 43
    :cond_1
    invoke-static {p0}, Lyn0;->Z(Lnh1;)Landroidx/compose/ui/node/LayoutNode;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    invoke-virtual {v2, v3}, Lj05;->a(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object v2, v0, Lmx4;->e:Lj05;

    .line 51
    .line 52
    if-nez v2, :cond_2

    .line 53
    .line 54
    new-instance v2, Lj05;

    .line 55
    .line 56
    invoke-direct {v2}, Lj05;-><init>()V

    .line 57
    .line 58
    .line 59
    iput-object v2, v0, Lmx4;->e:Lj05;

    .line 60
    .line 61
    :cond_2
    invoke-virtual {v2, v1}, Lj05;->a(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0}, Lmx4;->a()V

    .line 65
    .line 66
    .line 67
    :cond_3
    iget v0, p0, Ljx4;->Z:I

    .line 68
    .line 69
    and-int/lit8 v0, v0, 0x8

    .line 70
    .line 71
    if-eqz v0, :cond_4

    .line 72
    .line 73
    invoke-static {p0}, Lyn0;->a0(Lnh1;)Lmf5;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    check-cast p0, Landroidx/compose/ui/platform/AndroidComposeView;

    .line 78
    .line 79
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->w()V

    .line 80
    .line 81
    .line 82
    :cond_4
    return-void
.end method

.method public final a(J)V
    .locals 0

    .line 1
    return-void
.end method

.method public final a1()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Ljx4;->p0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Ld10;->s0:Ljava/util/HashSet;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    .line 8
    .line 9
    .line 10
    invoke-static {p0}, Lyn0;->a0(Lnh1;)Lmf5;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0}, Lmf5;->getSnapshotObserver()Lof5;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    sget-object v1, Lw45;->a:Ly2;

    .line 19
    .line 20
    new-instance v2, Lo7;

    .line 21
    .line 22
    const/16 v3, 0x9

    .line 23
    .line 24
    invoke-direct {v2, p0, v3}, Lo7;-><init>(Ljava/lang/Object;B)V

    .line 25
    .line 26
    .line 27
    iget-object v0, v0, Lof5;->a:Lxd7;

    .line 28
    .line 29
    invoke-virtual {v0, p0, v1, v2}, Lxd7;->c(Ljava/lang/Object;Lgn2;Ldn2;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    return-void
.end method

.method public final b(Lfi1;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Ld10;->q0:Lix4;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    check-cast p0, Lbi5;

    .line 7
    .line 8
    invoke-interface {p0, p1, p2}, Lbi5;->b(Lfi1;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method public final c()V
    .locals 0

    .line 1
    return-void
.end method

.method public final e()J
    .locals 2

    .line 1
    const/16 v0, 0x80

    .line 2
    .line 3
    invoke-static {p0, v0}, Lyn0;->X(Lnh1;I)Li55;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    iget-wide v0, p0, Leo5;->Z:J

    .line 8
    .line 9
    invoke-static {v0, v1}, Lu15;->R(J)J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    return-wide v0
.end method

.method public final e0(Li55;)V
    .locals 0

    .line 1
    iget-object p0, p0, Ld10;->q0:Lix4;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    check-cast p0, Ly58;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Ly58;->e0(Li55;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final f()Ljava/lang/Object;
    .locals 10

    .line 1
    sget-object v0, Lpu;->z:Lr06;

    .line 2
    .line 3
    iget-object v1, p0, Ld10;->s0:Ljava/util/HashSet;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Ljx4;->X:Ljx4;

    .line 9
    .line 10
    iget-boolean v1, v1, Ljx4;->p0:Z

    .line 11
    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    const-string v1, "visitAncestors called on an unattached node"

    .line 15
    .line 16
    invoke-static {v1}, Lwc3;->b(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    iget-object v1, p0, Ljx4;->X:Ljx4;

    .line 20
    .line 21
    iget-object v1, v1, Ljx4;->g0:Ljx4;

    .line 22
    .line 23
    invoke-static {p0}, Lyn0;->Z(Lnh1;)Landroidx/compose/ui/node/LayoutNode;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    :goto_0
    if-eqz p0, :cond_b

    .line 28
    .line 29
    iget-object v2, p0, Landroidx/compose/ui/node/LayoutNode;->H0:Lt6;

    .line 30
    .line 31
    iget-object v2, v2, Lt6;->i0:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v2, Ljx4;

    .line 34
    .line 35
    iget v2, v2, Ljx4;->f0:I

    .line 36
    .line 37
    and-int/lit8 v2, v2, 0x20

    .line 38
    .line 39
    const/4 v3, 0x0

    .line 40
    if-eqz v2, :cond_9

    .line 41
    .line 42
    :goto_1
    if-eqz v1, :cond_9

    .line 43
    .line 44
    iget v2, v1, Ljx4;->Z:I

    .line 45
    .line 46
    and-int/lit8 v2, v2, 0x20

    .line 47
    .line 48
    if-eqz v2, :cond_8

    .line 49
    .line 50
    move-object v2, v1

    .line 51
    move-object v4, v3

    .line 52
    :goto_2
    if-eqz v2, :cond_8

    .line 53
    .line 54
    instance-of v5, v2, Lnx4;

    .line 55
    .line 56
    if-eqz v5, :cond_1

    .line 57
    .line 58
    check-cast v2, Lnx4;

    .line 59
    .line 60
    invoke-interface {v2}, Lnx4;->Z()Lwl7;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    invoke-virtual {v5, v0}, Lwl7;->v(Lr06;)Z

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    if-eqz v5, :cond_7

    .line 69
    .line 70
    invoke-interface {v2}, Lnx4;->Z()Lwl7;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    invoke-virtual {p0, v0}, Lwl7;->C(Lr06;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    return-object p0

    .line 79
    :cond_1
    iget v5, v2, Ljx4;->Z:I

    .line 80
    .line 81
    and-int/lit8 v5, v5, 0x20

    .line 82
    .line 83
    if-eqz v5, :cond_7

    .line 84
    .line 85
    instance-of v5, v2, Loh1;

    .line 86
    .line 87
    if-eqz v5, :cond_7

    .line 88
    .line 89
    move-object v5, v2

    .line 90
    check-cast v5, Loh1;

    .line 91
    .line 92
    iget-object v5, v5, Loh1;->r0:Ljx4;

    .line 93
    .line 94
    const/4 v6, 0x0

    .line 95
    move v7, v6

    .line 96
    :goto_3
    const/4 v8, 0x1

    .line 97
    if-eqz v5, :cond_6

    .line 98
    .line 99
    iget v9, v5, Ljx4;->Z:I

    .line 100
    .line 101
    and-int/lit8 v9, v9, 0x20

    .line 102
    .line 103
    if-eqz v9, :cond_5

    .line 104
    .line 105
    add-int/lit8 v7, v7, 0x1

    .line 106
    .line 107
    if-ne v7, v8, :cond_2

    .line 108
    .line 109
    move-object v2, v5

    .line 110
    goto :goto_4

    .line 111
    :cond_2
    if-nez v4, :cond_3

    .line 112
    .line 113
    new-instance v4, Lc15;

    .line 114
    .line 115
    const/16 v8, 0x10

    .line 116
    .line 117
    new-array v8, v8, [Ljx4;

    .line 118
    .line 119
    invoke-direct {v4, v6, v8}, Lc15;-><init>(I[Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    :cond_3
    if-eqz v2, :cond_4

    .line 123
    .line 124
    invoke-virtual {v4, v2}, Lc15;->b(Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    move-object v2, v3

    .line 128
    :cond_4
    invoke-virtual {v4, v5}, Lc15;->b(Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    :cond_5
    :goto_4
    iget-object v5, v5, Ljx4;->h0:Ljx4;

    .line 132
    .line 133
    goto :goto_3

    .line 134
    :cond_6
    if-ne v7, v8, :cond_7

    .line 135
    .line 136
    goto :goto_2

    .line 137
    :cond_7
    invoke-static {v4}, Lyn0;->T(Lc15;)Ljx4;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    goto :goto_2

    .line 142
    :cond_8
    iget-object v1, v1, Ljx4;->g0:Ljx4;

    .line 143
    .line 144
    goto :goto_1

    .line 145
    :cond_9
    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNode;->w()Landroidx/compose/ui/node/LayoutNode;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    if-eqz p0, :cond_a

    .line 150
    .line 151
    iget-object v1, p0, Landroidx/compose/ui/node/LayoutNode;->H0:Lt6;

    .line 152
    .line 153
    if-eqz v1, :cond_a

    .line 154
    .line 155
    iget-object v1, v1, Lt6;->h0:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast v1, Lf18;

    .line 158
    .line 159
    goto/16 :goto_0

    .line 160
    .line 161
    :cond_a
    move-object v1, v3

    .line 162
    goto/16 :goto_0

    .line 163
    .line 164
    :cond_b
    iget-object p0, v0, Lr06;->a:Ldn2;

    .line 165
    .line 166
    invoke-interface {p0}, Ldn2;->invoke()Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object p0

    .line 170
    return-object p0
.end method

.method public final getDensity()Lfi1;
    .locals 0

    .line 1
    invoke-static {p0}, Lyn0;->Z(Lnh1;)Landroidx/compose/ui/node/LayoutNode;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, Landroidx/compose/ui/node/LayoutNode;->A0:Lfi1;

    .line 6
    .line 7
    return-object p0
.end method

.method public final getLayoutDirection()Lz24;
    .locals 0

    .line 1
    invoke-static {p0}, Lyn0;->Z(Lnh1;)Landroidx/compose/ui/node/LayoutNode;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, Landroidx/compose/ui/node/LayoutNode;->B0:Lz24;

    .line 6
    .line 7
    return-object p0
.end method

.method public final h(Lf17;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v0, v0, Ld10;->q0:Lix4;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    check-cast v0, Lqs;

    .line 9
    .line 10
    new-instance v1, Lt07;

    .line 11
    .line 12
    invoke-direct {v1}, Lt07;-><init>()V

    .line 13
    .line 14
    .line 15
    iget-boolean v2, v0, Lqs;->X:Z

    .line 16
    .line 17
    iput-boolean v2, v1, Lt07;->Z:Z

    .line 18
    .line 19
    iget-object v0, v0, Lqs;->Y:Lgn2;

    .line 20
    .line 21
    invoke-interface {v0, v1}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    move-object/from16 v0, p1

    .line 28
    .line 29
    check-cast v0, Lt07;

    .line 30
    .line 31
    iget-object v2, v0, Lt07;->X:Ls05;

    .line 32
    .line 33
    iget-boolean v3, v1, Lt07;->Z:Z

    .line 34
    .line 35
    const/4 v4, 0x1

    .line 36
    if-eqz v3, :cond_0

    .line 37
    .line 38
    iput-boolean v4, v0, Lt07;->Z:Z

    .line 39
    .line 40
    :cond_0
    iget-boolean v3, v1, Lt07;->f0:Z

    .line 41
    .line 42
    if-eqz v3, :cond_1

    .line 43
    .line 44
    iput-boolean v4, v0, Lt07;->f0:Z

    .line 45
    .line 46
    :cond_1
    iget-object v0, v1, Lt07;->X:Ls05;

    .line 47
    .line 48
    iget-object v1, v0, Ls05;->b:[Ljava/lang/Object;

    .line 49
    .line 50
    iget-object v3, v0, Ls05;->c:[Ljava/lang/Object;

    .line 51
    .line 52
    iget-object v0, v0, Ls05;->a:[J

    .line 53
    .line 54
    array-length v4, v0

    .line 55
    add-int/lit8 v4, v4, -0x2

    .line 56
    .line 57
    if-ltz v4, :cond_8

    .line 58
    .line 59
    const/4 v6, 0x0

    .line 60
    :goto_0
    aget-wide v7, v0, v6

    .line 61
    .line 62
    not-long v9, v7

    .line 63
    const/4 v11, 0x7

    .line 64
    shl-long/2addr v9, v11

    .line 65
    and-long/2addr v9, v7

    .line 66
    const-wide v11, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    and-long/2addr v9, v11

    .line 72
    cmp-long v9, v9, v11

    .line 73
    .line 74
    if-eqz v9, :cond_7

    .line 75
    .line 76
    sub-int v9, v6, v4

    .line 77
    .line 78
    not-int v9, v9

    .line 79
    ushr-int/lit8 v9, v9, 0x1f

    .line 80
    .line 81
    const/16 v10, 0x8

    .line 82
    .line 83
    rsub-int/lit8 v9, v9, 0x8

    .line 84
    .line 85
    const/4 v11, 0x0

    .line 86
    :goto_1
    if-ge v11, v9, :cond_6

    .line 87
    .line 88
    const-wide/16 v12, 0xff

    .line 89
    .line 90
    and-long/2addr v12, v7

    .line 91
    const-wide/16 v14, 0x80

    .line 92
    .line 93
    cmp-long v12, v12, v14

    .line 94
    .line 95
    if-gez v12, :cond_5

    .line 96
    .line 97
    shl-int/lit8 v12, v6, 0x3

    .line 98
    .line 99
    add-int/2addr v12, v11

    .line 100
    aget-object v13, v1, v12

    .line 101
    .line 102
    aget-object v12, v3, v12

    .line 103
    .line 104
    check-cast v13, Le17;

    .line 105
    .line 106
    invoke-virtual {v2, v13}, Ls05;->b(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v14

    .line 110
    if-nez v14, :cond_2

    .line 111
    .line 112
    invoke-virtual {v2, v13, v12}, Ls05;->l(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_2
    instance-of v14, v12, Lq3;

    .line 117
    .line 118
    if-eqz v14, :cond_5

    .line 119
    .line 120
    invoke-virtual {v2, v13}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v14

    .line 124
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    check-cast v14, Lq3;

    .line 128
    .line 129
    new-instance v15, Lq3;

    .line 130
    .line 131
    iget-object v5, v14, Lq3;->a:Ljava/lang/String;

    .line 132
    .line 133
    if-nez v5, :cond_3

    .line 134
    .line 135
    move-object v5, v12

    .line 136
    check-cast v5, Lq3;

    .line 137
    .line 138
    iget-object v5, v5, Lq3;->a:Ljava/lang/String;

    .line 139
    .line 140
    :cond_3
    iget-object v14, v14, Lq3;->b:Lon2;

    .line 141
    .line 142
    if-nez v14, :cond_4

    .line 143
    .line 144
    check-cast v12, Lq3;

    .line 145
    .line 146
    iget-object v14, v12, Lq3;->b:Lon2;

    .line 147
    .line 148
    :cond_4
    invoke-direct {v15, v5, v14}, Lq3;-><init>(Ljava/lang/String;Lon2;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v2, v13, v15}, Ls05;->l(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    :cond_5
    :goto_2
    shr-long/2addr v7, v10

    .line 155
    add-int/lit8 v11, v11, 0x1

    .line 156
    .line 157
    goto :goto_1

    .line 158
    :cond_6
    if-ne v9, v10, :cond_8

    .line 159
    .line 160
    :cond_7
    if-eq v6, v4, :cond_8

    .line 161
    .line 162
    add-int/lit8 v6, v6, 0x1

    .line 163
    .line 164
    goto :goto_0

    .line 165
    :cond_8
    return-void
.end method

.method public final i0(Lug3;Ltr4;I)I
    .locals 4

    .line 1
    iget-object p0, p0, Ld10;->q0:Lix4;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    check-cast p0, Lu31;

    .line 7
    .line 8
    new-instance v0, Lxe1;

    .line 9
    .line 10
    sget-object v1, Lcs4;->X:Lcs4;

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    sget-object v3, Lbs4;->Y:Lbs4;

    .line 14
    .line 15
    invoke-direct {v0, p2, v3, v1, v2}, Lxe1;-><init>(Ltr4;Ljava/lang/Enum;Ljava/lang/Enum;B)V

    .line 16
    .line 17
    .line 18
    const/4 p2, 0x0

    .line 19
    const/4 v1, 0x7

    .line 20
    invoke-static {p2, p2, p2, p3, v1}, Ls31;->b(IIIII)J

    .line 21
    .line 22
    .line 23
    move-result-wide p2

    .line 24
    new-instance v1, Llh3;

    .line 25
    .line 26
    invoke-interface {p1}, Lug3;->getLayoutDirection()Lz24;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-direct {v1, p1, v2}, Llh3;-><init>(Lug3;Lz24;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, v1, v0, p2, p3}, Lu31;->c(Lzr4;Ltr4;J)Lyr4;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-interface {p0}, Lyr4;->b()I

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    return p0
.end method

.method public final m0(Lug3;Ltr4;I)I
    .locals 4

    .line 1
    iget-object p0, p0, Ld10;->q0:Lix4;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    check-cast p0, Lu31;

    .line 7
    .line 8
    new-instance v0, Lxe1;

    .line 9
    .line 10
    sget-object v1, Lcs4;->X:Lcs4;

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    sget-object v3, Lbs4;->X:Lbs4;

    .line 14
    .line 15
    invoke-direct {v0, p2, v3, v1, v2}, Lxe1;-><init>(Ltr4;Ljava/lang/Enum;Ljava/lang/Enum;B)V

    .line 16
    .line 17
    .line 18
    const/4 p2, 0x0

    .line 19
    const/4 v1, 0x7

    .line 20
    invoke-static {p2, p2, p2, p3, v1}, Ls31;->b(IIIII)J

    .line 21
    .line 22
    .line 23
    move-result-wide p2

    .line 24
    new-instance v1, Llh3;

    .line 25
    .line 26
    invoke-interface {p1}, Lug3;->getLayoutDirection()Lz24;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-direct {v1, p1, v2}, Llh3;-><init>(Lug3;Lz24;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, v1, v0, p2, p3}, Lu31;->c(Lzr4;Ltr4;J)Lyr4;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-interface {p0}, Lyr4;->b()I

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    return p0
.end method

.method public final n(Ly24;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final t()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Ljx4;->p0:Z

    .line 2
    .line 3
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Ld10;->q0:Lix4;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final u0(Lp34;)V
    .locals 0

    .line 1
    iget-object p0, p0, Ld10;->q0:Lix4;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    check-cast p0, Lqv1;

    .line 7
    .line 8
    invoke-virtual {p1}, Lp34;->a()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final y0(Lug3;Ltr4;I)I
    .locals 4

    .line 1
    iget-object p0, p0, Ld10;->q0:Lix4;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    check-cast p0, Lu31;

    .line 7
    .line 8
    new-instance v0, Lxe1;

    .line 9
    .line 10
    sget-object v1, Lcs4;->Y:Lcs4;

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    sget-object v3, Lbs4;->X:Lbs4;

    .line 14
    .line 15
    invoke-direct {v0, p2, v3, v1, v2}, Lxe1;-><init>(Ltr4;Ljava/lang/Enum;Ljava/lang/Enum;B)V

    .line 16
    .line 17
    .line 18
    const/4 p2, 0x0

    .line 19
    const/16 v1, 0xd

    .line 20
    .line 21
    invoke-static {p2, p3, p2, p2, v1}, Ls31;->b(IIIII)J

    .line 22
    .line 23
    .line 24
    move-result-wide p2

    .line 25
    new-instance v1, Llh3;

    .line 26
    .line 27
    invoke-interface {p1}, Lug3;->getLayoutDirection()Lz24;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-direct {v1, p1, v2}, Llh3;-><init>(Lug3;Lz24;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v1, v0, p2, p3}, Lu31;->c(Lzr4;Ltr4;J)Lyr4;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-interface {p0}, Lyr4;->a()I

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    return p0
.end method

.method public final z(Laq5;Lbq5;J)V
    .locals 0

    .line 1
    iget-object p0, p0, Ld10;->q0:Lix4;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance p0, Ljava/lang/ClassCastException;

    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/ClassCastException;-><init>()V

    .line 9
    .line 10
    .line 11
    throw p0
.end method
