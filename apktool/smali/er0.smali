.class public final Ler0;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:Lv15;

.field public final b:Lkc6;

.field public final c:Ljava/util/Collection;

.field public final d:Lgn2;

.field public final e:[Ljq0;


# direct methods
.method public synthetic constructor <init>(Ljava/util/Collection;[Ljq0;)V
    .locals 1

    .line 28
    sget-object v0, Lag;->r0:Lag;

    invoke-direct {p0, p1, p2, v0}, Ler0;-><init>(Ljava/util/Collection;[Ljq0;Lgn2;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/Collection;[Ljq0;Lgn2;)V
    .locals 6

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    array-length v0, p2

    invoke-static {p2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    move-object v5, p2

    check-cast v5, [Ljq0;

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v0, p0

    move-object v3, p1

    move-object v4, p3

    invoke-direct/range {v0 .. v5}, Ler0;-><init>(Lv15;Lkc6;Ljava/util/Collection;Lgn2;[Ljq0;)V

    return-void
.end method

.method public varargs constructor <init>(Lv15;Lkc6;Ljava/util/Collection;Lgn2;[Ljq0;)V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, Ler0;->a:Lv15;

    .line 24
    iput-object p2, p0, Ler0;->b:Lkc6;

    .line 25
    iput-object p3, p0, Ler0;->c:Ljava/util/Collection;

    .line 26
    iput-object p4, p0, Ler0;->d:Lgn2;

    .line 27
    iput-object p5, p0, Ler0;->e:[Ljq0;

    return-void
.end method

.method public synthetic constructor <init>(Lv15;[Ljq0;)V
    .locals 1

    .line 21
    sget-object v0, Lag;->p0:Lag;

    invoke-direct {p0, p1, p2, v0}, Ler0;-><init>(Lv15;[Ljq0;Lgn2;)V

    return-void
.end method

.method public constructor <init>(Lv15;[Ljq0;Lgn2;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    array-length v0, p2

    .line 5
    invoke-static {p2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    move-object v5, p2

    .line 10
    check-cast v5, [Ljq0;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v3, 0x0

    .line 14
    move-object v0, p0

    .line 15
    move-object v1, p1

    .line 16
    move-object v4, p3

    .line 17
    invoke-direct/range {v0 .. v5}, Ler0;-><init>(Lv15;Lkc6;Ljava/util/Collection;Lgn2;[Ljq0;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method
