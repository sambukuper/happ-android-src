.class public final synthetic Lu43;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Lzy0;

.field public final synthetic Z:Ldn2;

.field public final synthetic f0:Lkx4;

.field public final synthetic g0:Z

.field public final synthetic h0:I

.field public final synthetic i0:Ljava/lang/Object;

.field public final synthetic j0:Ljava/lang/Object;

.field public final synthetic k0:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lkx4;Ldn2;ZLx67;Ls43;Lxz4;Lzy0;I)V
    .locals 1

    .line 24
    const/4 v0, 0x0

    iput-byte v0, p0, Lu43;->X:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu43;->f0:Lkx4;

    iput-object p2, p0, Lu43;->Z:Ldn2;

    iput-boolean p3, p0, Lu43;->g0:Z

    iput-object p4, p0, Lu43;->i0:Ljava/lang/Object;

    iput-object p5, p0, Lu43;->j0:Ljava/lang/Object;

    iput-object p6, p0, Lu43;->k0:Ljava/lang/Object;

    iput-object p7, p0, Lu43;->Y:Lzy0;

    iput p8, p0, Lu43;->h0:I

    return-void
.end method

.method public synthetic constructor <init>(Lzy0;Ldn2;Lkx4;Lrn2;ZLqt4;Lgg5;I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, Lu43;->X:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lu43;->Y:Lzy0;

    .line 8
    .line 9
    iput-object p2, p0, Lu43;->Z:Ldn2;

    .line 10
    .line 11
    iput-object p3, p0, Lu43;->f0:Lkx4;

    .line 12
    .line 13
    iput-object p4, p0, Lu43;->i0:Ljava/lang/Object;

    .line 14
    .line 15
    iput-boolean p5, p0, Lu43;->g0:Z

    .line 16
    .line 17
    iput-object p6, p0, Lu43;->j0:Ljava/lang/Object;

    .line 18
    .line 19
    iput-object p7, p0, Lu43;->k0:Ljava/lang/Object;

    .line 20
    .line 21
    iput p8, p0, Lu43;->h0:I

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, Lu43;->X:B

    .line 4
    .line 5
    sget-object v2, Ldn8;->a:Ldn8;

    .line 6
    .line 7
    iget v3, v0, Lu43;->h0:I

    .line 8
    .line 9
    iget-object v4, v0, Lu43;->k0:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v5, v0, Lu43;->j0:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v6, v0, Lu43;->i0:Ljava/lang/Object;

    .line 14
    .line 15
    packed-switch v1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    move-object v10, v6

    .line 19
    check-cast v10, Lrn2;

    .line 20
    .line 21
    move-object v12, v5

    .line 22
    check-cast v12, Lqt4;

    .line 23
    .line 24
    move-object v13, v4

    .line 25
    check-cast v13, Lgg5;

    .line 26
    .line 27
    move-object/from16 v14, p1

    .line 28
    .line 29
    check-cast v14, Llp2;

    .line 30
    .line 31
    move-object/from16 v1, p2

    .line 32
    .line 33
    check-cast v1, Ljava/lang/Integer;

    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    or-int/lit8 v1, v3, 0x1

    .line 39
    .line 40
    invoke-static {v1}, Lw79;->P(I)I

    .line 41
    .line 42
    .line 43
    move-result v15

    .line 44
    iget-object v7, v0, Lu43;->Y:Lzy0;

    .line 45
    .line 46
    iget-object v8, v0, Lu43;->Z:Ldn2;

    .line 47
    .line 48
    iget-object v9, v0, Lu43;->f0:Lkx4;

    .line 49
    .line 50
    iget-boolean v11, v0, Lu43;->g0:Z

    .line 51
    .line 52
    invoke-static/range {v7 .. v15}, Ljm4;->h(Lzy0;Ldn2;Lkx4;Lrn2;ZLqt4;Lgg5;Llp2;I)V

    .line 53
    .line 54
    .line 55
    return-object v2

    .line 56
    :pswitch_0
    move-object/from16 v19, v6

    .line 57
    .line 58
    check-cast v19, Lx67;

    .line 59
    .line 60
    move-object/from16 v20, v5

    .line 61
    .line 62
    check-cast v20, Ls43;

    .line 63
    .line 64
    move-object/from16 v21, v4

    .line 65
    .line 66
    check-cast v21, Lxz4;

    .line 67
    .line 68
    move-object/from16 v23, p1

    .line 69
    .line 70
    check-cast v23, Llp2;

    .line 71
    .line 72
    move-object/from16 v1, p2

    .line 73
    .line 74
    check-cast v1, Ljava/lang/Integer;

    .line 75
    .line 76
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    or-int/lit8 v1, v3, 0x1

    .line 80
    .line 81
    invoke-static {v1}, Lw79;->P(I)I

    .line 82
    .line 83
    .line 84
    move-result v24

    .line 85
    iget-object v1, v0, Lu43;->f0:Lkx4;

    .line 86
    .line 87
    iget-object v3, v0, Lu43;->Z:Ldn2;

    .line 88
    .line 89
    iget-boolean v4, v0, Lu43;->g0:Z

    .line 90
    .line 91
    iget-object v0, v0, Lu43;->Y:Lzy0;

    .line 92
    .line 93
    move-object/from16 v22, v0

    .line 94
    .line 95
    move-object/from16 v16, v1

    .line 96
    .line 97
    move-object/from16 v17, v3

    .line 98
    .line 99
    move/from16 v18, v4

    .line 100
    .line 101
    invoke-static/range {v16 .. v24}, Lw45;->d(Lkx4;Ldn2;ZLx67;Ls43;Lxz4;Lzy0;Llp2;I)V

    .line 102
    .line 103
    .line 104
    return-object v2

    .line 105
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
