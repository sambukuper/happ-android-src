.class public final Lbd5;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lp85;


# instance fields
.field public final X:I

.field public final Y:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-lez p1, :cond_1

    .line 5
    .line 6
    if-lez p2, :cond_0

    .line 7
    .line 8
    iput p1, p0, Lbd5;->X:I

    .line 9
    .line 10
    iput p2, p0, Lbd5;->Y:I

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    const-string p0, "skip must be greater than 0"

    .line 14
    .line 15
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const/4 p0, 0x0

    .line 19
    throw p0

    .line 20
    :cond_1
    const-string p0, "count must be greater than 0"

    .line 21
    .line 22
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const/4 p0, 0x0

    .line 26
    throw p0
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, Laq7;

    .line 2
    .line 3
    iget v0, p0, Lbd5;->Y:I

    .line 4
    .line 5
    iget p0, p0, Lbd5;->X:I

    .line 6
    .line 7
    if-ne v0, p0, :cond_0

    .line 8
    .line 9
    new-instance v0, Lxc5;

    .line 10
    .line 11
    invoke-direct {v0, p1, p0}, Lxc5;-><init>(Laq7;I)V

    .line 12
    .line 13
    .line 14
    iget-object p0, p1, Laq7;->X:Lk01;

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Lk01;->b(Lcq7;)V

    .line 17
    .line 18
    .line 19
    new-instance p0, Ly45;

    .line 20
    .line 21
    invoke-direct {p0, v0}, Ly45;-><init>(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, p0}, Laq7;->f(Liv5;)V

    .line 25
    .line 26
    .line 27
    return-object v0

    .line 28
    :cond_0
    if-le v0, p0, :cond_1

    .line 29
    .line 30
    new-instance v1, Lad5;

    .line 31
    .line 32
    invoke-direct {v1, p1, p0, v0}, Lad5;-><init>(Laq7;II)V

    .line 33
    .line 34
    .line 35
    iget-object p0, p1, Laq7;->X:Lk01;

    .line 36
    .line 37
    invoke-virtual {p0, v1}, Lk01;->b(Lcq7;)V

    .line 38
    .line 39
    .line 40
    new-instance p0, Lyc5;

    .line 41
    .line 42
    const/4 v0, 0x1

    .line 43
    invoke-direct {p0, v1, v0}, Lyc5;-><init>(Laq7;B)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, p0}, Laq7;->f(Liv5;)V

    .line 47
    .line 48
    .line 49
    return-object v1

    .line 50
    :cond_1
    new-instance v1, Lzc5;

    .line 51
    .line 52
    invoke-direct {v1, p1, p0, v0}, Lzc5;-><init>(Laq7;II)V

    .line 53
    .line 54
    .line 55
    iget-object p0, p1, Laq7;->X:Lk01;

    .line 56
    .line 57
    invoke-virtual {p0, v1}, Lk01;->b(Lcq7;)V

    .line 58
    .line 59
    .line 60
    new-instance p0, Lyc5;

    .line 61
    .line 62
    const/4 v0, 0x0

    .line 63
    invoke-direct {p0, v1, v0}, Lyc5;-><init>(Laq7;B)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1, p0}, Laq7;->f(Liv5;)V

    .line 67
    .line 68
    .line 69
    return-object v1
.end method
