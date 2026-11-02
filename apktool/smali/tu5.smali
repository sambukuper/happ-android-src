.class public final Ltu5;
.super Ljava/util/AbstractCollection;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final synthetic X:Lwu5;


# direct methods
.method public constructor <init>(Lwu5;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ltu5;->X:Lwu5;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final clear()V
    .locals 0

    .line 1
    iget-object p0, p0, Ltu5;->X:Lwu5;

    .line 2
    .line 3
    invoke-virtual {p0}, Lwu5;->clear()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Ltu5;->X:Lwu5;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lwu5;->containsValue(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 2

    .line 1
    new-instance v0, Lqu5;

    .line 2
    .line 3
    iget-object p0, p0, Ltu5;->X:Lwu5;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-direct {v0, p0, v1}, Lqu5;-><init>(Lwu5;B)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public final size()I
    .locals 0

    .line 1
    iget-object p0, p0, Ltu5;->X:Lwu5;

    .line 2
    .line 3
    iget-object p0, p0, Lwu5;->X:Ljava/util/concurrent/ConcurrentHashMap;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method
