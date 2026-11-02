.class public final Lsl0;
.super Lql0;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final b:Lsl0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lsl0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lsl0;->b:Lsl0;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Ly53;Lxm0;)V
    .locals 1

    .line 1
    invoke-super {p0, p1, p2}, Lql0;->a(Ly53;Lxm0;)V

    .line 2
    .line 3
    .line 4
    new-instance p0, Lfg0;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-direct {p0, v0}, Lfg0;-><init>(B)V

    .line 8
    .line 9
    .line 10
    invoke-static {p0, p1}, Lue3;->l0(Lfg0;Ly53;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lfg0;->a()Lgg0;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {p2, p0}, Lxm0;->d(Ll11;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method
