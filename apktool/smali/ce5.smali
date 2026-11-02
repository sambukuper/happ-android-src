.class public final synthetic Lce5;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Z

.field public final synthetic Z:Z

.field public final synthetic f0:Lxz4;

.field public final synthetic g0:Lkx4;

.field public final synthetic h0:Li48;

.field public final synthetic i0:Lx67;

.field public final synthetic j0:F

.field public final synthetic k0:F

.field public final synthetic l0:I

.field public final synthetic m0:S

.field public final synthetic n0:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ZZLxz4;Lkx4;Li48;Lx67;FFIIB)V
    .locals 0

    .line 1
    iput-byte p12, p0, Lce5;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lce5;->n0:Ljava/lang/Object;

    .line 4
    .line 5
    iput-boolean p2, p0, Lce5;->Y:Z

    .line 6
    .line 7
    iput-boolean p3, p0, Lce5;->Z:Z

    .line 8
    .line 9
    iput-object p4, p0, Lce5;->f0:Lxz4;

    .line 10
    .line 11
    iput-object p5, p0, Lce5;->g0:Lkx4;

    .line 12
    .line 13
    iput-object p6, p0, Lce5;->h0:Li48;

    .line 14
    .line 15
    iput-object p7, p0, Lce5;->i0:Lx67;

    .line 16
    .line 17
    iput p8, p0, Lce5;->j0:F

    .line 18
    .line 19
    iput p9, p0, Lce5;->k0:F

    .line 20
    .line 21
    iput p10, p0, Lce5;->l0:I

    .line 22
    .line 23
    iput-short p11, p0, Lce5;->m0:S

    .line 24
    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, Lce5;->X:B

    .line 4
    .line 5
    sget-object v2, Ldn8;->a:Ldn8;

    .line 6
    .line 7
    iget v3, v0, Lce5;->l0:I

    .line 8
    .line 9
    iget-object v4, v0, Lce5;->n0:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    move-object v5, v4

    .line 15
    check-cast v5, Llh4;

    .line 16
    .line 17
    move-object/from16 v14, p1

    .line 18
    .line 19
    check-cast v14, Llp2;

    .line 20
    .line 21
    move-object/from16 v1, p2

    .line 22
    .line 23
    check-cast v1, Ljava/lang/Integer;

    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    or-int/lit8 v1, v3, 0x1

    .line 29
    .line 30
    invoke-static {v1}, Lw79;->P(I)I

    .line 31
    .line 32
    .line 33
    move-result v15

    .line 34
    iget-boolean v6, v0, Lce5;->Y:Z

    .line 35
    .line 36
    iget-boolean v7, v0, Lce5;->Z:Z

    .line 37
    .line 38
    iget-object v8, v0, Lce5;->f0:Lxz4;

    .line 39
    .line 40
    iget-object v9, v0, Lce5;->g0:Lkx4;

    .line 41
    .line 42
    iget-object v10, v0, Lce5;->h0:Li48;

    .line 43
    .line 44
    iget-object v11, v0, Lce5;->i0:Lx67;

    .line 45
    .line 46
    iget v12, v0, Lce5;->j0:F

    .line 47
    .line 48
    iget v13, v0, Lce5;->k0:F

    .line 49
    .line 50
    iget-short v0, v0, Lce5;->m0:S

    .line 51
    .line 52
    move/from16 v16, v0

    .line 53
    .line 54
    invoke-virtual/range {v5 .. v16}, Llh4;->K0(ZZLxz4;Lkx4;Li48;Lx67;FFLlp2;II)V

    .line 55
    .line 56
    .line 57
    return-object v2

    .line 58
    :pswitch_0
    move-object/from16 v16, v4

    .line 59
    .line 60
    check-cast v16, Lqe4;

    .line 61
    .line 62
    move-object/from16 v25, p1

    .line 63
    .line 64
    check-cast v25, Llp2;

    .line 65
    .line 66
    move-object/from16 v1, p2

    .line 67
    .line 68
    check-cast v1, Ljava/lang/Integer;

    .line 69
    .line 70
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    or-int/lit8 v1, v3, 0x1

    .line 74
    .line 75
    invoke-static {v1}, Lw79;->P(I)I

    .line 76
    .line 77
    .line 78
    move-result v26

    .line 79
    iget-boolean v1, v0, Lce5;->Y:Z

    .line 80
    .line 81
    iget-boolean v3, v0, Lce5;->Z:Z

    .line 82
    .line 83
    iget-object v4, v0, Lce5;->f0:Lxz4;

    .line 84
    .line 85
    iget-object v5, v0, Lce5;->g0:Lkx4;

    .line 86
    .line 87
    iget-object v6, v0, Lce5;->h0:Li48;

    .line 88
    .line 89
    iget-object v7, v0, Lce5;->i0:Lx67;

    .line 90
    .line 91
    iget v8, v0, Lce5;->j0:F

    .line 92
    .line 93
    iget v9, v0, Lce5;->k0:F

    .line 94
    .line 95
    iget-short v0, v0, Lce5;->m0:S

    .line 96
    .line 97
    move/from16 v27, v0

    .line 98
    .line 99
    move/from16 v17, v1

    .line 100
    .line 101
    move/from16 v18, v3

    .line 102
    .line 103
    move-object/from16 v19, v4

    .line 104
    .line 105
    move-object/from16 v20, v5

    .line 106
    .line 107
    move-object/from16 v21, v6

    .line 108
    .line 109
    move-object/from16 v22, v7

    .line 110
    .line 111
    move/from16 v23, v8

    .line 112
    .line 113
    move/from16 v24, v9

    .line 114
    .line 115
    invoke-virtual/range {v16 .. v27}, Lqe4;->O(ZZLxz4;Lkx4;Li48;Lx67;FFLlp2;II)V

    .line 116
    .line 117
    .line 118
    return-object v2

    .line 119
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
