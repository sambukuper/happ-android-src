.class public final synthetic Ltw2;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic X:Z

.field public final synthetic Y:Lx67;

.field public final synthetic Z:Lkx4;

.field public final synthetic f0:Z

.field public final synthetic g0:Ldn2;

.field public final synthetic h0:Lig5;

.field public final synthetic i0:Llh7;

.field public final synthetic j0:Ljava/lang/String;

.field public final synthetic k0:Lo88;

.field public final synthetic l0:B

.field public final synthetic m0:B

.field public final synthetic n0:I

.field public final synthetic o0:Z

.field public final synthetic p0:Z


# direct methods
.method public synthetic constructor <init>(ZLx67;Lkx4;ZLdn2;Lig5;Llh7;Ljava/lang/String;Lo88;IIIIZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Ltw2;->X:Z

    iput-object p2, p0, Ltw2;->Y:Lx67;

    iput-object p3, p0, Ltw2;->Z:Lkx4;

    iput-boolean p4, p0, Ltw2;->f0:Z

    iput-object p5, p0, Ltw2;->g0:Ldn2;

    iput-object p6, p0, Ltw2;->h0:Lig5;

    iput-object p7, p0, Ltw2;->i0:Llh7;

    iput-object p8, p0, Ltw2;->j0:Ljava/lang/String;

    iput-object p9, p0, Ltw2;->k0:Lo88;

    iput-byte p10, p0, Ltw2;->l0:B

    iput-byte p11, p0, Ltw2;->m0:B

    iput p12, p0, Ltw2;->n0:I

    iput-boolean p13, p0, Ltw2;->o0:Z

    iput-boolean p14, p0, Ltw2;->p0:Z

    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

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
    if-eqz v1, :cond_2

    .line 31
    .line 32
    iget-boolean v1, v0, Ltw2;->X:Z

    .line 33
    .line 34
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 35
    .line 36
    .line 37
    move-result-object v9

    .line 38
    sget-object v2, Lhx4;->X:Lhx4;

    .line 39
    .line 40
    iget-object v10, v0, Ltw2;->Y:Lx67;

    .line 41
    .line 42
    invoke-static {v2, v10}, Lw39;->k(Lkx4;Lx67;)Lkx4;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    iget-object v3, v0, Ltw2;->Z:Lkx4;

    .line 47
    .line 48
    invoke-interface {v2, v3}, Lkx4;->y(Lkx4;)Lkx4;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    iget-object v3, v0, Ltw2;->i0:Llh7;

    .line 53
    .line 54
    invoke-interface {v3}, Llh7;->getValue()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    check-cast v3, Ldw0;

    .line 59
    .line 60
    iget-wide v7, v3, Ldw0;->a:J

    .line 61
    .line 62
    sget-object v3, Lu70;->e:Lx03;

    .line 63
    .line 64
    invoke-static {v2, v7, v8, v3}, Lu15;->f(Lkx4;JLx67;)Lkx4;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    iget-boolean v12, v0, Ltw2;->f0:Z

    .line 69
    .line 70
    if-eqz v12, :cond_1

    .line 71
    .line 72
    if-nez v1, :cond_1

    .line 73
    .line 74
    move v4, v6

    .line 75
    :cond_1
    const/4 v1, 0x0

    .line 76
    const/16 v8, 0xd

    .line 77
    .line 78
    const/4 v3, 0x0

    .line 79
    move-object v7, v5

    .line 80
    const/4 v5, 0x0

    .line 81
    iget-object v6, v0, Ltw2;->g0:Ldn2;

    .line 82
    .line 83
    move/from16 v22, v4

    .line 84
    .line 85
    move-object v4, v1

    .line 86
    move-object v1, v2

    .line 87
    move/from16 v2, v22

    .line 88
    .line 89
    invoke-static/range {v1 .. v8}, Lvj8;->x(Lkx4;ZLxz4;Landroidx/compose/material3/c;Ldn2;Ldn2;Llp2;I)Lkx4;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    move-object/from16 v20, v6

    .line 94
    .line 95
    iget-object v2, v0, Ltw2;->h0:Lig5;

    .line 96
    .line 97
    invoke-static {v1, v2}, Los4;->w(Lkx4;Lgg5;)Lkx4;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    move-object/from16 v19, v10

    .line 102
    .line 103
    new-instance v10, Lvw2;

    .line 104
    .line 105
    const/16 v21, 0x1

    .line 106
    .line 107
    iget-object v11, v0, Ltw2;->j0:Ljava/lang/String;

    .line 108
    .line 109
    iget-object v13, v0, Ltw2;->k0:Lo88;

    .line 110
    .line 111
    iget-byte v14, v0, Ltw2;->l0:B

    .line 112
    .line 113
    iget-byte v15, v0, Ltw2;->m0:B

    .line 114
    .line 115
    iget v2, v0, Ltw2;->n0:I

    .line 116
    .line 117
    iget-boolean v3, v0, Ltw2;->o0:Z

    .line 118
    .line 119
    iget-boolean v0, v0, Ltw2;->p0:Z

    .line 120
    .line 121
    move/from16 v18, v0

    .line 122
    .line 123
    move/from16 v16, v2

    .line 124
    .line 125
    move/from16 v17, v3

    .line 126
    .line 127
    invoke-direct/range {v10 .. v21}, Lvw2;-><init>(Ljava/lang/String;ZLo88;IIIIZLx67;Ldn2;B)V

    .line 128
    .line 129
    .line 130
    const v0, 0x6c71a6b9

    .line 131
    .line 132
    .line 133
    invoke-static {v0, v10, v7}, Ljm4;->U(ILon2;Llp2;)Lzy0;

    .line 134
    .line 135
    .line 136
    move-result-object v4

    .line 137
    const/16 v6, 0x6000

    .line 138
    .line 139
    const/4 v2, 0x0

    .line 140
    const/4 v3, 0x0

    .line 141
    move-object v5, v7

    .line 142
    move-object v0, v9

    .line 143
    invoke-static/range {v0 .. v6}, Lkm4;->c(Ljava/lang/Object;Lkx4;Lta2;Ljava/lang/String;Lzy0;Llp2;I)V

    .line 144
    .line 145
    .line 146
    goto :goto_1

    .line 147
    :cond_2
    move-object v7, v5

    .line 148
    invoke-virtual {v7}, Llp2;->Q()V

    .line 149
    .line 150
    .line 151
    :goto_1
    sget-object v0, Ldn8;->a:Ldn8;

    .line 152
    .line 153
    return-object v0
.end method
