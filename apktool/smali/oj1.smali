.class public final Loj1;
.super Lik1;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lzv3;


# instance fields
.field public final s0:Lg44;


# direct methods
.method public constructor <init>(Lov3;Lfx5;Lyu3;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p1, p2, p3}, Lik1;-><init>(Lov3;Lfx5;Lyu3;)V

    .line 8
    .line 9
    .line 10
    new-instance p1, Lf3;

    .line 11
    .line 12
    const/16 p2, 0xd

    .line 13
    .line 14
    invoke-direct {p1, p0, p2}, Lf3;-><init>(Ljava/lang/Object;B)V

    .line 15
    .line 16
    .line 17
    sget-object p2, Lw74;->X:Lw74;

    .line 18
    .line 19
    invoke-static {p2, p1}, Lx97;->P(Lw74;Ldn2;)Lg44;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iput-object p1, p0, Loj1;->s0:Lg44;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final A(Lov3;Lyu3;)Lkb6;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v0, Loj1;

    .line 8
    .line 9
    invoke-virtual {p0}, Lgk1;->X()Lfx5;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-direct {v0, p1, p0, p2}, Loj1;-><init>(Lov3;Lfx5;Lyu3;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public final Z(Lov3;Lyu3;)Lik1;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v0, Loj1;

    .line 8
    .line 9
    invoke-virtual {p0}, Lgk1;->X()Lfx5;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-direct {v0, p1, p0, p2}, Loj1;-><init>(Lov3;Lfx5;Lyu3;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public final d()Luv3;
    .locals 0

    .line 1
    iget-object p0, p0, Loj1;->s0:Lg44;

    .line 2
    .line 3
    invoke-interface {p0}, Lg44;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnj1;

    .line 8
    .line 9
    return-object p0
.end method
