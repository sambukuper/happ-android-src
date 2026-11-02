.class public final Lxw7;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lt11;


# instance fields
.field public final X:Llr5;


# direct methods
.method public constructor <init>(Llr5;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxw7;->X:Llr5;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final E(ZLrn2;Ls51;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object p0, p0, Lxw7;->X:Llr5;

    .line 2
    .line 3
    iget-object p0, p0, Llr5;->Y:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Lax7;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    new-instance p1, Lcx7;

    .line 11
    .line 12
    new-instance v0, Lww7;

    .line 13
    .line 14
    invoke-interface {p0}, Lax7;->g0()Lsm2;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-direct {v0, p0}, Lww7;-><init>(Lsm2;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p1, v0}, Lcx7;-><init>(Lww7;)V

    .line 22
    .line 23
    .line 24
    invoke-interface {p2, p1, p3}, Lrn2;->K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0
.end method

.method public final close()V
    .locals 0

    .line 1
    iget-object p0, p0, Lxw7;->X:Llr5;

    .line 2
    .line 3
    iget-object p0, p0, Llr5;->Y:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Lax7;

    .line 6
    .line 7
    invoke-interface {p0}, Ljava/io/Closeable;->close()V

    .line 8
    .line 9
    .line 10
    return-void
.end method
