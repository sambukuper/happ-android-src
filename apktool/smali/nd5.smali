.class public final Lnd5;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lw06;


# static fields
.field public static final c:Lxw3;

.field public static final d:Lvy0;


# instance fields
.field public a:Lxw3;

.field public volatile b:Lw06;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lxw3;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lnd5;->c:Lxw3;

    .line 7
    .line 8
    new-instance v0, Lvy0;

    .line 9
    .line 10
    const/4 v1, 0x6

    .line 11
    invoke-direct {v0, v1}, Lvy0;-><init>(B)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lnd5;->d:Lvy0;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lnd5;->b:Lw06;

    .line 2
    .line 3
    invoke-interface {p0}, Lw06;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
