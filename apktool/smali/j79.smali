.class public final Lj79;
.super Ljx4;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lg34;


# instance fields
.field public q0:F

.field public r0:Ljava/lang/Object;


# virtual methods
.method public final K(Lzr4;Ltr4;J)Lyr4;
    .locals 2

    .line 1
    invoke-interface {p2, p3, p4}, Ltr4;->o(J)Leo5;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    iget p3, p2, Leo5;->X:I

    .line 6
    .line 7
    iget p4, p2, Leo5;->Y:I

    .line 8
    .line 9
    new-instance v0, Li79;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-direct {v0, p2, p0, v1}, Li79;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 13
    .line 14
    .line 15
    sget-object p0, Le02;->X:Le02;

    .line 16
    .line 17
    invoke-interface {p1, p3, p4, p0, v0}, Lzr4;->g0(IILjava/util/Map;Lgn2;)Lyr4;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method
