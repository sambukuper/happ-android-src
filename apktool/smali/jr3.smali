.class public final Ljr3;
.super Lt1;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final h0:Ldn3;

.field public final i0:I

.field public j0:I


# direct methods
.method public constructor <init>(Lvm3;Ldn3;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-direct {p0, p1, v0}, Lt1;-><init>(Lvm3;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iput-object p2, p0, Ljr3;->h0:Ldn3;

    .line 9
    .line 10
    iget-object p1, p2, Ldn3;->X:Ljava/util/List;

    .line 11
    .line 12
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    iput p1, p0, Ljr3;->i0:I

    .line 17
    .line 18
    const/4 p1, -0x1

    .line 19
    iput p1, p0, Ljr3;->j0:I

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/String;)Lao3;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    iget-object p0, p0, Ljr3;->h0:Ldn3;

    .line 9
    .line 10
    iget-object p0, p0, Ldn3;->X:Ljava/util/List;

    .line 11
    .line 12
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lao3;

    .line 17
    .line 18
    return-object p0
.end method

.method public final R(Le37;I)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    return-object p0
.end method

.method public final T()Lao3;
    .locals 0

    .line 1
    iget-object p0, p0, Ljr3;->h0:Ldn3;

    .line 2
    .line 3
    return-object p0
.end method

.method public final e(Le37;)I
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget p1, p0, Ljr3;->j0:I

    .line 5
    .line 6
    iget v0, p0, Ljr3;->i0:I

    .line 7
    .line 8
    add-int/lit8 v0, v0, -0x1

    .line 9
    .line 10
    if-ge p1, v0, :cond_0

    .line 11
    .line 12
    add-int/lit8 p1, p1, 0x1

    .line 13
    .line 14
    iput p1, p0, Ljr3;->j0:I

    .line 15
    .line 16
    return p1

    .line 17
    :cond_0
    const/4 p0, -0x1

    .line 18
    return p0
.end method
