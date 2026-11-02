.class public final synthetic Lk48;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Ln48;

.field public final synthetic Z:I

.field public final synthetic f0:Leo5;

.field public final synthetic g0:Lzr4;


# direct methods
.method public synthetic constructor <init>(Ln48;ILeo5;Lzr4;B)V
    .locals 0

    .line 1
    iput-byte p5, p0, Lk48;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lk48;->Y:Ln48;

    .line 4
    .line 5
    iput p2, p0, Lk48;->Z:I

    .line 6
    .line 7
    iput-object p3, p0, Lk48;->f0:Leo5;

    .line 8
    .line 9
    iput-object p4, p0, Lk48;->g0:Lzr4;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, Lk48;->X:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v3, p0, Lk48;->g0:Lzr4;

    .line 7
    .line 8
    iget-object v4, p0, Lk48;->f0:Leo5;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    move-object v6, p1

    .line 14
    check-cast v6, Ldo5;

    .line 15
    .line 16
    iget v8, v4, Leo5;->Y:I

    .line 17
    .line 18
    iget-object v5, p0, Lk48;->Y:Ln48;

    .line 19
    .line 20
    iget-object p1, v5, Ln48;->v0:Lkd8;

    .line 21
    .line 22
    invoke-virtual {p1}, Lkd8;->d()Lh48;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iget-wide v9, p1, Lh48;->f0:J

    .line 27
    .line 28
    invoke-interface {v3}, Lug3;->getLayoutDirection()Lz24;

    .line 29
    .line 30
    .line 31
    move-result-object v11

    .line 32
    iget v7, p0, Lk48;->Z:I

    .line 33
    .line 34
    invoke-virtual/range {v5 .. v11}, Ln48;->e1(Ldo5;IIJLz24;)V

    .line 35
    .line 36
    .line 37
    iget-object p0, v5, Ln48;->z0:Lay6;

    .line 38
    .line 39
    iget-object p0, p0, Lay6;->X:Loh5;

    .line 40
    .line 41
    invoke-virtual {p0}, Loh5;->l()I

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    neg-int p0, p0

    .line 46
    invoke-static {v6, v4, v2, p0}, Ldo5;->h(Ldo5;Leo5;II)V

    .line 47
    .line 48
    .line 49
    return-object v1

    .line 50
    :pswitch_0
    move-object v8, p1

    .line 51
    check-cast v8, Ldo5;

    .line 52
    .line 53
    iget v10, v4, Leo5;->X:I

    .line 54
    .line 55
    iget-object v7, p0, Lk48;->Y:Ln48;

    .line 56
    .line 57
    iget-object p1, v7, Ln48;->v0:Lkd8;

    .line 58
    .line 59
    invoke-virtual {p1}, Lkd8;->d()Lh48;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    iget-wide v11, p1, Lh48;->f0:J

    .line 64
    .line 65
    invoke-interface {v3}, Lug3;->getLayoutDirection()Lz24;

    .line 66
    .line 67
    .line 68
    move-result-object v13

    .line 69
    iget v9, p0, Lk48;->Z:I

    .line 70
    .line 71
    invoke-virtual/range {v7 .. v13}, Ln48;->e1(Ldo5;IIJLz24;)V

    .line 72
    .line 73
    .line 74
    iget-object p0, v7, Ln48;->z0:Lay6;

    .line 75
    .line 76
    iget-object p0, p0, Lay6;->X:Loh5;

    .line 77
    .line 78
    invoke-virtual {p0}, Loh5;->l()I

    .line 79
    .line 80
    .line 81
    move-result p0

    .line 82
    neg-int p0, p0

    .line 83
    invoke-static {v8, v4, p0, v2}, Ldo5;->h(Ldo5;Leo5;II)V

    .line 84
    .line 85
    .line 86
    return-object v1

    .line 87
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
