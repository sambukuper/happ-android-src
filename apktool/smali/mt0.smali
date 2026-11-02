.class public final Lmt0;
.super Lhh8;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final synthetic a:Lnt0;

.field public final synthetic b:Lwi8;


# direct methods
.method public constructor <init>(Lnt0;Lwi8;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lmt0;->a:Lnt0;

    .line 5
    .line 6
    iput-object p2, p0, Lmt0;->b:Lwi8;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final g(Ljh8;Lx14;)Lzk6;
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
    iget-object p1, p0, Lmt0;->a:Lnt0;

    .line 8
    .line 9
    invoke-interface {p1, p2}, Lxi8;->A(Lx14;)Lzk6;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    check-cast p2, Lt14;

    .line 14
    .line 15
    sget-object v0, Lrt8;->Z:Lrt8;

    .line 16
    .line 17
    iget-object p0, p0, Lmt0;->b:Lwi8;

    .line 18
    .line 19
    invoke-virtual {p0, p2, v0}, Lwi8;->f(Lt14;Lrt8;)Lt14;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-interface {p1, p0}, Lnt0;->I(Lt14;)Laa7;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    return-object p0
.end method
