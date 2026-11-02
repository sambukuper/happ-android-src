.class public final synthetic Lk66;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Z

.field public final synthetic Z:Lkx4;

.field public final synthetic f0:Z

.field public final synthetic g0:I

.field public final synthetic h0:Lon2;

.field public final synthetic i0:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ZLon2;Lkx4;ZLjava/lang/Object;IB)V
    .locals 0

    .line 1
    iput-byte p7, p0, Lk66;->X:B

    .line 2
    .line 3
    iput-boolean p1, p0, Lk66;->Y:Z

    .line 4
    .line 5
    iput-object p2, p0, Lk66;->h0:Lon2;

    .line 6
    .line 7
    iput-object p3, p0, Lk66;->Z:Lkx4;

    .line 8
    .line 9
    iput-boolean p4, p0, Lk66;->f0:Z

    .line 10
    .line 11
    iput-object p5, p0, Lk66;->i0:Ljava/lang/Object;

    .line 12
    .line 13
    iput p6, p0, Lk66;->g0:I

    .line 14
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, Lk66;->X:B

    .line 4
    .line 5
    sget-object v2, Ldn8;->a:Ldn8;

    .line 6
    .line 7
    iget v3, v0, Lk66;->g0:I

    .line 8
    .line 9
    iget-object v4, v0, Lk66;->i0:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v5, v0, Lk66;->h0:Lon2;

    .line 12
    .line 13
    packed-switch v1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    move-object v7, v5

    .line 17
    check-cast v7, Lgn2;

    .line 18
    .line 19
    move-object v10, v4

    .line 20
    check-cast v10, Llz7;

    .line 21
    .line 22
    move-object/from16 v11, p1

    .line 23
    .line 24
    check-cast v11, Llp2;

    .line 25
    .line 26
    move-object/from16 v1, p2

    .line 27
    .line 28
    check-cast v1, Ljava/lang/Integer;

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    or-int/lit8 v1, v3, 0x1

    .line 34
    .line 35
    invoke-static {v1}, Lw79;->P(I)I

    .line 36
    .line 37
    .line 38
    move-result v12

    .line 39
    iget-boolean v6, v0, Lk66;->Y:Z

    .line 40
    .line 41
    iget-object v8, v0, Lk66;->Z:Lkx4;

    .line 42
    .line 43
    iget-boolean v9, v0, Lk66;->f0:Z

    .line 44
    .line 45
    invoke-static/range {v6 .. v12}, Loz7;->a(ZLgn2;Lkx4;ZLlz7;Llp2;I)V

    .line 46
    .line 47
    .line 48
    return-object v2

    .line 49
    :pswitch_0
    move-object v14, v5

    .line 50
    check-cast v14, Ldn2;

    .line 51
    .line 52
    move-object/from16 v17, v4

    .line 53
    .line 54
    check-cast v17, Lj66;

    .line 55
    .line 56
    move-object/from16 v18, p1

    .line 57
    .line 58
    check-cast v18, Llp2;

    .line 59
    .line 60
    move-object/from16 v1, p2

    .line 61
    .line 62
    check-cast v1, Ljava/lang/Integer;

    .line 63
    .line 64
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    or-int/lit8 v1, v3, 0x1

    .line 68
    .line 69
    invoke-static {v1}, Lw79;->P(I)I

    .line 70
    .line 71
    .line 72
    move-result v19

    .line 73
    iget-boolean v13, v0, Lk66;->Y:Z

    .line 74
    .line 75
    iget-object v15, v0, Lk66;->Z:Lkx4;

    .line 76
    .line 77
    iget-boolean v0, v0, Lk66;->f0:Z

    .line 78
    .line 79
    move/from16 v16, v0

    .line 80
    .line 81
    invoke-static/range {v13 .. v19}, Lhi5;->M(ZLdn2;Lkx4;ZLj66;Llp2;I)V

    .line 82
    .line 83
    .line 84
    return-object v2

    .line 85
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
