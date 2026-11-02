.class public final Lz12;
.super Lg24;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgn2;


# instance fields
.field public final synthetic Y:Z

.field public final synthetic Z:Ldn2;


# direct methods
.method public constructor <init>(Ldn2;Z)V
    .locals 0

    .line 1
    iput-boolean p2, p0, Lz12;->Y:Z

    .line 2
    .line 3
    iput-object p1, p0, Lz12;->Z:Ldn2;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1}, Lg24;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, Lpk6;

    .line 2
    .line 3
    iget-boolean v0, p0, Lz12;->Y:Z

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lz12;->Z:Ldn2;

    .line 8
    .line 9
    invoke-interface {p0}, Ldn2;->invoke()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, Ljava/lang/Boolean;

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    if-eqz p0, :cond_0

    .line 20
    .line 21
    const/4 p0, 0x1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 p0, 0x0

    .line 24
    :goto_0
    invoke-virtual {p1, p0}, Lpk6;->d(Z)V

    .line 25
    .line 26
    .line 27
    sget-object p0, Ldn8;->a:Ldn8;

    .line 28
    .line 29
    return-object p0
.end method
