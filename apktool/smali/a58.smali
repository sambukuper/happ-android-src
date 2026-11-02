.class public final synthetic La58;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lfw0;
.implements Lao2;


# instance fields
.field public final synthetic a:La74;


# direct methods
.method public constructor <init>(La74;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La58;->a:La74;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    .line 1
    iget-object p0, p0, La58;->a:La74;

    .line 2
    .line 3
    invoke-interface {p0}, Ljw3;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ldw0;

    .line 8
    .line 9
    iget-wide v0, p0, Ldw0;->a:J

    .line 10
    .line 11
    return-wide v0
.end method

.method public final b()Lon2;
    .locals 0

    .line 1
    iget-object p0, p0, La58;->a:La74;

    .line 2
    .line 3
    return-object p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lfw0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    instance-of v0, p1, Lao2;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    check-cast p1, Lao2;

    .line 10
    .line 11
    invoke-interface {p1}, Lao2;->b()Lon2;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iget-object p0, p0, La58;->a:La74;

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Lnx5;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    return p0

    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    return p0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, La58;->a:La74;

    .line 2
    .line 3
    invoke-virtual {p0}, Lnx5;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method
