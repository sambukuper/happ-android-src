.class public final Lte;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lmn0;


# instance fields
.field public final a:Lcl7;


# direct methods
.method public constructor <init>(Lcl7;Ls98;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lte;->a:Lcl7;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a(Lyh0;Ljava/util/Map;Lsn0;)Lln0;
    .locals 3

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-interface {p2}, Ljava/util/Map;->size()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 11
    .line 12
    .line 13
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    check-cast v2, Ljava/util/Map$Entry;

    .line 32
    .line 33
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    check-cast v2, Landroid/view/Surface;

    .line 38
    .line 39
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    invoke-interface {p1, v0, p3}, Lyh0;->J0(Ljava/util/ArrayList;Lsn0;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-nez v0, :cond_1

    .line 48
    .line 49
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    invoke-virtual {p3}, Lsn0;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    invoke-virtual {p3}, Lsn0;->a()V

    .line 56
    .line 57
    .line 58
    sget-object p0, Loy1;->k0:Loy1;

    .line 59
    .line 60
    return-object p0

    .line 61
    :cond_1
    iget-object p0, p0, Lte;->a:Lcl7;

    .line 62
    .line 63
    invoke-static {p2, p0}, Lw51;->m(Ljava/util/Map;Lcl7;)Lip4;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    new-instance p1, Lkn0;

    .line 68
    .line 69
    sget-object p2, Le02;->X:Le02;

    .line 70
    .line 71
    invoke-direct {p1, p2, p0}, Lkn0;-><init>(Ljava/util/Map;Ljava/util/Map;)V

    .line 72
    .line 73
    .line 74
    return-object p1
.end method
