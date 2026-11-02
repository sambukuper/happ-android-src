.class public final Lwb6;
.super Lhh8;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final synthetic a:Lww3;


# direct methods
.method public constructor <init>(Lww3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwb6;->a:Lww3;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final g(Ljh8;Lx14;)Lzk6;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    sget-object p1, Lqe4;->q0:Lqe4;

    .line 8
    .line 9
    invoke-virtual {p1, p2}, Lqe4;->A(Lx14;)Lzk6;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Lpw3;

    .line 14
    .line 15
    sget-object p2, Lww3;->c:Lww3;

    .line 16
    .line 17
    const/4 p2, 0x0

    .line 18
    iget-object p0, p0, Lwb6;->a:Lww3;

    .line 19
    .line 20
    invoke-virtual {p0, p1, p2}, Lww3;->c(Lpw3;Ljava/lang/String;)Lpw3;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    check-cast p0, Lu1;

    .line 25
    .line 26
    return-object p0
.end method
