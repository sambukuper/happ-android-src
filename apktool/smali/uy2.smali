.class public final synthetic Luy2;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic X:Lkx4;

.field public final synthetic Y:Lq80;

.field public final synthetic Z:Lkx4;

.field public final synthetic f0:Z

.field public final synthetic g0:Lwx3;

.field public final synthetic h0:Z

.field public final synthetic i0:Li48;

.field public final synthetic j0:Ly68;

.field public final synthetic k0:Z

.field public final synthetic l0:Lw58;

.field public final synthetic m0:Lxz4;

.field public final synthetic n0:Lrn2;

.field public final synthetic o0:Lrn2;

.field public final synthetic p0:Lgg5;

.field public final synthetic q0:Lde3;

.field public final synthetic r0:Lo88;

.field public final synthetic s0:Lay6;

.field public final synthetic t0:Ly05;

.field public final synthetic u0:Ljava/lang/String;

.field public final synthetic v0:Lkx4;

.field public final synthetic w0:B


# direct methods
.method public synthetic constructor <init>(Lkx4;Lq80;Lkx4;ZLwx3;ZLi48;Ly68;ZLw58;Lxz4;Lrn2;Lrn2;Lgg5;Lde3;Lo88;Lay6;Ly05;Ljava/lang/String;Lkx4;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Luy2;->X:Lkx4;

    .line 5
    .line 6
    iput-object p2, p0, Luy2;->Y:Lq80;

    .line 7
    .line 8
    iput-object p3, p0, Luy2;->Z:Lkx4;

    .line 9
    .line 10
    iput-boolean p4, p0, Luy2;->f0:Z

    .line 11
    .line 12
    iput-object p5, p0, Luy2;->g0:Lwx3;

    .line 13
    .line 14
    iput-boolean p6, p0, Luy2;->h0:Z

    .line 15
    .line 16
    iput-object p7, p0, Luy2;->i0:Li48;

    .line 17
    .line 18
    iput-object p8, p0, Luy2;->j0:Ly68;

    .line 19
    .line 20
    iput-boolean p9, p0, Luy2;->k0:Z

    .line 21
    .line 22
    iput-object p10, p0, Luy2;->l0:Lw58;

    .line 23
    .line 24
    iput-object p11, p0, Luy2;->m0:Lxz4;

    .line 25
    .line 26
    iput-object p12, p0, Luy2;->n0:Lrn2;

    .line 27
    .line 28
    iput-object p13, p0, Luy2;->o0:Lrn2;

    .line 29
    .line 30
    iput-object p14, p0, Luy2;->p0:Lgg5;

    .line 31
    .line 32
    iput-object p15, p0, Luy2;->q0:Lde3;

    .line 33
    .line 34
    move-object/from16 p1, p16

    .line 35
    .line 36
    iput-object p1, p0, Luy2;->r0:Lo88;

    .line 37
    .line 38
    move-object/from16 p1, p17

    .line 39
    .line 40
    iput-object p1, p0, Luy2;->s0:Lay6;

    .line 41
    .line 42
    move-object/from16 p1, p18

    .line 43
    .line 44
    iput-object p1, p0, Luy2;->t0:Ly05;

    .line 45
    .line 46
    move-object/from16 p1, p19

    .line 47
    .line 48
    iput-object p1, p0, Luy2;->u0:Ljava/lang/String;

    .line 49
    .line 50
    move-object/from16 p1, p20

    .line 51
    .line 52
    iput-object p1, p0, Luy2;->v0:Lkx4;

    .line 53
    .line 54
    move/from16 p1, p21

    .line 55
    .line 56
    iput-byte p1, p0, Luy2;->w0:B

    .line 57
    .line 58
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v11, p1

    .line 4
    .line 5
    check-cast v11, Llp2;

    .line 6
    .line 7
    move-object/from16 v1, p2

    .line 8
    .line 9
    check-cast v1, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    and-int/lit8 v2, v1, 0x3

    .line 16
    .line 17
    const/4 v3, 0x2

    .line 18
    const/4 v4, 0x0

    .line 19
    const/4 v5, 0x1

    .line 20
    if-eq v2, v3, :cond_0

    .line 21
    .line 22
    move v2, v5

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move v2, v4

    .line 25
    :goto_0
    and-int/2addr v1, v5

    .line 26
    invoke-virtual {v11, v1, v2}, Llp2;->N(IZ)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_3

    .line 31
    .line 32
    iget-object v1, v0, Luy2;->X:Lkx4;

    .line 33
    .line 34
    iget-object v2, v0, Luy2;->Y:Lq80;

    .line 35
    .line 36
    invoke-static {v1, v2}, Lhi5;->P(Lkx4;Lq80;)Lkx4;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    iget-object v2, v0, Luy2;->Z:Lkx4;

    .line 41
    .line 42
    invoke-interface {v1, v2}, Lkx4;->y(Lkx4;)Lkx4;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    iget-boolean v2, v0, Luy2;->f0:Z

    .line 47
    .line 48
    iget-object v3, v0, Luy2;->g0:Lwx3;

    .line 49
    .line 50
    if-nez v2, :cond_1

    .line 51
    .line 52
    move-object v5, v3

    .line 53
    goto :goto_1

    .line 54
    :cond_1
    iget-object v2, v0, Luy2;->t0:Ly05;

    .line 55
    .line 56
    invoke-interface {v2}, Llh7;->getValue()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    move-object/from16 v17, v2

    .line 61
    .line 62
    check-cast v17, Ljava/lang/Boolean;

    .line 63
    .line 64
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    iget-object v2, v3, Lwx3;->f:Lge4;

    .line 68
    .line 69
    iget v13, v3, Lwx3;->a:I

    .line 70
    .line 71
    iget-object v14, v3, Lwx3;->b:Ljava/lang/Boolean;

    .line 72
    .line 73
    iget v15, v3, Lwx3;->c:I

    .line 74
    .line 75
    iget v3, v3, Lwx3;->d:I

    .line 76
    .line 77
    new-instance v12, Lwx3;

    .line 78
    .line 79
    move-object/from16 v18, v2

    .line 80
    .line 81
    move/from16 v16, v3

    .line 82
    .line 83
    invoke-direct/range {v12 .. v18}, Lwx3;-><init>(ILjava/lang/Boolean;IILjava/lang/Boolean;Lge4;)V

    .line 84
    .line 85
    .line 86
    move-object v5, v12

    .line 87
    :goto_1
    new-instance v8, Lfe7;

    .line 88
    .line 89
    iget-boolean v2, v0, Luy2;->h0:Z

    .line 90
    .line 91
    iget-object v3, v0, Luy2;->i0:Li48;

    .line 92
    .line 93
    if-eqz v2, :cond_2

    .line 94
    .line 95
    iget-wide v6, v3, Li48;->j:J

    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_2
    iget-wide v6, v3, Li48;->i:J

    .line 99
    .line 100
    :goto_2
    invoke-direct {v8, v6, v7}, Lfe7;-><init>(J)V

    .line 101
    .line 102
    .line 103
    new-instance v6, Lwy2;

    .line 104
    .line 105
    iget-byte v7, v0, Luy2;->w0:B

    .line 106
    .line 107
    iget-object v9, v0, Luy2;->u0:Ljava/lang/String;

    .line 108
    .line 109
    iget-object v10, v0, Luy2;->v0:Lkx4;

    .line 110
    .line 111
    invoke-direct {v6, v4, v7, v9, v10}, Lwy2;-><init>(BILjava/lang/Object;Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    const v4, -0x4e5c8297

    .line 115
    .line 116
    .line 117
    invoke-static {v4, v6, v11}, Ljm4;->U(ILon2;Llp2;)Lzy0;

    .line 118
    .line 119
    .line 120
    move-result-object v16

    .line 121
    new-instance v4, Lxy2;

    .line 122
    .line 123
    iget-boolean v6, v0, Luy2;->k0:Z

    .line 124
    .line 125
    iget-object v7, v0, Luy2;->m0:Lxz4;

    .line 126
    .line 127
    invoke-direct {v4, v6, v2, v7, v3}, Lxy2;-><init>(ZZLxz4;Li48;)V

    .line 128
    .line 129
    .line 130
    const v9, 0x1241febf

    .line 131
    .line 132
    .line 133
    invoke-static {v9, v4, v11}, Ljm4;->U(ILon2;Llp2;)Lzy0;

    .line 134
    .line 135
    .line 136
    move-result-object v24

    .line 137
    new-instance v15, Lq58;

    .line 138
    .line 139
    invoke-direct {v15}, Ljava/lang/Object;-><init>()V

    .line 140
    .line 141
    .line 142
    new-instance v9, Lz48;

    .line 143
    .line 144
    iget-object v13, v0, Luy2;->j0:Ly68;

    .line 145
    .line 146
    iget-object v14, v0, Luy2;->l0:Lw58;

    .line 147
    .line 148
    iget-object v4, v0, Luy2;->n0:Lrn2;

    .line 149
    .line 150
    iget-object v10, v0, Luy2;->o0:Lrn2;

    .line 151
    .line 152
    iget-object v12, v0, Luy2;->p0:Lgg5;

    .line 153
    .line 154
    move/from16 v20, v2

    .line 155
    .line 156
    move-object/from16 v23, v3

    .line 157
    .line 158
    move-object/from16 v17, v4

    .line 159
    .line 160
    move/from16 v19, v6

    .line 161
    .line 162
    move-object/from16 v21, v7

    .line 163
    .line 164
    move-object/from16 v18, v10

    .line 165
    .line 166
    move-object/from16 v22, v12

    .line 167
    .line 168
    move-object v12, v9

    .line 169
    invoke-direct/range {v12 .. v24}, Lz48;-><init>(Ly68;Lw58;Lq58;Lzy0;Lrn2;Lrn2;ZZLxz4;Lgg5;Li48;Lzy0;)V

    .line 170
    .line 171
    .line 172
    move/from16 v2, v19

    .line 173
    .line 174
    const/4 v3, 0x6

    .line 175
    move-object v6, v14

    .line 176
    const/16 v14, 0x1288

    .line 177
    .line 178
    move-object v4, v13

    .line 179
    move v13, v3

    .line 180
    iget-object v3, v0, Luy2;->q0:Lde3;

    .line 181
    .line 182
    move-object v7, v4

    .line 183
    iget-object v4, v0, Luy2;->r0:Lo88;

    .line 184
    .line 185
    iget-object v10, v0, Luy2;->s0:Lay6;

    .line 186
    .line 187
    const/4 v12, 0x0

    .line 188
    move-object v0, v7

    .line 189
    move-object/from16 v7, v21

    .line 190
    .line 191
    invoke-static/range {v0 .. v14}, Lx30;->b(Ly68;Lkx4;ZLde3;Lo88;Lwx3;Lw58;Lxz4;Ld90;Lo48;Lay6;Llp2;III)V

    .line 192
    .line 193
    .line 194
    goto :goto_3

    .line 195
    :cond_3
    invoke-virtual {v11}, Llp2;->Q()V

    .line 196
    .line 197
    .line 198
    :goto_3
    sget-object v0, Ldn8;->a:Ldn8;

    .line 199
    .line 200
    return-object v0
.end method
