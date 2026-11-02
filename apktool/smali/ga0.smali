.class public final Lga0;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgm;


# instance fields
.field public final a:Lzz3;

.field public final b:Lfk2;

.field public final c:Ljava/util/Map;

.field public final d:Lg44;


# direct methods
.method public constructor <init>(Lzz3;Lfk2;Ljava/util/Map;)V
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
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lga0;->a:Lzz3;

    .line 11
    .line 12
    iput-object p2, p0, Lga0;->b:Lfk2;

    .line 13
    .line 14
    iput-object p3, p0, Lga0;->c:Ljava/util/Map;

    .line 15
    .line 16
    new-instance p1, Lf3;

    .line 17
    .line 18
    const/4 p2, 0x4

    .line 19
    invoke-direct {p1, p0, p2}, Lf3;-><init>(Ljava/lang/Object;B)V

    .line 20
    .line 21
    .line 22
    sget-object p2, Lw74;->X:Lw74;

    .line 23
    .line 24
    invoke-static {p2, p1}, Lx97;->P(Lw74;Ldn2;)Lg44;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iput-object p1, p0, Lga0;->d:Lg44;

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final c()Lt14;
    .locals 0

    .line 1
    iget-object p0, p0, Lga0;->d:Lg44;

    .line 2
    .line 3
    invoke-interface {p0}, Lg44;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    check-cast p0, Lt14;

    .line 11
    .line 12
    return-object p0
.end method

.method public final d()Lfk2;
    .locals 0

    .line 1
    iget-object p0, p0, Lga0;->b:Lfk2;

    .line 2
    .line 3
    return-object p0
.end method

.method public final e()Ljava/util/Map;
    .locals 0

    .line 1
    iget-object p0, p0, Lga0;->c:Ljava/util/Map;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getSource()Lke7;
    .locals 0

    .line 1
    sget-object p0, Lke7;->G:Lg55;

    .line 2
    .line 3
    return-object p0
.end method
