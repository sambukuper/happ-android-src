.class public final Ly55;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lae8;


# instance fields
.field public final a:Lke8;

.field public final b:Lc73;


# direct methods
.method public constructor <init>(Lke8;Lc73;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ly55;->a:Lke8;

    .line 5
    .line 6
    iput-object p2, p0, Ly55;->b:Lc73;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget-object v0, p0, Ly55;->b:Lc73;

    .line 2
    .line 3
    instance-of v1, v0, Ljw7;

    .line 4
    .line 5
    iget-object p0, p0, Ly55;->a:Lke8;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v0, Ljw7;

    .line 10
    .line 11
    iget-object v0, v0, Ljw7;->a:Ld53;

    .line 12
    .line 13
    invoke-interface {p0, v0}, Lr18;->onSuccess(Ld53;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    instance-of v1, v0, Lm32;

    .line 18
    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    check-cast v0, Lm32;

    .line 22
    .line 23
    iget-object v0, v0, Lm32;->a:Ld53;

    .line 24
    .line 25
    invoke-interface {p0, v0}, Lr18;->onError(Ld53;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    invoke-static {}, Lb61;->c()V

    .line 30
    .line 31
    .line 32
    return-void
.end method
