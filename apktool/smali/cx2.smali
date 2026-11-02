.class public final synthetic Lcx2;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic X:Lkx4;

.field public final synthetic Y:Z

.field public final synthetic Z:Lj74;

.field public final synthetic f0:Lgg5;

.field public final synthetic g0:Lgt;

.field public final synthetic h0:Lp8;

.field public final synthetic i0:Lhe2;

.field public final synthetic j0:Z

.field public final synthetic k0:Ltd;

.field public final synthetic l0:Lgn2;


# direct methods
.method public synthetic constructor <init>(Lkx4;ZLj74;Lgg5;Lgt;Lp8;Lhe2;ZLtd;Lgn2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcx2;->X:Lkx4;

    .line 5
    .line 6
    iput-boolean p2, p0, Lcx2;->Y:Z

    .line 7
    .line 8
    iput-object p3, p0, Lcx2;->Z:Lj74;

    .line 9
    .line 10
    iput-object p4, p0, Lcx2;->f0:Lgg5;

    .line 11
    .line 12
    iput-object p5, p0, Lcx2;->g0:Lgt;

    .line 13
    .line 14
    iput-object p6, p0, Lcx2;->h0:Lp8;

    .line 15
    .line 16
    iput-object p7, p0, Lcx2;->i0:Lhe2;

    .line 17
    .line 18
    iput-boolean p8, p0, Lcx2;->j0:Z

    .line 19
    .line 20
    iput-object p9, p0, Lcx2;->k0:Ltd;

    .line 21
    .line 22
    iput-object p10, p0, Lcx2;->l0:Lgn2;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v9, p1

    .line 4
    .line 5
    check-cast v9, Llp2;

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
    const/4 v4, 0x1

    .line 19
    const/4 v5, 0x0

    .line 20
    if-eq v2, v3, :cond_0

    .line 21
    .line 22
    move v2, v4

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move v2, v5

    .line 25
    :goto_0
    and-int/2addr v1, v4

    .line 26
    invoke-virtual {v9, v1, v2}, Llp2;->N(IZ)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_4

    .line 31
    .line 32
    iget-object v1, v0, Lcx2;->X:Lkx4;

    .line 33
    .line 34
    iget-boolean v2, v0, Lcx2;->Y:Z

    .line 35
    .line 36
    iget-object v11, v0, Lcx2;->Z:Lj74;

    .line 37
    .line 38
    if-eqz v2, :cond_3

    .line 39
    .line 40
    const v2, 0x6673b95c

    .line 41
    .line 42
    .line 43
    invoke-virtual {v9, v2}, Llp2;->W(I)V

    .line 44
    .line 45
    .line 46
    const v2, 0x6c1aa3a6

    .line 47
    .line 48
    .line 49
    invoke-virtual {v9, v2}, Llp2;->W(I)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    sget-object v2, Lep;->z:Lox1;

    .line 59
    .line 60
    invoke-virtual {v9, v2}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    check-cast v2, Ldp;

    .line 65
    .line 66
    iget-object v2, v2, Ldp;->c:Lxr;

    .line 67
    .line 68
    iget-wide v2, v2, Lxr;->b:J

    .line 69
    .line 70
    const v4, 0x3f19999a    # 0.6f

    .line 71
    .line 72
    .line 73
    invoke-static {v4, v2, v3}, Ldw0;->b(FJ)J

    .line 74
    .line 75
    .line 76
    move-result-wide v2

    .line 77
    const v4, 0x3df5c28f    # 0.12f

    .line 78
    .line 79
    .line 80
    invoke-static {v4, v2, v3}, Ldw0;->b(FJ)J

    .line 81
    .line 82
    .line 83
    move-result-wide v13

    .line 84
    sget-object v4, Ly01;->n:Lox1;

    .line 85
    .line 86
    invoke-virtual {v9, v4}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    move-object v12, v4

    .line 91
    check-cast v12, Lz24;

    .line 92
    .line 93
    invoke-virtual {v9, v11}, Llp2;->h(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v4

    .line 97
    invoke-virtual {v12}, Ljava/lang/Enum;->ordinal()I

    .line 98
    .line 99
    .line 100
    move-result v6

    .line 101
    invoke-virtual {v9, v6}, Llp2;->d(I)Z

    .line 102
    .line 103
    .line 104
    move-result v6

    .line 105
    or-int/2addr v4, v6

    .line 106
    invoke-virtual {v9, v13, v14}, Llp2;->e(J)Z

    .line 107
    .line 108
    .line 109
    move-result v6

    .line 110
    or-int/2addr v4, v6

    .line 111
    invoke-virtual {v9, v2, v3}, Llp2;->e(J)Z

    .line 112
    .line 113
    .line 114
    move-result v6

    .line 115
    or-int/2addr v4, v6

    .line 116
    invoke-virtual {v9}, Llp2;->K()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v6

    .line 120
    if-nez v4, :cond_1

    .line 121
    .line 122
    sget-object v4, Lzz0;->a:Lbe;

    .line 123
    .line 124
    if-ne v6, v4, :cond_2

    .line 125
    .line 126
    :cond_1
    new-instance v10, Ly60;

    .line 127
    .line 128
    move-wide v15, v2

    .line 129
    invoke-direct/range {v10 .. v16}, Ly60;-><init>(Lny6;Lz24;JJ)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v9, v10}, Llp2;->g0(Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    move-object v6, v10

    .line 136
    :cond_2
    check-cast v6, Lgn2;

    .line 137
    .line 138
    invoke-static {v1, v6}, Lw79;->t(Lkx4;Lgn2;)Lkx4;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    invoke-virtual {v9, v5}, Llp2;->p(Z)V

    .line 143
    .line 144
    .line 145
    :goto_1
    invoke-virtual {v9, v5}, Llp2;->p(Z)V

    .line 146
    .line 147
    .line 148
    goto :goto_2

    .line 149
    :cond_3
    const v2, 0x6673baf9

    .line 150
    .line 151
    .line 152
    invoke-virtual {v9, v2}, Llp2;->W(I)V

    .line 153
    .line 154
    .line 155
    goto :goto_1

    .line 156
    :goto_2
    const/4 v10, 0x0

    .line 157
    iget-object v2, v0, Lcx2;->f0:Lgg5;

    .line 158
    .line 159
    iget-object v3, v0, Lcx2;->g0:Lgt;

    .line 160
    .line 161
    iget-object v4, v0, Lcx2;->h0:Lp8;

    .line 162
    .line 163
    iget-object v5, v0, Lcx2;->i0:Lhe2;

    .line 164
    .line 165
    iget-boolean v6, v0, Lcx2;->j0:Z

    .line 166
    .line 167
    iget-object v7, v0, Lcx2;->k0:Ltd;

    .line 168
    .line 169
    iget-object v8, v0, Lcx2;->l0:Lgn2;

    .line 170
    .line 171
    move-object v0, v1

    .line 172
    move-object v1, v11

    .line 173
    invoke-static/range {v0 .. v10}, Ljb5;->c(Lkx4;Lj74;Lgg5;Lgt;Lp8;Lhe2;ZLtd;Lgn2;Llp2;I)V

    .line 174
    .line 175
    .line 176
    goto :goto_3

    .line 177
    :cond_4
    invoke-virtual {v9}, Llp2;->Q()V

    .line 178
    .line 179
    .line 180
    :goto_3
    sget-object v0, Ldn8;->a:Ldn8;

    .line 181
    .line 182
    return-object v0
.end method
