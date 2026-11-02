.class public final Lui;
.super Lg24;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic Y:B

.field public final synthetic Z:Lkx4;

.field public final synthetic f0:Lzy0;

.field public final synthetic g0:I

.field public final synthetic h0:Ljava/lang/Object;

.field public final synthetic i0:Ljava/lang/Object;

.field public final synthetic j0:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lce8;Lkx4;Lta2;Lgn2;Lzy0;I)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput-byte v0, p0, Lui;->Y:B

    .line 3
    .line 4
    iput-object p1, p0, Lui;->h0:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Lui;->Z:Lkx4;

    .line 7
    .line 8
    iput-object p3, p0, Lui;->j0:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p4, p0, Lui;->i0:Ljava/lang/Object;

    .line 11
    .line 12
    iput-object p5, p0, Lui;->f0:Lzy0;

    .line 13
    .line 14
    iput p6, p0, Lui;->g0:I

    .line 15
    .line 16
    invoke-direct {p0, v0}, Lg24;-><init>(I)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lkx4;Ljava/lang/Object;Ljava/lang/Object;Lzy0;IB)V
    .locals 0

    .line 20
    iput-byte p7, p0, Lui;->Y:B

    iput-object p1, p0, Lui;->h0:Ljava/lang/Object;

    iput-object p2, p0, Lui;->Z:Lkx4;

    iput-object p3, p0, Lui;->i0:Ljava/lang/Object;

    iput-object p4, p0, Lui;->j0:Ljava/lang/Object;

    iput-object p5, p0, Lui;->f0:Lzy0;

    iput p6, p0, Lui;->g0:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lg24;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, Lui;->Y:B

    .line 4
    .line 5
    iget-object v2, v0, Lui;->h0:Ljava/lang/Object;

    .line 6
    .line 7
    sget-object v3, Ldn8;->a:Ldn8;

    .line 8
    .line 9
    iget v4, v0, Lui;->g0:I

    .line 10
    .line 11
    iget-object v5, v0, Lui;->i0:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v6, v0, Lui;->j0:Ljava/lang/Object;

    .line 14
    .line 15
    packed-switch v1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    move-object/from16 v12, p1

    .line 19
    .line 20
    check-cast v12, Llp2;

    .line 21
    .line 22
    move-object/from16 v1, p2

    .line 23
    .line 24
    check-cast v1, Ljava/lang/Number;

    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 27
    .line 28
    .line 29
    move-object v7, v2

    .line 30
    check-cast v7, Lce8;

    .line 31
    .line 32
    move-object v9, v6

    .line 33
    check-cast v9, Lta2;

    .line 34
    .line 35
    move-object v10, v5

    .line 36
    check-cast v10, Lgn2;

    .line 37
    .line 38
    or-int/lit8 v1, v4, 0x1

    .line 39
    .line 40
    invoke-static {v1}, Lw79;->P(I)I

    .line 41
    .line 42
    .line 43
    move-result v13

    .line 44
    iget-object v8, v0, Lui;->Z:Lkx4;

    .line 45
    .line 46
    iget-object v11, v0, Lui;->f0:Lzy0;

    .line 47
    .line 48
    invoke-static/range {v7 .. v13}, Lkm4;->b(Lce8;Lkx4;Lta2;Lgn2;Lzy0;Llp2;I)V

    .line 49
    .line 50
    .line 51
    return-object v3

    .line 52
    :pswitch_0
    move-object/from16 v19, p1

    .line 53
    .line 54
    check-cast v19, Llp2;

    .line 55
    .line 56
    move-object/from16 v1, p2

    .line 57
    .line 58
    check-cast v1, Ljava/lang/Number;

    .line 59
    .line 60
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 61
    .line 62
    .line 63
    move-object/from16 v16, v5

    .line 64
    .line 65
    check-cast v16, Lta2;

    .line 66
    .line 67
    move-object/from16 v17, v6

    .line 68
    .line 69
    check-cast v17, Ljava/lang/String;

    .line 70
    .line 71
    or-int/lit8 v1, v4, 0x1

    .line 72
    .line 73
    invoke-static {v1}, Lw79;->P(I)I

    .line 74
    .line 75
    .line 76
    move-result v20

    .line 77
    iget-object v14, v0, Lui;->h0:Ljava/lang/Object;

    .line 78
    .line 79
    iget-object v15, v0, Lui;->Z:Lkx4;

    .line 80
    .line 81
    iget-object v0, v0, Lui;->f0:Lzy0;

    .line 82
    .line 83
    move-object/from16 v18, v0

    .line 84
    .line 85
    invoke-static/range {v14 .. v20}, Lkm4;->c(Ljava/lang/Object;Lkx4;Lta2;Ljava/lang/String;Lzy0;Llp2;I)V

    .line 86
    .line 87
    .line 88
    return-object v3

    .line 89
    :pswitch_1
    move-object/from16 v9, p1

    .line 90
    .line 91
    check-cast v9, Llp2;

    .line 92
    .line 93
    move-object/from16 v1, p2

    .line 94
    .line 95
    check-cast v1, Ljava/lang/Number;

    .line 96
    .line 97
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 98
    .line 99
    .line 100
    check-cast v2, Lce8;

    .line 101
    .line 102
    check-cast v5, Lgn2;

    .line 103
    .line 104
    move-object v7, v6

    .line 105
    check-cast v7, Lgn2;

    .line 106
    .line 107
    or-int/lit8 v1, v4, 0x1

    .line 108
    .line 109
    invoke-static {v1}, Lw79;->P(I)I

    .line 110
    .line 111
    .line 112
    move-result v10

    .line 113
    move-object v6, v5

    .line 114
    iget-object v5, v0, Lui;->Z:Lkx4;

    .line 115
    .line 116
    iget-object v8, v0, Lui;->f0:Lzy0;

    .line 117
    .line 118
    move-object v4, v2

    .line 119
    invoke-static/range {v4 .. v10}, Lz91;->b(Lce8;Lkx4;Lgn2;Lgn2;Lzy0;Llp2;I)V

    .line 120
    .line 121
    .line 122
    return-object v3

    .line 123
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
