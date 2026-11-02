.class public final synthetic Lrw2;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Ljava/lang/String;

.field public final synthetic Z:Lkx4;

.field public final synthetic f0:Z

.field public final synthetic g0:Z

.field public final synthetic h0:Lo88;

.field public final synthetic i0:B

.field public final synthetic j0:B

.field public final synthetic k0:I

.field public final synthetic l0:Z

.field public final synthetic m0:Z

.field public final synthetic n0:Lig5;

.field public final synthetic o0:Lx67;

.field public final synthetic p0:Ldw0;

.field public final synthetic q0:Ldw0;

.field public final synthetic r0:Ldw0;

.field public final synthetic s0:Ldw0;

.field public final synthetic t0:Ldn2;

.field public final synthetic u0:I

.field public final synthetic v0:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lkx4;ZZLo88;IIIIZLig5;Lx67;Ldw0;Ldw0;Ldw0;Ldw0;Ldn2;IIB)V
    .locals 1

    .line 1
    move/from16 v0, p20

    .line 2
    .line 3
    iput-byte v0, p0, Lrw2;->X:B

    .line 4
    .line 5
    iput-object p1, p0, Lrw2;->Y:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p2, p0, Lrw2;->Z:Lkx4;

    .line 8
    .line 9
    iput-boolean p3, p0, Lrw2;->f0:Z

    .line 10
    .line 11
    iput-boolean p4, p0, Lrw2;->g0:Z

    .line 12
    .line 13
    iput-object p5, p0, Lrw2;->h0:Lo88;

    .line 14
    .line 15
    iput-byte p6, p0, Lrw2;->i0:B

    .line 16
    .line 17
    iput-byte p7, p0, Lrw2;->j0:B

    .line 18
    .line 19
    iput p8, p0, Lrw2;->k0:I

    .line 20
    .line 21
    iput-boolean p9, p0, Lrw2;->l0:Z

    .line 22
    .line 23
    iput-boolean p10, p0, Lrw2;->m0:Z

    .line 24
    .line 25
    iput-object p11, p0, Lrw2;->n0:Lig5;

    .line 26
    .line 27
    iput-object p12, p0, Lrw2;->o0:Lx67;

    .line 28
    .line 29
    iput-object p13, p0, Lrw2;->p0:Ldw0;

    .line 30
    .line 31
    iput-object p14, p0, Lrw2;->q0:Ldw0;

    .line 32
    .line 33
    move-object/from16 p1, p15

    .line 34
    .line 35
    iput-object p1, p0, Lrw2;->r0:Ldw0;

    .line 36
    .line 37
    move-object/from16 p1, p16

    .line 38
    .line 39
    iput-object p1, p0, Lrw2;->s0:Ldw0;

    .line 40
    .line 41
    move-object/from16 p1, p17

    .line 42
    .line 43
    iput-object p1, p0, Lrw2;->t0:Ldn2;

    .line 44
    .line 45
    move/from16 p1, p18

    .line 46
    .line 47
    iput p1, p0, Lrw2;->u0:I

    .line 48
    .line 49
    move/from16 p1, p19

    .line 50
    .line 51
    iput p1, p0, Lrw2;->v0:I

    .line 52
    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    .line 55
    .line 56
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 44

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, Lrw2;->X:B

    .line 4
    .line 5
    sget-object v2, Ldn8;->a:Ldn8;

    .line 6
    .line 7
    iget v3, v0, Lrw2;->u0:I

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    move-object/from16 v21, p1

    .line 13
    .line 14
    check-cast v21, Llp2;

    .line 15
    .line 16
    move-object/from16 v1, p2

    .line 17
    .line 18
    check-cast v1, Ljava/lang/Integer;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    or-int/lit8 v1, v3, 0x1

    .line 24
    .line 25
    invoke-static {v1}, Lw79;->P(I)I

    .line 26
    .line 27
    .line 28
    move-result v22

    .line 29
    iget v1, v0, Lrw2;->v0:I

    .line 30
    .line 31
    invoke-static {v1}, Lw79;->P(I)I

    .line 32
    .line 33
    .line 34
    move-result v23

    .line 35
    iget-object v4, v0, Lrw2;->Y:Ljava/lang/String;

    .line 36
    .line 37
    iget-object v5, v0, Lrw2;->Z:Lkx4;

    .line 38
    .line 39
    iget-boolean v6, v0, Lrw2;->f0:Z

    .line 40
    .line 41
    iget-boolean v7, v0, Lrw2;->g0:Z

    .line 42
    .line 43
    iget-object v8, v0, Lrw2;->h0:Lo88;

    .line 44
    .line 45
    iget-byte v9, v0, Lrw2;->i0:B

    .line 46
    .line 47
    iget-byte v10, v0, Lrw2;->j0:B

    .line 48
    .line 49
    iget v11, v0, Lrw2;->k0:I

    .line 50
    .line 51
    iget-boolean v12, v0, Lrw2;->l0:Z

    .line 52
    .line 53
    iget-boolean v13, v0, Lrw2;->m0:Z

    .line 54
    .line 55
    iget-object v14, v0, Lrw2;->n0:Lig5;

    .line 56
    .line 57
    iget-object v15, v0, Lrw2;->o0:Lx67;

    .line 58
    .line 59
    iget-object v1, v0, Lrw2;->p0:Ldw0;

    .line 60
    .line 61
    iget-object v3, v0, Lrw2;->q0:Ldw0;

    .line 62
    .line 63
    move-object/from16 v16, v1

    .line 64
    .line 65
    iget-object v1, v0, Lrw2;->r0:Ldw0;

    .line 66
    .line 67
    move-object/from16 v18, v1

    .line 68
    .line 69
    iget-object v1, v0, Lrw2;->s0:Ldw0;

    .line 70
    .line 71
    iget-object v0, v0, Lrw2;->t0:Ldn2;

    .line 72
    .line 73
    move-object/from16 v20, v0

    .line 74
    .line 75
    move-object/from16 v19, v1

    .line 76
    .line 77
    move-object/from16 v17, v3

    .line 78
    .line 79
    invoke-static/range {v4 .. v23}, Lkm4;->i(Ljava/lang/String;Lkx4;ZZLo88;IIIIZLig5;Lx67;Ldw0;Ldw0;Ldw0;Ldw0;Ldn2;Llp2;II)V

    .line 80
    .line 81
    .line 82
    return-object v2

    .line 83
    :pswitch_0
    move-object/from16 v41, p1

    .line 84
    .line 85
    check-cast v41, Llp2;

    .line 86
    .line 87
    move-object/from16 v1, p2

    .line 88
    .line 89
    check-cast v1, Ljava/lang/Integer;

    .line 90
    .line 91
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    or-int/lit8 v1, v3, 0x1

    .line 95
    .line 96
    invoke-static {v1}, Lw79;->P(I)I

    .line 97
    .line 98
    .line 99
    move-result v42

    .line 100
    iget-object v1, v0, Lrw2;->Y:Ljava/lang/String;

    .line 101
    .line 102
    iget-object v3, v0, Lrw2;->Z:Lkx4;

    .line 103
    .line 104
    iget-boolean v4, v0, Lrw2;->f0:Z

    .line 105
    .line 106
    iget-boolean v5, v0, Lrw2;->g0:Z

    .line 107
    .line 108
    iget-object v6, v0, Lrw2;->h0:Lo88;

    .line 109
    .line 110
    iget-byte v7, v0, Lrw2;->i0:B

    .line 111
    .line 112
    iget-byte v8, v0, Lrw2;->j0:B

    .line 113
    .line 114
    iget v9, v0, Lrw2;->k0:I

    .line 115
    .line 116
    iget-boolean v10, v0, Lrw2;->l0:Z

    .line 117
    .line 118
    iget-boolean v11, v0, Lrw2;->m0:Z

    .line 119
    .line 120
    iget-object v12, v0, Lrw2;->n0:Lig5;

    .line 121
    .line 122
    iget-object v13, v0, Lrw2;->o0:Lx67;

    .line 123
    .line 124
    iget-object v14, v0, Lrw2;->p0:Ldw0;

    .line 125
    .line 126
    iget-object v15, v0, Lrw2;->q0:Ldw0;

    .line 127
    .line 128
    move-object/from16 v24, v1

    .line 129
    .line 130
    iget-object v1, v0, Lrw2;->r0:Ldw0;

    .line 131
    .line 132
    move-object/from16 v38, v1

    .line 133
    .line 134
    iget-object v1, v0, Lrw2;->s0:Ldw0;

    .line 135
    .line 136
    move-object/from16 v39, v1

    .line 137
    .line 138
    iget-object v1, v0, Lrw2;->t0:Ldn2;

    .line 139
    .line 140
    iget v0, v0, Lrw2;->v0:I

    .line 141
    .line 142
    move/from16 v43, v0

    .line 143
    .line 144
    move-object/from16 v40, v1

    .line 145
    .line 146
    move-object/from16 v25, v3

    .line 147
    .line 148
    move/from16 v26, v4

    .line 149
    .line 150
    move/from16 v27, v5

    .line 151
    .line 152
    move-object/from16 v28, v6

    .line 153
    .line 154
    move/from16 v29, v7

    .line 155
    .line 156
    move/from16 v30, v8

    .line 157
    .line 158
    move/from16 v31, v9

    .line 159
    .line 160
    move/from16 v32, v10

    .line 161
    .line 162
    move/from16 v33, v11

    .line 163
    .line 164
    move-object/from16 v34, v12

    .line 165
    .line 166
    move-object/from16 v35, v13

    .line 167
    .line 168
    move-object/from16 v36, v14

    .line 169
    .line 170
    move-object/from16 v37, v15

    .line 171
    .line 172
    invoke-static/range {v24 .. v43}, Lkm4;->e(Ljava/lang/String;Lkx4;ZZLo88;IIIIZLig5;Lx67;Ldw0;Ldw0;Ldw0;Ldw0;Ldn2;Llp2;II)V

    .line 173
    .line 174
    .line 175
    return-object v2

    .line 176
    nop

    .line 177
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
