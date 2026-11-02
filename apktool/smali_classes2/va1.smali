.class public final Lva1;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lxe2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Lsf2;


# direct methods
.method public synthetic constructor <init>(Lsf2;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lva1;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lva1;->Y:Lsf2;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Lze2;Lq51;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, Lva1;->X:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    iget-object v2, p0, Lva1;->Y:Lsf2;

    .line 6
    .line 7
    sget-object v3, Lc71;->X:Lc71;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    instance-of v0, p2, Lmo4;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    move-object v0, p2

    .line 17
    check-cast v0, Lmo4;

    .line 18
    .line 19
    iget v4, v0, Lmo4;->g0:I

    .line 20
    .line 21
    const/high16 v5, -0x80000000

    .line 22
    .line 23
    and-int v6, v4, v5

    .line 24
    .line 25
    if-eqz v6, :cond_0

    .line 26
    .line 27
    sub-int/2addr v4, v5

    .line 28
    iput v4, v0, Lmo4;->g0:I

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    new-instance v0, Lmo4;

    .line 32
    .line 33
    invoke-direct {v0, p0, p2}, Lmo4;-><init>(Lva1;Lq51;)V

    .line 34
    .line 35
    .line 36
    :goto_0
    iget-object p0, v0, Lmo4;->f0:Ljava/lang/Object;

    .line 37
    .line 38
    iget p2, v0, Lmo4;->g0:I

    .line 39
    .line 40
    const/4 v4, 0x1

    .line 41
    if-eqz p2, :cond_2

    .line 42
    .line 43
    if-ne p2, v4, :cond_1

    .line 44
    .line 45
    invoke-static {p0}, Lw39;->n0(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 50
    .line 51
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    const/4 v1, 0x0

    .line 55
    goto :goto_1

    .line 56
    :cond_2
    invoke-static {p0}, Lw39;->n0(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    new-instance p0, Ln;

    .line 60
    .line 61
    const/16 p2, 0x14

    .line 62
    .line 63
    invoke-direct {p0, p1, p2}, Ln;-><init>(Lze2;B)V

    .line 64
    .line 65
    .line 66
    iput v4, v0, Lmo4;->g0:I

    .line 67
    .line 68
    invoke-virtual {v2, p0, v0}, Lsf2;->a(Lze2;Lq51;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    if-ne p0, v3, :cond_3

    .line 73
    .line 74
    move-object v1, v3

    .line 75
    :cond_3
    :goto_1
    return-object v1

    .line 76
    :pswitch_0
    new-instance p0, Ln;

    .line 77
    .line 78
    const/4 v0, 0x2

    .line 79
    invoke-direct {p0, p1, v0}, Ln;-><init>(Lze2;B)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2, p0, p2}, Lsf2;->a(Lze2;Lq51;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    if-ne p0, v3, :cond_4

    .line 87
    .line 88
    move-object v1, p0

    .line 89
    :cond_4
    return-object v1

    .line 90
    nop

    .line 91
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
