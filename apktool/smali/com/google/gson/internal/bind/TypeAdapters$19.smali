.class Lcom/google/gson/internal/bind/TypeAdapters$19;
.super Lcom/google/gson/b;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/gson/b;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final b(Lrq3;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p1}, Lrq3;->c0()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/16 v0, 0x9

    .line 6
    .line 7
    if-ne p0, v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1}, Lrq3;->X()V

    .line 10
    .line 11
    .line 12
    const/4 p0, 0x0

    .line 13
    return-object p0

    .line 14
    :cond_0
    new-instance p0, Lf44;

    .line 15
    .line 16
    invoke-virtual {p1}, Lrq3;->r()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-direct {p0, p1}, Lf44;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-object p0
.end method

.method public final c(Lhs3;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lf44;

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Lhs3;->a0(Ljava/lang/Number;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
