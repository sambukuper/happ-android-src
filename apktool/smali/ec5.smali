.class public final Lec5;
.super Lld2;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final d:Lec5;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lec5;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    invoke-direct {v0, v1, v2, v2}, Lld2;-><init>(III)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lec5;->d:Lec5;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final d(Lxr0;Lrs;Lbc7;Lp91;Lvc5;)V
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    invoke-virtual {p1, p0}, Lxr0;->i(I)Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    check-cast p0, Lpp2;

    .line 7
    .line 8
    iget-object p1, p4, Lp91;->e:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p1, Lc15;

    .line 11
    .line 12
    invoke-virtual {p1, p0}, Lc15;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p4, Lp91;->d:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p1, Lt05;

    .line 18
    .line 19
    invoke-virtual {p1, p0}, Lt05;->a(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    return-void
.end method
