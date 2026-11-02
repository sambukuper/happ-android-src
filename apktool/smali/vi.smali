.class public final Lvi;
.super Lg24;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic Y:B

.field public final synthetic Z:Lce8;

.field public final synthetic f0:Lgn2;

.field public final synthetic g0:Lkx4;

.field public final synthetic h0:Lzy0;

.field public final synthetic i0:I

.field public final synthetic j0:Ljava/lang/Object;

.field public final synthetic k0:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lce8;Lgn2;Lkx4;Lg22;Lh62;Lzy0;I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, Lvi;->Y:B

    .line 3
    .line 4
    iput-object p1, p0, Lvi;->Z:Lce8;

    .line 5
    .line 6
    iput-object p2, p0, Lvi;->f0:Lgn2;

    .line 7
    .line 8
    iput-object p3, p0, Lvi;->g0:Lkx4;

    .line 9
    .line 10
    iput-object p4, p0, Lvi;->j0:Ljava/lang/Object;

    .line 11
    .line 12
    iput-object p5, p0, Lvi;->k0:Ljava/lang/Object;

    .line 13
    .line 14
    iput-object p6, p0, Lvi;->h0:Lzy0;

    .line 15
    .line 16
    iput p7, p0, Lvi;->i0:I

    .line 17
    .line 18
    const/4 p1, 0x2

    .line 19
    invoke-direct {p0, p1}, Lg24;-><init>(I)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public constructor <init>(Lce8;Lkx4;Lgn2;Lgn2;Lgn2;Lzy0;I)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, Lvi;->Y:B

    .line 23
    iput-object p1, p0, Lvi;->Z:Lce8;

    iput-object p2, p0, Lvi;->g0:Lkx4;

    iput-object p3, p0, Lvi;->f0:Lgn2;

    iput-object p4, p0, Lvi;->j0:Ljava/lang/Object;

    iput-object p5, p0, Lvi;->k0:Ljava/lang/Object;

    iput-object p6, p0, Lvi;->h0:Lzy0;

    iput p7, p0, Lvi;->i0:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lg24;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, Lvi;->Y:B

    .line 4
    .line 5
    sget-object v2, Ldn8;->a:Ldn8;

    .line 6
    .line 7
    iget v3, v0, Lvi;->i0:I

    .line 8
    .line 9
    iget-object v4, v0, Lvi;->k0:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v5, v0, Lvi;->j0:Ljava/lang/Object;

    .line 12
    .line 13
    packed-switch v1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    move-object/from16 v12, p1

    .line 17
    .line 18
    check-cast v12, Llp2;

    .line 19
    .line 20
    move-object/from16 v1, p2

    .line 21
    .line 22
    check-cast v1, Ljava/lang/Number;

    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 25
    .line 26
    .line 27
    move-object v9, v5

    .line 28
    check-cast v9, Lg22;

    .line 29
    .line 30
    move-object v10, v4

    .line 31
    check-cast v10, Lh62;

    .line 32
    .line 33
    or-int/lit8 v1, v3, 0x1

    .line 34
    .line 35
    invoke-static {v1}, Lw79;->P(I)I

    .line 36
    .line 37
    .line 38
    move-result v13

    .line 39
    iget-object v6, v0, Lvi;->Z:Lce8;

    .line 40
    .line 41
    iget-object v7, v0, Lvi;->f0:Lgn2;

    .line 42
    .line 43
    iget-object v8, v0, Lvi;->g0:Lkx4;

    .line 44
    .line 45
    iget-object v11, v0, Lvi;->h0:Lzy0;

    .line 46
    .line 47
    invoke-static/range {v6 .. v13}, Lzc1;->e(Lce8;Lgn2;Lkx4;Lg22;Lh62;Lzy0;Llp2;I)V

    .line 48
    .line 49
    .line 50
    return-object v2

    .line 51
    :pswitch_0
    move-object/from16 v20, p1

    .line 52
    .line 53
    check-cast v20, Llp2;

    .line 54
    .line 55
    move-object/from16 v1, p2

    .line 56
    .line 57
    check-cast v1, Ljava/lang/Number;

    .line 58
    .line 59
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 60
    .line 61
    .line 62
    move-object/from16 v17, v5

    .line 63
    .line 64
    check-cast v17, Lgn2;

    .line 65
    .line 66
    move-object/from16 v18, v4

    .line 67
    .line 68
    check-cast v18, Lgn2;

    .line 69
    .line 70
    or-int/lit8 v1, v3, 0x1

    .line 71
    .line 72
    invoke-static {v1}, Lw79;->P(I)I

    .line 73
    .line 74
    .line 75
    move-result v21

    .line 76
    iget-object v14, v0, Lvi;->Z:Lce8;

    .line 77
    .line 78
    iget-object v15, v0, Lvi;->g0:Lkx4;

    .line 79
    .line 80
    iget-object v1, v0, Lvi;->f0:Lgn2;

    .line 81
    .line 82
    iget-object v0, v0, Lvi;->h0:Lzy0;

    .line 83
    .line 84
    move-object/from16 v19, v0

    .line 85
    .line 86
    move-object/from16 v16, v1

    .line 87
    .line 88
    invoke-static/range {v14 .. v21}, Lz91;->d(Lce8;Lkx4;Lgn2;Lgn2;Lgn2;Lzy0;Llp2;I)V

    .line 89
    .line 90
    .line 91
    return-object v2

    .line 92
    nop

    .line 93
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
