.class public final Landroidx/compose/ui/graphics/shadow/DropShadowPainter;
.super Log5;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"
    }
    d2 = {
        "Landroidx/compose/ui/graphics/shadow/DropShadowPainter;",
        "Log5;",
        "ui-graphics"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final h0:Lx67;

.field public final i0:Ls67;

.field public final j0:Ldq;

.field public k0:F

.field public l0:Lg60;


# direct methods
.method public constructor <init>(Lx67;Ls67;Ldq;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Log5;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/ui/graphics/shadow/DropShadowPainter;->h0:Lx67;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/compose/ui/graphics/shadow/DropShadowPainter;->i0:Ls67;

    .line 7
    .line 8
    iput-object p3, p0, Landroidx/compose/ui/graphics/shadow/DropShadowPainter;->j0:Ldq;

    .line 9
    .line 10
    const/high16 p1, 0x3f800000    # 1.0f

    .line 11
    .line 12
    iput p1, p0, Landroidx/compose/ui/graphics/shadow/DropShadowPainter;->k0:F

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final d(F)Z
    .locals 0

    .line 1
    iput p1, p0, Landroidx/compose/ui/graphics/shadow/DropShadowPainter;->k0:F

    .line 2
    .line 3
    const/4 p0, 0x1

    .line 4
    return p0
.end method

.method public final e(Lg60;)Z
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/graphics/shadow/DropShadowPainter;->l0:Lg60;

    .line 2
    .line 3
    const/4 p0, 0x1

    .line 4
    return p0
.end method

.method public final i(Lsv1;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Landroidx/compose/ui/graphics/shadow/DropShadowPainter;->j0:Ldq;

    .line 6
    .line 7
    iget-object v3, v0, Landroidx/compose/ui/graphics/shadow/DropShadowPainter;->h0:Lx67;

    .line 8
    .line 9
    invoke-interface {v1}, Lsv1;->e()J

    .line 10
    .line 11
    .line 12
    move-result-wide v4

    .line 13
    invoke-interface {v1}, Lsv1;->getLayoutDirection()Lz24;

    .line 14
    .line 15
    .line 16
    move-result-object v6

    .line 17
    iget-object v7, v0, Landroidx/compose/ui/graphics/shadow/DropShadowPainter;->i0:Ls67;

    .line 18
    .line 19
    monitor-enter v2

    .line 20
    :try_start_0
    iget-object v8, v2, Ldq;->Z:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v8, Lsg;

    .line 23
    .line 24
    if-nez v8, :cond_0

    .line 25
    .line 26
    new-instance v9, Lsg;

    .line 27
    .line 28
    sget-object v10, Lu70;->e:Lx03;

    .line 29
    .line 30
    sget-object v13, Lz24;->X:Lz24;

    .line 31
    .line 32
    const/high16 v14, 0x3f800000    # 1.0f

    .line 33
    .line 34
    const/4 v15, 0x0

    .line 35
    const-wide/16 v11, 0x0

    .line 36
    .line 37
    invoke-direct/range {v9 .. v15}, Lsg;-><init>(Lx67;JLz24;FLs67;)V

    .line 38
    .line 39
    .line 40
    iput-object v9, v2, Ldq;->Z:Ljava/lang/Object;

    .line 41
    .line 42
    move-object v8, v9

    .line 43
    :cond_0
    iput-object v3, v8, Lsg;->a:Lx67;

    .line 44
    .line 45
    iput-wide v4, v8, Lsg;->b:J

    .line 46
    .line 47
    iput-object v6, v8, Lsg;->c:Lz24;

    .line 48
    .line 49
    invoke-interface {v1}, Lfi1;->getDensity()F

    .line 50
    .line 51
    .line 52
    move-result v9

    .line 53
    iput v9, v8, Lsg;->d:F

    .line 54
    .line 55
    new-instance v10, Ls67;

    .line 56
    .line 57
    iget v11, v7, Ls67;->a:F

    .line 58
    .line 59
    iget v12, v7, Ls67;->b:F

    .line 60
    .line 61
    iget-wide v13, v7, Ls67;->d:J

    .line 62
    .line 63
    move-wide v15, v13

    .line 64
    iget v13, v7, Ls67;->e:F

    .line 65
    .line 66
    iget-byte v14, v7, Ls67;->c:B

    .line 67
    .line 68
    invoke-direct/range {v10 .. v16}, Ls67;-><init>(FFFIJ)V

    .line 69
    .line 70
    .line 71
    iput-object v10, v8, Lsg;->e:Ls67;

    .line 72
    .line 73
    iget-object v9, v2, Ldq;->Y:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v9, Ls05;

    .line 76
    .line 77
    if-nez v9, :cond_1

    .line 78
    .line 79
    new-instance v9, Ls05;

    .line 80
    .line 81
    invoke-direct {v9}, Ls05;-><init>()V

    .line 82
    .line 83
    .line 84
    iput-object v9, v2, Ldq;->Y:Ljava/lang/Object;

    .line 85
    .line 86
    :cond_1
    invoke-virtual {v9, v8}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v9

    .line 90
    check-cast v9, Ltw1;

    .line 91
    .line 92
    if-nez v9, :cond_3

    .line 93
    .line 94
    invoke-interface {v3, v4, v5, v6, v1}, Lx67;->a(JLz24;Lfi1;)Lmb6;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    new-instance v9, Ltw1;

    .line 99
    .line 100
    invoke-direct {v9, v7, v3}, Ltw1;-><init>(Ls67;Lmb6;)V

    .line 101
    .line 102
    .line 103
    iget-object v3, v2, Ldq;->Y:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v3, Ls05;

    .line 106
    .line 107
    if-nez v3, :cond_2

    .line 108
    .line 109
    new-instance v3, Ls05;

    .line 110
    .line 111
    invoke-direct {v3}, Ls05;-><init>()V

    .line 112
    .line 113
    .line 114
    iput-object v3, v2, Ldq;->Y:Ljava/lang/Object;

    .line 115
    .line 116
    :cond_2
    iget-object v11, v8, Lsg;->a:Lx67;

    .line 117
    .line 118
    iget-wide v12, v8, Lsg;->b:J

    .line 119
    .line 120
    iget-object v14, v8, Lsg;->c:Lz24;

    .line 121
    .line 122
    iget v15, v8, Lsg;->d:F

    .line 123
    .line 124
    iget-object v4, v8, Lsg;->e:Ls67;

    .line 125
    .line 126
    new-instance v10, Lsg;

    .line 127
    .line 128
    move-object/from16 v16, v4

    .line 129
    .line 130
    invoke-direct/range {v10 .. v16}, Lsg;-><init>(Lx67;JLz24;FLs67;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v3, v10, v9}, Ls05;->l(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 134
    .line 135
    .line 136
    goto :goto_0

    .line 137
    :catchall_0
    move-exception v0

    .line 138
    goto :goto_1

    .line 139
    :cond_3
    :goto_0
    monitor-exit v2

    .line 140
    iget-object v2, v0, Landroidx/compose/ui/graphics/shadow/DropShadowPainter;->i0:Ls67;

    .line 141
    .line 142
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    const/4 v2, 0x0

    .line 146
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 147
    .line 148
    .line 149
    move-result v3

    .line 150
    invoke-interface {v1, v3}, Lfi1;->h0(F)F

    .line 151
    .line 152
    .line 153
    move-result v10

    .line 154
    iget-object v3, v0, Landroidx/compose/ui/graphics/shadow/DropShadowPainter;->i0:Ls67;

    .line 155
    .line 156
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 160
    .line 161
    .line 162
    move-result v2

    .line 163
    invoke-interface {v1, v2}, Lfi1;->h0(F)F

    .line 164
    .line 165
    .line 166
    move-result v11

    .line 167
    invoke-interface {v1}, Lsv1;->n0()Llr;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    iget-object v2, v2, Llr;->Y:Ljava/lang/Object;

    .line 172
    .line 173
    check-cast v2, Lwl6;

    .line 174
    .line 175
    invoke-virtual {v2, v10, v11}, Lwl6;->V(FF)V

    .line 176
    .line 177
    .line 178
    :try_start_1
    iget-object v2, v0, Landroidx/compose/ui/graphics/shadow/DropShadowPainter;->l0:Lg60;

    .line 179
    .line 180
    invoke-interface {v1}, Lsv1;->e()J

    .line 181
    .line 182
    .line 183
    move-result-wide v3

    .line 184
    iget-object v5, v9, Ltw1;->i:Ls67;

    .line 185
    .line 186
    iget-wide v6, v5, Ls67;->d:J

    .line 187
    .line 188
    iget v0, v0, Landroidx/compose/ui/graphics/shadow/DropShadowPainter;->k0:F

    .line 189
    .line 190
    iget v5, v5, Ls67;->e:F

    .line 191
    .line 192
    mul-float/2addr v0, v5

    .line 193
    const/4 v5, 0x0

    .line 194
    const/high16 v8, 0x3f800000    # 1.0f

    .line 195
    .line 196
    invoke-static {v0, v5, v8}, Lx97;->m(FFF)F

    .line 197
    .line 198
    .line 199
    move-result v0

    .line 200
    iget-object v5, v9, Ltw1;->i:Ls67;

    .line 201
    .line 202
    iget-byte v8, v5, Ls67;->c:B

    .line 203
    .line 204
    move-wide v5, v6

    .line 205
    move v7, v0

    .line 206
    move-object v0, v9

    .line 207
    invoke-virtual/range {v0 .. v8}, Ltw1;->a(Lsv1;Lg60;JJFI)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 208
    .line 209
    .line 210
    invoke-interface/range {p1 .. p1}, Lsv1;->n0()Llr;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    iget-object v0, v0, Llr;->Y:Ljava/lang/Object;

    .line 215
    .line 216
    check-cast v0, Lwl6;

    .line 217
    .line 218
    neg-float v1, v10

    .line 219
    neg-float v2, v11

    .line 220
    invoke-virtual {v0, v1, v2}, Lwl6;->V(FF)V

    .line 221
    .line 222
    .line 223
    return-void

    .line 224
    :catchall_1
    move-exception v0

    .line 225
    invoke-interface/range {p1 .. p1}, Lsv1;->n0()Llr;

    .line 226
    .line 227
    .line 228
    move-result-object v1

    .line 229
    iget-object v1, v1, Llr;->Y:Ljava/lang/Object;

    .line 230
    .line 231
    check-cast v1, Lwl6;

    .line 232
    .line 233
    neg-float v2, v10

    .line 234
    neg-float v3, v11

    .line 235
    invoke-virtual {v1, v2, v3}, Lwl6;->V(FF)V

    .line 236
    .line 237
    .line 238
    throw v0

    .line 239
    :goto_1
    monitor-exit v2

    .line 240
    throw v0
.end method
