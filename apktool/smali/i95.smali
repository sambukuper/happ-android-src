.class public final Li95;
.super Ljx4;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lg34;


# instance fields
.field public q0:Lgn2;

.field public r0:Z


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
    new-instance v0, Lzw2;

    .line 10
    .line 11
    const/16 v1, 0x14

    .line 12
    .line 13
    invoke-direct {v0, p0, p2, v1}, Lzw2;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 14
    .line 15
    .line 16
    sget-object p0, Le02;->X:Le02;

    .line 17
    .line 18
    invoke-interface {p1, p3, p4, p0, v0}, Lzr4;->g0(IILjava/util/Map;Lgn2;)Lyr4;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method public final N0()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method
