.class public final synthetic Lsw2;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic X:Z

.field public final synthetic Y:Lx67;

.field public final synthetic Z:Lkx4;

.field public final synthetic f0:Lkx4;

.field public final synthetic g0:Z

.field public final synthetic h0:Ldn2;

.field public final synthetic i0:Lig5;

.field public final synthetic j0:Llh7;

.field public final synthetic k0:Ly05;

.field public final synthetic l0:Ljava/lang/String;

.field public final synthetic m0:Lo88;

.field public final synthetic n0:B

.field public final synthetic o0:B

.field public final synthetic p0:I

.field public final synthetic q0:Z

.field public final synthetic r0:Z


# direct methods
.method public synthetic constructor <init>(ZLx67;Lkx4;Lkx4;ZLdn2;Lig5;Llh7;Ly05;Ljava/lang/String;Lo88;IIIIZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lsw2;->X:Z

    .line 5
    .line 6
    iput-object p2, p0, Lsw2;->Y:Lx67;

    .line 7
    .line 8
    iput-object p3, p0, Lsw2;->Z:Lkx4;

    .line 9
    .line 10
    iput-object p4, p0, Lsw2;->f0:Lkx4;

    .line 11
    .line 12
    iput-boolean p5, p0, Lsw2;->g0:Z

    .line 13
    .line 14
    iput-object p6, p0, Lsw2;->h0:Ldn2;

    .line 15
    .line 16
    iput-object p7, p0, Lsw2;->i0:Lig5;

    .line 17
    .line 18
    iput-object p8, p0, Lsw2;->j0:Llh7;

    .line 19
    .line 20
    iput-object p9, p0, Lsw2;->k0:Ly05;

    .line 21
    .line 22
    iput-object p10, p0, Lsw2;->l0:Ljava/lang/String;

    .line 23
    .line 24
    iput-object p11, p0, Lsw2;->m0:Lo88;

    .line 25
    .line 26
    iput-byte p12, p0, Lsw2;->n0:B

    .line 27
    .line 28
    iput-byte p13, p0, Lsw2;->o0:B

    .line 29
    .line 30
    iput p14, p0, Lsw2;->p0:I

    .line 31
    .line 32
    iput-boolean p15, p0, Lsw2;->q0:Z

    .line 33
    .line 34
    move/from16 p1, p16

    .line 35
    .line 36
    iput-boolean p1, p0, Lsw2;->r0:Z

    .line 37
    .line 38
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v5, p1

    .line 4
    .line 5
    check-cast v5, Llp2;

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
    const/4 v6, 0x1

    .line 20
    if-eq v2, v3, :cond_0

    .line 21
    .line 22
    move v2, v6

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move v2, v4

    .line 25
    :goto_0
    and-int/2addr v1, v6

    .line 26
    invoke-virtual {v5, v1, v2}, Llp2;->N(IZ)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_3

    .line 31
    .line 32
    iget-boolean v1, v0, Lsw2;->X:Z

    .line 33
    .line 34
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 35
    .line 36
    .line 37
    move-result-object v9

    .line 38
    iget-object v2, v0, Lsw2;->j0:Llh7;

    .line 39
    .line 40
    invoke-interface {v2}, Llh7;->getValue()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    check-cast v2, Ljava/lang/Number;

    .line 45
    .line 46
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    sget-object v3, Lhx4;->X:Lhx4;

    .line 51
    .line 52
    invoke-static {v3, v2, v2}, Lci8;->L(Lkx4;FF)Lkx4;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    iget-object v10, v0, Lsw2;->Y:Lx67;

    .line 57
    .line 58
    invoke-static {v2, v10}, Lw39;->k(Lkx4;Lx67;)Lkx4;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    iget-object v3, v0, Lsw2;->Z:Lkx4;

    .line 63
    .line 64
    invoke-interface {v2, v3}, Lkx4;->y(Lkx4;)Lkx4;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-virtual {v5}, Llp2;->K()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    sget-object v7, Lzz0;->a:Lbe;

    .line 73
    .line 74
    if-ne v3, v7, :cond_1

    .line 75
    .line 76
    new-instance v3, Lgh;

    .line 77
    .line 78
    const/4 v7, 0x4

    .line 79
    iget-object v8, v0, Lsw2;->k0:Ly05;

    .line 80
    .line 81
    invoke-direct {v3, v8, v7}, Lgh;-><init>(Ly05;B)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v5, v3}, Llp2;->g0(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    :cond_1
    check-cast v3, Lgn2;

    .line 88
    .line 89
    invoke-static {v2, v3}, Lz51;->J(Lkx4;Lgn2;)Lkx4;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    iget-object v3, v0, Lsw2;->f0:Lkx4;

    .line 94
    .line 95
    invoke-interface {v2, v3}, Lkx4;->y(Lkx4;)Lkx4;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    iget-boolean v12, v0, Lsw2;->g0:Z

    .line 100
    .line 101
    if-eqz v12, :cond_2

    .line 102
    .line 103
    if-nez v1, :cond_2

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_2
    move v6, v4

    .line 107
    :goto_1
    const/4 v1, 0x0

    .line 108
    sget-wide v7, Ldw0;->f:J

    .line 109
    .line 110
    const/4 v3, 0x3

    .line 111
    invoke-static {v1, v3, v7, v8, v4}, Lhl6;->a(FIJZ)Landroidx/compose/material3/c;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    const/4 v3, 0x0

    .line 116
    const/4 v8, 0x5

    .line 117
    move-object v7, v5

    .line 118
    const/4 v5, 0x0

    .line 119
    move-object v1, v2

    .line 120
    move v2, v6

    .line 121
    iget-object v6, v0, Lsw2;->h0:Ldn2;

    .line 122
    .line 123
    invoke-static/range {v1 .. v8}, Lvj8;->x(Lkx4;ZLxz4;Landroidx/compose/material3/c;Ldn2;Ldn2;Llp2;I)Lkx4;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    move-object/from16 v20, v6

    .line 128
    .line 129
    iget-object v2, v0, Lsw2;->i0:Lig5;

    .line 130
    .line 131
    invoke-static {v1, v2}, Los4;->w(Lkx4;Lgg5;)Lkx4;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    move-object/from16 v19, v10

    .line 136
    .line 137
    new-instance v10, Lvw2;

    .line 138
    .line 139
    const/16 v21, 0x0

    .line 140
    .line 141
    iget-object v11, v0, Lsw2;->l0:Ljava/lang/String;

    .line 142
    .line 143
    iget-object v13, v0, Lsw2;->m0:Lo88;

    .line 144
    .line 145
    iget-byte v14, v0, Lsw2;->n0:B

    .line 146
    .line 147
    iget-byte v15, v0, Lsw2;->o0:B

    .line 148
    .line 149
    iget v2, v0, Lsw2;->p0:I

    .line 150
    .line 151
    iget-boolean v3, v0, Lsw2;->q0:Z

    .line 152
    .line 153
    iget-boolean v0, v0, Lsw2;->r0:Z

    .line 154
    .line 155
    move/from16 v18, v0

    .line 156
    .line 157
    move/from16 v16, v2

    .line 158
    .line 159
    move/from16 v17, v3

    .line 160
    .line 161
    invoke-direct/range {v10 .. v21}, Lvw2;-><init>(Ljava/lang/String;ZLo88;IIIIZLx67;Ldn2;B)V

    .line 162
    .line 163
    .line 164
    const v0, -0x4de98f15

    .line 165
    .line 166
    .line 167
    invoke-static {v0, v10, v7}, Ljm4;->U(ILon2;Llp2;)Lzy0;

    .line 168
    .line 169
    .line 170
    move-result-object v4

    .line 171
    const/16 v6, 0x6000

    .line 172
    .line 173
    const/4 v2, 0x0

    .line 174
    const/4 v3, 0x0

    .line 175
    move-object v5, v7

    .line 176
    move-object v0, v9

    .line 177
    invoke-static/range {v0 .. v6}, Lkm4;->c(Ljava/lang/Object;Lkx4;Lta2;Ljava/lang/String;Lzy0;Llp2;I)V

    .line 178
    .line 179
    .line 180
    goto :goto_2

    .line 181
    :cond_3
    move-object v7, v5

    .line 182
    invoke-virtual {v7}, Llp2;->Q()V

    .line 183
    .line 184
    .line 185
    :goto_2
    sget-object v0, Ldn8;->a:Ldn8;

    .line 186
    .line 187
    return-object v0
.end method
